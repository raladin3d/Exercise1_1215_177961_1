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
 * @author Om Patel
 */
import java.util.Scanner;
public class CardTrick {
    
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            //c.setValue(insert call to random number generator here)
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            
            
           c.setValue((int) (1+Math.random() * 13));
            //System.out.println(c.getValue());
        
           c.setSuit(Card.SUITS[(int) (Math.random() * 4 + 0)]);
            //System.out.println(c.getSuit());
            magicHand[i]=c;
            
            
        }
//        for(int i=0;i<magicHand.length;i++){
//            System.out.println(magicHand[i].getValue());
//            System.out.println(magicHand[i].getSuit());
//        }
        
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
        System.out.println("Pick any card between 1 to 13:-");
        int value=input.nextInt();
        input.nextLine();
        System.out.println("Enter the card suit:-");
        String s=input.nextLine();
        input.nextLine();  
        
        System.out.printf("Card you picked is %d and is of suit %s: ",value,s);
        
       }  
    
    
    }
    
