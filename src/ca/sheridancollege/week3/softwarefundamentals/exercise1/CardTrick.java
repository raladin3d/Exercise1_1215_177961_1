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

        //Asking User to enter the details of the card
        System.out.println("Enter your Card Details below...");
        System.out.println("Enter the Number Corresponding to the Card Suit: ");
        System.out.println("1. Hearts, 2.Diamonds, 3.Spades, 4.Clubs");
        int suit = input.nextInt();
        System.out.print("Card Value: ");
        int value = input.nextInt();
        userCard.setValue(value);
        userCard.setSuit(Card.SUITS[suit-1]);

        //Searching the array for the card
        for (Card card : magicHand) {
            if (userCard.getValue() == card.getValue() &&
                    userCard.getSuit().equalsIgnoreCase(card.getSuit())) {
                flag = true;
                break;
            }
        }

        //printing the result of the draw
        if (!flag) {
            System.out.println("\nSORRY, THAT CARD IS NOT A PART OF THE " +
                    "MAGIC HAND!!");
        } else {
            System.out.println("\nYOU WON!");
            System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
            System.out.println("THE LUCKY CARD IS " + userCard.getValue() +
                    " of " + userCard.getSuit());
        }

    }

}
