/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itn.ControlStatement;

/**
 *
 * @author sumit
 */
public class ForLoopDemo {
    public static void main(String[] args) {
    //for(intialization ; condtion_check ; update){}    
        int i=0;
        for(;i<10;){
            System.out.print(i++);
        }
        for(int j=0;j<10;j++){
            //j is local inside block
            System.out.println("j");
        }       
        for(int j=0;j<10;j++){
            System.out.println(i);
        }
        for(int j=0;j<5;j++){
            for(int k =0;k<5;k++){
                System.out.println(j+","+k);   
            }
        }
    }
}
