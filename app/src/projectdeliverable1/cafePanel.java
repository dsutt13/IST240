/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectdeliverable1;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.Timer;

/**
 *
 * @author dsutt13
 */
public class cafePanel extends JPanel implements ActionListener {

    JButton welcome, cup;

    Timer tim;
    JTextArea message = new JTextArea("Time: ");
    JTextArea score = new JTextArea("Score: ");
    int limit = 0;
    int delay = 0;
    int i = 21;
    int n = 0;
    int scoreIntCafe;
    ImageIcon img;
    initialPanel initial;
    gameMapPanel map;

    public cafePanel(initialPanel a) {
        super();
        setLayout(null);
        setBackground(Color.orange);
        initial = a;

        welcome = new JButton("Welcome to Cafe!");
        welcome.setBounds(1000, 0, 200, 200);
        add(welcome);

        add(message);
        message.setBounds(0, 0, 100, 50);

        add(score);
        score.setBounds(0, 50, 100, 50);

        cup = new JButton();
        add(cup);
        cup.addActionListener(this);
        cup.setBounds(n, scoreIntCafe, 100, 100);

        delay = 1000;
        tim = new Timer(delay, this);
        
        ImageIcon img = new ImageIcon("images/" + "cup" + ".jpg");
        ImageIcon img2 = new ImageIcon(((img).getImage()).getScaledInstance(100, 100, java.awt.Image.SCALE_SMOOTH));
        cup.setText("");
        cup.setIcon(img2);

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
            initial.remove(initial.cafeGame);
            initial.add(initial.map);
            initial.validate();
            initial.repaint();
            initial.map.totalScore.setText("Score: " + initial.map.totalScoreInt);
            tim.stop();
        }

        if (obj == tim) {

            int n = (int) (Math.random() * 1800) + 1;
            int x = (int) (Math.random() * 800) + 1;

            cup.setBounds(n, x, 100, 100);
        }

        if (obj == cup) {
            scoreIntCafe = scoreIntCafe + 1;
            initial.map.totalScoreInt++;
            score.setText("Score: " + initial.map.totalScoreInt);
        }
    }

}
