/*
 * Student number: 991635122
 */
package ca.sheridancollege.week3.softwarefundamentals.exercise1;

import java.util.Random;
import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author dancye
 * Modified by Salim Jadun
 * Date modified: June 8, 2021
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            Random r = new Random();
            
            c.setValue((int)(Math.random() * 13) + 1 );
            
            c.setSuit(Card.SUITS[r.nextInt(4)]);
            
            magicHand[i] = c; 
               
        }
        
        Scanner sc = new Scanner(System.in);
        Card user = new Card();
        int value;
        String suit;
        
        System.out.println("Please pick any card value! ");
        value = sc.nextInt();
        System.out.println("Please pick a card suit!");
        suit = sc.next();
        
        user.setValue(value);
        user.setSuit(suit);
        
        boolean match = false;
        for (int i = 0; i<magicHand.length; i++){
            if (user.getValue() == magicHand[i].getValue() && 
                    user.getSuit().equalsIgnoreCase(magicHand[i].getSuit())){
                
                match = true;
                break;
            }
        }
        
        if (match){
            System.out.println("The card you chose exists in the magic hand");
        } else System.out.println("The card you chose does not exist in magic hand");
        
        System.out.println("You chose the " + value + " of " + suit);
        
        
        
    }
    
}
