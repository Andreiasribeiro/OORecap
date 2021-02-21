/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oorecap;

import model.Dog;
import model.Person;

/**
 *
 * @author Andreia
 */
public class OORecap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         //instance for the class
    Person p1 = new Person();//Any attribute so it will be defined by default (18, female, Andreia )
    
    Person p2 = new Person(25, "male", "Daniel");
    
    System.out.println(p1);
    System.out.println(p2);
    
    Dog d1 = new Dog("Fluffy, ");     
    
    d1.setOwner(p2);
    
        System.out.println(d1);
    
    }
            
          
}
