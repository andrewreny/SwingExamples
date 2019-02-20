package package1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class SwingExample2 extends JFrame implements ActionListener{

    public SwingExample2() {
        initUI();
    }

    public final void initUI() {
        JButton button1 = new JButton("Button1");
        button1.setBounds(100, 60, 100, 30);
		getContentPane().setLayout(null);
        getContentPane().add(button1);
        button1.addActionListener(this);
        setSize(300, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
		public void actionPerformed(ActionEvent e){
				System.out.println("Click!");
		}
    public static void main(String[] args) {
        SwingExample2 ex = new SwingExample2();
        ex.setVisible(true);
    }
}
