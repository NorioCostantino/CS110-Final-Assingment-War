/* Norio Costantino
 CS 110
 Final Assignment Tester*/

import java.util.Scanner;

/*This program uses the card Class and tests all of its functions.*/

public class tester
{
   public static void main(String [] args)
   {
      int card1Rank = 10, card2Rank = 9;                         //Card 1 and 2 rank
      int card1Suit = 1, card2Suit = 3;                           //Card 1 and 2 suit
      Boolean equality;                                           //Whether card 1 and 2 are equal or not
      String cardString1 = "O", cardString2="P";                            //String version of a card
      

     //  //Create new card objects, card 1 and card 2
      Card card1 = new Card (card1Suit, card1Rank);
      Card card2 = new Card (card2Suit, card2Rank);
//   
      System.out.println("Card 1 greater than card 2? " + card1.isGreater(card2));
      CardPile pile = new CardPile();

      Deck deck = new Deck();
      
      // pile.add(card1);
//       pile.add(card2);
//       pile.add(card1);
//       pile.add(card2);
//       pile.add(card1);
//       pile.add(card2);
//       pile.add(card1);
//       pile.add(card2);
//       pile.add(card1);
//       pile.add(card2);
//       

      //int y = deck.getSize();

WarGame game = new WarGame();

game.playRound();


      
//       //Test getRank and getSuit for both cards
//       System.out.println("Card 1's rank is " + card1.getRank()+ " and its suit is " + card1.getSuit());
//       System.out.println("Card 2's rank is " + card2.getRank()+ " and its suit is " + card2.getSuit());
//       //Assignment said that suit return is an integer, so it is an integer here, not a string
//       
//       
//       //Get string of card 1 and card 2
//       cardString1 = card1.toString();
//       cardString2 = card2.toString();
//       System.out.println(cardString1);
//       System.out.println(cardString2);
//       
//       //Use card equals
//       equality = card1.equals(card2);
//       System.out.println("Does card 1 equal card 2 in rank?: " + equality);
//       
//       //Create 3rd card that is not equal in rank. Try equals.
//       Card card3 = new Card (2,3);       //Rank 3 card
//       
//       equality = card1.equals(card3);
//       System.out.println("Does card 1 equal card 3 in rank?: " + equality);
//       
//       //Try to create a card with an invalid rank, and another with an invalid suit
//       
//       Card card4 = new Card (0,3); 
//       
//       //Since the class is exited when an error is made, both cannot be shown at once, but uncommenting will prove that both give error messages
//       
//       //Card card5 = new Card (2,15); 
      }

}