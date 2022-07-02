package com.study.mapper;

import com.study.common.auth.dto.AuthQuery;
import com.study.common.auth.entity.AuthModel;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
* @author Carl
* @description 查询所有并分页、批量添加
* @createDate 2022-06-27 20:35:54
* @Entity com.study.common.auth.entity.AuthModel
*/
@Mapper
public interface AuthMapper {

    /**
     * 功能描述: 查询所有权限，然后分页展示
     *
     * @return 权限
     */
    List<AuthModel> selectAuthByPageHelper();

    /**
     * 功能描述:
     *
     * @author Carl
     * @date 2022/6/27 21:15
     * @param authQuery 添加集合
     * @return java.lang.Integer
     **/
    Integer batchInsertAuthModel(AuthQuery authQuery);

    /**
     * 功能描述: 根据id批量删除
     *
     * @author Carl
     * @date 2022/6/28 10:05
     * @param authIds 数组
     * @return java.lang.Integer
     **/
    Integer batchDeleteAuthModel(@Param("authIds")Integer[] authIds);
}




