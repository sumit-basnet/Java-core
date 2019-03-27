/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itn.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author sumit
 */
public class InputDemo {
    public static void main(String[] args) {
        String path ="c:\\users\\sumit\\Desktop\\sumit.txt";
        File file  = new File(path);
        if (file.exists()){
            System.out.println("file exists ");
            System.out.println("Dir : "+file.isDirectory());
            System.out.println("size n kb : " +file.length());
            
        } 
        FileInputStream fis = null;
        // decalaring the fis before the try block for peoper closing of fis
        try{
            // string based input operation
            fis=new FileInputStream(file);
            //opens the file resources for input operation
            // performs some task on open resources
            int i;
            while((i=fis.read()) !=-1){
                System.out.println((char)i);
            }
        }
            catch(FileNotFoundException e){
                    System.out.println(e);
                    }
            catch(IOException e){
                    System.out.println(e);
                    }
            finally{
            // close that resources
            try{
                fis.close();
                
            }catch(IOException e){
                System.out.println(e);
            }
        }
    }
}
