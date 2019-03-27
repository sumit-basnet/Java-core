/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itn.oops;

import java.util.Scanner;

/**
 *
 * @author sumit
 */
public class Book {
    // fields 
    public String title;
    public String author;
    public String publication;
    public double price;
    //methods
    public Book(){
    
    }
    
    public Book(String  title, String author , String publication, double price){
        this. title=title;
        this.author=author;
        this.publication=publication;
        this.price=price;
    }
    
    
    public void publishBook(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Book title: ");
        title=sc.nextLine();
        System.out.println("enter book author: ");
        author=sc.nextLine();
        System.out.println("enter book publication: ");
        publication=sc.nextLine();
        System.out.println("enter book price : ");
        price=sc.nextDouble();
   }
    public void displayBook(){
            System.out.println("Book Details: ");
            System.out.println("****************");
            System.out.println("title: "+title);
            System.out.println("Author: "+author);
            System.out.println("Publsher: "+publication);
            System.out.println("price: "+price);
            System.out.println("******************");
    }
    
}
