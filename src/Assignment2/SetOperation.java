/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment2;

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
public class SetOperation {
    public static void main(String[] args) {
        Set <Integer> s1= new HashSet<>();
        s1.add(12);
        s1.add(34);
        s1.add(20);
        s1.add(30);
        s1.add(40);
        
        System.out.println(s1);
        Set <Integer> s2 = new LinkedHashSet<>();
        s2.add(2);
        s2.add(3);
        s2.add(20);
        s2.add(30);
        s2.add(4);
        
        s1.addAll(s2);
         s1.remove(34);
        System.out.println(s1);
       //aaba chai set lai read only banaune
         s2=Collections.unmodifiableSet(s2);
            try{ s2.add(23);
            }catch (Exception e){
                System.out.println(e);
            }
        SortedSet <Integer> s3 = new TreeSet<>();
        s3.add(12);
        s3.add(31);
        s3.add(21);
        s3.add(32);
        s3.add(41);
        System.out.println(s3);
    }
  
}
