/* Norio Costantino
 CS 110
 Final Assignment Deck Class*/

public class Deck extends CardPile
{
   /**
   A 52 card deck of cards
   */
   
   private final int NUMBER_OF_CARDS = 52; //every deck has 52 cards
   private Card card;
     
   public Deck()
   {
      int suit = 1;  //suits range from 1 to 4
      int rank = 1;  //ranks range from 1 to 13
      
      //populate the deck
      for(int i = 0; i < NUMBER_OF_CARDS; i++)
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


