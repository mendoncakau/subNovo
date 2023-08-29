package com.aula.sub;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
public class SubApplication {

    public static void main(String[] args) {
        SpringApplication.run(SubApplication.class, args);
    }

    @GetMapping("/")
    public  String oi(){
        return "Kakau lindo";
    }


}
