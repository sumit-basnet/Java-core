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
public class Pen {
  String name;
  String type;
  double price;
  
  public Pen(){
      //default constructor
  }
  public Pen(String type ,double price){
   this.name="starline";
   this.type=type;
   this.price=price;
   
   //  yesma chai name chai kaile ani change hudaena 
  }
  
    @Override
    public String toString() {
        return "Pen{" + "name=" + name + ", type=" + type + ", price=" + price + '}';
    }
  
  
  
  public  Pen(String name,String type,double price){
      this.name=name;
      this.type=type;
      this.price=price;
      // paraneterized constructor
  
  }
    public static void main(String[] args) {
        Pen p1= new Pen();
        p1.name="pilot pen";
        p1.type="Ink pen";
        p1.price=50;
        Pen p2=new Pen("starline","gel",20);
        System.out.println(p1.toString());
        System.out.println(p2.toString());
    }

}
