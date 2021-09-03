/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linearsearch;

import java.util.Random;
import java.util.Scanner;

public class Linearsearch {

    //check input must be positive and not alphabet
    public int getSize() {
        Scanner sc = new Scanner(System.in);
        int size = 0;
        while (true) {
            try {
                System.out.println("Enter number of array: ");
                size = Integer.parseInt(sc.nextLine());
                if (size > 0) {
                    break;
                } else {
                    System.out.println("Must be a positive");
                }

            } catch (Exception e) {
                System.out.println("Must be a number");
            }
        }

        return size;
    }
//check value must not be alphabet

    public int getValue() {
        Scanner sc = new Scanner(System.in);
        int value = 0;
        while (true) {
            try {
                System.out.println("Enter search value: ");
                value = Integer.parseInt(sc.nextLine());
                break;
            } catch (Exception e) {
                System.out.println("wrong input");
            }
        }

        return value;
    }

    public void multisearch(int arr[], int size, int value) {
        //Find index of value
        String indexS = "";
        for (int i = 0; i < size; i++) {
            if (value == arr[i]) {
                indexS += i + ", ";
            }
            // tim phan tu o nhieu vi tri
        }
        if (indexS.isEmpty()) {
            System.out.println("Not found");
        } else {
            System.out.println("Found " + value + " at index: " + indexS.substring(0, indexS.length() - 2));
        } //isEmpty=equals("")
    }

    public void search(int arr[], int size, int value) {
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (value == arr[i]) {
                index = i;
                break;//tim ra phan tu dau tien
            }
        }
        if (index == -1) {
            System.out.println("Not found");
        } else {
            System.out.println("Found " + value + " at index: " + index);
        }

    }

    public void display(int arr[], int size) {
        System.out.print("The array: [");
        for (int i = 0; i < size; i++) {
            if (i == size - 1) {
                System.out.println(arr[i] + "]");
            } else {
                System.out.print(arr[i] + ", ");
            }
        }
    }

    public static void main(String[] args) {
        //input size of array
        Linearsearch ln = new Linearsearch();
        int size = ln.getSize();
        //initial array
        Random r = new Random();
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = r.nextInt(10);//gia tri den toi da 10,+ 1 ben ngoai dau ngoac de gias tri bat dau tu 1
        }
        //input value search
        int value = ln.getValue();
        ln.display(arr, size);
        ln.multisearch(arr, size, value);

    }
}
