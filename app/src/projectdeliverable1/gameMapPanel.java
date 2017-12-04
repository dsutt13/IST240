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
import javax.swing.JTextArea;

/**
 *
 * @author dsutt13
 */
public class gameMapPanel extends JPanel implements ActionListener, KeyListener {

    JButton pmans, phyrst, champs, madMex, den, cafe, player, home;
    JTextArea totalScore;
    int x = 1100;
    int y = 850;
    int totalScoreInt;
    initialPanel initial;

    Rectangle r1;//pmans
    Rectangle r2;//phyrst
    Rectangle r3;//champs
    Rectangle r4;//Mad Mex
    Rectangle r5;//den
    Rectangle r6;//cafe
    Rectangle play;//player
    Rectangle homeRect;//home

    public void paintComponent(Graphics g) {

        super.paintComponent(g);
        requestFocusInWindow();
        Image img = Toolkit.getDefaultToolkit().getImage("images/map.png");
        g.drawImage(img, 0, 0, 2000, 1000, this);

    }

    public void intersect() {
        play = player.getBounds();//player
        if (play.intersects(r1)) {;
            initial.remove(initial.map);
            initial.add(initial.pmansGame);
            initial.validate();
            initial.repaint();
            initial.pmansGame.tim.start();
            r1.setBounds(2000, 2000, 100, 100);
        }
        if (play.intersects(r2)) {
            initial.remove(initial.map);
            initial.add(initial.phyrstGame);
            initial.validate();
            initial.repaint();
            initial.phyrstGame.tim.start();
            r2.setBounds(2000, 2000, 100, 100);
        }
        if (play.intersects(r3)) {
            initial.remove(initial.map);
            initial.add(initial.champsGame);
            initial.validate();
            initial.repaint();
            initial.champsGame.tim.start();
            r3.setBounds(2000, 2000, 100, 100);
        }
        if (play.intersects(r4)) {
            initial.remove(initial.map);
            initial.add(initial.mexGame);
            initial.validate();
            initial.repaint();
            initial.mexGame.tim.start();
            r4.setBounds(2000, 2000, 100, 100);
        }
        if (play.intersects(r5)) {
            initial.remove(initial.map);
            initial.add(initial.denGame);
            initial.validate();
            initial.repaint();
            initial.denGame.tim.start();
            r5.setBounds(2000, 2000, 100, 100);
        }
        if (play.intersects(r6)) {
            initial.remove(initial.map);
            initial.add(initial.cafeGame);
            initial.validate();
            initial.repaint();
            initial.cafeGame.tim.start();
            r6.setBounds(2000, 2000, 100, 100);
        }
        if (play.intersects(homeRect)) {
            initial.remove(initial.map);
            initial.add(initial.fp);
            initial.validate();
            initial.repaint();
        }
    }

    public gameMapPanel(initialPanel a) {
        super();
        setLayout(null);
        initial = a;

        pmans = new JButton("PMans");
        phyrst = new JButton("Phyrst");
        champs = new JButton("Champs");
        madMex = new JButton("Mad Mex");
        den = new JButton("Lion's Den");
        cafe = new JButton("Cafe 210 West");
        player = new JButton();
        home = new JButton("Home!");
        
        totalScore = new JTextArea("Total Score: " + totalScoreInt);
        totalScore.setBounds(0,900,110,50);
        add(totalScore);
        
        r1 = new Rectangle(1450, 450, 100, 100);//pmans
        r2 = new Rectangle(700, 500, 100, 100);//phyrst
        r3 = new Rectangle(700, 400, 100, 100);//champs
        r4 = new Rectangle(800, 850, 100, 100);//madMex
        r5 = new Rectangle(1650, 200, 100, 100);//den
        r6 = new Rectangle(150, 150, 100, 100);//cafe
        homeRect = new Rectangle(75,650,100,100);//home

        pmans.addActionListener(this);
        phyrst.addActionListener(this);
        champs.addActionListener(this);
        madMex.addActionListener(this);
        den.addActionListener(this);
        cafe.addActionListener(this);
        player.addActionListener(this);
        home.addActionListener(this);

        pmans.setBounds(1450, 450, 100, 100);
        phyrst.setBounds(700, 500, 100, 100);
        champs.setBounds(700, 400, 100, 100);
        madMex.setBounds(800, 850, 100, 100);
        den.setBounds(1650, 200, 100, 100);
        cafe.setBounds(150, 150, 100, 100);
        player.setBounds(x, y, 75, 75);
        home.setBounds(75,650,100,100);

        add(pmans);
        add(phyrst);
        add(champs);
        add(madMex);
        add(den);
        add(cafe);
        add(player);
        add(home);

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
        // System.out.println("Key pressed");
        int kk = evt.getKeyCode();
        if (kk == evt.VK_LEFT) {
            x = x - 10;
        }
        if (kk == evt.VK_RIGHT) {
            x = x + 10;
        }
        if (kk == evt.VK_UP) {
            y = y - 10;
        }
        if (kk == evt.VK_DOWN) {
            y = y + 10;
        }
        player.setBounds(new Rectangle(x, y, 75, 75));
        intersect();
    }

    @Override
    public void keyReleased(KeyEvent ke) {

    }

}
