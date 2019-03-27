/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment2;

/**
 *
 * @author sumit
 */
public class LaptopDemo {
    public static void main(String[] args) throws CloneNotSupportedException {
        Laptop L2=new Laptop("Asus","Scat srix-ii",240000.00);
//          Laptop L2= new Laptop();
//          L2.Laptop("Asus", "zypherus-M",300000.00); // this produces error
        System.out.println(L2.toString());
        Laptop L3=new Laptop();
//        L3.id=2; // yp private vako vayera change assign gaarna namileko 
        L2.name="Ausus";
        L2.model="Nitro-5";
        L2.price=140000.00;
        System.out.println(L3.toString());
        
        Laptop L5=new Laptop();
        L5=(Laptop)L2.clone();
        L5.name="Alienware";
        System.out.println(L5.toString());
//        
    }
}
