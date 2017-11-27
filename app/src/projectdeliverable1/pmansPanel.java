/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectdeliverable1;

import java.awt.Color;
import java.awt.MenuComponent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel; 
import javax.swing.JTextArea;
import javax.swing.Timer;


/**
 *
 * @author dsutt13
 */
class pmansPanel extends JPanel implements ActionListener {
    
    JButton welcome;
    
    Timer tim;
    JTextArea message = new JTextArea("Time: ");
    int limit = 0;
    int delay = 0;
    int i = 6;
    initialPanel initial;
    gameMapPanel map;
    
    
    
    public pmansPanel() {
        super();
        setLayout(null);
        setBackground(Color.orange);
        
        welcome = new JButton("Welcome to Primanti Bro's!");
        welcome.setBounds(1000,0,200,200);
        add(welcome);
        
        add(message);
        message.setBounds(0,0,100,50);
        
        delay = 1000;
        tim = new Timer(delay, this);
             
    }
 
    @Override
    public void actionPerformed(ActionEvent ae) {
        Object obj = ae.getSource();
        if(obj == tim) {
           i = i-1;
           message.setText("Time: " + i);   
        }
        
        if(i == 0) {
              initial.remove(initial.pmansGame);
              initial.add(initial.map);
              initial.validate();
              initial.repaint();
            
            }
        
        }

}
