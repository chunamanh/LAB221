
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class Validation {
    
    private Scanner sc = new Scanner(System.in);
    
    public int inputInt(String mess, int min, int max) {
        System.out.print(mess);
        while(true) {
            String input = sc.nextLine();
            try {
                int number = Integer.parseInt(input);
                if (number < min || number > max) {
                    System.out.print("Please input between " + min + ", " + max + ": ");
                    continue;
                }
                return number;
            } catch (Exception e) {
                System.out.print("Please input an integer number: ");
            }
        }
    }
    
    public double inputDouble(String mess) {
        System.out.print(mess);
        while(true) {
            String input = sc.nextLine();
            try {
                double number = Double.parseDouble(input);
//                
            return number;
            } catch (Exception e) {
                System.out.print("Please input a double number: ");
            }
        }
    }
    
    public String inputOperator(String mess) {
        while(true) {
            System.out.print(mess);
            String input = sc.nextLine();
            //if (input.equals("+") || input.equals("-") || ..) return input
            if ("+-*/^=".indexOf(input) >= 0 && input.length() == 1)
                return input;
            else System.out.println("Please intput(+, -, *, /, ^)");
        }
    }
}
