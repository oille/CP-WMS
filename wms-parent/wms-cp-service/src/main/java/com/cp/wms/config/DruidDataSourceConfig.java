package com.cp.wms.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

@Configuration
public class DruidDataSourceConfig{

    @Bean
    @ConfigurationProperties(prefix="spring.datasource")
    public DataSource dataSource(){
        DruidDataSource druidDataSource=new DruidDataSource();
        return druidDataSource;
    }

    //配置druid监控
    //配置servlet
    @Bean
    public ServletRegistrationBean druidServlet(){
        ServletRegistrationBean servletRegistrationBean=new ServletRegistrationBean(new StatViewServlet(),"/druid/*");
        //配置一些参数
        Map<String,String> map = new HashMap<>();

        map.put("loginUsername","admin");
        map.put("loginPassword","123456");
        map.put("allow","");//允许那些URL访问 不写允许所有
        map.put("deny","192.168.2.22");//拒绝哪些URL访问

        servletRegistrationBean.setInitParameters(map);
        return servletRegistrationBean;
    }

    //配置filter
    @Bean
    public FilterRegistrationBean druidFliter(){
        FilterRegistrationBean bean = new FilterRegistrationBean();
        Map<String,String> map = new HashMap<>();
        map.put("exclusions","*.js,*.css,*.jpg,*.png,/druid/*");
        bean.setInitParameters(map);
        bean.setFilter(new WebStatFilter());
        bean.setUrlPatterns(Arrays.asList("/*"));

        return bean;
    }
}
