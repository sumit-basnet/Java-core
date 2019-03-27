/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itn.ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author sumit
 */
public class InputMismatchDemo {
    public static void main(String[] args) {
        int  a;
        Scanner sc= new Scanner(System.in);
        boolean ok= false;
        do{
            
        
        System.out.println("Enter an integer value : ");
        //user inputs non - integer(chars)
        try{
        a=sc.nextInt();
        ok=false;
        System.out.println("the value is "+a);
        }
        catch(InputMismatchException e){
        ok= true;
            System.out.println("Exception occured : "+e);
        }
        sc.nextLine();
        }while(ok);
//        ======================================
        //number foramt exception
//        ========================================

//        String num="100";
            String  num="rs100";
            //this  throws number format exception trying to convert string value 
            //into equivalent numeric value
            int value=0;
            try{
            value= Integer.parseInt(num);
            System.out.println("the value is "+ value);
            }
            catch(NumberFormatException e){
                System.out.println(e);
            }
        
    }
}
