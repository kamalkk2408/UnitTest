package com.kishore.kamal;

public class Calculator {

    CalculatorService calculatorService;

    Calculator(CalculatorService calculatorService){
        this.calculatorService = calculatorService;
    }


    public Integer perform(Integer a, Integer b){return a *calculatorService.add(a,b);}
}
