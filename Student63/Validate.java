/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;


public class Validate {
     Scanner sc = new Scanner(System.in);

    public String getName() {
        String name = "";
      while (true) {
            System.out.print("Enter name: ");
            name = sc.nextLine();
            if (name.trim().length() == 0) {
                continue;
            }
            break;
        } 
        return name;
    }
      public String getAddress() {
        String address = "";
        while (true) {
            System.out.print("Enter Address: ");
            address = sc.nextLine();
            if (address.trim().length() == 0) {
                continue;
            }
            break;
        } 
        return address;
    }
     public double getSalary() {
        double n = 0;
        while (true) {
            try {
                System.out.print("Enter salary: ");
                n = Float.parseFloat(sc.nextLine());
                if (n < 0) {
                    continue;
                }
            } catch (Exception e) {
                System.out.println("Oop ! Enter again: ");
                continue;
            }
            break;
        } 
        return n;
    }
      public void add(List<Person> list) {
        for(int i=0; i<3; i++){
        System.out.println("Input information of student");
        String name = getName();
        String address = getAddress();
        double salary = getSalary();
        Person p = new Person(name, address, salary);
        list.add(p);
        }
    }
    public void display(List<Person> list){
        Collections.sort(list, new Comparator<Person>() {
                @Override
                public int compare(Person o1, Person o2) {
                    return (int) (o1.getSalary() - o2.getSalary());
                }
            });
         for(int i=0; i<list.size(); i++){
            System.out.println(" ");
            System.out.println("Information of person you have entered");
            list.get(i).display();
          
        }
    }
}


