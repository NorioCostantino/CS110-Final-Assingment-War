/* Norio Costantino
 CS 110
 Final Assignment CardPile Class*/
import java.util.ArrayList;
import java.util.Random;
import java.util.Collections;

public class CardPile 
{
   
   private ArrayList<Card> cardPile;      //The rraylist of cards
   private int size;                      //size of card pile (how many cards are in the pile)
     
   /**Constructor creates a new cardpile (an arraylist of cards) with size = 0;
   */
   public CardPile()
   {
      size = 0;
      cardPile = new ArrayList<Card>();
   }

   /**Add a card tot he bottom of the card pile
   @param card is the card being added to the bottom of the pile
   */
   public void add(Card card)
   {
      cardPile.add(size,card); 
      size++;
   }
   
   /**Draw a card from the pile, removing it from the pile completely
   @return the top card in the pile
   */
   public Card draw()
   {
      Card nextCard = cardPile.get(0);
      cardPile.remove(0);
      size--;   
      return nextCard;
   }
   
   /**Get a specific card from teh card pile
   @param index the index of the card you want to get
   @return the card at the index specified
   */
   public Card get(int index)
   {
      Card card = cardPile.get(index);
      return card;
   }
   
   /**
   Shuffle the card pile so that the elements are in random order
   */
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
   
   /**isEmpty determines whether the card pile is empty
   @return ture if empty, false if not.
   */
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
   
   /**Empties out the card pile making it blank
   */
   public void empty()
   {
      cardPile.clear();
      size = 0;
   }
   
   /**Gives the size of the card pile
   @return card pile size
   */
   public int size()
   {
      return size;
   }
   
   
}