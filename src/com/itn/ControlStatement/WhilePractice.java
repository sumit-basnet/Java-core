/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itn.ControlStatement;

import java.util.Scanner;

/**
 *
 * @author sumit
 */
public class WhilePractice {
    public static void main(String[] args) {
        char choice='y';
        Scanner sc= new Scanner(System.in);
        System.out.println("Student information center: ");
        System.out.println("____________________________");
        while(choice=='y'){
        System.out.println("Enter student detail");
        System.out.println("Name: ");
        String name= sc.nextLine();
        System.out.println("Gender: ");
        String gender=sc.nextLine();
        System.out.println("postion: ");
        String position= sc.nextLine();
        System.out.println("grade :");
        int grade= sc.nextInt();
        System.out.printf("student detail: %s , %s , %d , %s",name,gender,grade,position);
        System.out.println("Enter another student detail (y/n)");
        choice=sc.next().toLowerCase().charAt(0);
        //adding dummy input
        sc.nextLine();
        //,consumes empty lune so other nextline() command work properly
       }
        System.out.println("thanks for using student informaton system.. ");
    }
}
