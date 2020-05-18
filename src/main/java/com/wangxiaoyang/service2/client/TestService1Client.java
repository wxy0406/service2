package com.wangxiaoyang.service2.client;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@AuthorizedFeignClient(name = "service1")
public interface TestService1Client {

    @GetMapping(value = "/api/test/{message}")
    void test(@PathVariable(value = "message") String message);
}
