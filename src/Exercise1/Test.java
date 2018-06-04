package Exercise1;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.security.SecureRandom;

public class Test {
    private static JavaQuestion[] allQuestions;
    private static final SecureRandom randomNumber = new SecureRandom();
    private static int answer;
    private static final int numOfQuestions = 5;
    private static double score = 0;
    private static boolean isRightAnswer;

    public static void startTest(String name) {

        JOptionPane.showMessageDialog(null,"------ Java Quiz --------"+
                "\n-------------------------------------------"+"\nHello "+name+
                ",\n Are you ready for the quiz? This is a 5 questions multiple choice quiz.\n"+"Lets start....");

// declaring all questions
        String q1 = "What does JDK stands for: \n(1) Java Details Kit \n(2) Java Door Key \n(3) Java Developers Kit \n(4) Java Design Key";
        String q2 = "The Java compiler generates: \n(1) Source code \n(2) Bytecode \n(3) Executable file \n(4) Image file";
        String q3 = "Which is not a part of defining an object: \n(1) Description \n(2) Methods \n(3) Associations with other objects \n(4) Name";
        String q4 = "A class is: \n(1) An object \n(2) An executable piece of code\n(3) An abstract definition of an object\n(4) A variable";
        String q5 = "Choose the appropriate data type for this value: \n(1) Int\n(2) Boolean\n(3) Double \n(4) String";

        //Array of the questions
        allQuestions = new JavaQuestion[] {
                new JavaQuestion(q1, 3),
                new JavaQuestion(q2, 2),
                new JavaQuestion(q3, 1),
                new JavaQuestion(q4, 3),
                new JavaQuestion(q5, 3),
        };
//Questions simulation
simulateQuestion(allQuestions);
    }
//Displaying questions and getting answer
    public static void simulateQuestion(JavaQuestion[] allQuestions) {
        for (int i = 0; i < allQuestions.length; i++) {
            JOptionPane.showMessageDialog(null, allQuestions[i].getQuestions());
answer = keyboardInput();
            isRightAnswer = checkAnswer(allQuestions[i].getAnswers());
generateMessage(isRightAnswer);
        }
    }
//Answer input from keyboard
    public static int keyboardInput() {
        answer = Integer.parseInt(JOptionPane.showInputDialog("Choose an option: 1 / 2 / 3 / 4: "));
        return answer;
    }
//Answer checking
    public static boolean checkAnswer(int rightAnswer) {
        boolean isRight = false;
        for (int i = 0; i < allQuestions.length; i++) {
            if (answer ==(rightAnswer)) {
                score++;
                return true;
            } else
                return false;
        }
        return isRight;


    }
//Message for right or wrong answer
    public static void generateMessage(boolean rightAnswer) {
        int randomResponse = 1 + randomNumber.nextInt(4);
        if (rightAnswer) {
            switch (randomResponse) {
                case 1:
                    JOptionPane.showMessageDialog(null, "Excellent");
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Good!");
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Keep up the good work!");
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Nice job!!");
                    break;

            }
        } else {
            switch (randomResponse) {
                case 1:
                    JOptionPane.showMessageDialog(null, "Wrong!! Try Again");
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Don't give up");
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Better luck next time!");
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Oh no.. Wrong answer");
                    break;
            }

        }
    }

    //Result display

    public String showScore() {

        return String.format("You are done with your test.\nYour total score is: %s/%d\nYour score in percentage: %s", score, numOfQuestions, (score * 100) / numOfQuestions);
    }
}

