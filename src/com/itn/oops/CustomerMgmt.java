/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itn.oops;
import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author sumit
 */
public class CustomerMgmt {
    public void /*Customer // yp pani rakhna  milxa*/ fillCustomerDetails(Customer c){
//        Customer c= new Customer(); // yesto pani garna milxa tesko lagi chai mathi ko parameter lai hataunu paarxa


        // method takes a default constructor of customer class
        //add customer detail information in the object's fields 
        //then return that object
        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter customer information : ");
        System.out.println("enter customer id : ");
        int id =sc.nextInt();
//        c.id=id;  // private field id not accessible from outside of class
        c.setId(id); // using setter to write value onto object field
        System.out.println("Enter customer gender : ");
        char gender = sc.next().charAt(0);
        c.setGender(gender);
        sc.nextLine();
        
        System.out.println("enter name : ");
        c.setName(sc.nextLine());
        
        System.out.println("enter address : ");
        c.setAddress(sc.nextLine());
        
        System.out.println("enter date of birth(yyyy-mm-dd) : ");
        String date = sc.nextLine(); // input date as string first and convert it into date
        c.setDob(LocalDate.parse(date));
        
//        return c;  
    }
    
    public void showCustomer(Customer c){
        System.out.println("Customer details : ");
//        System.out.println("Id : "+c.id); yesto gaarna  paaidaina
        System.out.println("Id : "+c.getId());
        System.out.println("Name : "+c.getName());
        System.out.println("Address : "+c.getAddress());
        System.out.println("Gender : "+c.getGender());
        System.out.println("Date of Birth : "+c.getDob().getMonth()+
                " "+c.getDob().getDayOfMonth()+" , "+c.getDob().getYear());
        
    }
    
    public static void main(String[] args) {
        System.out.println("Welcome to customer managment app");
        Customer c1= new Customer();
//        Customer c2= new Customer();
        CustomerMgmt cm= new CustomerMgmt();
//        cm.fillCustomerDetails(c1);
//        cm.showCustomer(c1);
//        
//        Customer c2= new Customer();
//        cm.fillCustomerDetails(c2);
//        cm.showCustomer(c2);
        
        Customer [] customers= new Customer[2];
        //array of 10 customer objects
        for(int i =0 ; i<2;i++){
            customers[i]=new Customer();
            cm.fillCustomerDetails(customers[i]);
        }
        // for showing the details
        for(Customer cust: customers){
            cm.showCustomer(cust);
//            System.out.println(cust.toString());
        }
    }
}
