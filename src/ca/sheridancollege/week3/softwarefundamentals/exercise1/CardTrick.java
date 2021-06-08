/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.exercise1;

import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class CardTrick {

    public static void main(String[] args) {

        Card[] magicHand = new Card[7];
        Random rando = new Random();
        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();

            c.setValue(rando.nextInt(6) + 1); // randomly generates value between 1 and 7
            c.setSuit(Card.SUITS[rando.nextInt(4)]); // randomly generates a number between [0,3]with SUIT index
            magicHand[i] = c; // sets card to c
        }

        // create's a default person Card
        Card personCard = new Card(); //personCard = luckyCard
        int value;
        String suit;
        boolean find = false;

        //Scanner 
        Scanner input = new Scanner(System.in);
        // asks user for input for card value and suits 
        System.out.print("Enter Value of card that is between 1-7: ");
        value = input.nextInt();
        System.out.print("Enter suit of the card" + Arrays.toString(Card.SUITS) + ": ");
        suit = input.next();
        // sets of value/ suit for user card
        personCard.setValue(value); //made it value because we need any value user enters
        personCard.setSuit(suit);   //made it suit cause we need any suit the user enters

        // loop that finds if the user's choice of Card is in the Magic Hand
        for (int i = 0; i < magicHand.length; i++) {
            if (magicHand[i].getValue() == personCard.getValue() && magicHand[i].getSuit().equalsIgnoreCase(personCard.getSuit())) {
                
                find = true;
                break;
            }
        }
        // display the Card was found or not
        if (find) {
            System.out.println("Card was found in the Magic Hand");
        } else {
            System.out.println("Card was not found in Magic Hand");
        }
    }

}



