/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * modifier: Li Fan
 * Student number: 991630397
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
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            //c.setValue(insert call to random number generator here)
            c.setValue(new Random(). nextInt (13));
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            c.setSuit (Card.SUITS[new Random().nextInt (13)]);
            magicHand[i] = c;
        }
        
        //insert code to ask the user for Card value and suit, create their card
        Scanner input = new Scanner (System.in);
        System.out.print ("Card value");
        int Cardvalue = input.nextInt();
        
        System.out.print ("Card suit [Hearts, Diamonds, Spades, Clubs]");
        
        String Cardsuit = input.next();
        // and search magicHand here
        Card luckyCard = null;
        for (int i = 0; i < magicHand.length; i++){
            if (magicHand[i].getSuit().equals(Cardsuit.trim())&&magicHand[i].getValue()==Cardvalue){
                luckyCard = magicHand[i];
            }
        }
        //Then report the result here
        if (luckyCard==null){
            System.out.print("Cant't find the card you guessed!");
        }else{
            System.out.print("Bingo, There are cards you're looking for! Card suit:"+luckyCard.getSuit() + "Card value:"+luckyCard.getValue());
        }
    }
    
}
