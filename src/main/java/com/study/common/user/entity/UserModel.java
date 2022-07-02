package com.study.common.user.entity;

import com.study.common.base.entity.BaseModel;
import com.study.common.role.entity.RoleModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @ClassName UserModel
 * @Description TODO
 * @Author Carl
 * @Date 2022/6/26 20:18
 **/
@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserModel extends BaseModel {
    /**
     * 用户id
     */
    private Integer uId;
    /**
     * 用户昵称
     */
    private String userName;
    /**
     * 用户性别，0为女，1为男
     */
    private Integer sex;
    /**
     * 出生日期
     */
    private String birthday;

    /**
     * 是否被删除，0表示被删除，1表示没有被删除
     */
    private Integer delFlag;

    private List<RoleModel> roleModelList;
}
