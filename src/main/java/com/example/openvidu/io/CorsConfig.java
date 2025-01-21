package com.example.openvidu.io;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;

import java.util.Arrays;

@Configuration
@Primary
public class CorsConfig implements CorsConfigurationSource {

    @Override
    public CorsConfiguration getCorsConfiguration(HttpServletRequest request) {
        CorsConfiguration config = new CorsConfiguration();

        // 허용할 오리진 설정 (클라이언트 도메인으로 변경하세요)
        config.setAllowedOrigins(Arrays.asList("http://localhost:3000", "http://localhost:5173", "http://localhost:8080",
                "http://localhost:80","http://localhost:443","http://localhost:5080",
                "http://ec2-3-35-216-33.ap-northeast-2.compute.amazonaws.com:8080",
                "http://ec2-3-35-216-33.ap-northeast-2.compute.amazonaws.com:80",
                "http://ec2-3-35-216-33.ap-northeast-2.compute.amazonaws.com:6080",
                "http://ec2-3-35-216-33.ap-northeast-2.compute.amazonaws.com/**",
                "http://3.35.216.33:80",
                "http://3.35.216.33:8080",
                "http://3.35.216.33:6080"

        ));

        // 허용할 HTTP 메서드 설정
        config.setAllowedMethods(Arrays.asList("GET", "POST", "PUT", "DELETE", "OPTIONS"));

        // 허용할 헤더 설정
        config.setAllowedHeaders(Arrays.asList("*"));

        // 노출할 헤더 설정 (클라이언트에서 접근 가능한 헤더)
        config.setExposedHeaders(Arrays.asList("access"));

        // 인증 정보 허용 여부 설정
        config.setAllowCredentials(true);

        return config;
    }
}