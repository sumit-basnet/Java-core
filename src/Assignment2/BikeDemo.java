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
public class BikeDemo {
    public static void main(String[] args) {
    Bike b1= new Bike();
    b1.name="yamaha";
    b1.model="fzs";
    b1.display();
    Bike b2= new Bike();
    b2.name="yamaha";
    b2.model="R-15";
//    b2.display();
    Bike.showBike(b1);
    
    }
    
    
}
