/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itn.objects;

import java.util.Scanner;

/**
 *
 * @author sumit
 */
public class Book implements Cloneable {
    int sn;
    String title;
    String author;
    String  publisher;
    double price;
    //behaviours
    @Override
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
    
    public void showBook(){
        //non-static variables are directly accessible from within non-static method
        System.out.println("Book s.no: "+sn);
        System.out.println("title: "+ title);
        System.out.println("Book author: " +author);
        System.out.println("Book publisher: "+publisher);
        System.out.println("Book price: "+ price);
    }
    public void createBook(){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter book title");
        title=sc.nextLine();
        System.out.println("enter book author: ");
        author=sc.nextLine();
        System.out.println("enter book publisher: ");
        publisher=sc.nextLine();
        System.out.println("enter book price: ");
        price=sc.nextDouble();
        System.out.println("enter book seral no: ");
        sn=sc.nextInt();
        
        
    }
    public static void main(String[] args) {
        Book b1=new Book();
        //instanciating book object using default constructor
        //default constructor is provided by JVM if we do not create ourselves
        b1.createBook();
        
        Book b2=new Book();
        b2.createBook();
        
        Book b3=b2;
        b3.sn=100001;
        
        b1.showBook();
        b2.showBook();
        b3.showBook();
    }
}
