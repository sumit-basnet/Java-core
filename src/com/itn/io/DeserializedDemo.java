/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itn.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 *
 * @author sumit
 */
public class DeserializedDemo {
    public static void main(String[] args) {
        FileInputStream fis= null;
        ObjectInputStream ois= null;
        try{
            fis= new FileInputStream("C:/Users/sumit/Desktop/employee.txt");
            ois=new ObjectInputStream(fis);
            Employee e=(Employee) ois.readObject();
            System.out.println("ID : "+e.getId());
            System.out.println("Name : "+e.getName());
            System.out.println("Salary : "+e.getSalary());
        }catch(FileNotFoundException | ClassNotFoundException ex){
            System.out.println(ex);
        }catch(IOException ex){
            System.out.println(ex);
        }
        finally{
            try{
                if(ois!=null){
                    ois.close();
                }if(fis!=null){
                    fis.close();
                }
            }catch(IOException ex){
                System.out.println(ex);
            }
        }
    }
}
