/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectdeliverable1;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
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
    
    ImageIcon originalSize = new ImageIcon("images/map.jpg");
    ImageIcon newSize = new ImageIcon(((originalSize).getImage()).getScaledInstance(2000, 1000, java.awt.Image.SCALE_SMOOTH));
    
    

    public initialPanel() {
        //super();
        mjp = new myJPanelstd();
        ip = new instructionsPanel();
        scp = new selectcharacterPanel();
        map = new gameMapPanel();
        ds = new gameDesigners();

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
            add(map);
            validate();
            repaint();
        }
        if(obj == scp.character2) {
            remove(scp);
            add(map);
            validate();
            repaint();
        }
        if(obj == scp.character3) {
            remove(scp);
            add(map);
            validate();
            repaint();
        }
    }


}
