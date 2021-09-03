/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class Main {
    
    static void menu() {
        System.out.println("1. Normal Calculator");
        System.out.println("2. BMI Calculator");
        System.out.println("3. Exit");
    }
    
    public static void main(String[] args) {
        RegularCalculator regular = new RegularCalculator();
        BMI bmi = new BMI();
        Validation check = new Validation();
        while(true) {
            menu();
            int option = check.inputInt("Please choice one option: ", 1, 4);
            switch(option) {
                case 1: 
                    regular.calculator();
                    break;
                case 2:
                    bmi.calculator();
                    break;
                case 3:
                    return;
            }
            System.out.println("");
        }
    }
    
}
