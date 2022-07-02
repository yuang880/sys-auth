package com.study.service;

import com.github.pagehelper.PageInfo;
import com.study.common.user.dto.UserQuery;
import com.study.common.user.entity.UserModel;
import com.study.rest.Result;

import java.util.List;

/**
 * 功能描述：
 *
 * @Author Carl
 * @Date 2022/6/26 20:45
 **/
public interface UserService {

    /**
     * 功能描述: 查询所有用户
     *
     * @param userQuery 查询条件
     * @return 封装进Result
     */
    Result<List<UserModel>> findAllUser(UserQuery userQuery);

    /**
     * 功能描述: 根据用户名查询对应的角色
     *
     * @param userQuery 查询条件
     * @return 封装进Result
     */
    Result<List<UserModel>> findUserAndRole(UserQuery userQuery);

    /**
     * 功能描述: 批量添加用户
     *
     * @param userQuery 用户集
     * @return 封装进Result
     */
    Result<Integer> batchAddUserModel(UserQuery userQuery);

    /**
     * 功能描述: 批量删除用户
     *
     * @param userQuery 条件，从中取出userIds。
     * @return 封装进Result
     */
    Result<Integer> batchRemoveUserModel(UserQuery userQuery);

    /**
     * 功能描述: 分页查询用户信息
     *
     * @param userQuery 条件，从中取出userIds。
     * @return 封装进Result
     */
    PageInfo<UserModel> findUserModelByPageHelper(UserQuery userQuery);

    /**
     * 功能描述: 查询某一个用户有几个角色，再根据角色查询权限
     *
     * @param userQuery  查询条件，包含UserName
     * @return UserModel的列表
     */
    Result<List<UserModel>> findUserAndRoleAndAuth(UserQuery userQuery);
}
