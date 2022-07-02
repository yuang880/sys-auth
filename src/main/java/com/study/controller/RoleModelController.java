package com.study.controller;

import com.github.pagehelper.PageInfo;
import com.study.common.role.dto.RoleQuery;
import com.study.common.role.entity.RoleModel;
import com.study.rest.Result;
import com.study.service.RoleModelService;
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
 * @Date 2022/6/27 20:40
 **/
@RestController
@RequestMapping("/role")
public class RoleModelController {

    @Autowired
    private RoleModelService roleModelService;

    @PostMapping("/queryRolesByPageHelper")
    public PageInfo<RoleModel> queryRolesByPageHelper(@Validated @RequestBody RoleQuery roleQuery){
        return roleModelService.findRolesByPageHelper(roleQuery);
    }

    @PostMapping("/batchAddRoleModel")
    public Result<Integer> batchAddRoleModel(@Validated @RequestBody RoleQuery roleQuery){
        return roleModelService.batchAddRoleModel(roleQuery);
    }

    @PostMapping("/queryRoleAndAuth")
    public Result<List<RoleModel>> queryRoleAndAuth(@Validated @RequestBody RoleQuery roleQuery){
        return roleModelService.findRoleAndAuth(roleQuery);
    }

}
