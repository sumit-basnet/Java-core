/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itn;
import java.util.Scanner;
/*
 *
 * @author sumit
 */
public class HelloWorld {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println();//prints the empty line 
        System.out.println("hello world");
        //print with command liine arguments
        System.out.print(args[0]+" ");
        System.out.print(args[1]+"");
        
        String name=null; //null is the literal that could be assigned to any tyoe
        System.out.println("enter your name : ");
        System.out.println("");
        //console input 
        Scanner input = new Scanner(System.in);
        //Scanner is a class form java.util pakage for taking consile input
        //Scanner classobject is created using new keyword for taking inputs
        // new Scanner(System,in)--> is a ScannerConstuctor which crete  an scanner
        //it takes a parameter System.in which is a standred input stream
        name=input.nextLine();
        //inputs a line of string  and places it in a string variable name
        System.out.println("welcome user "+name);
             
        
    }
    
}
