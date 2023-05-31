package at.technikum.slmbbcalcapi.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {
    @RequestMapping("/calc/add")
    public int add(
            @RequestParam int a,
            @RequestParam int b
    ){
        return a+b;
    }
}
