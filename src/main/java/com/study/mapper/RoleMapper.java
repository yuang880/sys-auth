package com.study.mapper;

import com.study.common.role.dto.RoleQuery;
import com.study.common.role.entity.RoleModel;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
* @author Carl
* @description 查询所有并分页、批量添加、
* @createDate 2022-06-27 20:45:25
* @Entity com.study.common.role.entity.RoleModel
*/
@Mapper
public interface RoleMapper {

    /**
     * 功能描述: 查询所有角色，然后分页展示
     *
     * @return 角色
     */
    List<RoleModel> selectRolesByPageHelper();

    /**
     * 功能描述:
     *
     * @author Carl
     * @date 2022/6/27 21:15
     * @param roleQuery 添加集合
     * @return java.lang.Integer
     **/
    Integer batchInsertRoleModel(RoleQuery roleQuery);

    /**
     * 功能描述: 查询某一个角色有几个权限
     *
     * @param roleQuery  查询条件，包含roleName
     * @return RoleModel
     */
    List<RoleModel> selectRoleAndAuth(RoleQuery roleQuery);

}




