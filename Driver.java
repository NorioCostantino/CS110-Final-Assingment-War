/* Norio Costantino
 CS 110
 Final Assignment Driver*/
import javax.swing.*;

public class Driver
{

public static void main(String [] args)
   {
      JFrame frame = new WarGameGUI();
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setSize(700,450);
      frame.validate();
      frame.setVisible(true);
   }
}