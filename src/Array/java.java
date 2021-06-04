/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array;

/**
 *
 * @author Asus
 */
public class java {
    public static void main(String[] args) {
    
      //  String[] arrCards = randomCards();
    
}
    
    public String[] randomCards(){
        int[] deck = new int[52];
    String[] suits = { "Hearts", "Clubs","Spades", "Diamonds"};
    String[] ranks = {"1", "2", "3", "4", "5", "6", "7", "8", "9",
      "10", "11", "12", "13"};
        
    // Initialize cards
    for (int i = 0; i < deck.length; i++){
      deck[i] = i + 1;
    }
    
    // Shuffle the cards
    for (int i = 0; i < deck.length; i++) {
      // Generate an index randomly
      int index = (int)(Math.random() * deck.length);
      deck[i] = deck[index]; 
     
    }

    String[] random;
      random = new String[7];
      // Display the first four cards
      for (int i = 0; i < 7; i++) {
      String suit = suits[deck[i] / 13];
      String rank = ranks[deck[i] % 13];
      random[i] = (rank +" "+ suit);
      System.out.println(random[i]);
    }
    return random;
    }
}