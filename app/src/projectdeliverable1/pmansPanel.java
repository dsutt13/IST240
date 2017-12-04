/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectdeliverable1;

import java.awt.Color;
import java.awt.MenuComponent;
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
class pmansPanel extends JPanel implements ActionListener {

    JButton welcome, wrong;
    JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12;

    Timer tim;
    JTextArea message = new JTextArea("Time: ");
    JTextArea question = new JTextArea("How many national championships has Penn State\n won?");
    JTextArea question2 = new JTextArea("What were Penn State's original colors?");
    JTextArea question3 = new JTextArea("What was Penn State's original mascot?");
    JTextArea score = new JTextArea("Score: ");
    
    int limit = 0;
    int delay = 0;
    int i = 21;
    int scoreIntPman = 0;
    initialPanel initial;
    gameMapPanel map;

    public pmansPanel(initialPanel a) {
        super();
        setLayout(null);
        setBackground(Color.orange);
        initial = a;
        
        b1 = new JButton("2");//correct
        b2 = new JButton("5");
        b3 = new JButton("1");
        b4 = new JButton("3");
        
        b5 = new JButton("Blue and Gold");
        b6 = new JButton("Pink and Black"); //correct
        b7 = new JButton("Red and Orange");
        b8 = new JButton("Green and White");

        b9 = new JButton("Eagle");
        b10 = new JButton("Bear");
        b11 = new JButton("Donkey"); //correct
        b12 = new JButton("Badger");

        welcome = new JButton("Welcome to Primanti Bro's!");
        welcome.setBounds(1000, 0, 200, 200);
        add(welcome);

        add(score);
        score.setBounds(0, 50, 100, 50);
        
        add(message);
        message.setBounds(0, 0, 100, 50);

        add(question);
        question.setBounds(250, 500, 300, 300);
        add(question2);
        question2.setBounds(700, 500, 300, 300);
        add(question3);
        question3.setBounds(1300, 500, 300, 300);

        add(b1);
        b1.setBounds(550, 500, 50, 50);
        add(b2);
        b2.setBounds(550, 575, 50, 50);
        add(b3);
        b3.setBounds(550, 650, 50, 50);
        add(b4);
        b4.setBounds(550, 725, 50, 50);
        add(b5);
        b5.setBounds(1050, 500, 150, 50);
        add(b6);
        b6.setBounds(1050, 575, 150, 50);
        add(b7);
        b7.setBounds(1050, 650, 150, 50);
        add(b8);
        b8.setBounds(1050, 725, 150, 50);
        add(b9);
        b9.setBounds(1625, 500, 150, 50);
        add(b10);
        b10.setBounds(1625, 575, 150, 50);
        add(b11);
        b11.setBounds(1625, 650, 150, 50);
        add(b12);
        b12.setBounds(1625, 725, 150, 50);
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b10.addActionListener(this);
        b11.addActionListener(this);
        b12.addActionListener(this);

        delay = 1000;
        tim = new Timer(delay, this);

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
        
        if (obj == b1) {
            scoreIntPman = scoreIntPman + 3;
            score.setText("Score: " + scoreIntPman);
            initial.map.totalScoreInt = initial.map.totalScoreInt + scoreIntPman;
            initial.map.totalScore.setText("Total Score: " + initial.map.totalScoreInt);
            remove(b1);
        }

        if (obj == b2) {
            scoreIntPman = scoreIntPman - 1;
            score.setText("Score: " + scoreIntPman);
            initial.map.totalScoreInt = initial.map.totalScoreInt + scoreIntPman;
            initial.map.totalScore.setText("Total Score: " + initial.map.totalScoreInt);
            remove(b2);
        }
        if (obj == b3) {
            scoreIntPman = scoreIntPman - 1;
            score.setText("Score: " + scoreIntPman);
            initial.map.totalScoreInt = initial.map.totalScoreInt + scoreIntPman;
            initial.map.totalScore.setText("Total Score: " + initial.map.totalScoreInt);
            remove(b3);
        }

        if (obj == b4) {
            scoreIntPman = scoreIntPman - 1;
            score.setText("Score: " + scoreIntPman);
            initial.map.totalScoreInt = initial.map.totalScoreInt + scoreIntPman;
            initial.map.totalScore.setText("Total Score: " + initial.map.totalScoreInt);
            remove(b4);
        }
        if (obj == b5) {
            scoreIntPman = scoreIntPman - 1;
            score.setText("Score: " + scoreIntPman);
            initial.map.totalScoreInt = initial.map.totalScoreInt + scoreIntPman;
            initial.map.totalScore.setText("Total Score: " + initial.map.totalScoreInt);
            remove(b5);
        }

        if (obj == b6) {
            scoreIntPman = scoreIntPman + 3;
            score.setText("Score: " + scoreIntPman);
            initial.map.totalScoreInt = initial.map.totalScoreInt + scoreIntPman;
            initial.map.totalScore.setText("Total Score: " + initial.map.totalScoreInt);
            remove(b6);
        }
        if (obj == b7) {
            scoreIntPman = scoreIntPman - 1;
            score.setText("Score: " + scoreIntPman);
            initial.map.totalScoreInt = initial.map.totalScoreInt + scoreIntPman;
            initial.map.totalScore.setText("Total Score: " + initial.map.totalScoreInt);
            remove(b7);

        }

        if (obj == b8) {
            scoreIntPman = scoreIntPman - 1;
            score.setText("Score: " + scoreIntPman);
            initial.map.totalScoreInt = initial.map.totalScoreInt + scoreIntPman;
            initial.map.totalScore.setText("Total Score: " + initial.map.totalScoreInt);
            remove(b8);
        }
        if (obj == b9) {
            scoreIntPman = scoreIntPman - 1;
            score.setText("Score: " + scoreIntPman);
            initial.map.totalScoreInt = initial.map.totalScoreInt + scoreIntPman;
            initial.map.totalScore.setText("Total Score: " + initial.map.totalScoreInt);
            remove(b9);
        }

        if (obj == b10) {
            scoreIntPman = scoreIntPman - 1;
            score.setText("Score: " + scoreIntPman);
            initial.map.totalScoreInt = initial.map.totalScoreInt + scoreIntPman;
            initial.map.totalScore.setText("Total Score: " + initial.map.totalScoreInt);
            remove(b10);

        }
        if (obj == b11) {
            scoreIntPman = scoreIntPman + 3;
            score.setText("Score: " + scoreIntPman);
            initial.map.totalScoreInt = initial.map.totalScoreInt + scoreIntPman;
            initial.map.totalScore.setText("Total Score: " + initial.map.totalScoreInt);
            remove(b11);
        }

        if (obj == b12) {
            scoreIntPman = scoreIntPman - 1;
            score.setText("Score: " + scoreIntPman);
            initial.map.totalScoreInt = initial.map.totalScoreInt + scoreIntPman;
            initial.map.totalScore.setText("Total Score: " + initial.map.totalScoreInt);
            remove(b12);
        }
        
        if (i == 0) {
            initial.remove(initial.pmansGame);
            initial.add(initial.map);
            initial.validate();
            initial.repaint();
            tim.stop();
        }

    }

}
