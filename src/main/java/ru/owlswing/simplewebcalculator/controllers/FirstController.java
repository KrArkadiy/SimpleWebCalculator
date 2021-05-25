package ru.owlswing.simplewebcalculator.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/first")
public class FirstController {
@GetMapping("/calculator")
    public String calculate(@RequestParam("a") int a,
                            @RequestParam("b") int b,
                            @RequestParam("action") String action,
                            Model model) {
    double result;
    switch (action){
        case "multiplication":
            result = a*b;
            break;
        case "addition" :
            result = a+b;
            break;
        case "substraction":
            result = a-b;
            break;
        case "divisionb":
            result = a/(double)b;
            break;
        default:
            result = 0;
            break;
    }
    model.addAttribute("result", result);
    return "/first/result";
    }
}
