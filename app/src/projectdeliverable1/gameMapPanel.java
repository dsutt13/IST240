/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectdeliverable1;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author dsutt13
 */
public class gameMapPanel extends JPanel implements ActionListener {

    JButton map, pmans, phyrst, champs, madMex, den, cafe;

    public gameMapPanel() {
        super();
        setLayout(null);
        ImageIcon originalSize = new ImageIcon("images/map.png");
        ImageIcon newSize = new ImageIcon(((originalSize).getImage()).getScaledInstance(2000, 1000, java.awt.Image.SCALE_SMOOTH));
  
        map = new JButton();
        map.setBounds(0,0,2000,1000);
        add(map);
        map.setIcon(newSize);
        
        pmans.addActionListener(this);
        phyrst.addActionListener(this);
        champs.addActionListener(this);
        madMex.addActionListener(this);
        den.addActionListener(this);
        cafe.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        
    }




}
