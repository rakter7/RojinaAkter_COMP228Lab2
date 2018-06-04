package Exercise1;

import javax.swing.*;

public class JavaTest {
    public static void main(String[] args) {
        Test test= new Test();
        String name=JOptionPane.showInputDialog("Enter your name: ");
        test.startTest(name);
        JOptionPane.showMessageDialog(null,test.showScore());

    }
}
