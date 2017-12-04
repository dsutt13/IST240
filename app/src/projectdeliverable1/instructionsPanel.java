/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectdeliverable1;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 *
 * @author sjo5124
 */
public class instructionsPanel extends JPanel implements ActionListener {
    
    
//    XMLEncoder xe;
//    XMLDecoder de;
//    String instructions = "These are the instructions";
//    JButton click, restore, news;
//    
    
    
    JTextArea message = new JTextArea("The instructions are as follows: \nWander around to your favorite State College bars "
            + "and play fun games to try to earn as many points as possible!!  Then go home to Beaver Plaza!");
    JButton menu;
    
    public instructionsPanel(){
	 
            super();
            setLayout(null);
            setBackground(Color.green);
            
            message.setBounds(500,300, 1000, 300);
            add(message);
            
            menu = new JButton("Menu");
            menu.setBounds(0,0,100,100);
            add(menu);
            
            
            
//            click = new JButton("Click here for your directions");
//            news.setBounds(700,300, 300, 300);
//            add(click);
//            click.addActionListener(this);
//            
//            news = new JButton("click here to save progress");
//            news.setBounds(400,300, 300, 300);
//            add(news);
//            
            }

    @Override
    public void actionPerformed(ActionEvent ae) {
//        Object obj = ae.getSource();
//
//        if (obj == click)
//        {
//            try
//            {
//                xe = new XMLEncoder(new BufferedOutputStream(new FileOutputStream("info.xml")));
//            } catch (Exception xx)
//            {
//                xx.printStackTrace();
//            }
//
//            try
//            {
//                xe.writeObject(instructions);
//                
//            } catch (Exception xx)
//            {
//                xx.printStackTrace();
//            }
//
//            try
//            {
//                xe.close();
//            } catch (Exception xx)
//            {
//                xx.printStackTrace();
//            }
//            news.setText("Info Saved OK - check the XML file to see the results");
//        }
//    }
}
}