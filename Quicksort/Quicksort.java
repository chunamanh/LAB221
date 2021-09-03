/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quicksort;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Quicksort {
public int getSize() {
        Scanner sc = new Scanner(System.in);
        int size = 0;
        while (true) {
            try {
                System.out.println("Enter number of array: ");
                size = Integer.parseInt(sc.nextLine());
                if (size >  0) {
                    break;
                }else{
                      System.out.print("Must be a positive");
                }

            } catch (Exception e) {
                System.out.print("Must be a number");
            } 
        }

        return size;
    }
int partition(int arr[], int left, int right) {
        int i = left, j = right;
        int tmp;
        int pivot = arr[(left + right) / 2];

        while (i <= j) {
            while (arr[i] < pivot) {
                i++;
            }
            while (arr[j] > pivot) {
                j--;
            }
            if (i <= j) {
                tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
                i++;
                j--;
            }
        };
        return i;
    }

void quickSort(int arr[], int left, int right) {
        int index = partition(arr, left, right);
        if (left < index - 1) {
            quickSort(arr, left, index - 1);
        }
        if (index < right) {
            quickSort(arr, index, right);
        }
    }


    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        Quicksort sorter = new Quicksort();
        int size = sorter.getSize();
        Random r = new Random();
        int arr[] = new int[size];
        for (int a = 0; a < size; a++) {
        arr[a] = r.nextInt(10);
        }//gia tri den toi da 10,+ 1 ben ngoai dau ngoac de gias tri bat dau tu 1
        System.out.print("Unsorted array  :[");//in day chua sap xep
        for (int a = 0; a < size ; a++) {
            if (a == size-1){
            System.out.println(arr[a]+ "]" );
        }else{
                System.out.print(arr[a] + ", " );}}
        sorter.quickSort(arr, 0, size - 1);
        System.out.print("Sorted array: [ ");
        for (int a = 0; a < size ; a++) {
            if (a == size-1){
            System.out.println(arr[a]+ "]" );
        }else{
                System.out.print(arr[a] + ", " );}}
        
        
    }
    
}
