package com.ds.utils;

/**
 * @ClassName: Result
 * @Description: function desc
 * @Author cnopens
 * @Date 2020/9/14 下午3:31
 * @Copyright Dashuo
 **/
public class Result {
    private int code;
    private String message;
    private Object data;


    public static Result toResult(int code, String message, Object data) {
        return new Result(code, message, data);
    }

    public Result(int code, String message, Object data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
