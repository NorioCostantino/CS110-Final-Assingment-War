/* Norio Costantino
 CS 110
 Final Assignment WarGame Class*/

public class WarGame
{
   /**
   The main logic of the game.    
   */
   private Deck deck;               //A new 52 card deck to start the game
   private CardPile potCardPile;    //The "pot": cards to be claimed.
   
   //The cards available to each player
   private cardPile player1Pile;    
   private cardPile player2Pile;    
   
   //The status of a result, such as the winner of a round, a war or an empty pile
   String status;
     
   //Constructor  
   public WarGame()
   {
      deck = new Deck(); //Create new 52 cards deck
      
      //MAKE SHUFFLE A CLASS WITHIN CARD PILE SO THAT EACH PILE 
      //IS SHUFFLED WHEN THEY RUN OUT OF CARDS
      deck.shuffle();//Shuffle the cards
      
      //The initial sizes of the card piles are 26 cards each
      player1Pile = new CardPile(Deck.getSize()/2);
      player2Pile = new CardPile(Deck.getSize()/2);
      
      //Spoils piles start out empty
      p1SpoilsPile = new CardPile(0);
      p2SpoilsPile = new CardPile(0);
      
   }


   public String playRound(cardPile player1Pile, cardPile player2Pile)
   {
      Card card1 = player1Pile.draw();
      Card card2 = player2Pile.draw();
      int card1Rank = card1.getRank();
      int card2Rank = card2.getRank();
      cardPile pot = new CardPile(); 
      String winner;
      
      //Check for war first
      if (card1Rank == card2Rank)
      {
         winner =  //send back "war" in string, driver will go into
          
      }
      
      //Aces are written as rank 1 in the card program, however they beat all cards
      //except for a two (house rules!) 
      else if (card1Rank = 1 || card2Rank = 1)
      {
         if (card1Rank = 1 && card2Rank = 2)
         {
            winner = "player2"; //2 beats ace, house rules
            return winner;
         }
         
         else if (card2Rank = 1 && card1Rank = 2)
         {
            winner = "player1"; //2 beats ace, house rules
            return winner;
         }
         
         else if (card1Rank > card2Rank)
         {
            winner = "player2"; //Card rank is less, but it is an ace. Player 2 wins.
            return winner;
         }
         
         else
         {
            winner = "player1"; //card rank is less, but it is an ace. player 2 wins
         }
         winner = "player2"
      }
      
      else if(card1Rank > card2Rank);
      {
         winner = "player1"
      }
      
      else
      {
         winner = "player2";
      }
      
      //add the pot to 
      
      
          
   }   
   
   //
   public void war(cardPile player1Pile, cardPile player2Pile)
   {
      player1Pile = 
      
      
      
   }
   
   //Docu
   public int getPlayer1PileSize()
   {
      return player1Pile.size();
   }
   
   //Docu
   public int getPlayer2PileSize()
   {
      return player2Pile.size();
   }


   
}

