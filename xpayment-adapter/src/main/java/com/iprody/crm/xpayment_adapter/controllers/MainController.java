package com.iprody.crm.xpayment_adapter.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class MainController {

    @GetMapping("/")
    public Mono<String> index() {
        return Mono.just("Welcome to index");
    }

    @GetMapping("/actuator")
    public Mono<String> actuator() {
        return Mono.just("200");
    }
}
