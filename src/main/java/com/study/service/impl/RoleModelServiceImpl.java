package com.study.service.impl;

import cn.hutool.core.util.ObjectUtil;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.study.common.role.dto.RoleQuery;
import com.study.common.role.entity.RoleModel;
import com.study.mapper.RoleMapper;
import com.study.rest.Result;
import com.study.service.RoleModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
* @author Carl
* @description 针对表【t_role(角色表)】的数据库操作Service实现
* @createDate 2022-06-27 20:45:25
*/
@Service
public class RoleModelServiceImpl implements RoleModelService{

    @Autowired
    private RoleMapper roleMapper;

    @Override
    public PageInfo<RoleModel> findRolesByPageHelper(RoleQuery roleQuery) {
        //校验
        // 这里如果roleQuery为空，或者pageNum/pageNum为空，该怎么抛出
        // 自定义异常，
        PageHelper.startPage(roleQuery.getPageNum(), roleQuery.getPageSize());
        List<RoleModel> roleModelList = roleMapper.selectRolesByPageHelper();
        return new PageInfo<>(roleModelList);
    }

    @Override
    public Result<Integer> batchAddRoleModel(RoleQuery roleQuery) {
        // 校验
        if(ObjectUtil.isEmpty(roleQuery)){
            return Result.failed("roleQuery不能为空");
        }
        Integer integer = roleMapper.batchInsertRoleModel(roleQuery);
        if(integer < 0){
            return Result.failed("批量添加角色失败");
        }
        return Result.succeed("批量添加角色成功");
    }

    @Override
    public Result<List<RoleModel>> findRoleAndAuth(RoleQuery roleQuery) {
        // service层校验
        if(ObjectUtil.isEmpty(roleQuery)){
            return Result.failed("查询条件不能为空");
        }
        List<RoleModel> roleModelList = roleMapper.selectRoleAndAuth(roleQuery);
        return Result.succeed(roleModelList, "根据角色查询对应的权限成功");
    }
}




