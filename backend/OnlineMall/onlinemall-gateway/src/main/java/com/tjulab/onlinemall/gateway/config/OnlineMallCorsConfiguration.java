package com.tjulab.onlinemall.gateway.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.reactive.CorsWebFilter;
import org.springframework.web.cors.reactive.UrlBasedCorsConfigurationSource;

/**
 * 解决跨域问题
 */
@Configuration
public class OnlineMallCorsConfiguration {
    @Bean
    public CorsWebFilter corsWebFilter() {
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        CorsConfiguration corsConfiguration = new CorsConfiguration();
        // 配置跨域
        corsConfiguration.addAllowedHeader("*");      // 设置允许跨域的头
        corsConfiguration.addAllowedMethod("*");      // 设置允许跨域的请求方式
        corsConfiguration.addAllowedOrigin("*");      // 设置允许跨域的请求来源
        corsConfiguration.setAllowCredentials(true);  // 允许携带cookie进行跨域
        source.registerCorsConfiguration("/**", corsConfiguration);
        return new CorsWebFilter(source);
    }
}
