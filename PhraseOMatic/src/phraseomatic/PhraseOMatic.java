/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phraseomatic;

/**
 *
 * @author nafikovti
 */
public class PhraseOMatic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] wordListOne = {"круглосуточный", "трехзвенный",
                                "30000-метровый", "взаимный", "обоюдный выигрыш", 
                                "фронтэнд", "на основе веб технологий", 
                                "проникающий", "умный", "шесть сигм", 
                                "метод критического пути", "динамичный"};
        
        String[] wordListTwo = {"уполномоченный", "трудный",
                                "чистый продукт", "ориентированный", "центральный", 
                                "распределенный", "кластеризированный", 
                                "фирменный", "нестандартный ум", "позиционированный", 
                                "сетевой", "сфокусированный", "использованный с выгодой", 
                                "выровненный", "нацеленный на", "общий", "совместный", 
                                "ускоренный"};
        
        String[] wordListTree = {"процесс", "пункт разгрузки",
                                 "выход из положения", "тип структуры", "талант", 
                                 "подход", "уровень завоеванного внимания", 
                                 "портал", "период времени", "обзор", 
                                 "образец", "пункт следования"};      
        
        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int treeLength = wordListTree.length;
        
        int rand1 = (int) (Math.random() * oneLength);
        int rand2 = (int) (Math.random() * twoLength);
        int rand3 = (int) (Math.random() * treeLength);
        
        String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + 
                        wordListTree[rand3];
        
        System.out.println("Все, что нам нужно, - это " + phrase);
                
    }
    
}
