/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bubblesort2;

import java.util.Random;
import java.util.Scanner;

public class BubbleSort2 {

    //check input
    public int getSize() {
        Scanner sc = new Scanner(System.in);
        int size = 0;
        //input size of array
        while (true) {
            try {
                System.out.println("Enter number of array: ");
                size = Integer.parseInt(sc.nextLine());
                if (size > 0) {
                    break;
                } else {
                    System.out.print("Must be a positive");
                }

            } catch (Exception e) {
                System.out.print("Must be a number");
            }
        }
        return size;
    }

    public void bubbleSort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    {
                        // swap arr[j+1] and arr[i] 
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
            }
        }
    }
    //display array

    void display(int[] arr) {
        for (int a = 0; a < arr.length; a++) {
            if (a == arr.length - 1) {
                System.out.println(arr[a] + "]");
            } else {
                System.out.print(arr[a] + ", ");
            }
        }
    }

    public static void main(String[] args) {
        //input size of array
        BubbleSort2 ob = new BubbleSort2();
        int size = ob.getSize();
        Random r = new Random();
        int arr[] = new int[size];
        for (int a = 0; a < size; a++) {
            arr[a] = r.nextInt(10);
        }//gia tri den toi da 10,+ 1 ben ngoai dau ngoac de gias tri bat dau tu 1
        System.out.print("Unsorted array  :[");//in day chua sap xep
        ob.display(arr);
        ob.bubbleSort(arr);
        //in day da sap xep
        System.out.print("sorted array  :[");
        ob.display(arr);
    }
}
