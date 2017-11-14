/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectdeliverable1;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
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
        int x = 1100;
        int y = 850;
     public void paintComponent(Graphics g) {
        
        super.paintComponent(g);
        requestFocusInWindow();
        Image img = Toolkit.getDefaultToolkit().getImage("images/map.png");
        g.drawImage(img,0,0,2000,1000,this);   
     
    }
    
    public gameMapPanel() {
        super();
        setLayout(null);
        
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
        
        pmans.setBounds(1450,450,100,100);
        phyrst.setBounds(700,500,100,100);
        champs.setBounds(700,400,100,100);
        madMex.setBounds(800,850,100,100);
        den.setBounds(1650,200,100,100);
        cafe.setBounds(150,150,100,100);
        player.setBounds(x,y,75,75);
        
        add(pmans);
        add(phyrst);
        add(champs);
        add(madMex);
        add(den);
        add(cafe);
        add(player);
        
        setFocusable(true);
        addKeyListener(this);
    }

   
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        
    }

    @Override
    public void keyTyped(KeyEvent ke) {
        
    }

    @Override
    public void keyPressed(KeyEvent evt) {
        System.out.println("Key pressed");
        int kk = evt.getKeyCode();
        if (kk == evt.VK_LEFT)
        {
            x = x - 10;
        }
        if (kk == evt.VK_RIGHT)
        {
            x = x + 10;
        }
        if (kk == evt.VK_UP)
        {
            y = y - 10;
        }
        if (kk == evt.VK_DOWN)
        {
            y = y + 10;
        }
        player.setBounds(new Rectangle(x, y, 75, 75));
    }

    @Override
    public void keyReleased(KeyEvent ke) {
        
    }




}
