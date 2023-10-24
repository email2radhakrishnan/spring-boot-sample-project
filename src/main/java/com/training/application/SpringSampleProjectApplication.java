package com.training.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;


@SpringBootApplication
public class SpringSampleProjectApplication {

    public static void main(String[] args) {
        List a = Arrays.asList(new int[]{1});
        Collections.min(a);
        System.out.println(-20 > -40
        );
        SpringApplication.run(SpringSampleProjectApplication.class, args);
    }

}
