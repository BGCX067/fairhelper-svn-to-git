/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package fairhelper;

import fairhelper.panels.MainPanel;
import javax.swing.JFrame;

/**
 *
 * @author Feoran
 */
public class Frame extends JFrame {

    public Frame() {
        super("Fair Helper");
        MainPanel mainPanel = new MainPanel();
        setSize(Settings.getFrameSize());
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(mainPanel);
    }

}
