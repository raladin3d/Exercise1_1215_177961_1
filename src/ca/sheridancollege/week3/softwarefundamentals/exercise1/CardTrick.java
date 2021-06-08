/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.exercise1;

import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author dancye  modifier: Adithi  id: 991626025
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            //c.setValue(insert call to random number generator here)
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            c.setValue((int) (Math.random() * 13 + 1));
            c.setSuit(Card.SUITS[(int)(Math.random()*4)]);
        }
        
        //insert code to ask the user for Card value and suit, create their card
        Card ca = new Card();
        Scanner input = new Scanner (System.in);
        System.out.println("Enter card Value:");
        int value = input.nextInt();
        System.out.println("Enter suit:(Heart , Spade , Club , Diamonds)");
        String suit = input.next();
        
        ca.setValue(value);
        ca.setSuit(suit);
        
        System.out.println("The card user picked : " + value + "  " + suit );
        // and search magicHand here
        //Then report the result here
    }
    
}
