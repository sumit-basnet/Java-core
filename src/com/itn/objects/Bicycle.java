/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itn.objects;

/**
 *
 * @author sumit
 */
public class Bicycle {
    static int count;
    // tf  we donot insert static than count is produced to each and every object so count is always set to 0
    int sn;
    String brand;
    //String  model;
    double price;
    
   public Bicycle(){
        sn=count++;
    }
    
   public void showBicycle(){
       System.out.println("sn: "+sn);
       System.out.println("Brand: "+brand);
       System.out.println("Price: "+price);
       System.out.println("Total production: "+Bicycle.count);
       // the count here is the static variable so we need to call with thw refrence of the classs
       // this is the better practice 
       
   }
   public static void displayBicycle(Bicycle b){
       //this methods works for class to dsplay its objects
       // so inorder to display it should be provided with what it should display
       System.out.println("sn: "+b.sn + "title: "+b.brand+ "price: "+b.price);
      //if it was a non static method  we could use it like  below 
//             System.out.println("sn: "+sn + "title: "+brand+ "price: "+price);

   }
    public static void main(String[] args) {
        Bicycle b1=new Bicycle();
        b1.brand="Hero";
        b1.price=1200;
        
        Bicycle b2=new Bicycle();
        b2.brand="pheonix";
        b2.price=1300;
        
        // using non-statc methods
        b1.showBicycle();
        b2.showBicycle();
        //using static method 
        displayBicycle(b1);
        displayBicycle(b2);
    }
}
