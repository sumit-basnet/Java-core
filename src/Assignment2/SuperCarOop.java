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
public class SuperCarOop extends CarOop {
   String gear;
   String NOS;
   String AutoBrake;
   
   public SuperCarOop(){
       super();
   }
   
   public SuperCarOop( int  id , String name, String model, String color, String gear, String NOS ,String AutoBrake){
       super(id, name, model,color);
       this.gear=gear;
       this.NOS=NOS;
       this.AutoBrake=AutoBrake;
   }
   
   public void createSuperCar(){
       createCar();
       Scanner sc=new Scanner(System.in);
       System.out.println("enter gear : ");
       this.gear= sc.next();
      
       System.out.println("enter NOS : ");
       this.NOS=sc.next();
       System.out.println("enter AutoBrake : ");
       this.AutoBrake=sc.next();
   }
   public void displaySuperCar(){
       displayCar();
       System.out.println("gear : "+gear);
       System.out.println("NOS : "+NOS);
       System.out.println("AutoBrake : "+AutoBrake);
   }
   
    public static void main(String[] args) {
        SuperCarOop s1= new  SuperCarOop();
        s1.createSuperCar();
        s1.displaySuperCar();
    }
}
