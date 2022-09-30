package pro.sky.calculated.service;

import org.springframework.stereotype.Service;
import pro.sky.calculated.Interface.CheckService;

@Service
public class CheckServiceServiceImpl implements CheckService {
    @Override
    public int sum(int num1, int num2){
        return num1 + num2;
    }

    @Override
    public int minus(int num1, int num2){
        return num1 - num2;
    }

    @Override
    public int multiply(int num1, int num2){
        return num1 * num2;
    }

    @Override
    public int divide(int num1, int num2){
        return num1 / num2;
    }
}
