/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class BMI {
    
    Validation check = new Validation();
    
    public void calculator() {
        int weight, height;
        weight = check.inputInt("Enter Weight(kg): ", 1, Integer.MAX_VALUE);
        height = check.inputInt("Enter Height(cm): ", 1, Integer.MAX_VALUE);
        double number = weight/((height/100.0)*(height/100.0));
        System.out.println(String.format("BMI number: %.2f", number));
        System.out.print("BMI Status: ");
        if (number < 19)
            System.out.println("Under-stand");
        else if (number < 25)
            System.out.println("Standard");
        else if (number < 30)
            System.out.println("Overweight");
        else if (number < 40)
            System.out.println("Fat-should lose weight");
        else System.out.println("Very fat-should lose weight immediately");
    }

}
