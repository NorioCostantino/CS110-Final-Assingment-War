/* Norio Costantino
 CS 110
 Final Assignment Deck Class*/

public class Deck extends CardPile
{
   /**
   The deck is a special card pile with 52 cards that contains every playing card.
   */
   
   private final int NUM_CARDS = 52; //every deck has 52 cards, make this final at the end. 6 for testing purposes
   private Card card;
   
   /**
   Constructor: create a new deck of 52 cards, a specialized card pile
   */
   public Deck()
   {
      int suit = 1;  //suits range from 1 to 4
      int rank = 1;  //ranks range from 1 to 13
      
      //Populate the deck
      for(int i = 0; i < NUM_CARDS; i++)
      {   
         
         card = new Card(suit, rank);
         this.add(card);  
         
         suit++;
         rank++;
         
         if (suit == 5)
         {
            suit = 1;
         }
         
         if (rank == 14)
         {
            rank = 1;
         }
         
      }
      
   }   

}


