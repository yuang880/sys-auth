package com.study.service;

import com.study.common.auth.dto.AuthQuery;
import com.study.rest.Result;

/**
* @author Carl
* @description 针对表【t_auth(权限表)】的数据库操作Service
* @createDate 2022-06-27 20:35:54
*/
public interface AuthModelService {


    /**
     * 功能描述: 批量添加权限
     *
     * @author Carl
     * @date 2022/6/27 21:26
     * @param authQuery 条件
     * @return com.study.rest.Result<java.lang.Integer>
     **/
    Result<Integer> batchAddAuthModel(AuthQuery authQuery);

    /**
     * 功能描述: 批量删除权限
     *
     * @author Carl
     * @date 2022/6/27 21:26
     * @param authQuery 条件
     * @return com.study.rest.Result<java.lang.Integer>
     **/
    Result<Integer> batchDeleteAuthModel(AuthQuery authQuery);

}
