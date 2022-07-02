package com.study.mapper;

import com.study.common.user.dto.UserQuery;
import com.study.common.user.entity.UserModel;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @ClassName UserMapper
 * @Description TODO 分页查询所有 添加/批量添加  更新  删除/批量删除  查询/模糊查询
 * @Author Carl
 * @Date 2022/6/26 20:31
 **/
@Mapper
public interface UserMapper {

    /**
     * 功能描述：查询所有用户，返回用户列表
     *
     * @param userQuery 条件
     * @return List<UserModel>
     */
    List<UserModel> selectAllUser(UserQuery userQuery);


    /**
     * 功能描述: 查询某一个用户有几个角色
     *
     * @param userQuery  查询条件，包含UserName
     * @return UserModel的列表
     */
    List<UserModel> selectUserAndRole(UserQuery userQuery);

    /**
     * 功能描述: 批量添加
     *
     * @param userQuery  其中包括一个List<UserModel>
     * @return Integer代表添加是否成功，-1代表失败
     */
    Integer batchInsertUserModel(UserQuery userQuery);

    /**
     * 功能描述: 根据用户id批量删除
     * 这里删除的本质是修改del_flag字段为0，并不是直接删除，因此，底层实际是update语句。
     *
     * @param userIds  Integer[] userIds;
     * @return Integer代表删除是否成功，-1代表失败
     */
    Integer batchDeleteUserModel(@Param("userIds") Integer[] userIds);

    /**
     * 功能描述: 查询所有用户，然后分页展示
     *
     * @return List<UserModel>
     */
    List<UserModel> selectUserModelByPageHelper();

    /**
     * 功能描述: 查询某一个用户有几个角色，再根据角色查询权限
     *
     * @param userQuery  查询条件，包含UserName
     * @return UserModel的列表
     */
    List<UserModel> selectUserAndRoleAndAuth(UserQuery userQuery);

}
