/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.exercise1;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author Ya Su 991638096
 */
import java.util.Scanner;
import java.util.Arrays;
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++){
        
            Card c = new Card();
            //c.setValue(insert call to random number generator here)
            c.setValue((int)(Math.random()*13 + 1));
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            c.setSuit(Card.SUITS[(int)(Math.random()*4)]);
            magicHand [i] = c;
        }
        
        boolean found = false;
        Card userCard = new Card();
        luckyCard.setValue(5);
        luckyCard.setSuit(Card.SUITS[1]);
     
        

        
        // and search magicHand here
        for(int i=0; i<magicHand.length; i++){
            if(magicHand[i].getValue()==luckyCard.getValue() && magicHand[i].getSuit()==luckyCard.getSuit()){
                found = true;
                break;
            }
        }
        
        //Then report the result here
        if(found){
            System.out.println("You won! Lucky card found in magicHand");
        } else {
            System.out.println("You lose! Lucky card not found in magicHand");
        }
          System.out.println("Lucky card: " + luckyCard);
    }
    
}
