/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beersong;

/**
 *
 * @author nafikovti
 */
public class BeerSong {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int beerNum = 99;
        String word = "бутылок (бутылки)";
        
        while (beerNum > 0) {
        
            if (beerNum == 1) {
                word = "бутылка";
            }

            System.out.println(beerNum + " " + word + " пива на стене");
            System.out.println(beerNum + " " + word + " пива.");
            System.out.println("Возьми одну.");
            System.out.println("Пусти по кругу.");
            
            beerNum = beerNum - 1;
            if (beerNum > 0) {
                System.out.println(beerNum + " " + word + " пива на стене");
            }    
        }
        System.out.println("Нет бутылок пива на стене");
        
    }
    
}
