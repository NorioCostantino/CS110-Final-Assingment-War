/* Norio Costantino
 CS 110
 Final Assignment CardPile Class*/
import java.util.ArrayList;
import java.util.Random;
import java.util.Collections;

public class CardPile 
{
   /**
      Collection of cards to draw from, add to etc.
   */
   
   private ArrayList<Card> cardPile;      //The rraylist of cards
   private int size;                      //size of card pile (how many cards are in the pile)
     
   //constructor. create card pile of length 0  
   public CardPile()
   {
      size = 0;
      cardPile = new ArrayList<Card>();
   }

   //Add card to the bottom of the card pile
   public void add(Card card)
   {
      cardPile.add(size,card); 
      size++;
   }
   
   //Draw card from card pile (take off top and shift)
   public Card draw()
   {
      Card nextCard = cardPile.get(0);
      cardPile.remove(0);
      size--;   
      return nextCard;
   }
   
   //shuffle the card pile by swapping two random cards in the list a certain number of times.
   public void shuffle()
   {
      int numberOfSwaps = 10000;
      Random random = new Random();
      
      for(int i = 0; i < numberOfSwaps; i++)
      { 
         int position1 = random.nextInt(size);
         int position2 = random.nextInt(size);
         
         //swap positions in the arraylist
         Collections.swap(cardPile,position1,position2);
      }  
   }
   
   //determines whether the card pile has any elements in it
   //@return
   //@return
   public boolean isEmpty()
   {
      if (size == 0)
      {
         return true;
      }
      
      else
      {
         return false;
      }
   }
   
   public void empty()
   {
      cardPile.clear();
   }
   
   public int getSize()
   {
      return size;
   }
   
   
}