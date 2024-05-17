package com.example.springbootbenjaminsecurityfilters;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.www.BasicAuthenticationFilter;

@Configuration
public class SecurityConfig {

    @Bean
    @Order(2)
    SecurityFilterChain controllerFilterChain(HttpSecurity http) throws Exception {
        return http
            .securityMatcher("/c/**")
            .authorizeHttpRequests(matcher -> matcher.anyRequest().permitAll())
            .addFilterBefore(new Filter1(), BasicAuthenticationFilter.class)
            .build();
    }

    @Bean
    @Order(1)
    SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        return http
            .securityMatcher("/api/**")
            .authorizeHttpRequests(matcher -> matcher.anyRequest().permitAll())
            .addFilterBefore(new Filter2(), BasicAuthenticationFilter.class)
            .build();
    }

}
