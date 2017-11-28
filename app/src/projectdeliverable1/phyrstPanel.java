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
class phyrstPanel extends JPanel implements ActionListener {
    JButton welcome;
    
    Timer tim;
    JTextArea message = new JTextArea("Time: ");
    int limit = 0;
    int delay = 0;
    int i = 6;
    initialPanel initial;
    gameMapPanel map;
    
    public phyrstPanel(initialPanel a) {
        super();
        setLayout(null);
        setBackground(Color.black);
        initial = a;
        
        welcome = new JButton("Welcome to the Phyrst!");
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
            initial.remove(initial.phyrstGame);
            initial.add(initial.map);
            initial.validate();
            initial.repaint();
            tim.stop();
        }
    }
}
