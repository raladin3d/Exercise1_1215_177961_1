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
 * @author dancye
 * @author Omkar Khurana
 * 991607080
 */
public class CardTrick {

    public static void main(String[] args){
        Card[] magicHand = new Card[7];
        Card userCard = new Card();
        boolean flag = false;
        Scanner input = new Scanner(System.in);

        //assigning random cards to the hand of magic 7 cards
        for (int i=0; i< magicHand.length; i++){
            magicHand[i]= new Card();
            magicHand[i].setValue((int)(Math.random()*13 + 1));
            magicHand[i].setSuit(Card.SUITS[(int)(Math.random()*3)]);
        }

        //insert code to ask the user for Card value and suit, create their card
        //Asking User to enter the details of the card
        System.out.println("Enter your Selected Card Details below...");
        System.out.print("Card Value: ");
        int value = input.nextInt();
        System.out.print("Card Suit: ");
        String suit = input.next();
        userCard.setValue(value);
        userCard.setSuit(suit);

        
        // and search magicHand here
        //Then report the result here
    }
    
}