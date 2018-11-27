import javax.swing.JOptionPane;

public class About {
  
   public static void info() {
       String message = "Zeldathon Game Tracker\nThe purpose of this program is to keep track of/play many of the gameshows played at Zeldathon.";
       
       JOptionPane.showMessageDialog(null, message, "About Zeldathon Game Tracker", JOptionPane.INFORMATION_MESSAGE);
  
  
   }
}
