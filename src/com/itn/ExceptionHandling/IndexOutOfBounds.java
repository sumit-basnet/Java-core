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
public class IndexOutOfBounds {
    public static void main(String[] args) {
        int[] odds= {1,2,5,7,9};
        String s="Nepal";
        
        // display last of array and string 
        try{
            System.out.println("last in array : "+odds[5]);
            System.out.println("last of string : "+s.charAt(5));
            // both of these throws exception 
            
        }catch(ArrayIndexOutOfBoundsException | StringIndexOutOfBoundsException e){
//         this is multi-catch block
        //child exception must be caught first
            System.out.println(e);
        }
//        catch(StringIndexOutOfBoundsException e){
        //this is  multiple catch block
//            System.out.println(e);
//        }
        catch(Exception e){
            //parent exception catch block must appear after child exception block
            System.out.println(e);
        }
    }
}
