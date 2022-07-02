package com.study.controller;

import com.github.pagehelper.PageInfo;
import com.study.common.user.dto.UserQuery;
import com.study.common.user.entity.UserModel;
import com.study.rest.Result;
import com.study.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 功能描述：
 *
 * @Author Carl
 * @Date 2022/6/26 21:06
 **/
@RestController
@Slf4j
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 功能描述: 查询所有用户
     *
     * @param userQuery  查询条件
     * @return List<UserModel>
     */
    @PostMapping("/queryAllUser")
    public Result<List<UserModel>> queryAllUser(@Validated @RequestBody UserQuery userQuery) {
        return userService.findAllUser(userQuery);
    }

    /**
     * 功能描述: 根据用户名查询对应的角色
     *
     * @param userQuery 查询条件
     * @return List<UserModel>
     */
    @PostMapping("/queryUserAndRole")
    Result<List<UserModel>> queryUserAndRole(@Validated @RequestBody UserQuery userQuery){
        return userService.findUserAndRole(userQuery);
    }

    /**
     * 功能描述: 批量添加
     *
     * @param userQuery 用户集
     * @return List<UserModel>
     */
    @PostMapping("/batchAddUserModel")
    public Result<Integer> batchAddUserModel(@Validated @RequestBody UserQuery userQuery){
        return userService.batchAddUserModel(userQuery);
    }

    /**
     * 功能描述: 批量删除
     *
     * @param userQuery 用户ids
     * @return List<Integer>
     */
    @PostMapping("/batchRemoveUserModel")
    public Result<Integer> batchRemoveUserModel(@Validated @RequestBody UserQuery userQuery){
        return userService.batchRemoveUserModel(userQuery);
    }

    /**
     * 功能描述: 查询所有，并分页展示
     *
     * @param userQuery 包含pageNum和pageSize
     * @return List<Integer>
     */
    @PostMapping("/queryAllUserByPageHepler")
    public PageInfo<UserModel> queryAllUserByPageHepler(@Validated @RequestBody UserQuery userQuery){
        return userService.findUserModelByPageHelper(userQuery);
    }

    @PostMapping("/queryUserAndRoleAndAuth")
    public Result<List<UserModel>> queryUserAndRoleAndAuth(@Validated @RequestBody UserQuery userQuery){
        return userService.findUserAndRoleAndAuth(userQuery);
    }
}
