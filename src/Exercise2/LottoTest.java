package Exercise2;
import javax.swing.JOptionPane;

public class LottoTest {
    public static void main(String[] args) {

        JOptionPane.showMessageDialog(null, "!!!!!!!!!!!!! -- LOTTO -- !!!!!!!!!!!!!!!!" +
                "\n----------------------------------------\n" +
                "\n- To play it choose a number from 3 to 27." +
                "\n- Run the lotto for 5 (maximum) times to match with your number" +
                "\n- If the number matches with your number, you win" +
                "\n- Otherwise you lose ..." +
               "\n- - - Lets play - - - ");

        // user input option
            int userInput = Integer.parseInt(JOptionPane.showInputDialog("Choose a number between 3 and 27: "));

            // new object creation
            Lotto gameObj = new Lotto();

            // call the method to start the game
            gameObj.lottoGame(userInput);

    }

}
