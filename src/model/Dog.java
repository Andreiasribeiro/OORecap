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
public class Dog {
    
    private String name;
    private String breed;
    private boolean vaccined;
    private Person owner;
           
    
    /**
     * 
     * @param name 
     */
     public Dog(String name){
         this.name = name;
         this.breed = "Mixed";
         this.vaccined = false;
         this.owner = null; 
         
     }
     
     // Methods
     /**
      * Name getter
      * @return 
      */
     public String getName(){
         
         return this.name;
     }
     /**
      * Name setter
      * @param name 
      */
    public void setName( String name){
        this.name = name;
    }
    /**
     * Breed getter
     * @return 
     */
    public String getBreed(){
        return this.breed;
    }
    /**
     * Breed setter
     * @param breed 
     */
    public void setBreed(String breed){
        this.breed = breed;
    }
    /**
     * Vaccined getter
     * @return 
     */
    public boolean isVaccined(){
        return this.vaccined;
    }
    /**
     * Vaccined setter
     * @param vaccined 
     */
    public void setVaccined(boolean vaccined){
        this.vaccined =  vaccined;
    }

    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }
  
    @Override
  public String toString(){
      
      return "Name: " + this.name + " owner: " + this.owner.getName();
      
  }
         
}
