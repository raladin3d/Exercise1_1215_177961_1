
package ca.sheridancollege.week3.softwarefundamentals.exercise1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*
 * SYST17796 Fundamentals of Software Design 
 * Mohamed Alhabbal
 * Student Number: 991521294
 * Date: 2021/06/08
 */
/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author Mohamed Alhabbal
 */
public class CardTrick {

    public static void main(String[] args) {

        Card[] magicHand = new Card[7];
        Random ran = new Random();
        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();

            // randomly generate a value between [1,13]
            // randomly generate a number between [0,3] and get the 
            // String in SUITS array
            // set ith card of magicHand to c
            c.setValue(ran.nextInt(13) + 1);
            c.setSuit(Card.SUITS[ran.nextInt(4)]);
            magicHand[i] = c;
        }

        // created a default user card luckyCard
        Card luckyCard = new Card();
        int value;
        String suit;
        boolean found = false;

        Scanner scan = new Scanner(System.in);

        // input the value and suit for the card
        System.out.print("Enter the value of the card between (1-13): ");
        value = scan.nextInt();
        System.out.print("Enter the suit of the card" + Arrays.toString(Card.SUITS) + ": ");
        suit = scan.next();

        // set the value and suit for the lucky Card
        luckyCard.setValue(4);
        luckyCard.setSuit("Hearts");

        // loop to determine if userCard is present in magicHand
        for (int i = 0; i < magicHand.length; i++) {
            if (magicHand[i].getValue() == luckyCard.getValue() && magicHand[i]
                    .getSuit().equalsIgnoreCase(luckyCard.getSuit())) {
                found = true;
                break;
            }
        }

        // display the result based on the search
        if (found) {
            System.out.println("Lucky Card found in magic Hand !");
        } else {
            System.out.println("Lucky card not found in the magic Hand !");
        }
    }
}

