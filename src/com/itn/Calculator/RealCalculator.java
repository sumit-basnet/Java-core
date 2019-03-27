/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itn.Calculator;

/**
 *
 * @author sumit
 */
public class RealCalculator extends Calculator {
    public static void main(String[] args) {
        RealCalculator r1 = new RealCalculator();
        r1.powerOn();
        int [] a={1,2,3,4,5,6,7};
       int sum = r1.add(a);
       int sub = r1.sub(5, 3);
       int mul=r1.mul(4, 2);
      double  div= r1.div(20, 2);
      
      double circleArea= r1.circleArea(3);
      double squareArea= r1.Area(5);
      double rectangleArea= r1.Area(2.5, 2.5);
      
        System.out.println("sum = "+sum);
        System.out.println("substration = "+sub);
        System.out.println("multiply = "+mul);
        System.out.println("division = "+div);
        System.out.println("Circle area "+circleArea);
        System.out.println("Square area = "+squareArea);
        System.out.println("reactangle  Area = "+rectangleArea);
        
        r1.powerOff();
        
       
    }
    
}
