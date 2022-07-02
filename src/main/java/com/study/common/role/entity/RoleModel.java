package com.study.common.role.entity;

import com.study.common.auth.entity.AuthModel;
import com.study.common.base.entity.BaseModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * 角色表
 * @author Carl
 */
@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RoleModel extends BaseModel {

    private Integer roleId;

    /**
     * 角色名称
     */
    private String roleName;

    private List<AuthModel> authModelList;

}