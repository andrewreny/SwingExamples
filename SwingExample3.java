package package1;

import java.awt.event.*; 
import java.awt.*; 
import javax.swing.*; 
public class SwingExample3 extends JFrame { 
  
    // JFrame 
    static JFrame frame; 
  
    // JButton 
    static JButton b1, b2, b3; 
  
    // label to diaplay text 
    static JLabel label; 
  
    // main class 
    public static void main(String[] args) 
    { 
        // create a new frame to stor text field and button 
        frame = new JFrame("panel"); 
  
        // create a label to display text 
        label = new JLabel("Panel Label"); 
  
        // create a new buttons 
        b1 = new JButton("Button #1"); 
        b2 = new JButton("Button #2"); 
        b3 = new JButton("Button #3"); 
  
        // create a panel to add buttons 
        JPanel p = new JPanel(); 
  
        // add buttons and textfield to panel 
        p.add(b1); 
        p.add(b2); 
        p.add(b3); 
        p.add(label); 
  
        // setbackground of panel 
        p.setBackground(Color.blue); 
  
        // add panel to frame 
        frame.add(p); 
  
        // set the size of frame 
        frame.setSize(300, 300); 
  
        frame.show(); 
    } 
} 
