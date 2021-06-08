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
 * @YutingLi 991623940
 */
import java.util.Scanner;
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            c.setValue((int)Math.random()*12);
            c.setSuit(Card.SUITS[(int)Math.random()*3]);
            magicHand[i] = c;
        }
        //insert code to ask the user for Card value and suit, create their card
        Card p = new Card();
        Scanner input = new Scanner(System.in);
        System.out.println("please pick any card value (1-13): ");
        p.setValue(input.nextInt());
        System.out.println("please pick any card suit (Hearts, Diamonds, Spades, Clubs): ");
        p.setSuit(input.nextLine());
        
        // and search magicHand here
        //Then report the result here
    }
    
}
