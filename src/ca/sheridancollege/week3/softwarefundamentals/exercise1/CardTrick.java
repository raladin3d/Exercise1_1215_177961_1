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
        
        Card userCard = new Card();
        int value;
        String suit;
        boolean found = false;
        
        //insert code to ask the user for Card value and suit, create their card
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the card value(1-13) : ");
        value = input.nextInt();
        System.out.println("Enter the card suit (Hearts, Diamonds, Spades, Clubs): ");
        suit = input.next();
        userCard.setValue(value);
        userCard.setSuit(suit);
        
        // and search magicHand here
        for(int i=0; i<magicHand.length; i++){
            if(magicHand[i].getValue()==userCard.getValue() && magicHand[i].getSuit()==userCard.getSuit()){
                found = true;
                break;
            }
        }
        
        //Then report the result here
        if(found){
            System.out.println("User's card match the magicHand");
        } else {
            System.out.println("User's card not match the magicHand");
        }
    }
    
}