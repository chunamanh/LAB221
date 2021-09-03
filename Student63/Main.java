
import java.util.ArrayList;
import java.util.List;

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
     public static void main(String[] args) {
        Validate v = new Validate();
        List<Person> list = new ArrayList<>();
        System.out.println("====Management Person Program====");
        v.add(list);
        v.display(list);
    }
}
