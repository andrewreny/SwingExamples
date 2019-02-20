package package1;

import java.awt.event.*; 
import java.awt.*; 
import javax.swing.*; 
public class SwingExample4 extends JFrame { 
  
    // JFrame 
    public static JFrame frame; 
  
    // JButton 
    public static JButton b1, b2, b3, b4; 
  
    // label to diaplay text 
    public static JLabel label; 
  
    // main class 
    public static void main(String[] args) 
    { 
        // create a new frame to stor text field and button 
        frame = new JFrame("Panel"); 
  
        // create a label to display text 
        label = new JLabel("Panel Label"); 
  
        // create a new buttons 
        b1 = new JButton("button1"); 
        b2 = new JButton("button2"); 
        b3 = new JButton("button3"); 
        b4 = new JButton("button4"); 
  
        // create a panel to add buttons and  a specific layout 
        JPanel p = new JPanel(new BorderLayout()); 
  
        // add buttons and textfield to panel 
        p.add(b1, BorderLayout.NORTH); 
        p.add(b2, BorderLayout.SOUTH); 
        p.add(b3, BorderLayout.EAST); 
        p.add(b4, BorderLayout.WEST); 
        p.add(label, BorderLayout.CENTER); 
  
        // setbackground of panel 
        p.setBackground(Color.green); 
  
        // add panel to frame 
        frame.add(p); 
  
        // set the size of frame 
        frame.setSize(300, 300); 
  
        frame.show(); 
    } 
} 
