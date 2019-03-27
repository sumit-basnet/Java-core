/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itn.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author sumit
 */
public class OutputDemo {
    public static void main(String[] args) {
        FileReader fr= null;
       FileWriter fw = null;
       try{
           fr = new FileReader("C:\\Users\\sumit\\Desktop\\Sumit.txt");
           fw = new FileWriter("C:\\Users\\sumit\\Desktop\\new.txt",true);
           int c;
           while((c=fr.read()) !=-1){
               fw.write(c);
           }
           fw.write("\r");
       }catch(FileNotFoundException e){
           System.out.println(e);
       }catch(IOException e){
           System.out.println(e);
       }catch(NullPointerException e){
           System.out.println(e);
       }finally{
           try{
               if(fr!=null){
                   fr.close();
               }if(fw!=null){
                   fw.close();
               }
           }catch(IOException e){
               System.out.println(e);
           }
       }
        
    }
}
