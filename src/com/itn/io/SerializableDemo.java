/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itn.io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 *
 * @author sumit
 */
public class SerializableDemo {
    public static void main(String[] args) {
        Employee e= new Employee();
        e.setId(1001);
        e.setName("sumit");
        e.setSalary(1200000.00); 
        
        FileOutputStream fos= null;
        ObjectOutputStream oos= null;
        try{
           fos= new FileOutputStream("c:/Users/sumit/Desktop/employee.txt"); 
           oos= new ObjectOutputStream(fos);
           oos.writeObject(e);
        }catch(IOException ex){
            System.out.println(ex);
        }finally{
            try{
                if(oos!=null){
                oos.close();
                }if(fos !=null){
                    fos.close();
                }
            }catch(IOException ex){
                System.out.println(ex);
            }
        }
    }
}
