package com.study.controller;

import com.study.common.auth.dto.AuthQuery;
import com.study.rest.Result;
import com.study.service.AuthModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 功能描述：
 *
 * @Author Carl
 * @Date 2022/6/27 20:40
 **/
@RestController
@RequestMapping("/auth")
public class AuthModelController {

    @Autowired
    private AuthModelService authModelService;

    @PostMapping("/batchAddAuthModel")
    public Result<Integer> batchAddAuthModel(@Validated @RequestBody AuthQuery authQuery) {
        return authModelService.batchAddAuthModel(authQuery);
    }

    @PostMapping("/batchDeleteAuthModel")
    public Result<Integer> batchDeleteAuthModel(@Validated @RequestBody AuthQuery authQuery) {
        return authModelService.batchDeleteAuthModel(authQuery);
    }



}
