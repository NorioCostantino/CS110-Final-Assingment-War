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
   
   private JLabel playercard1;
   private JLabel playercard2;
   
   private JPanel gamePanel; 
   
   public WarGameGUI()
   {
      //Start new game
      game = new WarGame();
      
      //Add the title to the topPanel
      //Set up the top panel
      topPanel = new JPanel();
      topPanel.setBackground(Color.blue);
      title = new JLabel("Norio's WAR");
      
      title.setFont(new Font("ARIAL",Font.BOLD,24));
      topPanel.add(title);
      
      //Add the test to the status pane to start
      status = new JPanel();
      statusLabel = new JLabel("Welcome!");
      statusLabel.setFont(new Font ("ARIAL",Font.BOLD,16));
      status.add(statusLabel);

      //Add Button
      button = new JButton();
      button.setEnabled(true);
      button.setText("Go");
      button.addActionListener(new ButtonListener());
      
      //Labels showing the backs of cards, put all labels on the player piles
      JLabel player1PlayLabel = new JLabel(new ImageIcon("back.jpg"));
      JLabel player2PlayLabel = new JLabel(new ImageIcon("back.jpg"));
      
      JLabel player1PileLabel = new JLabel (new ImageIcon("back.jpg"));
      JLabel player2PileLabel = new JLabel (new ImageIcon("back.jpg"));
      
      
      //setup the game panel panels
      p1Play = new JPanel();
      p2Play = new JPanel();
      p1Pile = new JPanel();
      p2Pile = new JPanel();
      
      //Set the overall layout
      setLayout(new GridLayout(4,1));
      
      //Setup the game panel
      
      gamePanel = new JPanel(new FlowLayout());
      
      gamePanel.setBackground(Color.red);
      
      //Add the backs to each of the buttons
      gamePanel.add(player1PlayLabel);
      gamePanel.add(player2PlayLabel);
      gamePanel.add(player1PileLabel);
      gamePanel.add(player2PileLabel);
      
      //Add each panel to the overall layout
      add(topPanel);
      add(gamePanel);     
      add(button);
      add(status);
      
   }
   /**Handling button press
   */
   private class ButtonListener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {     
         String winner; //stores winner string  

         // make a move
         game.playRound();
         // react
            
         if (game.getWinner().equals("finalPlayer1Winner"))
         {
            statusLabel = new JLabel("Player 1 wins!");
         }
          
         else if (game.getWinner().equals("FinalPlayer2Winner"))
         {
            statusLabel = new JLabel("Player 2 wins!");
         }
               
         else if (game.getWinner().equals("player1"))
         {
            statusLabel = new JLabel("Player 1 Wins the Round!");
         }
            
         else if (game.getWinner().equals("player2"))
         {
            statusLabel = new JLabel("Player 2 Wins the Round!");
         }   
      }
              
              

   }
      
      // disable all buttons
      // private void disableAll()
//       {
//          for (int r=0;r<3;r++)
//             for(int c=0;c<3;c++)
//             {
//                buttons[r][c].setEnabled(false);
//             }
//       
//       }
   }     


