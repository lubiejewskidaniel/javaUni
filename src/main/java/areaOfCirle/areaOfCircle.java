/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package areaOfCirle;

import java.util.Scanner;

/**
 *
 * @author lubie
 */
public class areaOfCircle {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        double area = Math.PI * radius * radius;
        System.out.println("The area of the circle is: " + String.format("%.2f", area));
    }
}
