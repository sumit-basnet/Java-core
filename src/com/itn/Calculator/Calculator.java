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
public class Calculator implements Simple, Scientific {

    @Override
    public int add(int []a) {
      int sum=0;
        for(int i =0 ;i<a.length;i++){
        sum =sum+a[i];
      }
       return sum; 
    }

    @Override
    public int sub(int a, int b) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    return a-b;
    }

    @Override
    public int mul(int a, int b) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    return a*b;
    }

    @Override
    public double div(int a, int b) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    return a/b;
    }

    @Override
    public double circleArea(double r) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    return (PI*r*r);
    }

    @Override
    public double Area(double l, double b) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    return l*b;
    }

    @Override
    public double Area(double l) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    return l*l;
    }
    
    public void powerOn(){
        System.out.println("powered on");
    }
    
    public void powerOff(){
        System.out.println("power off");
    }
    
}
