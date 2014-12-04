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
   
   
   
   //gridbag layout
   private JPanel master;
   
   
   
   
   private JButton button;             //One button to go
   
   private JPanel status;              //status bar at the bottom 
   
   private JLabel title;               //Title for top panel
   private JLabel statusLabel;         //Status text
   private JLabel numberCardsPlayer1, numberCardsPlayer2;
   
   private JLabel player1PlayLabel;
   private JLabel player2PlayLabel;
   
   private JPanel gamePanel; 
   
   public WarGameGUI()
   {
      //Start new game
      game = new WarGame();
      
     //  
//       //Add the title to the topPanel
//       //Set up the top panel
//       topPanel = new JPanel();
//       topPanel.setBackground(Color.blue);
//       title = new JLabel("Norio's WAR");
//       
//       title.setFont(new Font("ARIAL",Font.BOLD,24));
//       topPanel.add(title);
    
      
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
      add(topPanel,c);
      
      
      //4 cards display
      p1Play = new JPanel();
      player1PlayLabel = new JLabel(new ImageIcon("back.jpg"));
      p1Play.add(player1PlayLabel);
      
      c.gridx = 1;
      c.gridy = 1;
      c.gridwidth = 1;
      c.ipadx = 0;
      c.ipady = 50;
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
      
      
      
      //The button
      button = new JButton();
      button.setEnabled(true);
      button.setText("Go");
      button.addActionListener(new ButtonListener());
      
      c.gridwidth = 2;
      c.fill = GridBagConstraints.HORIZONTAL;
      c.gridx = 1;
      c.gridy = 2;
      c.ipady = 0;
      add(button,c);
                  
       
      //The status panel
      status = new JPanel();
      statusLabel = new JLabel("Welcome!");
      statusLabel.setFont(new Font ("ARIAL",Font.BOLD,16));
      status.add(statusLabel);
      
      c.gridx = 1;
      c.gridy = 3;
      add(status,c);
                  

      
     //  //Add the test to the status pane to start
//       status = new JPanel();
//       statusLabel = new JLabel("Welcome!");
//       statusLabel.setFont(new Font ("ARIAL",Font.BOLD,16));
//       status.add(statusLabel);
// 
//       //Add Button
//       button = new JButton();
//       button.setEnabled(true);
//       button.setText("Go");
//       button.addActionListener(new ButtonListener());
//       
//       //Labels showing the backs of cards, put all labels on the player piles
//       player1PlayLabel = new JLabel(new ImageIcon("back.jpg"));
//       player2PlayLabel = new JLabel(new ImageIcon("back.jpg"));
//       
//       JLabel player1PileLabel = new JLabel (new ImageIcon("back.jpg"));
//       JLabel player2PileLabel = new JLabel (new ImageIcon("back.jpg"));
//       
//       
//       //Setup the game panel panels
//       p1Play = new JPanel();
//       p2Play = new JPanel();
//       p1Pile = new JPanel();
//       p2Pile = new JPanel();
//       
//       //Set the overall layout
//       setLayout(new GridLayout(4,1));
//       
//       //Setup the game panel
//       
//       gamePanel = new JPanel(new FlowLayout());
//       
//       gamePanel.setBackground(Color.red);
//       
//       //Add the backs to each of the buttons
//       gamePanel.add(player1PlayLabel);
//       gamePanel.add(player2PlayLabel);
//       gamePanel.add(player1PileLabel);
//       gamePanel.add(player2PileLabel);
//       
//       //Add each panel to the overall layout
//       add(topPanel);
//       add(gamePanel);     
//       add(button);
//       add(status);
      
   }
   /**Handling button press
   */
   private class ButtonListener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {     
         String winner; //stores winner string  
         
         //Play a round
         game.playRound();
         
         //Reaction to round 
         
         //Set the pictures of the center play cards
         //player1PlayLabel = new JLabel(new ImageIcon(game.card1.getImage()));
         //player2PlayLabel = new JLabel(new ImageIcon(game.card2.getImage()));
         //p1Play.add(player1PlayLabel);
         //p1Play.repaint();
         //p2Play.add(player2PlayLabel);
         //p2Play.repaint();
         
         ImageIcon play1Icon = new ImageIcon(game.card1.getImage());
         ImageIcon play2Icon = new ImageIcon(game.card2.getImage());
         player1PlayLabel.setIcon(play1Icon);
         player2PlayLabel.setIcon(play2Icon);
         
         
         if (game.getWinner().equals("finalPlayer1Winner"))
         {
            statusLabel.setText("Player 1 Wins the Game!");
         }
          
         else if (game.getWinner().equals("FinalPlayer2Winner"))
         {
            statusLabel.setText("Player 2 Wins the Game!");
         }
               
         else if (game.getWinner().equals("player1"))
         {
            statusLabel .setText("Player 1 Wins the Round!");
         }
            
         else if (game.getWinner().equals("player2"))
         {
            statusLabel.setText("Player 2 Wins the Round!");
         }   
      }
              
              

   }
      
}     


