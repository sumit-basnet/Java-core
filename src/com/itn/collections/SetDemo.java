/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itn.collections;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 *
 * @author sumit
 */
public class SetDemo {
    public static void main(String[] args) {
        Set<String> s1= new HashSet();
        s1.add("argentina");
        s1.add("Nepal");
        s1.add("India");
        s1.add("Bangladesh");
        s1.add("Bhutan");
        s1.add("Nepal");
        //fast access
        //doesnot support duplicate entity
        System.out.println(s1);
        Set<String> s2= new LinkedHashSet();
        s1.add("Nepal");
        s2.add("Argentina");
        s2.add("China");
        s2.add("USA");
        s2.add("Chilli");
        System.out.println(s2);
        s2.remove("China");
        System.out.println(s2);
        //make a set read only
        //for order that you put
        s2=Collections.unmodifiableSet(s2);
        System.out.println(s2);
        try{
        s2.remove("USA");
        }
        catch(Exception e){
            System.out.println(e);
        }
        
        SortedSet<String> s3= new TreeSet<>();
//        Set<String> s4= new TreeSet<>();
//        TreeSet<String> s5= new TreeSet<>();
        
        s3.add("NP");
        s3.add("US");
        s3.add("JPN");
        s3.add("UK");
        s3.add("UAE");
        s3.add("AUS");
        System.out.println(s3);
        // creates a ordered alphabetcally ordered set of elements
    }
}
