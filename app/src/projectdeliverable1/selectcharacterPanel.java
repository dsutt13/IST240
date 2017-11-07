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
 * @author sjo5124
 */
public class selectcharacterPanel extends JPanel {

    JButton menu, character1, character2, character3;
    
    public selectcharacterPanel() {
        super();
        setLayout(null);
        setBackground(Color.yellow);

        menu = new JButton("Menu");
        menu.setBounds(0, 0, 100, 100);
        add(menu);
        
        
        character1 = new JButton("Harry Potter");
        character1.setBounds(600,500, 200, 100);
        add(character1);
        
        
        character2 = new JButton("Jon Snow");
        character2.setBounds(600,300, 200, 100);
        add(character2);
        
        character3 = new JButton("Michael Myers");
        character3.setBounds(600,100, 200, 100);
        add(character3);
    }
}
