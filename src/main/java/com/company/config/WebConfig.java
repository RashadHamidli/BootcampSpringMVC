package com.company.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@ComponentScan
@EnableWebMvc
@ComponentScan(basePackages = "com.company")
public class WebConfig {
    @Bean
    public ViewResolver viewResolver(){
        InternalResourceViewResolver viewResolver=new InternalResourceViewResolver();
        viewResolver.setPrefix("/src/main/webapp/WEB-INF");
        viewResolver.setSuffix(".jsp");
        return viewResolver;
    }
}
