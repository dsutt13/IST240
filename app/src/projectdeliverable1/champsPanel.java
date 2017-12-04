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
public class champsPanel extends JPanel implements ActionListener {

    JButton welcome, point, point2, minus;
    
    Timer tim;
    JTextArea message = new JTextArea("Time: ");
    JTextArea score = new JTextArea ("Score: ");
    int limit = 0;
    int delay = 0;
    int i = 21;
    int x = 0;
    int n = 0;
    initialPanel initial;
    gameMapPanel map;
    int scoreIntChamps = 0;
    ImageIcon minusPic;
    ImageIcon pointPic;
    ImageIcon point2Pic;
    ImageIcon pointPicture;
    
    public champsPanel(initialPanel a) {
        super();
        setLayout(null);
        setBackground(Color.orange);
        initial = a;
        
        welcome = new JButton("Welcome to Champs!");
        welcome.setBounds(1000,0,200,200);
        add(welcome);
        
        point = new JButton("+1");
        point.setBounds(600,0,150,150);
        add(point);
        point.addActionListener(this);
        
        point2 = new JButton("+3");
        point2.setBounds(400,0, 100, 100);
        add(point2);
        point2.addActionListener(this);
        
        minus = new JButton("-1");
        minus.setBounds(900, 400, 150, 150);
        add(minus);
        minus.addActionListener(this);
        
        add(score);
        score.setBounds(0, 50, 100, 50);
        
        add(message);
        message.setBounds(0, 0, 100, 50);

        delay = 1000;
        tim = new Timer(delay, this);
        
        ImageIcon pointPic = new ImageIcon("images/" + "point" + ".jpg");
        ImageIcon pointPicture = new ImageIcon(((pointPic).getImage()).getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH));
        point.setText("");
        point.setIcon(pointPicture);
        
        ImageIcon point2Pic = new ImageIcon("images/" + "shot" + ".png");
        ImageIcon point2Pic2 = new ImageIcon(((point2Pic).getImage()).getScaledInstance(100, 100, java.awt.Image.SCALE_SMOOTH));
        point2.setText("");
        point2.setIcon(point2Pic2);
        
        ImageIcon minusPic = new ImageIcon("images/" + "water" + ".jpg");
        ImageIcon minusPic2 = new ImageIcon(((minusPic).getImage()).getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH));
        minus.setText("");
        minus.setIcon(minusPic2);
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
            initial.remove(initial.champsGame);
            initial.add(initial.map);
            initial.validate();
            initial.repaint();
            tim.stop();
        }
        
        if(obj == tim){
               
            int n = (int) (Math.random() * 1800) + 1;
            int x = (int)(Math.random() * 800) + 1;
            
            point.setBounds(n,x, 150, 150);
        }
        
         if(obj == tim){
               
            int n = (int) (Math.random() * 1800) + 1;
            int x = (int)(Math.random() * 800) + 1;
            
            point2.setBounds(n,x, 100, 100);
        }
          if(obj == tim){
               
            int n = (int) (Math.random() * 1800) + 1;
            int x = (int)(Math.random() * 800) + 1;
            
            minus.setBounds(n,x, 150, 150);
        }
        
        if(obj ==  point){
            scoreIntChamps = scoreIntChamps + 1;
            score.setText("Score: " + scoreIntChamps);           
            initial.map.totalScoreInt = initial.map.totalScoreInt + scoreIntChamps;
            initial.map.totalScore.setText("Total Score: " + initial.map.totalScoreInt);
            
        }
         if(obj ==  point2){
            scoreIntChamps = scoreIntChamps + 3;
            score.setText("Score: " + scoreIntChamps);
            
            initial.map.totalScoreInt = initial.map.totalScoreInt + scoreIntChamps;
            initial.map.totalScore.setText("Total Score: " + initial.map.totalScoreInt);
            
        }
        
          if(obj ==  minus){
            scoreIntChamps = scoreIntChamps - 1;
            score.setText("Score: " + scoreIntChamps); 
            initial.map.totalScoreInt = initial.map.totalScoreInt + scoreIntChamps;
            initial.map.totalScore.setText("Total Score: " + initial.map.totalScoreInt);
        }
    
    }
    
}
