package com.example.computer.service;

public class ServiceComputerImpl implements IServiceComputer{
    @Override
    public double caculator(double item1, double item2, String caculation) {
        switch (caculation){
            case "+":
                return item1+item2;
            case "-":
                return item1-item2;
            case "*":
                return item1*item2;
            case "/":
                return item1/item2;
        }
        return 0;
    }
}
