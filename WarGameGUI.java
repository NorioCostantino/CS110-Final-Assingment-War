/* Norio Costantino
 CS 110
 Final Assignment WarGameGUI*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class WarGameGUI extends JFrame
{
   private WarGame game;                  //The logic of the game
   
   //All panels, the top title panel, button panel, status panel and the 4 player panels
   private JPanel topPanel;   
   private JPanel p1Pile, p2Pile;
   private JPanel p1Play, p2Play;
   
   private JButton button;             //One button to go
   
   private JPanel status;              //status bar at the bottom 
   
   private JLabel title;               //Title for top panel
   private JLabel statusLabel;         //Status text
   private JLabel numberCardsPlayer1, numberCardsPlayer2;
   
   private JPanel cardsInPile1;        //number of cards in each pile
   private JPanel cardsInPile2;        
   private JLabel cardsInPile1Label;       
   private JLabel cardsInPile2Label;
   
   private JLabel player1PlayLabel;
   private JLabel player2PlayLabel;
   
   private JPanel gamePanel; 
   
   public WarGameGUI()
   {
      //Start new game
      game = new WarGame();
      
      //Grid bag layout
      setLayout(new GridBagLayout());
      GridBagConstraints c = new GridBagConstraints();
      
      //Top Panel
      topPanel = new JPanel();
      topPanel.setBackground(Color.blue);
      title = new JLabel("Norio's WAR");
      title.setFont(new Font("ARIAL",Font.BOLD,24));
      topPanel.add(title);
      
      c.fill = GridBagConstraints.HORIZONTAL;
      c.gridy = 0;
      c.gridx = 0;
      c.gridwidth = 4;
      c.ipadx = 0;
      c.ipady = 10;
      add(topPanel,c);
      
      
      //4 cards display
      p1Play = new JPanel();
      player1PlayLabel = new JLabel(new ImageIcon("back.jpg"));
      p1Play.add(player1PlayLabel);
      
      c.gridx = 1;
      c.gridy = 1;
      c.gridwidth = 1;
      c.ipadx = 0;
      c.ipady = 10;
      add(p1Play,c);
      
      
      p2Play = new JPanel();
      player2PlayLabel = new JLabel(new ImageIcon("back.jpg"));
      p2Play.add(player2PlayLabel);
      
      c.gridx = 2;
      add(p2Play,c);
      
      
      p1Pile = new JPanel();
      JLabel player1PileLabel = new JLabel (new ImageIcon("back.jpg"));
      p1Pile.add(player1PileLabel);
     
      c.gridx = 0;
      add(p1Pile,c);
      
      
      p2Pile = new JPanel();
      JLabel player2PileLabel = new JLabel (new ImageIcon("back.jpg"));
      p2Pile.add(player2PileLabel);
      
      c.gridx = 3;
      add(p2Pile,c);
      
      //Card remaining labels
      cardsInPile1 = new JPanel();
      cardsInPile1Label = new JLabel();
      cardsInPile1Label.setText("26 Cards Left");
      cardsInPile1.add(cardsInPile1Label);
      c.gridx = 0;
      c.gridy = 2;
      c.ipady=0;
      add(cardsInPile1,c);
     
     
      cardsInPile2 = new JPanel();
      cardsInPile2Label = new JLabel();
      cardsInPile2Label.setText("26 Cards Left");
      cardsInPile2.add(cardsInPile2Label); 
      c.gridx = 3;
      add(cardsInPile2,c);

      //The button
      button = new JButton();
      button.setEnabled(true);
      button.setText("Go");
      button.addActionListener(new ButtonListener());
      
      c.gridwidth = 2;
      c.fill = GridBagConstraints.HORIZONTAL;
      c.gridx = 1;
      c.gridy = 3;
      c.ipady = 0;
      add(button,c);
                  
       
      //The status panel
      status = new JPanel();
      statusLabel = new JLabel("Welcome!");
      statusLabel.setFont(new Font ("ARIAL",Font.BOLD,16));
      status.add(statusLabel);
      
      c.gridx = 1;
      c.gridy = 4;
      add(status,c);

   }
   /**Handling button press
   */
   private class ButtonListener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {     
         String winner; //stores winner string  
 
         //play a round
         game.playRound();
         
         //Reaction to round
         //display cards drawn
         ImageIcon play1Icon = new ImageIcon(game.card1.getImage());
         ImageIcon play2Icon = new ImageIcon(game.card2.getImage());
         player1PlayLabel.setIcon(play1Icon);
         player2PlayLabel.setIcon(play2Icon);
         
          //Check for a war
         if (game.getWinner().equals("war"))
         {
            game.war();
            statusLabel.setText("War!");
         }
         
         //Check to see who won       
         if (game.getWinner().equals("player1"))
         {
            statusLabel.setText("Player 1 Wins the Round!");
            
            //Change the number of cards left
            cardsInPile1Label.setText(game.getPlayer1PileSize() + " cards left");
            cardsInPile2Label.setText(game.getPlayer2PileSize() + " cards left");
         }
            
         else if (game.getWinner().equals("player2"))
         {
            statusLabel.setText("Player 2 Wins the Round!");
            //Change the number of cards left
            cardsInPile1Label.setText(game.getPlayer1PileSize() + " cards left");
            cardsInPile2Label.setText(game.getPlayer2PileSize() + " cards left");
         }   
         
         //check if someone won
         if (game.getWinner().equals("finalPlayer1Winner") )
         {
            statusLabel.setText("Player 1 Wins the Game!");
            button.setEnabled(false);  
         }

         else if (game.getWinner().equals("finalPlayer2Winner"))
         {
            statusLabel.setText("Player 2 Wins the Game!");
            button.setEnabled(false);
         }
     }       

   }
      
} 
