/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.exercise1;

import java.util.Random;
import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author Tamer Aladdin
 * Student ID: 991624364
 */
public class CardTrick {
    static Scanner in = new Scanner(System.in);
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            // call random values from 1-13
            c.setValue(Card.RandomNumber(1, 13));
            // call random for suit (Hearts, Diamonds,....)
            c.setSuit(Card.SUITS[Card.RandomNumber(0, 3)]);
            magicHand[i]=c;
        }
        //insert code to ask the user for Card value and suit, create their card 
        int cvalue;
        do {
            System.out.println("Please enter a correct card value: (1-13)");
            cvalue= in.nextInt();            
        } while (cvalue<1 || cvalue >13);

        int svalue;
        do {
            System.out.println("Please enter a correct suit value: (0-3)");
            svalue= in.nextInt();
        } while (svalue<0 || svalue>3);
        
        // and search magicHand here
        boolean found = false;
        for (int i=0; i<magicHand.length; i++)
        {
            if (magicHand[i].getValue()==cvalue && magicHand[i].getSuit()==Card.SUITS[svalue] ) {
                //Then report the result here
                    System.out.println("Congrats! This is your card (Your card value & suit value match the magic hand  \n ------------------)");
                    found= true;
            } break;
            
        }
        if (!found) {
            System.out.println("Your values don't match \n -----------------");            
        }
        for (int i=0; i<magicHand.length; i++)
        {
            System.out.printf("Card value is: %d, and suit value is: %s \n",magicHand[i].getValue(),magicHand[i].getSuit());
        }
        
                    
    }
    
}