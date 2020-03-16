/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dog;

/**
 *
 * @author User
 */
public class Dog {

    /**
     * @param args the command line arguments
     */
    String name;
    
    public static void main(String[] args) {
        // TODO code application logic here
        Dog dog1 = new Dog();
        
        dog1.bark();
        dog1.name = "Барт";
        
        Dog[] myDogs = new Dog[3];
        
        myDogs[0] = new Dog();
        myDogs[1] = new Dog();
        myDogs[2] = dog1;
        
        myDogs[0].name = "Фред";
        myDogs[1].name = "Джордж";
        
        System.out.print("Имя последней собаки - ");
        System.out.println(myDogs[2].name);      
        
        int x = 0;
        
        while (x < myDogs.length) {
            myDogs[x].bark();
            x = x + 1;
        }
        
    }
    
    public void bark(){
        System.out.println(name + " сказал Гав!");        
    }
    
    public void eat(){
        
    }
    
    public void chaseCat(){
        
    }
    
}

