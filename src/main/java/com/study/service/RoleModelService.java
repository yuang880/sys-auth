package com.study.service;

import com.github.pagehelper.PageInfo;
import com.study.common.role.dto.RoleQuery;
import com.study.common.role.entity.RoleModel;
import com.study.rest.Result;

import java.util.List;

/**
* @author Carl
* @description 针对表【t_role(角色表)】的数据库操作Service
* @createDate 2022-06-27 20:45:25
*/

public interface RoleModelService {

    /**
     * 功能描述:
     *
     * @author Carl
     * @date 2022/6/27 20:55
     * @param roleQuery 传进当前页，和展示数
     * @return com.github.pagehelper.PageInfo<com.study.common.role.entity.RoleModel>
     **/
    PageInfo<RoleModel> findRolesByPageHelper(RoleQuery roleQuery);

    /**
     * 功能描述: 批量添加角色
     *
     * @author Carl
     * @date 2022/6/27 21:26
     * @param roleQuery 条件
     * @return com.study.rest.Result<java.lang.Integer>
     **/
    Result<Integer> batchAddRoleModel(RoleQuery roleQuery);

    /**
     * 功能描述: 根据角色名查权限
     *
     * @param roleQuery 查询条件
     * @return 封装进Result
     */
    Result<List<RoleModel>> findRoleAndAuth(RoleQuery roleQuery);

}
