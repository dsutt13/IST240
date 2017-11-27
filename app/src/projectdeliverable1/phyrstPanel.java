/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectdeliverable1;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author dsutt13
 */
class phyrstPanel extends JPanel {
    JButton welcome;
    
    public phyrstPanel() {
        super();
        setLayout(null);
        setBackground(Color.orange);
        
        welcome = new JButton("Welcome to the Phyrst!");
        welcome.setBounds(1000,0,200,200);
        add(welcome);
        
    }
}
