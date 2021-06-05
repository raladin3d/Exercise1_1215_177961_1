/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.exercise1;

import java.util.Scanner;
import java.util.Random;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author dancye
 * @modified by Danish Ali, Student ID: 991628757
 */

public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = produceMagicHand();
        Card selectedCard = askSelectedCard();
        displayResult(magicHand, selectedCard);
    }
    
    public static Card[] produceMagicHand(){
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++){
            Card c = new Card();
            
            Random rand = new Random();
            int cardValue = rand.nextInt(13) + 1;            
            int suitValue = rand.nextInt(4);

            c.setValue(cardValue);
            c.setSuit(Card.SUITS[suitValue]);
            
            magicHand[i] = c;
        }
        
        return magicHand;
    }
    
    public static Card askSelectedCard(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the card number (1-13): ");
        int selectedCardNumber = input.nextInt();

        System.out.print("Enter the card suit (0: Spades, 1: Diamonds, "
                + "2: Hearts, 3:Clubs): ");
        int selectedCardSuit = input.nextInt();

        Card selectedCard = new Card();
        selectedCard.setValue(selectedCardNumber);
        selectedCard.setSuit(Card.SUITS[selectedCardSuit]);
        
        return selectedCard;
    }

    public static Boolean CardMatchResult(Card[] magicHand, Card selectedCard){
        for(int i=0; i<magicHand.length; i++){
            Card inhandCard = magicHand[i];
            if(inhandCard.getSuit().equalsIgnoreCase(selectedCard.getSuit()) && 
               inhandCard.getValue() == selectedCard.getValue()){
                return true;
            }
        }
        
        return false;
    }
    
    public static void displayResult(Card[] magicHand, Card selectedCard){
        System.out.print("\nThe 7 random cards selected are: \n");
        for(int i=0; i<magicHand.length; i++){
            int cardValue = magicHand[i].getValue();
            var cardSuit = magicHand[i].getSuit();
            System.out.println(String.format("Car1"
                    + "d: %d of %s", cardValue, cardSuit));
        }
      
        if(CardMatchResult(magicHand, selectedCard)){
            System.out.println("You Win! Your card matched");
        }
        else{
            System.out.println("\nYou Lost! Your card was not amongst the 7 "
                    + "randomly selected");
        }
    }
    
}
