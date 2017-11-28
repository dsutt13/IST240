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

    JButton welcome;
    JButton b1, b2, b3, b4;

    Timer tim;
    JTextArea message = new JTextArea("Time: ");
    JTextArea question = new JTextArea("How many championships have Penn State won?");
    JTextArea wrongAnswer = new JTextArea("Wrong Answer!");
    int limit = 0;
    int delay = 0;
    int i = 6;
    int score = 0;
    initialPanel initial;
    gameMapPanel map;

    public pmansPanel(initialPanel a) {
        super();
        setLayout(null);
        setBackground(Color.orange);
        initial = a;
        
        b1 = new JButton("2");
        b2 = new JButton("5");
        b3 = new JButton("1");
        b4 = new JButton("3");

        welcome = new JButton("Welcome to Primanti Bro's!");
        welcome.setBounds(1000, 0, 200, 200);
        add(welcome);

        add(message);
        message.setBounds(0, 0, 100, 50);

        add(question);
        question.setBounds(250, 500, 300, 300);

        add(b1);
        b1.setBounds(400, 400, 50, 50);
        add(b2);
        b2.setBounds(360, 360, 50, 50);
        add(b3);
        b3.setBounds(320, 320, 50, 50);
        add(b4);
        b4.setBounds(280, 280, 50, 50);

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
        /*if (obj == b1) {
            System.out.print(score + 5);
        } else {
            add(wrongAnswer);
            wrongAnswer.setBounds(800, 800, 100, 100);
            System.out.print(wrongAnswer);
        }*/

        if (i == 0) {
            initial.remove(initial.pmansGame);
            initial.add(initial.map);
            initial.validate();
            initial.repaint();
            tim.stop();
        }

    }

}
