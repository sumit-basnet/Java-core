/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itn.collections;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sumit
 */
public class ListDemo {
    public static void main(String[] args) {
 
//   List l1= new List(); //list interface cannot be instanciated
        List l1= new ArrayList();
        l1.add(100); //adding element to the list
        l1.add(200);
        l1.add("java");
        l1.add('A');
        l1.add(false);
        //non genric array list
        //type unsafe list
        System.out.println("First : "+l1.get(0));
        //fetched first element from a list
        System.out.println("Second : "+l1.get(1));
        l1.remove(1);
        //removing the second element from list
//        int i=l1.get(1);
//        String s= l1.get(1)
          //the returned value could be of any type so java type checking doesnot
          //allow it to assigned to any specific type variable
          System.out.println("New Second : "+l1.get(1));

    } 
}
