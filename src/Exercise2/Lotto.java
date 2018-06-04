package Exercise2;
import javax.swing.JOptionPane;
import java.security.SecureRandom;
public class Lotto {

    private static final SecureRandom randomNum = new SecureRandom();


    // enum
    private enum Status {
        WON, LOST
    }

    Status gameStatus;


    // Three random integers
    private int[] intVal = new int[3];


    // constructor
    public Lotto() {
        this.intVal = intVal;
    }


    // array retrieving
    public int[] getIntVal() {
        return intVal;
    }

    // simulate game
    public void lottoGame(int userInput) {
        int lotto;
        int sum = 0;
        int noOfRolls = 1;
        //loop to continue the roll for 5 times
        while (noOfRolls <= 5) {
            lotto = 1 + randomNum.nextInt(9);
            sum += lotto;
            JOptionPane.showMessageDialog(null, "You got: " + sum);

            if (sum >= userInput)
                break;
            else
                noOfRolls++;
        }
        if (sum == userInput)
            gameStatus = Status.WON;
        else
            gameStatus = Status.LOST;

        // final message display
        if (gameStatus == Status.WON)
            JOptionPane.showMessageDialog(null, "Congrats!! \nYou are the winner");
        else
            JOptionPane.showMessageDialog(null, "GAME OVER\nYou lose the game..Try Again!!");
    }
}