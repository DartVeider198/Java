/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package echotestdrive;

/**
 *
 * @author User
 */




public class EchoTestDrive {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Echo e1 = new Echo();        
        Echo e2 = e1;
        int x = 1 ;
        
        while(x < 5){
            e1.hello();
            e1.count = e1.count + 1;
            if(x == 3){
                e2.count = e2.count + 1;
            }
            if(x == 4){
                e2.count = e2.count + e1.count;
            }
            x = x + 1;
        }
        System.out.println(e2.count);        
        
    }
    
}

class Echo{
    int count = 0;
    void hello(){
        System.out.println("привееееет...");
    }
}




