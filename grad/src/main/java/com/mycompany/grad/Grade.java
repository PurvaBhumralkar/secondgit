/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.grad;

import java.util.Scanner;

/**
 *
 * @author purva
 */
public class Grade {
    public static void main (String args[]){
        int grade;
        Scanner sc =new Scanner (System.in);
        System.out.println("Enter grade ");
        grade = sc.nextInt();
       
        if (grade< 60){
            System.out.println("F");
        } else if (grade < 70) {
            System.out.println("D");
        } else if (grade <80) {
            System.out.println("C");
        } else if (grade <90) {
            System.out.println("B");
        } else {
            System.out.println("A");
        }
    }
}
