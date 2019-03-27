/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itn.collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author sumit
 */
public class MapDemo {
    public static void main(String[] args) {
        Map <Integer , String> m1= new HashMap();
        //Map<key,value>
        // where key only holds unique elements
        //where key only holds unique elements 
        //pair of key and value here hash map is the data structure
        
        m1.put(1, "One");
        m1.put(3, "Three");
        m1.put(4, "Four");
        m1.put(2, "Two");
        m1.put(1, "Uno");
        System.out.println(m1);
        for(Map.Entry<Integer,String> m: m1.entrySet()){
            System.out.println("Key : " +m.getKey());
            System.out.println("Value : "+m.getValue());
        }
        System.out.println(m1.get(4));
       // returns the value with key 4
       Map<String, String> m2= new LinkedHashMap();
       // this maintains insertion order of map entries
       m2.put("Np", "Nepal");
       m2.put("JPN", "Japan");
       m2.put("AUS", "Australia");
        System.out.println(m2);
        System.out.println(m2.get("AUS"));
        
        Map <Integer,String> codes = new TreeMap();
        codes.put(001, "America");
        codes.put(977, "Nepal");
        codes.put(91, "India");
        codes.put(061, "Austrilia");
        //creates a sorted map according to its key element
        System.out.println(codes); 
    }
    
}
