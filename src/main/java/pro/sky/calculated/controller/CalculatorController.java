package pro.sky.calculated.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.calculated.Interface.CheckService;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {

    private final CheckService checkService;

    public CalculatorController(CheckService checkService){
        this.checkService = checkService;
    }

    @GetMapping("/plus")
    public String plus(@RequestParam int num1, @RequestParam int num2){
        return num1 + " + " + num2 + " + " + checkService.sum(num1, num2);
    }

    @GetMapping("/minus")
    public String minus(@RequestParam int num1, @RequestParam int num2){
        return num1 + " - " + num2 + " + " + checkService.minus(num1, num2);
    }

    @GetMapping("/multiply")
    public String multiply(@RequestParam int num1, @RequestParam int num2){
        return num1 + " * " + num2 + " + " + checkService.multiply(num1, num2);
    }

    @GetMapping("/divide")
    public String divide(@RequestParam int num1, @RequestParam int num2){
        return num1 + " / " + num2 + " + " + checkService.divide(num1, num2);
    }
}
