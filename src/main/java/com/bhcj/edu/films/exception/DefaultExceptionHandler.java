package com.bhcj.edu.films.exception;

import com.bhcj.edu.films.result.Result;
import com.bhcj.edu.films.result.ResultFactory;
import org.apache.shiro.authz.UnauthorizedException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Global exception handler.
 *
 * @author lxc
 * @date 2021/4/12 10:18
 */
@ControllerAdvice
@ResponseBody
public class DefaultExceptionHandler {
    @ExceptionHandler(value = Exception.class)
    public Result exceptionHandler(Exception e) {
        String message = null;

        if (e instanceof IllegalArgumentException) {
            message = "传入了错误的参数";
        }

        if (e instanceof MethodArgumentNotValidException) {
            message = ((MethodArgumentNotValidException) e).getBindingResult().getFieldError().getDefaultMessage();
        }

        if (e instanceof UnauthorizedException) {
            message = "权限认证失败";
        }

        return ResultFactory.buildFailResult(message);
    }
}
