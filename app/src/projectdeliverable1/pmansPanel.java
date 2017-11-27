/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectdeliverable1;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JPanel; 
import javax.swing.JTextArea;
import javax.swing.Timer;

/**
 *
 * @author dsutt13
 */
class pmansPanel extends JPanel{
    
    JButton welcome;
    
    Timer tim;
    JTextArea message = new JTextArea("Time: ");
    int limit = 0;
    int delay = 0;
    int i = 45;
    
    public pmansPanel() {
        super();
        setLayout(null);
        setBackground(Color.orange);
        
        welcome = new JButton("Welcome to Primanti Bro's!");
        welcome.setBounds(1000,0,200,200);
        add(welcome);
        
        add(message);
        message.setBounds(0,20,150,150);
        message.setText("Time: " + i);
        delay = 1000;
        i=i-1;
        //tim = new Timer(delay, this);
        
        
        
    }

}
