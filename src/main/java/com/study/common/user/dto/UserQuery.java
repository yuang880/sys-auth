package com.study.common.user.dto;

import com.study.common.base.dto.BaseQuery;
import com.study.common.base.entity.BaseModel;
import com.study.common.user.entity.UserModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @ClassName UserQuery
 * @Description TODO
 * @Author Carl
 * @Date 2022/6/26 20:18
 **/
@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserQuery extends BaseQuery {

    private Integer userId;

    private String userName;

    private Integer sex;

    private String birthday;

    private List<UserQuery> userQueryList;

    private Integer[] userIds;

    private Integer pageNum;

    private Integer pageSize;
}
