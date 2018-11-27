import javax.swing.JOptionPane;

public class ZeldathonGameTracker {
// This class will select what game to track and call the class needed for each game.
   public static void main(String[] args) {
      int gameSelector = 0;
      
      while (gameSelector != 9) {
         gameSelector = Integer.parseInt(JOptionPane.showInputDialog(null, "1-About\n2-Who Wants to be a Millionaire\n9-Close"));
         
         if (gameSelector == 1)
             About.info();
         else if(gameSelector== 2)
             Millionaire.play();
         else if (gameSelector == 9)
             JOptionPane.showMessageDialog(null, "Thank you.");
         
         
          }
  }
}