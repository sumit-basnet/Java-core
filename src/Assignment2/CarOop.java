/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment2;

import java.util.Scanner;

/**
 *
 * @author sumit
 */
public class CarOop {
    int sn;
    String name;
    String model;
    String color;
    
    public CarOop(){
    }
    
    public CarOop(int sn, String name, String model, String color){
        this.sn=sn;
        this.name=name;
        this.model=model;
        this.color=color;
    }
    
    public void createCar(){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter sn :" );
        sn=sc.nextInt();
        sc.nextLine();
        System.out.println("enter name : ");
        name=sc.nextLine();
        System.out.println("enter model : ");
        model=sc.nextLine();
        System.out.println("enter color : ");
        color=sc.next();
    }
    
    public  void displayCar(){
        System.out.println("===================================");
        System.out.println("sn : "+sn);
        System.out.println("name : "+name);
        System.out.println("model : "+model);
        System.out.println("color : "+color);
        System.out.println("===================================");
    }
}
