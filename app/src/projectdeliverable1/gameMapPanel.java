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
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author dsutt13
 */
public class gameMapPanel extends JPanel implements ActionListener, KeyListener {

    JButton map, pmans, phyrst, champs, madMex, den, cafe, player;

     public void paintComponent(Graphics g) {
        
        super.paintComponent(g);
        Image img = Toolkit.getDefaultToolkit().getImage("images/map.png");
        g.drawImage(img,0,0,2000,1000,this);   
    }
    
    public gameMapPanel() {
        super();
        setLayout(null);
        /*ImageIcon originalSize = new ImageIcon("images/map.png");
        ImageIcon newSize = new ImageIcon(((originalSize).getImage()).getScaledInstance(2000, 1000, java.awt.Image.SCALE_SMOOTH));
  
        map = new JButton();
        map.setBounds(0,0,2000,1000);
        //add(map);
        map.setIcon(newSize);*/
        
        pmans = new JButton("PMans");
        phyrst = new JButton("Phyrst");
        champs = new JButton("Champs");
        madMex = new JButton("Mad Mex");
        den = new JButton("Lion's Den");
        cafe = new JButton("Cafe 210 West");
        player = new JButton();
        
        pmans.addActionListener(this);
        phyrst.addActionListener(this);
        champs.addActionListener(this);
        madMex.addActionListener(this);
        den.addActionListener(this);
        cafe.addActionListener(this);
        player.addActionListener(this);
        
        pmans.setBounds(1800,400,100,100);
        phyrst.setBounds(900,400,100,100);
        champs.setBounds(700,400,100,100);
        madMex.setBounds(100,400,100,100);
        den.setBounds(300,400,100,100);
        cafe.setBounds(900,600,100,100);
        
        add(pmans);
        add(phyrst);
        add(champs);
        add(madMex);
        add(den);
        add(cafe);
    }

   
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        
    }

    @Override
    public void keyTyped(KeyEvent ke) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyPressed(KeyEvent ke) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyReleased(KeyEvent ke) {
        
    }




}
