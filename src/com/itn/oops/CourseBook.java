/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itn.oops;

/**
 *
 * @author sumit
 */
public class CourseBook extends Book {
    public String grade;
    public String board;
    public String type;
    
    public  CourseBook(){
        // there is an implicit call to a superclass(parent) constructor from subclass (child)
        //class constructor even if we do not mention it 
       super();
       // call to a  superclass constructor should be a first ine inside
       //sub class constructor 
    }
    public CourseBook(String grade, String board, String type){
        super();
        this.grade=grade;
        this.board=board;
        this.type=type;
    }
    public CourseBook(String title, String author, String publication,double price,String grade,String board,String type){
        super(title,author,publication,price);
        this.grade=grade;
        this.board=board;
        this.type=type;
        
    }
    public  void showCourseBook(){
        displayBook();
        //this method is made avilablethrough inheritance
        System.out.println("Course book detail: ");
        System.out.println("*********************");
        System.out.println("Grade: "+grade);
        System.out.println("Board: "+board);
        System.out.println("type: "+type);
    }
    public void CreateCourseBook(){
        publishBook();
        this.grade="BBA";
        this.board="TU";
        this.type="refrence Textbook";
    }
    
    public static void main(String[] args) {
        CourseBook b1= new CourseBook();
        b1.CreateCourseBook();
        b1.showCourseBook();
        
        Book b2= new CourseBook();
        b2.publishBook();
        //access to book specific features only
        //Coursebook feature are hidden
        
        Book b3=new Book();
        //not a inheritance
        //means CourseBook class run method has Book class object
        
//        courseBook b4= new Book();
        //Book not a type of CourseBook
        //while CourseBook us of type Book
        //so syntatcally incorrect
        
        CourseBook b5= new CourseBook("Java Fundamentals","Gopal shamrma","sajha publication",700,"BscCSIT","TU","Programming ");
        b5.showCourseBook();
        
    }
    
}
