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
 * @author dancye
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = generateMagicHand();
        Card luckyCard = askForLuckyCard();
        
        if(IsUserLucky(magicHand, luckyCard)){
            System.out.print("Congratulations! You won the game.");
        }
        else{
            System.out.print("Oops! you lost, please try again");
        }
    }
    
    public static Card[] generateMagicHand(){
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
    
    public static Card askForLuckyCard(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter lucky card number: (1-13)");
        int luckyCardNumber = scanner.nextInt();

        System.out.print("Enter lucky card suit: (0: Hearts, 1: Diamonds, 2: Spades, 3:Clubs)");
        int luckyCardSuit = scanner.nextInt();

        Card luckyCard = new Card();
        luckyCard.setValue(luckyCardNumber);
        luckyCard.setSuit(Card.SUITS[luckyCardSuit]);
        
        return luckyCard;
    }
    
    public static Boolean IsUserLucky(Card[] magicHand, Card luckyCard){
        for(int i=0; i<magicHand.length; i++){
            Card currentCard = magicHand[i];
            if(currentCard.getSuit().equalsIgnoreCase(luckyCard.getSuit()) && 
               currentCard.getValue() == luckyCard.getValue()){
                return true;
            }
        }
        
        return false;
    }
}