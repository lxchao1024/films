package com.bhcj.edu.films.result;

import lombok.Data;

/**
 * @author lxc
 * @date 2019/4
 */
@Data
public class Result {
    private int code;
    private String message;
    private Object result;

    Result(int code, String message, Object data) {
        this.code = code;
        this.message = message;
        this.result = data;
    }
}
