package io.eskay.testingrender;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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

    @GetMapping("/more")
    public String more(@RequestParam(required = false,defaultValue = "Guest") String name) {
        return """
                Welcome %s this is the third endpoint called more,
                If you're seeing this then it means then
                automatic redeploy is working
               """.formatted(name);
    }
}
