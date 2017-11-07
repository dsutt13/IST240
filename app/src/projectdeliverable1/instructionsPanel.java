/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectdeliverable1;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 *
 * @author sjo5124
 */
public class instructionsPanel extends JPanel {
    
    JTextArea message = new JTextArea("The instructions are as follows: \nWander around to your favorite State College bars "
            + "and play fun games to try to earn as many points as possible!!");
    JButton menu;
    
    public instructionsPanel(){
	
            super();
            setLayout(null);
            setBackground(Color.green);
            
            message.setBounds(400,300, 1000, 500);
            add(message);
            
            menu = new JButton("Menu");
            menu.setBounds(0,0,100,100);
            add(menu);
            

}}