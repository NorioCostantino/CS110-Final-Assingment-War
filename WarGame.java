/* Norio Costantino
 CS 110
 Final Assignment WarGame Class*/

public class WarGame
{
   /**
   The main logic of the game.    
   */
   public Deck deck;               //A new 52 card deck to start the game
   
   
   //The cards available to each player
   private CardPile player1Pile;    
   private CardPile player2Pile;    
   
   //The cards to be claimed in each round
   private CardPile pot; 
      
   //The winner of the round
   private String winner;
   
   //The two cards that are being compared
   public Card card1;
   public Card card2;
     
   /**Constructor of WarGame. Create game with 2 piles, make a new deck, shuffle it and split in half to make 2 card piles. 
   */ 
   public WarGame()
   {
      deck = new Deck(); //Create new 52 cards deck
      pot = new CardPile(); //Create new "pot"
      winner = null;
      
      //Shuffle the cards
      deck.shuffle();    
        
      //The initial sizes of the card piles are decksize/2 each
      player1Pile = new CardPile();
      player2Pile = new CardPile();
      
      //The counter for splitting up the deck
      int counter;
      
      //Distribute the cards evenly. Since the deck is shuffled, simply split the deck in half and add
      for(counter = 0; counter < deck.size()/2; counter++)
      {
         player1Pile.add(deck.get(counter));
      }   
      
      for(counter = deck.size()/2; counter < deck.size(); counter++)
      {
         player2Pile.add(deck.get(counter));
      }
      
   }
   /**Play a round of War Game
   */
   public void playRound()
   {
      if(player1Pile.size() == 0) 
      {
         winner = "finalPlayer1Winner";
      }
      
      else if(player2Pile.size() == 0) 
      {
         winner = "finalPlayer2Winner";
      }      
      
      else
      {
         //Draw a card from each pile
         card1 = player1Pile.draw();
         card2 = player2Pile.draw();
         
         //Add both cards to the pot
         pot.add(card1);
         pot.add(card2);
         
          //Find the winner of the round
          this.findWinner();
      }
   }   
   
   /** Find the winner of the round or game. winner will be modified.
   */
   public void findWinner()
   {
      //Compare card ranks
      int card1Rank = card1.getRank();
      int card2Rank = card2.getRank();
      
      //Check for war first. If there is a war, keep adding to pot until the ranks are not the same
      if (card1Rank == card2Rank)
      {
         winner = "war";
      }
      
      //Aces are written as rank 1 in the card program, however they beat all cards except for a two (house rules!) 
      else if (card1Rank == 1 || card2Rank == 1)
      {
         if (card1Rank == 1 && card2Rank == 2)
         {
            winner = "player2"; //2 beats ace, house rules
         }
         
         else if (card2Rank == 1 && card1Rank == 2)
         {
            winner = "player1"; //2 beats ace, house rules
         }
         
         else if (card1Rank > card2Rank)
         {
            winner = "player2"; //Card rank is less, but it is an ace. Player 2 wins.
         }
         
         else          
         {
            winner = "player1"; //card rank is less, but it is an ace. player 2 wins
         }
         
      }
      
      else if(card1Rank > card2Rank)
      {
         winner = "player1";
      }
      
      else 
      {
         winner = "player2";
      }

   }


   /**
   If there is a tie, go to war. War simply adds a new card to the pot which is not compared. 
   */
   public void war()
   { 
      //The two facedown cards
      Card temp1;
      Card temp2;
     
      //Take a card from each hand face down
      temp1 = player1Pile.draw();
      temp2 = player2Pile.draw();
      
      //Add temp cards to the pot
      pot.add(temp1);
      pot.add(temp2);
   }
      
   /**claimWinner adds the won cards in the pot to the winner's hand and then empties the pot
   */
   public void claimWinner()
   {
      //If player 1 won, add pot to player 1 pile. 
      if(winner.equals("player1"))
      {
         for(int i = 0; i < pot.size(); i++)
         {
            player1Pile.add(pot.get(i));
         }
      }
      
      //If not, add pot to player 2 pile
      else
      {
         for(int j = 0; j < pot.size(); j++)
         {
            player2Pile.add(pot.get(j));
         }
      }
      
      //empty the pot for the next round
      pot.empty();
   }
   
   /**Find the winner of a round or game
   @return player1roundwin, player2roundwin, player1finalwin or player2finalwin
   */
   public String getWinner()
   {
      return winner;
   }
   
   /**
   Get the pile size of player 1's pile
   @return size of player 2 pile
   */
   public int getPlayer1PileSize()
   {
      return player1Pile.size();
   }
   
   /**
   Get the pile size of player 2's pile
   @return size of player 2 pile
   */
   public int getPlayer2PileSize()
   {
      return player2Pile.size();
   }

   /**
   Get rank of card drawn by player 1
   @return player 1 drawn card rank
   */
   public int getCard1Rank()
   {
      return card1.getRank();
   }

   /**
   Get rank of card drawn by player 2
   @return player 2 drawn card rank
   */
   public int getcard2Rank()
   {
      return card2.getRank();
   }
}

