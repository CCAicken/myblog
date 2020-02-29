package com.example.myblog;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * @description: 修改启动类，继承 SpringBootServletInitializer 并重写 configure 方法
 * @author: lgd
 * @create: 2020-01-17 23:39
 */
public class SpringBootStartMyblogApplication extends SpringBootServletInitializer {
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        // 注意这里要指向原先用main方法执行的Application启动类
        return builder.sources(MyblogApplication.class);
    }

}
