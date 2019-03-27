/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itn.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author sumit
 */
public class ArrayListDemo {
    public static void main(String[] args) {
      List<Integer> l1= new ArrayList<>();
      l1.add(10001);
//      l1.add("java");
      //not allowed  in list
      //generic list only allows the specified type values
      l1.add(20001);
      ArrayList<Integer> l2= new ArrayList<>();
       l2.add(30001);
       l2.add(400001);
       
      boolean check=  l1.contains(new Integer(20001));
       //it returns in boolean  so it is s assigned to boolean variable
        System.out.println("List contains 20001? : "+check);
        
        int pos= l1.indexOf(new Integer(20001));
        System.out.println("value of 20001 is position "+(pos+1));
        l1.add(0,10000);
        //inserting an element n first position is time consuming for lage list
        //it performs multiple shift operation on the list to create a empty position 
        // for value  to be added into a list
        // so it  isnot favorable to use arraylistif  er are to perform insertion or 
        // removal elements from a list on positionsother than last
        //
        // before adding colection list2 to list 1
        check=l1.contains(l2);
        System.out.println("list l1 contains elementfrom list 2:"+check);
        
        l1.addAll(l2);
        //add l2 into lsit l1
        System.out.println("size of lst 1:"+ l1.size());
        //after adding  colection list2 to list1
        check=l1.contains(l2);
        System.out.println("list l1 contains elementfrom list 2:"+check);
//        l1={1000,10001,20001,30001,40001}
        
//        l1.retainAll(l2);// yesle  intersecto ko kaam gaarxa
//        l1={30001,40001}
//        maintains a list l1 that contains only elements that is  present in l2
//         it retains common elements of l1 and l2 in l1
            
            //remove all
            l1.removeAll(l2);
            //l1=(10000,10001,2001}
            //remove the common from list l1 and l2
            //accessing the lis using loop
            System.out.println("****************************");
        for (int i = 0; i < l1.size(); i++) {
            System.out.println(l1.get(i));
        }
        Object [] coll= l1.toArray();
        for(Object i:coll ){
            System.out.println(i);
        }
        System.out.println("**************************************");
        //to access a collection elements we can use iterator
        Iterator it= l1.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("************************************");
        l1.forEach( (i) -> {
            System.out.println(i);
            });
        //this is known as lambda expression
        
    }
}
