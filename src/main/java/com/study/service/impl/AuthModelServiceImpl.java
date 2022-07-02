package com.study.service.impl;

import cn.hutool.core.util.ObjectUtil;
import com.study.common.auth.dto.AuthQuery;
import com.study.mapper.AuthMapper;
import com.study.rest.Result;
import com.study.service.AuthModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
* @author Carl
* @description 针对表【t_auth(权限表)】的数据库操作Service实现
* @createDate 2022-06-27 20:35:54
*/
@Service
public class AuthModelServiceImpl implements AuthModelService{

    @Autowired
    private AuthMapper authMapper;

    @Override
    public Result<Integer> batchAddAuthModel(AuthQuery authQuery) {
        // 校验
        if(ObjectUtil.isEmpty(authQuery)){
            return Result.failed("authQuery不能为空");
        }
        Integer integer = authMapper.batchInsertAuthModel(authQuery);
        if(integer < 0){
            return Result.failed("批量添加失败");
        }
        return Result.failed("批量添加成功");
    }

    @Override
    public Result<Integer> batchDeleteAuthModel(AuthQuery authQuery) {
        // 校验
        if(ObjectUtil.isEmpty(authQuery)){
            return Result.failed("authQuery不能为空");
        }
        Integer integer = authMapper.batchDeleteAuthModel(authQuery.getAuthIds());
        if(integer < 0){
            return Result.failed("批量删除失败");
        }
        return Result.failed("批量删除成功");
    }
}




