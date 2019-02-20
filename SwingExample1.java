package package1;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class SwingExample1 extends JFrame {

    public SwingExample1() {
       setTitle("Simple example");
       setSize(300, 200);
       setLocationRelativeTo(null);
       setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
       SwingExample1 ex = new SwingExample1();
       ex.setVisible(true);
    }
}