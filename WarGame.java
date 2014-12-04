/* Norio Costantino
 CS 110
 Final Assignment WarGame Class*/

public class WarGame
{
   /**
   The main logic of the game.    
   */
   private Deck deck;               //A new 52 card deck to start the game
   
   
   //The cards available to each player
   private CardPile player1Pile;    
   private CardPile player2Pile;    
   
   //The cards to be claimed in each round
   Private CardPile pot; 
      
   //The winner of the round
   private String winner;
   
   //The two cards that are being compared
   private Card card1;
   private Card card2;
     
   //Constructor. create game with 2 piles, make a new deck, shuffle it and split in half to make 2 card piles.  
   public WarGame()
   {
      deck = new Deck(); //Create new 52 cards deck
      pot = new CardPile();//create new "pot"
      winner = null;
      
      deck.shuffle();//Shuffle the cards
      
      //The initial sizes of the card piles are decksize/2 each
      player1Pile = new CardPile();
      player2Pile = new CardPile();
      
      //Distribute the cards. Since the deck is shuffled, simply split the deck in half and add
      for(int i = 0; i < deck.getSize()/2; i++)
      {
         player1Pile.add(deck(i));
      }   
      
      for(int k = 0; k < deck.getSize()/2; k++)
      {
         player2Pile.add(deck(k));
      }
      
   }
   
   public void playRound()
   {
      //Draw a card from each pile
      card1 = player1Pile.draw();
      card2 = player2Pile.draw();
      
      //Add both cards to the pot
      pot.add(card1);
      pot.add(card2);
      
      //Check for war first. If there is a war, keep adding to pot until the ranks are not the same
      if (card1Rank == card2Rank)
      {
         this.war();
      }
      
      //If not war, find the winner of the round
      else
      {
         this.findWinner();
      }
      
      //Give the winner the pot of cards
      this.claimWinner(); 
   }   
   
   //Docu
   public void findWinner()
   {
      //Compare card ranks
      int card1Rank = card1.getRank();
      int card2Rank = card2.getRank();
      
      //Aces are written as rank 1 in the card program, however they beat all cards except for a two (house rules!) 
      if (card1Rank = 1 || card2Rank = 1)
      {
         if (card1Rank = 1 && card2Rank = 2)
         {
            winner = "player2"; //2 beats ace, house rules
         }
         
         else if (card2Rank = 1 && card1Rank = 2)
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
      
      else if(card1Rank > card2Rank);
      {
         winner = "player1"
      }
      
      else
      {
         winner = "player2";
      }
   }


   //If the cards are tied, war starts
   public void war()
   { 
      //The two facedown cards
      Card temp1;
      Card temp2;
               
      //Take a card from each hand facce down
      temp1 = card1Pile.draw();
      temp2 = card2Pile.draw();
      
      //Add temp cards to the pot
      pot.add(temp1);
      pot.add(temp2);

      //if the cards are still equal, go into a loop
      while(card1.getRank() == card2.getRank())
      {
         //Take a card from each hand face down
         temp1 = card1Pile.draw();
         temp2 = card2Pile.draw();
         
         //Draw two cards to compare again
         card1 = card1Pile.draw();
         card2 = card2Pile.draw();
         
         //Add all four cards to the pot
         pot.add(temp1);
         pot.add(temp2);
         pot.add(card1);
         pot.add(card2);
      }
      
      //Now that the ranks are uneven, find the winner
      this.findWinner(); 
   }
      
   //claimWinner adds the won cards in the pot to the winner's hand and then empties the pot
   public void claimWinner();
   {
      //If player 1 won, add pot to player 1 pile. 
      if(status.equals("player1")
      {
         for(int i = 0; i < pot.size(); i++)
         {
            player1Pile.add(pot(i));
         }
      }
      
      //If not, add pot to player 2 pile
      else
      {
         for(int j = 0; j < pot.size(); j++)
         {
            player2Pile.add(pot(j));
         }
      }
      
      //empty the pot for the next round
      pot.empty();
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

