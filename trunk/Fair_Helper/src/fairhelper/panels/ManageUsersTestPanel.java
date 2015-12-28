/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package fairhelper.panels;

import fairhelper.theme.Theme;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.Box;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.Border;

/**
 *
 * @author Feoran
 */
public class ManageUsersTestPanel extends JPanel {

    private JPanel manageUsersMenuPanel;
    private JPanel scrollPanel;

    private JScrollPane scrollPane;
    private Box panelBox;

    public ManageUsersTestPanel() {

        setLayout(new BorderLayout());
        initComponents();
    }

    private void initComponents() {
        scrollPanel = new JPanel();
        panelBox = Box.createHorizontalBox();
        panelBox.add(new AddUserPanel());
        scrollPane = new JScrollPane();
        scrollPane.setPreferredSize(new Dimension(panelBox.getPreferredSize().width-20, 410));
        scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        scrollPane.setViewportView(panelBox);
        scrollPanel.add(scrollPane);
        add(scrollPanel);
        createManageUsersTestPanel();
        add(manageUsersMenuPanel, BorderLayout.EAST);
        JPanel southPanel = new JPanel();
        southPanel.add(Box.createVerticalStrut(100));
        add(southPanel, BorderLayout.SOUTH);
    }

    private void createManageUsersTestPanel() {
        manageUsersMenuPanel = new JPanel();
        manageUsersMenuPanel.setBackground(Theme.getColor("backgroundColor1"));
        manageUsersMenuPanel.add(Box.createHorizontalStrut(180));
    }

}
