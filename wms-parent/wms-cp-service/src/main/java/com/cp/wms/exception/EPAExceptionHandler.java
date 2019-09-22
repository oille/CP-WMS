package com.cp.wms.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@ControllerAdvice //异常处理AOP 拦截所有异常，系统一旦报异常直接进入到该类中
public class EPAExceptionHandler{

    /*@ExceptionHandler(Exception.class) 通用异常处理
    public String processException(Exception e, HttpServletRequest rquest){
        Map<String,Object> map = new HashMap<>();
        if(e instanceof EPAException){
            map.put("message",e.getMessage());
            map.put("type","系统自定义异常");
            map.put("code","customize");
            //rquest.setAttribute("javax.servlet.error.status_code",500);
            rquest.setAttribute("msg",map);
        }else{
            map.put("message",e.getStackTrace());
            map.put("type","运行时异常");
            map.put("code","runtime");
            rquest.setAttribute("javax.servlet.error.status_code",500);
            rquest.setAttribute("msg",map);
        }
        return "forward:/error"; //自适应异常处理，即拦截异常后进行处理，处理结果重新交给springboot自身已经设置过得异常处理组件
    }*/                            //自动配置下/web/sevlet/error/ErrorMvcAutoConfiguration这个类来处理这里面注入了一个BasicErrorController
                              //这里面用来处理/error路径的请求，并根据请求头信息如果是 text/html 用errorHtml方法处理返回页面 ，如果不是
                                 //用ResponseEntity处理返回json

    //返回JSON类型的异常处理
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public Map<String,Object> processException(Exception e){
        Map<String,Object> map = new HashMap<>();
        if(e instanceof EPAException){
            map.put("message",e.getMessage());
            map.put("type","系统自定义异常");
            map.put("code","customize");
        }else{
            map.put("message",e.getStackTrace());
            map.put("type","运行时异常");
            map.put("code","runtime");
        }
        return map;
    }
}


