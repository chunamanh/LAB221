
import java.util.Random;
import java.util.ResourceBundle;
import java.util.Scanner;
import java.util.regex.Pattern;

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

    Scanner sc = new Scanner(System.in);
    public int getChoice() {
        int choice = 0;
        while (true) {
            try {
                System.out.print("input your choice: ");
                choice = Integer.parseInt(sc.nextLine());
                if (choice >= 1 && choice <= 3) {
                    break;
                }
            } catch (Exception e) {
                System.err.println("invalid choice, please input again");
            }
        }
        return choice;
    }

 public void checkAccount(ResourceBundle bundle) {
        while (true) {
            System.out.println(bundle.getString("account"));
            String username = sc.nextLine();
            Pattern p = Pattern.compile("^[0-9]{10}$");
            if (p.matcher(username).find()) {
                break;
            } else {
                System.out.println(bundle.getString("check.account"));
            }
        }
    }

    public void checkPassword(ResourceBundle bundle) {
        while (true) {
            System.out.println(bundle.getString("password"));
            String password = sc.nextLine();

            Pattern p = Pattern.compile("^[0-9A-Za-z]{8,31}$");//8-31 ki tu
            Pattern pDigit = Pattern.compile("^[0-9a-zA-Z]*[0-9]+[0-9a-zA-Z]*");//check co it nhat 1 so
            Pattern pAnpha = Pattern.compile("^[0-9a-zA-Z]*[a-zA-Z]+[0-9a-zA-Z]*");//co it nhat 1 chu
            if (p.matcher(password).find()) {
                if (p.matcher(password).find() && pDigit.matcher(password).find()
                        && pAnpha.matcher(password).find()) {
                    System.out.println(bundle.getString("right.password"));
                    break;
                } else {
                    System.out.println(bundle.getString("wrong.password"));
                }
            } 

        }
    }

    public String randomCapcha() {
        String alphabet = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        String capcha="";
        Random r = new Random();
        int length=alphabet.length();
        for (int i = 0; i < 6; i++) {
          int index = r.nextInt(length);
            capcha = capcha+alphabet.charAt(index);
        }
        System.out.println(capcha);
        return capcha;
    }

    public void checkCapcha(ResourceBundle bundle,String capcha ) {
        
        while (true) {
            System.out.println(bundle.getString("capcha"));
            String input = "";
            input = sc.nextLine();
            if (capcha.equals(input)) {
                System.out.println(bundle.getString("right.capcha"));
                break;
            } else {
                System.out.println(bundle.getString("wrong.capcha"));
            }
        }
    }

}
