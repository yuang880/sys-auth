package com.study.common.auth.dto;

import com.study.common.base.dto.BaseQuery;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @ClassName AuthQuery
 * @Description TODO
 * @Author Carl
 * @Date 2022/6/26 20:19
 **/
@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AuthQuery extends BaseQuery {
    private Integer authId;

    private String authName;

    private List<AuthQuery> authQueryList;

    private Integer[] authIds;

}
