package com.example.blogupdate.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class ConfigSecurity extends WebSecurityConfigurerAdapter  {

    @Override
    protected void configure(HttpSecurity http) throws Exception {

        // Đăng ký những pattern không cần đăng nhập cũng có thể sử dụng
        http.authorizeHttpRequests().antMatchers("/index", "/user/**", "/login").permitAll();
    }

}
