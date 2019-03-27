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
public class Laptop implements Cloneable {

    int id;
    String name;
    public String model;
    protected double  price;
    static String imported= "By lappy trading center";
   public Laptop(){
       name="no name";
       model="no model";
       price=00.00;
   }
   @Override
   public Object clone() throws CloneNotSupportedException{
       return super.clone();
   }
   public void input(){
       Scanner sc=new Scanner(System.in);
       System.out.println("enter id: ");
       id=sc.nextInt();
       System.out.println("enter name: ");
       name=sc.nextLine();
       System.out.println("enter model: ");
       model= sc.nextLine();
   }
   
   @Override
    public String toString(){
     return("id= "+id+ ", name= "+name+" ,Model= "+model+", price= "+" , price= "+price+", Imported by= "+imported);   
    }
    public Laptop(String name, String model,double price ){
        this.name= name;
        this.model=model;
        this.price=price;
                
    }
    
    
    public static void main(String[] args) {
       Laptop L1=new Laptop();
       L1.id=1;
       L1.name="MSI";
       L1.model="Msi-GS65VR";
       L1.price=270000.00;
               
        System.out.println(L1.toString());
    }

    Laptop clone(Laptop L2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
