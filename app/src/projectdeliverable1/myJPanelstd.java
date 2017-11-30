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
 * @author sjo5124
 */
public class myJPanelstd extends JPanel {

    //  instructionsPanel ip = new instructionsPanel();
    JTextArea message = new JTextArea("Time: ");
    JButton start, banner, instructions, logo, designers;
    Timer tim;
    int limit = 0;
    int delay = 0;
    int i = 0;
    int x = 0;
    ImageIcon img;

    public myJPanelstd() {

        super();
        setLayout(null);
        setBackground(Color.blue);

        logo = new JButton();
        add(logo);
        logo.setBounds(500, 100, 1000, 500);
        ImageIcon originalSize = new ImageIcon("images/barCrawl.jpg");
        ImageIcon newSize = new ImageIcon(((originalSize).getImage()).getScaledInstance(1000, 500, java.awt.Image.SCALE_SMOOTH));
        logo.setIcon(newSize);

        start = new JButton("Start");
        add(start);
        start.setBounds(750, 800, 150, 50);

        banner = new JButton("Bar Crawl");
        add(banner);
        banner.setBounds(0, 0, 2000, 90);

        instructions = new JButton("Instructions");
        add(instructions);
        instructions.setBounds(1050, 800, 150, 50);

        designers = new JButton("Game Designers");
        add(designers);
        designers.setBounds(1200, 800, 250, 50);

    }

}
