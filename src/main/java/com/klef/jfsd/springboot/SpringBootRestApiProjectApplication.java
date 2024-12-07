package com.klef.jfsd.springboot;  // Main class should be in this package or higher

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication  // This automatically enables component scanning
public class SpringBootRestApiProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootRestApiProjectApplication.class, args);
        System.out.println("SB rest api is running");
    }
}
