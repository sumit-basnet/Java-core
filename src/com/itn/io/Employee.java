/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itn.io;

import java.io.Serializable;

/**
 *
 * @author sumit
 */
public class Employee implements Serializable {
    //ths converts theobject nto the serial version 
    
    
    private static final long serialVersionUID=12345678L;
    //this field is used to identify employee class object during deserilization
    //if this value differs in objext and class the deserialization process
    //wont accept the serialized object
    private int id ; 
    private String name;
    private double salary;

    public Employee() {
    }

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    
}
