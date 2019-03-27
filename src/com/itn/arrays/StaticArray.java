/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itn.arrays;

/**
 *
 * @author sumit
 */
public class StaticArray {
    public static void main(String[] args) {
       //declaration  of array
       int[] odds = {1,3,5,7,9};
       //statically created array
       char vowels[]={'a','e','i','o','u'};
       // arrays could be made of any data types
       // premitive,non-premtive or user defined
       //non premitive type ko le  tesko object rakhne banaune ho
       //accessing an  array using its index value
      // index specifies position of an array element
      //index always starts from 0 upto length -1; where length is size of an array
        System.out.println("first vowel of english alphabet: " + vowels[0]);
        //index[INDEX] == here index 0 means first element
        //we cand have a random access to an elements
        System.out.println(odds[3]);
        System.out.println(odds[0]);
       //asccessng all elements of an array usinf for loop
       //here i is used as an index variable whch is initialized with 0 
       //array.length gives a length or size of an array
       for(int i=0; i<odds.length;i++){
           System.out.println(odds[i]);
       }
       // foreach-loop is specailly designed to work for array or similar collections
       for(char c : vowels){
           //for each char c in array vowels
           System.out.print(c+"\t");
       }
    }
}
