/*
 * Daniel Bensusan
 * Exercise 1
 * SYST17796
 */
package ca.sheridancollege.week3.softwarefundamentals.exercise1;

import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        Scanner k = new Scanner(System.in);
        Random cardGen = new Random();
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            c.setValue(cardGen.nextInt(13) + 1);
            c.setSuit(Card.SUITS[cardGen.nextInt(4)]);
            magicHand[i] = c;
        }
        
        Card defaultCard = new Card();
        int face;
        String suit;
        boolean found = false;
        System.out.println("Enter the value of your card choice:");
        face = k.nextInt();
        System.out.println("Enter the suit of your card please" + (Arrays.toString(Card.SUITS)+":"));
        suit = k.next();
        
        defaultCard.setValue(face);
        defaultCard.setSuit(suit);
        
        for(int i = 0; i < magicHand.length; i++){
            if(magicHand[i].getValue() == defaultCard.getValue() && magicHand[i].getSuit().equalsIgnoreCase(defaultCard.getSuit()))
            {
                found = true;
                break;
            }
        }   
        
        if(found)
            System.out.println("Default User Card Found in MagicHand");
        else
            System.out.println("Default User Card Not Found in MagicHand");
        
    }
    
}
