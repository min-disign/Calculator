package Mingi.calculator;

public class Calculator {

   public double Result1;

    public double calculate(int num1, int num2, char operator) {
        double result = 0;

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 == 0) {
                    throw new ArithmeticException("Cannot divide by zero.");
                }
                result = (double) num1 / num2;
                break;
            default:
                throw new IllegalArgumentException("Invalid operator: " + operator);
        }

        Result1 = result;
        return Result1;
    }
    public double getLastResult() {
        return Result1;
    }
    public double setLastResult(double Result1){
       return this.Result1 = Result1;
    }



}