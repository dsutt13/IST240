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
class difficultyPanel extends JPanel{
    
    JButton easy, medium, hard;
    
    public difficultyPanel() {
        super();
        setLayout(null);
        setBackground(Color.orange);
        
        easy = new JButton("Easy");
        easy.setBounds(600,500, 200, 100);
        add(easy);
        
        
        medium = new JButton("Medium");
        medium.setBounds(600,300, 200, 100);
        add(medium);
        
        hard = new JButton("Hard");
        hard.setBounds(600,100, 200, 100);
        add(hard);
    }
}
