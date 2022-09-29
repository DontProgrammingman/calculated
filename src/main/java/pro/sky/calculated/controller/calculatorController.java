package pro.sky.calculated.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.calculated.Interface.checkService;

@RestController
@RequestMapping("/calculator")
public class calculatorController {

    private final checkService checkService;

    public calculatorController(checkService checkService){
        this.checkService = checkService;
    }

    @GetMapping("/plus")
    public String plus(@RequestParam int num1, @RequestParam int num2){
        return checkService.sum(num1, num2);
    }

    @GetMapping("/minus")
    public String minus(@RequestParam int num1, @RequestParam int num2){
        return checkService.minus(num1, num2);
    }

    @GetMapping("/multiply")
    public String multiply(@RequestParam int num1, @RequestParam int num2){
        return checkService.multiply(num1, num2);
    }

    @GetMapping("/divide")
    public String divide(@RequestParam int num1, @RequestParam int num2){
        return checkService.divide(num1, num2);
    }
}
