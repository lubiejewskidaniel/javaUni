/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fibonacci;

import java.util.Scanner;

/**
 *
 * @author lubie
 */
public class fibonacci {
    public static void main (String[] arg){
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of terms for Fibonacci sequence: ");
        int n = scanner.nextInt();

        int first = 0, second = 1;
        System.out.print("Fibonacci Sequence: " + first + " " + second);

        for (int i = 2; i < n; i++) {
            int next = first + second;
            System.out.print(" " + next);
            first = second;
            second = next;
        }
    }
    
}
