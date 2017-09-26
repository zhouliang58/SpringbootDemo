package com.imooc.exception;

import com.imooc.enums.ResultEnum;

/**
 * Created by zhouliang
 * 2017-09-26 16:17
 */
public class GirlException extends RuntimeException {
    private Integer code;

    public GirlException(ResultEnum resultEnum) {
        super(resultEnum.getMsg());
        this.code = resultEnum.getCode();
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
