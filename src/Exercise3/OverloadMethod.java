package Exercise3;
import javax.swing.JOptionPane;

public class OverloadMethod {
    //instance variables
    private static double number1;
    private static double number2;


    public static void main(String[] args) {
        //user input option
        double numberOne = Double.parseDouble(JOptionPane.showInputDialog("Enter first number: "));
        double numberTwo = Double.parseDouble(JOptionPane.showInputDialog("Enter Second number: "));

        //display result with different
        JOptionPane.showMessageDialog(null, "First method with default arguments \nSummation of two numbers: " + getSummation());
        JOptionPane.showMessageDialog(null, "Second method with one arguments \nSummation of two numbers: " + getSummation(numberTwo));
        JOptionPane.showMessageDialog(null, "Third method with both arguments \nSummation of two numbers: " + getSummation(numberOne,numberTwo));

    }

    public static double getSummation() {
        number1 = 5;
        number2 = 10;
        double sum = number1+number2;
        return sum;
    }

    public static double getSummation(double number2) {
        number1 = 5;
        double sum = number1+number2;
        return sum;
    }

    public static double getSummation(double number1, double number2) {
        double sum = number1+number2;
        return sum;
    }
}
