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

/**
 *
 * @author dsutt13
 */
public class gameDesigners extends JPanel {

    JButton menu;
    JTextArea message = new JTextArea("Game Designers:\nDylan Sutt\nSamuel Onimus\nNathaniel Ouzts");
    
    public gameDesigners() {
        super();
        setLayout(null);
        setBackground(Color.yellow);

        menu = new JButton("Menu");
        menu.setBounds(0, 0, 100, 100);
        add(menu);
        
        message.setBounds(400,300, 1000, 500);
        add(message);
        
    }
    
}
