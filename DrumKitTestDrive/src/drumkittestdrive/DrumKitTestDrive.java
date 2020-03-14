/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drumkittestdrive;

/**
 *
 * @author User
 */

class DrumKit{
    
    boolean topHat = true;
    boolean shape = true;
    
    void PlayToHat() {
        System.out.println("динь динь ди-динь");
    }
    
    void PlayShare(){
        System.out.println("бах бах ба-бах");
    }
}

public class DrumKitTestDrive {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DrumKit d = new DrumKit();
        
        d.PlayShare();
        
        d.shape = false;
        
        if (d.shape == true){
            d.PlayShare();
        }
        
        d.PlayToHat();
        
    }
    
}
