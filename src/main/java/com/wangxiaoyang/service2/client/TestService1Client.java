package com.wangxiaoyang.service2.client;


import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Service
@AuthorizedFeignClient(name = "service1")
@RequestMapping("/api")
public interface TestService1Client {

    @GetMapping(value = "/test/{message}")
    void test(@PathVariable(value = "message") String message);
}
