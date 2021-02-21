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
public class Car {
    
    private String make;
    private String colour;
    private int year;
    
 
  /**
   * Default Constructor
   */
    public Car(){
        
        this.make = "Tayota";    
        this.colour = "blue";    
        this.year = 2019;
        
    }
  
    /**
     * Constructor for make
     * @param make 
     */
    public Car(String make){
        this.make = make;
        this.year = 2019;
    }
    /**
     * Constructor for year
     * @param year 
     */
    public Car(int year){
        
        this.make = "Toyota";
        this.year = year;
        
    }
       /**
     * Constructor with all parameters
     * @param make
     * @param colour
     * @param year 
     */
    public Car (String make, String colour, int year) {
        this.make = make;
        this.colour = colour;
        this.year = year;
        
    }
    /**
     * Make getter
     * @param make 
     */
    public void setMake(String make){
        this.make = make;
    }
    /**
     * Make setter
     * @return 
     */
    public String getName(){
        
        return this.make;
    }
   
    } 