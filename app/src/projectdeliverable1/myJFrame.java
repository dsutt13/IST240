/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectdeliverable1;

import java.awt.BorderLayout;
import javax.swing.JFrame;

/**
 *
 * @author sjo5124
 */
public class myJFrame extends JFrame {

   initialPanel initial;

    public myJFrame() {
        super("BAR CRAWL");
        initial = new initialPanel();
        add(initial);
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(2000, 1000);
        setVisible(true);
    }
}
