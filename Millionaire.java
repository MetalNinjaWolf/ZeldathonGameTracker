import javax.swing.JOptionPane;

public class Millionaire {
   public static void play() {
   // Defining the 2D array with money values and questions.
      String[][] questions = new String[2][15];
      questions[0][0] = "1 "; questions[1][0] = "What is Farore the goddess of? ";
      questions[0][1] = "5 "; questions[1][1] = "In Skyward Sword, how many times must Link defeat the Imprisoned? ";
      questions[0][2] = "10 "; questions[1][2] = "In which Zelda game do Zoras not appear? ";
      questions[0][3] = "25 "; questions[1][3] = "In Majora's Mask, which mask allows Link to perform a mysterious dance? ";
      questions[0][4] = "50 "; questions[1][4] = "Which item from Ocarina of Time does not reappear in Majora's Mask? ";
      questions[0][5] = "100 "; questions[1][5] = "Which Zelda game has the fewest dungeons? ";
      questions[0][6] = "200 "; questions[1][6] = "In Majora's Mask, what is the name of the ghost that appears in the Spring Water Cave by Ikana Canyon? ";
      questions[0][7] = "300 "; questions[1][7] = "What is the name of the little girl who visits the demon Batreaux in Skyward Sword? ";
      questions[0][8] = "400 "; questions[1][8] = "Which one of these Mario enemies is found in the Minish Cap? ";
      questions[0][9] = "500 "; questions[1][9] = "How many rupees does the Magic Armor cost at Malo Mart? ";
      questions[0][10] = "600 "; questions[1][10] = "In Zelda's Adventure, which Shrine is first? ";
      questions[0][11] = "700 "; questions[1][11] = "In Four Swords Adventure, Shadow Link was made by which of the following? ";
      questions[0][12] = "800 "; questions[1][12] = "The events of A Link to the Past are preceded by which conflict? ";
      questions[0][13] = "900 "; questions[1][13] = "As seen in a flashback scene in Twilight Princess, Ganondorf murdered which Sage in his attempt to escape execution? ";
      questions[0][14] = "1000 "; questions[1][14] = "In Phantom Hourglass, which Anouki is really a Yook in disguise? ";
     // Array of responses in dropdown menu of JOptionPane.
      String[] responses = {"Correct", "Incorrect","Resign"};
      
     // Looping through questions in JOptionPane
      for (int i=0; i <= 14 ; i++) {
         String input = (String) JOptionPane.showInputDialog(null,  "The answer of " + questions[1][i]+ " is: ",
            "For $" +questions[0][i], JOptionPane.QUESTION_MESSAGE, null, responses, responses[0]);
      if (input== responses[0]) {
    	  
      }
      // If the person on the show gets the question wrong the tracker will select incorrect and it will have this response and break from the loop.
      else if (input==responses[1]) {
    	  JOptionPane.showMessageDialog(null, "Sorry, you have lost");
    	  break;
      }
      // If the person on the show gets the question right and decides to resign the person using the tracker will resign and receive the final value and break the loop.
      else if (input==responses[2]) {
      JOptionPane.showMessageDialog(null,"Congratulations, you have won $" +questions[0][i-1]);
    	  break;
      }
      // If the person on the show answers all correctly the loop will end and display a message.
     if (i==14) {
    	 JOptionPane.showMessageDialog(null, "You have won Who Wants to be a Millionaire!");
     }
      }
   }
}