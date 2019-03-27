/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itn.ExceptionHandling;

/**
 *
 * @author sumit
 */
public class CompileTimeDemo {
    public static void main(String[] args){
       try{
        Class c= Class.forName("com.itn.objects.Boxa");
        //generates compile time ecception
        // forced to handle by java compiler
           System.out.println("Inside try block.. ");
       }
       catch(Exception e){
           // inside catch block exception object is reffered as e
//           e.printStackTrace();
        System.out.println(e);
           System.out.println();
           System.out.println(e.getMessage());
       }
       //some others task after try-catch block
       // is  executed if exception handling is done 
       // and even if exceptiom occurs
        System.out.println("Normal Flow of program execution.. : ");
    }
}
 