package io.eskay.testingrender;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@SpringBootApplication
public class TestingRenderApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestingRenderApplication.class, args);
    }

    @GetMapping("/one")
    public String getOne() {
        return "This is the first endpoint";
    }

    @GetMapping("/two")
    public String getTwo() {
        return "Second endpoint successfully deployed on render";
    }
}
