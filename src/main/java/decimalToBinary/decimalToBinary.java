/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package decimalToBinary;

import java.util.Scanner;

/**
 *
 * @author lubie
 */
public class decimalToBinary {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a decimal number: ");
        int decimal = scanner.nextInt();

        String binary = Integer.toBinaryString(decimal);
        System.out.println("Binary representation: " + binary);  
    }
    
}
