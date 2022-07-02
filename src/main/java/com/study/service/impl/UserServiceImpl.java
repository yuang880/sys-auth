package com.study.service.impl;

import cn.hutool.core.util.ArrayUtil;
import cn.hutool.core.util.ObjectUtil;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.study.common.user.dto.UserQuery;
import com.study.common.user.entity.UserModel;
import com.study.mapper.UserMapper;
import com.study.rest.Result;
import com.study.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 功能描述：
 *
 * @Author Carl
 * @Date 2022/6/26 21:01
 **/
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;


    @Override
    public Result<List<UserModel>> findAllUser(UserQuery userQuery) {
        //校验
        List<UserModel> result = userMapper.selectAllUser(userQuery);
        return Result.succeed(result, "查询所有用户成功！");
    }

    @Override
    public Result<List<UserModel>> findUserAndRole(UserQuery userQuery) {
        // service层校验
        if(ObjectUtil.isEmpty(userQuery)){
            return Result.failed("查询条件不能为空");
        }
        List<UserModel> userModelList = userMapper.selectUserAndRole(userQuery);
        return Result.succeed(userModelList, "根据用户名查询对应的角色成功");
    }

    @Override
    public Result<Integer> batchAddUserModel(UserQuery userQuery) {
        //校验
        if(ObjectUtil.isEmpty(userQuery)){
            return Result.failed("批量添加用户时，用户不能为空！");
        }
        // 如果用户名是必填项，在这里需要对用户名进行校验。
        // TODO 查询用户名是否以存在，
        Integer integer = userMapper.batchInsertUserModel(userQuery);
        if(integer < 0){
            return Result.failed("批量添加用户失败！");
        }
        return Result.succeed("批量添加用户成功！");
    }

    @Override
    public Result<Integer> batchRemoveUserModel(UserQuery userQuery) {
        //校验
        if(ObjectUtil.isEmpty(userQuery)){
            return Result.failed("查询条件不能为空！");
        }
        Integer[] userIds = userQuery.getUserIds();
        if(ArrayUtil.isEmpty(userIds)){
            return Result.failed("用户id不能为空");
        }
        Integer integer = userMapper.batchDeleteUserModel(userIds);
        if(integer < 0){
            return Result.failed("批量删除用户失败！");
        }
        return Result.succeed("批量删除用户成功！");
    }

    @Override
    public PageInfo<UserModel> findUserModelByPageHelper(UserQuery userQuery) {

        PageHelper.startPage(userQuery.getPageNum(), userQuery.getPageSize());
        List<UserModel> userModelList = userMapper.selectUserModelByPageHelper();
        return new PageInfo<>(userModelList);
    }

    @Override
    public Result<List<UserModel>> findUserAndRoleAndAuth(UserQuery userQuery) {
        //校验
        if(ObjectUtil.isEmpty(userQuery)){
            return Result.failed("查询条件不能为空！");
        }
        List<UserModel> userModelList = userMapper.selectUserAndRoleAndAuth(userQuery);
        return Result.succeed("查询成功");
    }

}
