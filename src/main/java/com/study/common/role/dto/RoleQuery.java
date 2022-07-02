package com.study.common.role.dto;

import com.study.common.base.dto.BaseQuery;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @ClassName RoleQuery
 * @Description TODO
 * @Author Carl
 * @Date 2022/6/26 20:19
 **/
@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RoleQuery  extends BaseQuery {

    private Integer roleId;

    private String roleName;

    private Integer pageNum;

    private Integer pageSize;

    private List<RoleQuery> roleQueryList;

}
