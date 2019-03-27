/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itn.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author sumit
 */
public class BufferDemo {
    //this is used to read the data in bulky manner
    //where data are read in line by line  order
    public static void main(String[] args) {
        FileReader fr= null;
        BufferedReader br= null;
        
        FileWriter fw= null;
        BufferedWriter bw = null;
        try{
            fr= new FileReader("C:\\Users\\sumit\\Desktop\\src.txt");
            fw= new  FileWriter("C:\\Users\\sumit\\Desktop\\dest.txt");
            
            br= new BufferedReader(fr);
            bw= new BufferedWriter(fw);
            //buffered read and buffered writing 
            String line = "";
            int count =0;
            while((line=br.readLine()) !=null){
            bw.write(++count+": "+line);
            bw.newLine();
                System.out.println(count+ ": "+line);
        }
        }catch(FileNotFoundException fe){
            System.out.println(fe.getMessage());
        }catch(IOException ie){
            System.out.println(ie.getMessage());
        }
        finally{
            try{
                if(br!=null){
                    br.close();
                }if(bw!=null){
                    bw.close();
                }
                
            }catch(IOException ie){
                        System.out.println(ie);
                        }
        }
        
    }
}
