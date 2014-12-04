/* Norio Costantino
 CS 110
 Final Assignment Tester Class*/
import java.util.ArrayList;
import java.util.Random;
import java.util.Collections;

public class test
{
   
 public static void main(String [] args)

   {
      WarGame game = new WarGame();
      
      game.playRound();
      game.claimWinner();
      
      game.playRound();
      game.claimWinner();
      
      game.playRound();
      game.playRound();
      game.playRound();
      
      //game.claimWinner();
      System.out.println("done");
      
   }  
}