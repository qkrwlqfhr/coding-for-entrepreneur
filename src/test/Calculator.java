package test;

public class Calculator {
    public static void main (String[] args){
        CalculatorMethods calculatorMethods = new CalculatorMethods();
        System.out.println(calculatorMethods.sum(3,5));
        System.out.println(calculatorMethods.divide(3,5));
        System.out.println(calculatorMethods.multifly(3,5));
        System.out.println(calculatorMethods.substract(3,5));
    }
}
