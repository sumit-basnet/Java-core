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
public class TraingularArray {
    public static void main(String[] args) {
        //two dimensonal array
        int[][] tri= new int[4][];
        // mking a iregular shaped multidimeansional array
        tri[0]=new int[1]; 
        // add one  dimenasional array in first row
        //trial[0] refers to first row
        tri[1]=new int[2];
        tri[2]=new int[3];
        tri[3]=new int[4];    
//         the above meantion codes gives the array of below 
//        []
//        [] []
//        [] [] []
//        [] [] [] []

//assign value to the artri.length element
        for(int i=0; i<tri.length;i++){
            //returns no. of row aerray 
            for(int j=0;j<tri[i].length;j++){
                //return no.of cols in each row(tri[i])
                tri[i][j]=i*j;
            }
        }
        
        for(int i=0;i<tri.length;i++){
            for(int j=0;j<tri[i].length;j++){
                System.out.print(tri[i][j] + "\t");
            }
            System.out.println();
        }
    }
}

