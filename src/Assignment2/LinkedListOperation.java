/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment2;

import java.util.Iterator;
import java.util.LinkedList;

/**
 *
 * @author sumit
 */
public class LinkedListOperation {
    public static void main(String[] args) {
        LinkedList <String> f = new LinkedList<>();
        f.add("apple");
        f.add("banana");
        f.add("orange");
        f.add("banana");
        f.add(1,"grapes");
        System.out.println(f.get(0));
        System.out.println("+++++++++");
        for(String s: f){
            System.out.println(s);
        }
        System.out.println("===============");
        Iterator i=f.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
        
    }
}
