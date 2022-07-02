package com.study.rest;


/**
 * @author Carl
 */

public enum CodeEnum {
    SUCCESS(200),
    ERROR(-2);

    private Integer code;
    CodeEnum(Integer code){
        this.code = code;
    }

    public Integer getCode() {
        return code;
    }
}
