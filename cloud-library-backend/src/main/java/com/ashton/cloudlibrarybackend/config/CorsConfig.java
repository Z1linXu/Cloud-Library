package com.ashton.cloudlibrarybackend.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        // Apply CORS settings to all endpoints
        registry.addMapping("/**")
                // Allow sending cookies (credentials)
                .allowCredentials(true)
                // Allowed origins (using patterns to avoid conflicts when credentials are enabled)
                .allowedOriginPatterns("*")
                // Allowed HTTP methods
                .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS")
                // Allowed request headers
                .allowedHeaders("*")
                // Expose response headers to the client
                .exposedHeaders("*");
    }
}