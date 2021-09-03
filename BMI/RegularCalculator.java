/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class RegularCalculator {
    
    Validation check = new Validation();
    
    public void calculator() {
        double num1, num2, res;
        String operator;
        num1 = check.inputDouble("Enter number: ");
        while(true) {
//            operator = check.inputOperator("Enter operator: ");
//            if (!operator.equals("=")) {
//                num2 = check.inputDouble("Enter number: ", operator);
//                num1 = cal(num1, num2, operator);
//                System.out.println("Memory: " + String.valueOf(num1));
//            } else {
//                System.out.println("Result: " + String.valueOf(num1));
//                return;
//            }
            while(true) {
                operator = check.inputOperator("Enter operator: ");
                num2 = check.inputDouble("Enter number: ");
                if (!operator.equals("/")) break;
                else {
                    if (num2 != 0) break;
                    else System.out.println("Can't div 0, please enter again: ");
                }
            }
            if (!operator.equals("=")) {
                num1 = cal(num1, num2, operator);
                System.out.println("Memory: " + String.valueOf(num1));
            } else {
                System.out.println("Result: " + String.valueOf(num1));
                return;
            }
        }
    }
    
    private double cal(double num1, double num2, String operator) {
        if (operator.equals("+"))
            return num1 + num2;
        if (operator.equals("-"))
            return num1 - num2;
        if (operator.equals("*"))
            return num1*num2;
        if (operator.equals("^"))
            return Math.pow(num1, num2);
        return num1/num2;
    }
}
