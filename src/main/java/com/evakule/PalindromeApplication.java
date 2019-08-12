package com.evakule;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class PalindromeApplication {

    public static void main(String[] args) {
        SpringApplication.run(PalindromeApplication.class, args);
    }
}
