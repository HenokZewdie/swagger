package com.contract.swagger;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NumberController {

    @GetMapping("/validate/prime-number")
    public String isNumberPrime(@RequestParam("number") String number) {
        return Integer.parseInt(number) % 2 == 0 ? "Even" : "Odd";
    }
}
