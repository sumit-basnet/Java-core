/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itn.Assignment1;

/**
 *
 * @author sumit
 */
public class MatrixAdd {
   public int[][] matrix(int [][]a, int [][]b) {
       int  sum[][]=new int[5][5];
       for(int i=0;i<2;i++){
           for(int j=0;j<2;j++){
               sum[i][j]=a[i][j]+b[i][j];
           }
       }
       return sum;
   }
    public static void main(String[] args) {
        MatrixAdd m1= new MatrixAdd();
        int [][] a={{0,1},{0,2},{1,2},{1,1}};
         int [][] b={{0,1},{0,2},{1,2},{1,1}};
         int [][] sum =m1.matrix(a, b) ;
         for(int i = 0;i<2;i++){
             for(int j =0;j<2;j++){
                 System.out.print(sum[i][j]+"\t");
             }
             System.out.println();
         }
    }

}


