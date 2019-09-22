package com.cp.wms.exception;

import org.springframework.boot.web.servlet.error.DefaultErrorAttributes;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.WebRequest;

import java.util.Map;

@Component
public class EPAErrorAttributes extends DefaultErrorAttributes {
    @Override
    public Map<String, Object> getErrorAttributes(WebRequest webRequest, boolean includeStackTrace) {
        //获取最原始的提示信息
        Map<String,Object> map = super.getErrorAttributes(webRequest,includeStackTrace);
        //添加自己的信息
        //map.put("company","");
        //获取到传过来的 handle 传过来的异常信息map
        Map<String,Object> _map = (Map<String, Object>) webRequest.getAttribute("msg",0);
        map.put("msg",_map);
        return map;
    }
}
