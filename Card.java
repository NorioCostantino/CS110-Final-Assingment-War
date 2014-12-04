/* Norio Costantino
 CS 110
 Assignment 5 Card Class*/

public class Card
{
   public final static int SPADES = 1;    //Each suit gets an int "code" 1-4
   public final static int CLUBS = 2;
   public final static int HEARTS = 3;
   public final static int DIAMONDS = 4;
   
   public final static int ACE = 1;       //Ace, jack queen and king are values 1, 11, 12 and 13
   public final static int JACK = 11;
   public final static int QUEEN = 12;
   public final static int KING = 13;
   
   private final int rank; //rank of the card which cannot be changed;
   private final int suit; //suit of the card which cannot be changed;
   
   /**
   The default constructor creates a card of a given suit and rank, after which it cannot be changed.
   Suits are 1 = spades, 2 = clubs, 3 = hearts, 4 = diamonds. ace = 1, jack = 11, queen = 12, king = 13
   */
     
   public Card(int cardSuit, int cardRank)
   {
      //Invalid input checking
      if (cardSuit != SPADES && cardSuit != CLUBS && cardSuit != HEARTS && cardSuit != DIAMONDS)
      {
         System.out.println("Invalid card suit");
         System.exit(1);
      }
      if (cardRank < 1 || cardRank > 13)
      {
         System.out.println("Invalid card rank");
         System.exit(1);
      }
      rank = cardRank;
      suit = cardSuit;
   }
   
  
   /** The getSuit method returns the suit of the card
   @return the suit of the card.*/
   public int getSuit()
   {
      return suit;   
   }

   /** The getRank method returns the rank of the card
   @return card rank.*/
   public int getRank()
   {
      return rank;   
   }   
   
   /** The toString method returns the string rank of the card
   @return the name of the rank and suit of the card.*/
   public String toString()
   {
      String suitString = "Card"; //string version of suit
      String valueString = "Card"; //string version of value
    
      switch (suit)
      {
         case SPADES: suitString = "Spades";
         break;
         
         case CLUBS: suitString = "Clubs";
         break;
         
         case HEARTS: suitString = "Hearts";
         break;
         
         case DIAMONDS: suitString = "Diamonds";
         break;
      }
         
      switch (rank)
      {
         case 1: valueString = "Ace";
         break;
         
         case 2: valueString = "2";
         break;
         
         case 3: valueString = "3";
         break;
         
         case 4: valueString = "4";
         break;
         
         case 5: valueString = "5";
         break;
         
         case 6: valueString = "6";
         break;
         
         case 7: valueString = "7";
         break;
         
         case 8: valueString = "8";
         break;
         
         case 9: valueString = "9";
         break;
         
         case 10: valueString = "10";
         break;
         
         case 11: valueString = "Jack";
         break;
         
         case 12: valueString = "Queen";
         break;
         
         case 13: valueString = "King";
         break; 
      }
      
      String totalString = valueString + " of " + suitString; //combining the results
      return totalString;
   
   }   
   
   /** The equals method compares this card to another card
   @param otherCard is the card being compared
   @return true if they are the same rank, false if they are not */
   public Boolean equals(Card otherCard)
   {
      Boolean equality;                         //True if euqal, false if not
      int card1value = otherCard.getRank();
      int card2value = rank;   
      
      if (card1value == card2value)
      {
         equality = true;
      }
      
      else
      {
         equality = false;
      }   
      
      return equality;
   }
   
   /** The isGreater method shows if this card is greater than another card
   @param otherCard is the card being compared
   @return true if this card is greater, false if they are not */
   public Boolean isGreater(Card otherCard)
   {
      Boolean greater;                 
      
      int card1value = rank;   
      int card2value = otherCard.getRank();
      
      if (card1value > card2value)
      {
         greater = true;
      }
      
      else
      {
         greater = false;
      }   
      
      return greater;
   }  
} 

