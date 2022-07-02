package com.study.common.base.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @ClassName BaseQuery
 * @Description TODO
 * @Author Carl
 * @Date 2022/6/26 20:21
 **/

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BaseQuery {

    private Date createDate;

    private  Date updateDate;

}
