package pro.sky.calculated.service;

import org.springframework.stereotype.Service;
import pro.sky.calculated.Interface.checkService;

@Service
public class checkServiceServiceImpl implements checkService {
    @Override
    public String sum(int num1, int num2){
        return num1 + " + " + num2 + " = " + (num1 + num2);
    }

    @Override
    public String minus(int num1, int num2){
        return num1 + " - " + num2 + " = " + (num1 - num2);
    }

    @Override
    public String multiply(int num1, int num2){
        return num1 + " * " + num2 + " = " + (num1 * num2);
    }

    @Override
    public String divide(int num1, int num2){
        return num1 + " / " + num2 + " = " + (num1 / num2);
    }
}
