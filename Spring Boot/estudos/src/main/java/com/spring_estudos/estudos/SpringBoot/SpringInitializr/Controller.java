package com.spring_estudos.estudos.SpringBoot.SpringInitializr;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/")
    public String mensagem() {
        return "Meu primeiro projeto Spring Boot Web";
    }
}
