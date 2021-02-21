/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Andreia
 */
public class Person {
    
    //Attributes
    int age;
    String gender;
    String name;
    
    
    //CONSTRUCTOR is to inicialize the object
    /**
     * Parameters:
     * @param age
     * @param gender
     * @param name 
     */
    public Person(int age, String gender, String name){
        this.age = age;
        this.gender = gender;
        this.name = name;        
        
    }
   /**
    * DEFAULT CONSTRUCTOR 
    * Default values
    */
    public Person(){
        System.out.println("New person created");
        this.age = 18;
        this.gender = "Female";
        this.name = "Andréia";
   
    }
    //METHODS:
    
    public String run(){
      return this.name + "is running";  
    }
    
    public String walk(){
        
        return this.name + " is walking";        
    
    }
    
   // Method to return the variable age (to access age)    
    public int getAge (){        
        return this.age;
    }
    
    //Method to set the variable age. Doesn't return anything
    public void setAge(int age){
        this.age = age;
    }
    
    public String getGender() {
        return this.gender;
    }
    
    public void setGenger(String gender){
        this.gender = gender;
        
    }
    
    protected String getName() {
        return this.name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    @Override
    public String toString() {
        
        return "Name " + this.name + ", Gender " + this.gender + ", Age " + this.age;
    }
    
   }

