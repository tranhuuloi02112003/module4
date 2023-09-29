package com.example.demo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
@EnableWebSecurity
public class  ConfigSecurity extends WebSecurityConfigurerAdapter {
    @Autowired
    UserDetailsService userDetailsService;

    @Bean
    public BCryptPasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userDetailsService).passwordEncoder(passwordEncoder());
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        // Đăng ký những pattern không cần đăng nhập cũng có thể sử dụng
        http.authorizeHttpRequests().antMatchers("/index", "/user/**", "/login").permitAll();
        // Đăng ký pattern cần đăng nhập với quyền user mới được truy cập
        http.authorizeHttpRequests().antMatchers("/role/**").hasRole("USER");
        http.authorizeHttpRequests().antMatchers("/admin/**").hasRole("ADMIN");
        // Trả vêf trang lỗi khi user không có quyền truy cập
        http.authorizeHttpRequests().and().exceptionHandling().accessDeniedPage("/accessDenied");

        http.authorizeHttpRequests().and().formLogin()
                .loginPage("/login")
                .loginProcessingUrl("/doLogin")
                .defaultSuccessUrl("/index")
                .failureUrl("/login?error=true")
                .usernameParameter("user")
                .passwordParameter("pass");
    }
}
