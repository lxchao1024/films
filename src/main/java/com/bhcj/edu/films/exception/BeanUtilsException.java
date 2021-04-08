package com.bhcj.edu.films.exception;

/**
 * BeanUtils exception.
 *
 * @author lxc
 * @date 2021/4/12 10:18
 */
public class BeanUtilsException extends RuntimeException {

    public BeanUtilsException(String message) {
        super(message);
    }

    public BeanUtilsException(String message, Throwable cause) {
        super(message, cause);
    }
}

