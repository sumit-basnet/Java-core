/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author sumit
 */
public class ArrayListOperation {
    public static void main(String[] args) {
        List <Integer> l1= new ArrayList<Integer>();
        l1.add(2000);
        l1.add(3000);
        ArrayList <Integer> l2 = new ArrayList<>();
        l2.add(2000);
        l2.add(4000);
        l2.add(5000);
         boolean check =l1.contains(new Integer(2000));
         System.out.println("List contains 2000? : "+check);
         
         int pos =l1.indexOf(new Integer(2000));
         System.out.println("List contains 20001? : "+(pos+1));
         l1.add(0,5000);
         l1.addAll(l2);
         System.out.println(l1);
         System.out.println("size of 1st list l : "+l1.size());
        check = l1.contains(l2);
        System.out.println("list l1 contains wlwment list 2 : " +check);
//        l1.retainAll(l2);
//        System.out.println(l1);
//        l1.removeAll(l2);
        System.out.println(l1);
        System.out.println("+++++++++++++++++++++++");
        for (int i = 0; i < l1.size(); i++) {
            System.out.println(l1.get(i));
            //yesle chai elements tanne kaam garxa l1 bata 
            //yeslai ni herdemna ta aaba
        }
        Object[] coll= l1.toArray();
        for(Object  i:coll){
        System.out.println(i);
        }
        System.out.println("*********************");
        Iterator it= l1.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("++++++++++++++++++++++++++");
        l1.forEach((i)-> {
            System.out.println(i);
        });    
    }
}
