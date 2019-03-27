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
public class MethodOperation {
    public void area(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter l: ");
        double l=sc.nextDouble();
        System.out.println("enter b; ");
        double b= sc.nextDouble();
        
        double area=l*b;
        System.out.println("the area is : "+area);
    }
    public  static double area(double l,double b){
        return l*b;
    }
    
    public static void main(String[] args) {
        MethodOperation m1= new MethodOperation();
        m1.area();
        double area=m1.area(2.00,3.00);
        System.out.println("the area is :"+area);
    }
    
}
