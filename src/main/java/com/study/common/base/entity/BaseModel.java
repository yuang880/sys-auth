package com.study.common.base.entity;

import lombok.Data;

/**
 * @ClassName BaseModel
 * @Description TODO
 * @Author Carl
 * @Date 2022/6/26 20:21
 **/
@Data
public class BaseModel  implements  java.io.Serializable{

    private String  createDate;


    private  String  updateDate;


    private  String createBy;


    private  String  updateBy;
}