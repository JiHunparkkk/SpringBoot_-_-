package com.jihun.webBook;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class WebBookApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebBookApplication.class, args);
    }

}
