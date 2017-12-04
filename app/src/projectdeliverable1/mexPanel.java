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
public class mexPanel extends JPanel implements ActionListener, KeyListener {

    JButton welcome, player, n1, n2, n3, n4, n5, n6, n7;

    Timer tim;
    JTextArea message = new JTextArea("Time: ");
    JTextArea score = new JTextArea("Score: ");
    int limit = 0;
    int delay = 0;
    int i = 21;
    int scoreIntMex = 0;
    initialPanel initial;
    gameMapPanel map;

    Rectangle r1, r2, r3, r4, r5, r6, r7, play;

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

    public mexPanel(initialPanel a) {
        super();
        setLayout(null);
        setBackground(Color.cyan);
        initial = a;

        welcome = new JButton("Welcome to Mad Mex");
        welcome.setBounds(1000, 0, 200, 200);
        add(welcome);

        player = new JButton();
        player.setBounds(r, t, 75, 75);
        add(player);

        add(score);
        score.setBounds(0, 50, 100, 50);

        n1 = new JButton("+1");
        n1.setBounds(400, 400, 75, 75);
        add(n1);

        n2 = new JButton("+2");
        n2.setBounds(900, 150, 75, 75);
        add(n2);

        n3 = new JButton("+1");
        n3.setBounds(300, 800, 75, 75);
        add(n3);

        n4 = new JButton("+1");
        n4.setBounds(300, 100, 75, 75);
        add(n4);

        n5 = new JButton("+2");
        n5.setBounds(800, 750, 75, 75);
        add(n5);

        n6 = new JButton("+1");
        n6.setBounds(1300, 700, 75, 75);
        add(n6);

        n7 = new JButton("+3");
        n7.setBounds(1700, 400, 75, 75);
        add(n7);

        n1.addActionListener(this);
        n2.addActionListener(this);
        n3.addActionListener(this);
        n4.addActionListener(this);
        n5.addActionListener(this);
        n6.addActionListener(this);
        n7.addActionListener(this);

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
        r5 = new Rectangle(1500, 750, 75, 75);
        r6 = new Rectangle(1300, 700, 75, 75);
        r7 = new Rectangle(1700, 400, 75, 75);

    }

    public void intersect() {

        play = player.getBounds();

        if (play.intersects(r1)) {
            scoreIntMex = scoreIntMex + 1;
            score.setText("Score: " + scoreIntMex);
            r1.setBounds(2000, 2000, 100, 100);
            initial.map.totalScoreInt = initial.map.totalScoreInt + scoreIntMex;
            initial.map.totalScore.setText("Total Score: " + initial.map.totalScoreInt);
        }
        if (play.intersects(r2)) {
            scoreIntMex = scoreIntMex + 2;
            score.setText("Score: " + scoreIntMex);
            r2.setBounds(2000, 2000, 100, 100);
            initial.map.totalScoreInt = initial.map.totalScoreInt + scoreIntMex;
            initial.map.totalScore.setText("Total Score: " + initial.map.totalScoreInt);
        }
        if (play.intersects(r3)) {
            scoreIntMex = scoreIntMex + 1;
            score.setText("Score: " + scoreIntMex);
            r3.setBounds(2000, 2000, 100, 100);
            initial.map.totalScoreInt = initial.map.totalScoreInt + scoreIntMex;
            initial.map.totalScore.setText("Total Score: " + initial.map.totalScoreInt);
        }
        if (play.intersects(r4)) {
            scoreIntMex = scoreIntMex + 1;
            score.setText("Score: " + scoreIntMex);
            r4.setBounds(2000, 2000, 100, 100);
            initial.map.totalScoreInt = initial.map.totalScoreInt + scoreIntMex;
            initial.map.totalScore.setText("Total Score: " + initial.map.totalScoreInt);
        }
        if (play.intersects(r5)) {
            scoreIntMex = scoreIntMex + 2;
            score.setText("Score: " + scoreIntMex);
            r5.setBounds(2000, 2000, 100, 100);
            initial.map.totalScoreInt = initial.map.totalScoreInt + scoreIntMex;
            initial.map.totalScore.setText("Total Score: " + initial.map.totalScoreInt);
        }
        if (play.intersects(r6)) {
            scoreIntMex = scoreIntMex + 1;
            score.setText("Score: " + scoreIntMex);
            r6.setBounds(2000, 2000, 100, 100);
            initial.map.totalScoreInt = initial.map.totalScoreInt + scoreIntMex;
            initial.map.totalScore.setText("Total Score: " + initial.map.totalScoreInt);
        }
        if (play.intersects(r7)) {
            scoreIntMex = scoreIntMex + 3;
            score.setText("Score: " + scoreIntMex);
            r7.setBounds(2000, 2000, 100, 100);
            initial.map.totalScoreInt = initial.map.totalScoreInt + scoreIntMex;
            initial.map.totalScore.setText("Total Score: " + initial.map.totalScoreInt);

        }
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        Object obj = ae.getSource();
        if (obj == tim) {
            if (initial.diff == 1) {//easy
                delay = 1000;
                tim.setDelay(delay);
                i = i - 1;
                message.setText("Time: " + i);
            }
            if (initial.diff == 2) {//medium
                delay = 800;
                tim.setDelay(delay);
                i = i - 1;
                message.setText("Time: " + i);
            }
            if (initial.diff == 3) {//hard
                delay = 600;
                tim.setDelay(delay);
                i = i - 1;
                message.setText("Time: " + i);
            }
        }
        if (i == 0) {
            initial.remove(initial.mexGame);
            initial.add(initial.map);
            initial.validate();
            initial.repaint();
            i = 6;
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
            r = r - 15;
        }
        if (kk == evt.VK_RIGHT) {
            r = r + 15;
        }
        if (kk == evt.VK_UP) {
            t = t - 15;
        }
        if (kk == evt.VK_DOWN) {
            t = t + 15;
        }
        player.setBounds(new Rectangle(r, t, 75, 75));
        intersect();
    }

    @Override
    public void keyReleased(KeyEvent evt) {
        
    }

}
