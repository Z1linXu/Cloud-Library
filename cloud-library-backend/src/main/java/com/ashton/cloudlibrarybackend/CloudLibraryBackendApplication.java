package com.ashton.cloudlibrarybackend;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@MapperScan("com.ashton.cloudlibrarybackend.mapper")
@EnableAspectJAutoProxy(exposeProxy = true)
public class CloudLibraryBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudLibraryBackendApplication.class, args);
    }

}
