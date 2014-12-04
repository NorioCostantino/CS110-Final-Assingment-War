/* Norio Costantino
 CS 110
 Final Assignment WarGameGUI*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class WarGameGUI extends JFrame
{
   private WarGame game;                  //The logic of the game
   
   //All panels
   private JPanel topPanel;   
   private JPanel player1PilePanel, player2PilePanel;
   private JPanel player1PlayPanel, player2PlayPanel;
   
   private JButton button;                //One button
   
   private JTextPane status;              //status bar at the bottom/center 
   
   private JLabel title;                  //Title for top panel
   private JLabel numberCardsPlayer1, numberCardsPlayer2;
   
   private JLabel playercard1;
   private JLabel playercard2;
   
   private JPanel gamePanel; 
   
   public WarGameGUI()
   {
      //Start new game
      game = new WarGame();
      
      topPanel = new JPanel();
      topPanel.setBackground(Color.green);
      
      player1PilePanel = new JPanel();
      player2PilePanel = new JPanel();
      
      gamePanel = new JPanel(new FlowLayout());
      
      
      player1PilePanel.setBackground(Color.blue);
      player2PilePanel.setBackground(Color.blue);

      player1PlayPanel = new JPanel();
      player2PlayPanel = new JPanel();
            
      player1PlayPanel.setBackground(Color.blue);
      player2PlayPanel.setBackground(Color.blue);

      title = new JLabel("Norio's WAR");
      title.setFont(new Font("HELVETICA",Font.ITALIC,36));
      //title.setForeGround(Color.RED);
      topPanel.add(title);
      
      //topPanel.setLayout(new FlowLayout());
      
      //Status text pane
      status = new JTextPane();
      status.setText("Welcome!");
      //status.setFont(new Font "HELVETICA",Font.ITALIC,16);
      
      //Button
      
      button = new JButton();
      button.setEnabled(true);
      button.setText("Go");
      
      button.addActionListener(new ButtonListener());
      
      
     // status = new JLabel("Game in progress");
     // status.setFont(new Font("ARIAL",Font.BOLD,24));
     // topPanel.add(status);
      
      setLayout(new GridLayout(3,1));
      
      gamePanel.setBackground(Color.red);
      
      gamePanel.add(player1PilePanel);
      gamePanel.add(player2PilePanel);
      gamePanel.add(player1PlayPanel);
      gamePanel.add(player2PlayPanel);
      
      add(topPanel);
      add(gamePanel);     
      add(button);
      
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
            status.setText("Player 1 wins!");
         }
          
         else if (game.getWinner().equals("FinalPlayer2Winner"))
         {
            status.setText("Player 2 wins!");
         }
               
         else if (game.getWinner().equals("player1"))
         {
            status.setText("Player 1 Wins the Round!");
         }
            
         else if (game.getWinner().equals("player2"))
         {
            status.setText("Player 2 Wins the Round!");
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


