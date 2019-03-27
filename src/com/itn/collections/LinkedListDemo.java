/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itn.collections;

import java.util.Iterator;
import java.util.LinkedList;

/**
 *
 * @author sumit
 */
public class LinkedListDemo {
    public static void main(String[] args) {
    LinkedList<String> fruits= new LinkedList<>();
    fruits.add("Apple");
    fruits.add("orange");  
    fruits.add(1,"Banana");
//    fruits.add(111);
    String newFruit = fruits.get(2);
        System.out.println("++++++++++++++++");
        for (String s: fruits) {
            System.out.println(s="Mango");
        }
        Iterator it = fruits.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}

