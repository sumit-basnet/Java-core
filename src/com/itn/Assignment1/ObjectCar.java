/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itn.Assignment1;

import java.util.Scanner;

/**
 *
 * @author sumit
 */
public class ObjectCar implements Cloneable {
    int  sn;
    String name;
    String model;
    String type;
    static String importer="Abc enterprises";
    @Override
     public Object clone() throws CloneNotSupportedException{
         return super.clone();
     }
     
    Scanner sc= new Scanner(System.in);
    public void input(){
        System.out.println("enter sn: ");
        sn=sc.nextInt();
        sc.nextLine();
        System.out.println("enter name: ");
        name=sc.nextLine();
        System.out.println("enter model: ");
        model=sc.nextLine();
        System.out.println("enter type: ");
        type=sc.nextLine();
    }
    public void display(){
        System.out.println();
        System.out.println("symbol no is: "+sn);
        System.out.println("name  is: "+name);
        System.out.println("model is: "+model);
        System.out.println("type is: "+type);
        System.out.println("imported by: "+importer);
        System.out.println();
    }
    
}
