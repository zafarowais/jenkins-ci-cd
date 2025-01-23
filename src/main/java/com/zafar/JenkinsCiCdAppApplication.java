package com.zafar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class JenkinsCiCdAppApplication {

    @GetMapping("/greet/{name}")
    public String greetMessage(@PathVariable String name) {
        return "Hello" + name + "How are you?";
    }

    public static void main(String[] args) {
        SpringApplication.run(JenkinsCiCdAppApplication.class, args);
    }

}
