package com.wangxiaoyang.service2.web.rest;

import com.wangxiaoyang.service2.client.TestService1Client;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * REST controller for managing the current user's account.
 */
@RestController
@RequestMapping("/api")
public class TestResource {

    private final Logger log = LoggerFactory.getLogger(TestResource.class);

    private final TestService1Client testService1Client;

    public TestResource(TestService1Client testService1Client) {
        this.testService1Client = testService1Client;
    }

    /**
     * GET  /authenticate : check if the user is authenticated, and return its login.
     *
     * @param message 消息
     */
    @GetMapping("/test")
    public void isAuthenticated(String message) {
        log.debug("Test");
        testService1Client.test(message);
    }
}
