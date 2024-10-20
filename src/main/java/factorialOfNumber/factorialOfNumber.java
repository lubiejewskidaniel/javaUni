/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factorialOfNumber;

import java.util.Scanner;

/**
 *
 * @author lubie
 */
public class factorialOfNumber {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        int factorial = 1;

        for (int i = 1; i <= num; i++) {
            factorial *= i;
            System.out.println(factorial);
        }

        System.out.println("The factorial of " + num + " is: " + factorial);    
    }
}
