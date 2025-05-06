package com.iprody.crm.xpayment_adapter.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ActuatorController {

    @GetMapping("/actuator")
    public String actuator() {
        return "actuator";
    }
}
