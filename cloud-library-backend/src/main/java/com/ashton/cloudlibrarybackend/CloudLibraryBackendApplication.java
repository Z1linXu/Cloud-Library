package com.ashton.cloudlibrarybackend;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.ashton.cloudlibrarybackend.mapper")
public class CloudLibraryBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudLibraryBackendApplication.class, args);
    }

}
