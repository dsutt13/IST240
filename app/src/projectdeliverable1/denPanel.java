/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectdeliverable1;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.Timer;

/**
 *
 * @author dsutt13
 */
public class denPanel extends JPanel implements ActionListener, KeyListener {

    JButton welcome, player, n1, n2, n3, n4, n5, n6, n7, n8, n9, n10, n11, n12, n13, n14;
    Timer tim;
    JTextArea message = new JTextArea("Time: ");
    JTextArea score = new JTextArea("Score: ");
    int limit = 0;
    int delay = 0;
    int i = 21;
    initialPanel initial;
    int scoreIntDen = 0;
    gameMapPanel map;
    
    Rectangle r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, play;

    int x = 0;
    int y = 0;

    int r = 1100;
    int t = 850;
    
    public void paintComponent(Graphics g) {

        super.paintComponent(g);
        requestFocusInWindow();
        // Image img = Toolkit.getDefaultToolkit().getImage("");
        //g.drawImage(img, 0, 0, 2000, 1000, this);

    }
    
    public denPanel(initialPanel a) {
        super();
        setLayout(null);
        setBackground(Color.orange);
        initial = a;
        
        welcome = new JButton("Welcome to the Lion's Den!");
        welcome.setBounds(1000,0,200,200);
        add(welcome);
        
        
        player = new JButton();
        player.setBounds(r, t, 75, 75);
        add(player);

        add(score);
        score.setBounds(0, 50, 100, 50);

        n1 = new JButton("+1");
        n1.setBounds(400, 400, 75, 75);
        add(n1);

        n2 = new JButton("+1");
        n2.setBounds(900, 150, 75, 75);
        add(n2);

        n3 = new JButton("+3");
        n3.setBounds(400, 1000, 50, 50);
        add(n3);

        n4 = new JButton("-1");
        n4.setBounds(300, 100, 100, 100);
        add(n4);

        n5 = new JButton("+5");
        n5.setBounds(100, 750, 50, 50);
        add(n5);

        n6 = new JButton("-1");
        n6.setBounds(300, 700, 75, 75);
        add(n6);

        n7 = new JButton("+1");
        n7.setBounds(1500, 1100, 75, 75);
        add(n7);

        n8 = new JButton("+1");
        n8.setBounds(1300, 1900, 75, 75);
        add(n8);

        n9 = new JButton("+1");
        n9.setBounds(1000, 500, 75, 75);
        add(n9);

        n10 = new JButton("+3");
        n10.setBounds(1750, 600, 50, 50);
        add(n10);

        n11 = new JButton("-1");
        n11.setBounds(1600, 1100, 100, 100);
        add(n11);

        n12 = new JButton("+5");
        n12.setBounds(1400, 1500, 50, 50);
        add(n12);

        n13 = new JButton("-1");
        n13.setBounds(1400, 700, 75, 75);
        add(n13);

        n14 = new JButton("+1");
        n14.setBounds(1500, 900, 75, 75);
        add(n14);

        n1.addActionListener(this);
        n2.addActionListener(this);
        n3.addActionListener(this);
        n4.addActionListener(this);
        n5.addActionListener(this);
        n6.addActionListener(this);
        n7.addActionListener(this);
        n8.addActionListener(this);
        n9.addActionListener(this);
        n10.addActionListener(this);
        n11.addActionListener(this);
        n12.addActionListener(this);
        n13.addActionListener(this);
        n14.addActionListener(this);
        player.addActionListener(this);
        
        add(message);
        message.setBounds(0, 0, 100, 50);

        delay = 1000;
        tim = new Timer(delay, this);
        
        setFocusable(true);
        addKeyListener(this);

        r1 = new Rectangle(400, 400, 75, 75);
        r2 = new Rectangle(900, 150, 75, 75);
        r3 = new Rectangle(400, 1000, 75, 75);
        r4 = new Rectangle(300, 100, 75, 75);
        r5 = new Rectangle(100, 750, 75, 75);
        r6 = new Rectangle(300, 700, 75, 75);
        r7 = new Rectangle(700, 400, 75, 75);

        r8 = new Rectangle(1300, 1900, 75, 75);
        r9 = new Rectangle(1000, 500, 75, 75);
        r10 = new Rectangle(1750, 600, 75, 75);
        r11 = new Rectangle(1600, 1100, 75, 75);
        r12 = new Rectangle(1400, 1500, 75, 75);
        r13 = new Rectangle(1400, 700, 75, 75);
        r14 = new Rectangle(1500, 900, 75, 75);
    }
    
    public void intersect() {

        play = player.getBounds();

        if (play.intersects(r1)) {
            scoreIntDen = scoreIntDen + 1;
            score.setText("Score: " + scoreIntDen);
            r1.setBounds(2000, 2000, 100, 100);
            initial.map.totalScoreInt = initial.map.totalScoreInt + scoreIntDen;
            initial.map.totalScore.setText("Total Score: " + initial.map.totalScoreInt);

        }
        if (play.intersects(r2)) {
            scoreIntDen = scoreIntDen + 1;
            score.setText("Score: " + scoreIntDen);
            r2.setBounds(2000, 2000, 100, 100);
            initial.map.totalScoreInt = initial.map.totalScoreInt + scoreIntDen;
            initial.map.totalScore.setText("Total Score: " + initial.map.totalScoreInt);
        }
        if (play.intersects(r3)) {
            scoreIntDen = scoreIntDen + 3;
            score.setText("Score: " + scoreIntDen);
            r3.setBounds(2000, 2000, 100, 100);
            initial.map.totalScoreInt = initial.map.totalScoreInt + scoreIntDen;
            initial.map.totalScore.setText("Total Score: " + initial.map.totalScoreInt);
        }
        if (play.intersects(r4)) {
            scoreIntDen = scoreIntDen - 1;
            score.setText("Score: " + scoreIntDen);
            r4.setBounds(2000, 2000, 100, 100);
            initial.map.totalScoreInt = initial.map.totalScoreInt + scoreIntDen;
            initial.map.totalScore.setText("Total Score: " + initial.map.totalScoreInt);
        }
        if (play.intersects(r5)) {
            scoreIntDen = scoreIntDen - 5;
            score.setText("Score: " + scoreIntDen);
            r5.setBounds(2000, 2000, 100, 100);
            initial.map.totalScoreInt = initial.map.totalScoreInt + scoreIntDen;
            initial.map.totalScore.setText("Total Score: " + initial.map.totalScoreInt);
        }
        if (play.intersects(r6)) {
            scoreIntDen = scoreIntDen - 1;
            score.setText("Score: " + scoreIntDen);
            r6.setBounds(2000, 2000, 100, 100);
            initial.map.totalScoreInt = initial.map.totalScoreInt + scoreIntDen;
            initial.map.totalScore.setText("Total Score: " + initial.map.totalScoreInt);
        }
        if (play.intersects(r7)) {
            scoreIntDen = scoreIntDen + 1;
            score.setText("Score: " + scoreIntDen);
            r7.setBounds(2000, 2000, 100, 100);
            initial.map.totalScoreInt = initial.map.totalScoreInt + scoreIntDen;
            initial.map.totalScore.setText("Total Score: " + initial.map.totalScoreInt);
        }

        if (play.intersects(r8)) {
            scoreIntDen = scoreIntDen + 1;
            score.setText("Score: " + scoreIntDen);
            r8.setBounds(2000, 2000, 100, 100);
            initial.map.totalScoreInt = initial.map.totalScoreInt + scoreIntDen;
            initial.map.totalScore.setText("Total Score: " + initial.map.totalScoreInt);
        }
        if (play.intersects(r9)) {
            scoreIntDen = scoreIntDen + 1;
            score.setText("Score: " + scoreIntDen);
            r9.setBounds(2000, 2000, 100, 100);
            initial.map.totalScoreInt = initial.map.totalScoreInt + scoreIntDen;
            initial.map.totalScore.setText("Total Score: " + initial.map.totalScoreInt);
        }
        if (play.intersects(r10)) {
            scoreIntDen = scoreIntDen + 3;
            score.setText("Score: " + scoreIntDen);
            r3.setBounds(2000, 2000, 100, 100);
            initial.map.totalScoreInt = initial.map.totalScoreInt + scoreIntDen;
            initial.map.totalScore.setText("Total Score: " + initial.map.totalScoreInt);
        }
        if (play.intersects(r11)) {
            scoreIntDen = scoreIntDen - 1;
            score.setText("Score: " + scoreIntDen);
            r11.setBounds(2000, 2000, 100, 100);
            initial.map.totalScoreInt = initial.map.totalScoreInt + scoreIntDen;
            initial.map.totalScore.setText("Total Score: " + initial.map.totalScoreInt);
        }
        if (play.intersects(r12)) {
            scoreIntDen = scoreIntDen - 5;
            score.setText("Score: " + scoreIntDen);
            r12.setBounds(2000, 2000, 100, 100);
            initial.map.totalScoreInt = initial.map.totalScoreInt + scoreIntDen;
            initial.map.totalScore.setText("Total Score: " + initial.map.totalScoreInt);
        }
        if (play.intersects(r13)) {
            scoreIntDen = scoreIntDen - 1;
            score.setText("Score: " + scoreIntDen);
            r13.setBounds(2000, 2000, 100, 100);
            initial.map.totalScoreInt = initial.map.totalScoreInt + scoreIntDen;
            initial.map.totalScore.setText("Total Score: " + initial.map.totalScoreInt);
        }
        if (play.intersects(r14)) {
            scoreIntDen = scoreIntDen + 1;
            score.setText("Score: " + scoreIntDen);
            r14.setBounds(2000, 2000, 100, 100);
            initial.map.totalScoreInt = initial.map.totalScoreInt + scoreIntDen;
            initial.map.totalScore.setText("Total Score: " + initial.map.totalScoreInt);
        }
    }


    @Override
    public void actionPerformed(ActionEvent ae) {
        Object obj = ae.getSource();
        if (obj == tim) {
            if (initial.diff  == 1) {//easy
                delay = 1000;
                tim.setDelay(delay);
                i = i - 1;
                message.setText("Time: " + i);
            }
            if (initial.diff  == 2) {//medium
                delay = 800;
                tim.setDelay(delay);
                i = i - 1;
                message.setText("Time: " + i);
            }
            if (initial.diff  == 3) {//hard
                delay = 600;
                tim.setDelay(delay);
                i = i - 1;
                message.setText("Time: " + i);
            }
        }

        if (i == 0) {
            initial.remove(initial.denGame);
            initial.add(initial.map);
            initial.validate();
            initial.repaint();
            tim.stop();
        }
    }

    @Override
    public void keyTyped(KeyEvent evt) {
        
    }

    @Override
    public void keyPressed(KeyEvent evt) {
        int kk = evt.getKeyCode();
        if (kk == evt.VK_LEFT) {
            r = r - 12;
        }
        if (kk == evt.VK_RIGHT) {
            r = r + 12;
        }
        if (kk == evt.VK_UP) {
            t = t - 12;
        }
        if (kk == evt.VK_DOWN) {
            t = t + 12;
        }
        player.setBounds(new Rectangle(r, t, 75, 75));
        intersect();
    }

    @Override
    public void keyReleased(KeyEvent evt) {
        
    }
    
}
