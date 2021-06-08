
/*
 * SYST17796 Fundamentals of Software Design 
 * Mohamed Alhabbal
 * Student Number: 991521294
 * Date: 2021/06/08
 */

package ca.sheridancollege.week3.softwarefundamentals.exercise1;


import java.util.Random;


/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then
 * asks the user to pick a card and searches the array of cards for the match to
 * the user's card. To be used as starting code in ICE 1
 *
 * @author dancye
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
            //String in SUITS array
            // set ith card of magicHand to c
            c.setValue(ran.nextInt(13) + 1);
            c.setSuit(Card.SUITS[ran.nextInt(4)]);
            magicHand[i] = c;
        }

        // create a default user card
        Card userCard = new Card();
        int value;
        String suit;
        boolean found = false;
    }
    
}

