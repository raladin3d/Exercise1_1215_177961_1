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
 * @author dancye
 */
import java.util.Scanner;
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        boolean result = false;
        
        Scanner input = new Scanner(System.in);
        
        Card c = new Card();
        for (int i=0; i<magicHand.length; i++)
        {
            magicHand[i]= new Card();
            //c.setValue(insert call to random number generator here)
            int random_num = (int)Math.floor(Math.random()*(13-1+1)+1);
            magicHand[i].setValue(random_num);
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            int random_suit = (int)Math.floor(Math.random()*(3-0+1)+0);
            magicHand[i].setSuit(Card.SUITS[random_suit]);
        }
        
        //insert code to ask the user for Card value and suit, create their card
        System.out.print("Please enter the Card Value ");
        int u_value = input.nextInt();
        System.out.println("Please 0.Hearts 1.Diamonds 2.Spades 3.Clubs ");
        int u_suit = input.nextInt();
        
        c.setValue(u_value);
        c.setSuit(c.SUITS[u_suit]);
        
        
        // and search magicHand here
        for (int i=0 ;i<magicHand.length; i++){
            if(magicHand[i].getValue() == c.getValue() && magicHand[i].getSuit() == c.getSuit()){
                result = true;
                break;
            }
        }

        
        //Then report the result here
        if(!result){
            System.out.println("You loose The game");
            System.out.println("The correct choice was out of"+ magicHand[i].getValue() + " " + magicHand[i].getSuit());
        }else{
            System.out.println("You Won the game by Guessing the correct card");
            System.out.print("the Selected Card was" + c.getValue() +" " + c.getSuit());
        }
        
    }
    
}
