
import java.util.ResourceBundle;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Admin
 */
public class TPbank {

    public void menu() {
        System.out.println("=========Login Tien Phong Bank’s Ebank===========");
        System.out.println("1. Vietnamese");
        System.out.println("2. English");
        System.out.println("3. Exit");
    }

    /**
     * @param args the command line arguments
     */
    public void login(ResourceBundle bundle){
        Validation v = new Validation();
         String capcha ="";
           v.checkAccount(bundle);
           v.checkPassword(bundle);
             capcha = v.randomCapcha();
           v.checkCapcha(bundle,capcha);
    }
    public static void main(String[] args) {
        TPbank tp = new TPbank();
        Validation v = new Validation();
        tp.menu();
         String capcha ="";
        int choice = v.getChoice();
        ResourceBundle bundle;
        switch (choice) {
            case 1:
                bundle = ResourceBundle.getBundle("Lang.VI");
               tp.login(bundle);
                break;
            case 2:
                bundle = ResourceBundle.getBundle("Lang.EN");
               tp.login(bundle);
                break;
            case 3:
                System.exit(0);
        }
    }

}
