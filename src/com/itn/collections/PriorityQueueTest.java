/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itn.collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 *
 * @author sumit
 */
public class PriorityQueueTest {
    public static void main(String[] args) {
        Queue <String> q1= new PriorityQueue();

        q1.add("Apple");
        q1.offer("dell");
        //yesle pani add nai gaarba kaam gaarxa but the offer is used espcally in queue
        q1.offer("dell");
        q1.offer("HP");
        q1.offer("msi");
        System.out.println("Head  of Queue : "+q1.element());
        //returns head element but doesnot  remove it from queue
        System.out.println("Head of queue : "+q1.peek());
        //retuns the head element but doesnot remove the head element
        System.out.println(q1);
        //it maintans a queue in some natural ordering 
        System.out.println("Head pf queue : "+q1.poll());
        //retrives and removes the first element from teh queue
        q1.remove();
        //removes head from queue
        q1.remove("dell");
        //remove the element from queue
        System.out.println(q1);
        
                
        Queue<String>  q2=  new LinkedList<>();
        // yo chai queue nai ho jun chai link list data strucute ko hunxa
        //or it can also be interpreted as the link list  having the faeatures of queue
        q2.offer("java");
        q2.offer("PHP");
        q2.offer("JavaScript");
        q2.offer("Python");
        
        Iterator it= q2.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
        System.out.println("++++++++++++++++++++");
        q2.forEach((s)->{
            System.out.println(s);
        });
        System.out.println(q2);
        System.out.println("Head : "+q2.poll());
        System.out.println("Head : "+q2.poll());
        System.out.println("Head : "+q2.poll());
        System.out.println("Head : "+q2.poll());
        System.out.println("Head : "+q2.poll());
        //returns null value if queue is empty
//        System.out.println("Head : "+q2.element());
        //returns the ThrowsNoSuchElementException
        

        System.out.println(q2);
        

    }
  
}
