/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectdeliverable1;
 
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author sjo5124 
 */
public class initialPanel extends JPanel implements ActionListener {

    
    myJPanelstd mjp;
    instructionsPanel ip;
    selectcharacterPanel scp;
    gameMapPanel map;
    gameDesigners ds;
    difficultyPanel dp;
    finalPanel fp;
    
    JButton player;
    
    pmansPanel pmansGame;
    phyrstPanel phyrstGame;
    cafePanel cafeGame;
    mexPanel mexGame;
    champsPanel champsGame;
    denPanel denGame;
        
    int diff = 0;
    
    ImageIcon originalSize = new ImageIcon("images/map.jpg");
    ImageIcon newSize = new ImageIcon(((originalSize).getImage()).getScaledInstance(2000, 1000, java.awt.Image.SCALE_SMOOTH));
    ImageIcon harry = new ImageIcon("images/harry.jpg");
    ImageIcon harry1 = new ImageIcon(((harry).getImage()).getScaledInstance(75, 75, java.awt.Image.SCALE_SMOOTH));
    ImageIcon kingSnow = new ImageIcon("images/jon.jpg");
    ImageIcon kingSnow1 = new ImageIcon(((kingSnow).getImage()).getScaledInstance(75, 75, java.awt.Image.SCALE_SMOOTH));
    ImageIcon myers = new ImageIcon("images/myers.jpg");
    ImageIcon myers1 = new ImageIcon(((myers).getImage()).getScaledInstance(75, 75, java.awt.Image.SCALE_SMOOTH));
    


    public initialPanel() {
        //super();
        mjp = new myJPanelstd();
        ip = new instructionsPanel();
        scp = new selectcharacterPanel();
        map = new gameMapPanel(this);
        ds = new gameDesigners();
        dp = new difficultyPanel();
        fp = new finalPanel(this);
        
        pmansGame = new pmansPanel(this);
        phyrstGame = new phyrstPanel(this);
        cafeGame = new cafePanel(this);
        mexGame = new mexPanel(this);
        champsGame = new champsPanel(this);
        denGame = new denPanel(this);

        setLayout(new GridLayout(1, 1));
        add(mjp);

        mjp.instructions.addActionListener(this);
        ip.menu.addActionListener(this);
        mjp.start.addActionListener(this);
        scp.menu.addActionListener(this);
        mjp.designers.addActionListener(this);
        ds.menu.addActionListener(this);
        scp.character1.addActionListener(this);
        scp.character2.addActionListener(this);
        scp.character3.addActionListener(this);
        dp.easy.addActionListener(this);
        dp.medium.addActionListener(this);
        dp.hard.addActionListener(this);

        /*pmansGame.b1.addActionListener(this);
        pmansGame.b2.addActionListener(this);
        pmansGame.b3.addActionListener(this);
        pmansGame.b4.addActionListener(this);
        */
        //map.totalScoreInt = (map.totalScoreInt + cafeGame.scoreIntCafe);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        Object obj = ae.getSource();
        //click instructions
        if (obj == mjp.instructions) {
            remove(mjp);
            add(ip);
            validate();
            repaint();

        }
        if (obj == ip.menu) {
            remove(ip);
            add(mjp);
            validate();
            repaint();
        }
     //click start
        if (obj == mjp.start) {
            remove(mjp);
            add(scp);
            validate();
            repaint();
        }
        if (obj == scp.menu) {
            remove(scp);
            add(mjp);
            validate();
            repaint();
        }
        //click designers
        if(obj == mjp.designers) {
            remove(mjp);
            add(ds);
            validate();
            repaint();
        }
        if(obj == ds.menu) {
            remove(ds);
            add(mjp);
            validate();
            repaint();
        }

        //click a character
        if(obj == scp.character1) {
            remove(scp);
            add(dp);
            validate();
            repaint();
            map.player.setIcon(harry1);
            denGame.player.setIcon(harry1);
            mexGame.player.setIcon(harry1);
        }
        if(obj == scp.character2) {
            remove(scp);
            add(dp);
            validate();
            repaint();
            map.player.setIcon(kingSnow1);
            denGame.player.setIcon(kingSnow1);
            mexGame.player.setIcon(kingSnow1);
        }
        if(obj == scp.character3) { 
            remove(scp);
            add(dp);
            validate();
            repaint();
            map.player.setIcon(myers1);
            denGame.player.setIcon(myers1);
            mexGame.player.setIcon(myers1);
        }
        
        //selecting difficulty
        if(obj == dp.easy) {
            diff = 1;
            remove(dp);
            add(map);
            validate();
            repaint();
        }
        if(obj == dp.medium) {
            diff = 2;
            remove(dp);
            add(map);
            validate();
            repaint();
        }
        if(obj == dp.hard) { 
            diff = 3;
            remove(dp);
            add(map);
            validate();
            repaint();
        }
        
        //pmans
        

    }


}
