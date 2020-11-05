package com.backend.auth.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.cors(); // TODO: Enable Cors Function (Get, Put, Post, Delete etc)
        http.csrf().disable(); // TODO: Disable Csrf Function
        http.authorizeRequests().antMatchers("/**")
                .fullyAuthenticated().and().httpBasic();
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        // TODO: We make a hardcode for user and password
        auth.inMemoryAuthentication().withUser("riskiip").password("{noop}kikiganteng")
                .roles("USER");
    }
}
