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
import javax.swing.Timer;

/**
 *
 * @author dsutt13
 */
public class mexPanel extends JPanel implements ActionListener {

    JButton welcome;
    
    Timer tim;
    JTextArea message = new JTextArea("Time: ");
    int limit = 0;
    int delay = 0;
    int i = 6;
    initialPanel initial;
    gameMapPanel map;
    
    public mexPanel(initialPanel a) {
        super();
        setLayout(null);
        setBackground(Color.orange);
        initial = a;
        
        welcome = new JButton("Welcome to Mad Mex");
        welcome.setBounds(1000,0,200,200);
        add(welcome);
        
        add(message);
        message.setBounds(0, 0, 100, 50);

        delay = 1000;
        tim = new Timer(delay, this);
        
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        Object obj = ae.getSource();
        if (obj == tim) {
            i = i - 1;
            message.setText("Time: " + i);
        }

        if (i == 0) {
            initial.remove(initial.mexGame);
            initial.add(initial.map);
            initial.validate();
            initial.repaint();
            i = 6;
        }
    }
    
}
