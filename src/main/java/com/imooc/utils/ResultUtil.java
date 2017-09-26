package com.imooc.utils;

import com.imooc.domain.Result;

/**
 * Created by zhouliang
 * 2017-09-26 16:19
 */
public class ResultUtil {
    public static Result<Object> success(Object object) {
        Result<Object> result = new Result<>();
        result.setCode(0);
        result.setMsg("成功");
        result.setData(object);
        return result;
    }

    public static Result<Object> success() {
        return success(null);
    }

    public static Result error(Integer code, String msg) {
        Result result = new Result();
        result.setCode(code);
        result.setMsg(msg);
        return result;
    }
}
