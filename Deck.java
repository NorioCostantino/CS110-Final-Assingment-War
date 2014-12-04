/* Norio Costantino
 CS 110
 Final Assignment Deck Class*/

public class Deck extends cardPile
{
   /**
      A 52 card deck of cards
   */
   
   private final int NUMBER_OF_CARDS = 52; //every deck has 52 cards
   
   private CardPile deck;  //Deck is a special card pile
   private Card card;
     
   public Deck()
   {
      deck = new CardPile();
      int suit = 1;  //suits range from 1 to 4
      int rank = 1;  //ranks range from 1 to 13
      
      //populate the deck
      for(int i = 0; i < NUMBER_OF_CARDS; i++)
      {
         
         
         card = new Card(suit, rank);
         deck.add(card);
         
         
         suit++;
         rank++;
         
         if suit
         deck.add(
         for suit
      }
      
      
   }   

}


