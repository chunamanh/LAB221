/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacci;

/**
 *
 * @author Admin
 */
public class Fibonacci {
    
 
    public static void main(String[] args) {
        int prenum= 0 ;
        int nextnum = 1;
        System.out.print(prenum+" "+nextnum+" " );
      
        for (int i = 0;i< 43;i++){
            int sum = prenum + nextnum;
            System.out.print(sum+ ", ");
            prenum = nextnum;
            nextnum= sum;
            
        }
    }
    
}
