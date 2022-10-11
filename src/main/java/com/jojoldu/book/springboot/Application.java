package com.jojoldu.book.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication //스프링부트의 자동설정, 스프링 bean 읽기와 생성을 모두 자동 설정
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        //run으로 인해 내장 was 를 사용
    }

}
