package com.spring.boot.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MediaTypeController {

    @GetMapping(value = "/json", consumes = MediaType.APPLICATION_JSON_VALUE)
    public String json() {
        return "HTTP Header 의 ContentType 을 application/json 으로 설정하여 해당 타입만 받도록 한다.";
    }

    @GetMapping(value = "/accept", produces = MediaType.TEXT_PLAIN_VALUE)
    public String accept() {
        return "HTTP Header 의 AcceptType 을 application/json 으로 설정하여 해당 타입만 받도록 한다.";
    }

    @RequestMapping("/option")
    public String option() {
        return "option() 을 이용해 테스트를 진행하면 HTTP Method 목록을 헤더에 반환한다.";
    }
}
