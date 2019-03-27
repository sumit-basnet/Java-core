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
public class Account {
    public int accNo;
    public  String  name;
    public  double amount;
    public  String branch;
    public  static final String Bank ="ABC Development bank";
    public static int count=10001;
    public Account(){
        accNo=count++;
    }
    public  void createAccount(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter account name : ");
        name=sc.nextLine();
        System.out.println("Enter branch : ");
        branch=sc.nextLine();
        System.out.println("Enter Deposite amount : ");
        amount = sc.nextDouble();   
    }
    
    public void viewAccount(){
        System.out.println("********************");
        System.out.println(Bank);
        System.out.println("Branch : "+branch);
        System.out.println("Acc_no : "+ accNo);
        System.out.println("Acc_name : "+name);
        System.out.println("Amount : "+ amount);
        System.out.println("*********************");
        
    }
    
    public void deposite(double  amount){
        this.amount+=amount;
        System.out.println("Amount Deposited : "+amount);
        System.out.println("New amount : "+ this.amount);
    }
    public void withdrawl(double amount){
        this.amount-=amount;
        System.out.println("Amount Withdrawl : "+amount);
        System.out.println("New amount : "+this.amount);
    }
    
}
