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
public class Bike {
    static int count;
    int sn;
    String name;
    String model;
    int total;
    
    public Bike() {
    sn=count;
    count++;
    }
    static{
        System.out.println("this is the satic 1");
    }
    public void display(){
        System.out.println("id: "+sn);  
        System.out.println("name: "+name);
        System.out.println("model: "+model);
        System.out.println("total:"+count);
    }
    public static void showBike(Bike b){
        System.out.println("id: "+b.sn+" ,name: "+b.name+",model: "+b.model);
    }
    public static void main(String[] args) {
        System.out.println("this is main");
            Bike b2= new Bike();
            b2.name="yamaha";
            b2.model="R-15";
//          b2.display();
            showBike(b2);
    }
    static{
        System.out.println("thus is the static 2");
    }
    
}
