/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package fairhelper.panels;

import fairhelper.UserManager;
import fairhelper.language.Language;
import fairhelper.theme.Theme;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Feoran
 */
public class MainPanel extends JPanel {

    private BorderLayout layout;

    private JPanel northPanel;
    private JPanel southPanel;
    private JPanel boxPanel;
    private JPanel bottomMenuPanel;

    private LoginPanel loginPanel;
    private ControlPanel controlPanel;

    private JLabel logo;
    private JLabel themeLabel;
    private JLabel languageLabel;

    private JButton closeButton;
    private JButton exitAccountButton;

    private JComboBox themeBox;
    private JComboBox languageBox;

    public MainPanel() {

        layout = new BorderLayout();
        setLayout(layout);

        initComponents();

    }

    private void initComponents() {

	  northPanel = new JPanel();
          northPanel.setBackground(Theme.getColor("backgroundColor1"));
          northPanel.add(Box.createVerticalStrut(60));
          logo = new JLabel(new ImageIcon("Images/logos/fairhelper.png"));
          logo.setSize(400, 120);
          northPanel.add(logo);
          northPanel.add(Box.createHorizontalStrut(60));
          
          add(northPanel, BorderLayout.NORTH);

          if (UserManager.getLoginedUser() == null) {
              loginPanel = new LoginPanel();
              add(loginPanel, BorderLayout.CENTER);
          }
          else {
              controlPanel = new ControlPanel();
              add(controlPanel);
          }

          southPanel = new JPanel();
          southPanel.setLayout(new BorderLayout());
          southPanel.setBackground(Theme.getColor("backgroundColor1"));
          southPanel.add(Box.createVerticalStrut(60));
          createBoxMenu();
          Box boxMenuBoxesHorizontal = Box.createHorizontalBox();
          Box boxMenuBoxesVertical = Box.createVerticalBox();
          boxMenuBoxesHorizontal.add(Box.createHorizontalStrut(20));
          boxMenuBoxesVertical.add(Box.createVerticalStrut(5));
          boxMenuBoxesVertical.add(boxPanel);
          boxMenuBoxesVertical.add(Box.createVerticalStrut(5));
          boxMenuBoxesHorizontal.add(boxMenuBoxesVertical);
          southPanel.add(boxMenuBoxesHorizontal, BorderLayout.WEST);
          createBottomMenu();
          southPanel.add(bottomMenuPanel, BorderLayout.EAST);
          add(southPanel, BorderLayout.SOUTH);

          addActionlisteners();

    }

    private void createBoxMenu() {
        boxPanel = new JPanel();
        boxPanel.setLayout(new GridLayout(2, 2, 2, 2));
        boxPanel.setBackground(Theme.getColor("backgroundColor1"));
        themeLabel = new JLabel(Language.getText("themeLabel"));
        themeLabel.setForeground(Theme.getColor("labelColor1"));
        boxPanel.add(themeLabel);
        themeBox = new JComboBox(getThemeNames());
        themeBox.setBackground(Theme.getColor("backgroundColor2"));
        themeBox.setForeground(Theme.getColor("labelColor1"));
        themeBox.setSelectedIndex(getThemeBoxCurrentThemeIndex());
        themeBox.addActionListener(new ThemeBoxHandler());
        themeBox.setLocation(0, 0);
        boxPanel.add(themeBox);
        languageLabel = new JLabel(Language.getText("languageLabel"));
        languageLabel.setForeground(Theme.getColor("labelColor1"));
        boxPanel.add(languageLabel);
        languageBox = new JComboBox(getLanguageNames());
        languageBox.setBackground(Theme.getColor("backgroundColor2"));
        languageBox.setForeground(Theme.getColor("labelColor1"));
        languageBox.setSelectedIndex(getLanguageBoxCurrentLanguageIndex());
        languageBox.addActionListener(new LanguageBoxHandler());
        boxPanel.add(languageBox);
    }

    private void createBottomMenu() {
        bottomMenuPanel = new JPanel();
        bottomMenuPanel.setBackground(Theme.getColor("backgroundColor1"));
        int buttonHeight = 36;
        if (UserManager.getLoginedUser() != null) {
            exitAccountButton = new JButton(Language.getText("exitAccountButton"));
            exitAccountButton.setBackground(Theme.getColor("backgroundColor2"));
            exitAccountButton.setForeground(Theme.getColor("labelColor1"));
            exitAccountButton.setPreferredSize(new Dimension(exitAccountButton.getPreferredSize().width, buttonHeight));
            bottomMenuPanel.add(exitAccountButton);
            bottomMenuPanel.add(Box.createHorizontalStrut(20));
        }
        closeButton = new JButton(Language.getText("closeButton"));
        closeButton.setBackground(Theme.getColor("backgroundColor2"));
        closeButton.setForeground(Theme.getColor("labelColor1"));
        closeButton.setPreferredSize(new Dimension(closeButton.getPreferredSize().width, buttonHeight));
        bottomMenuPanel.add(closeButton);
    }

    private void addActionlisteners() {
        if (loginPanel != null)
            loginPanel.getLoginButton().addActionListener(new LoginHandler());
        if (closeButton != null)
            closeButton.addActionListener(new CloseProgramHandler());
        if(exitAccountButton != null)
            exitAccountButton.addActionListener(new ExitAccountHandler());
    }

    private String[] getThemeNames() {
        String[] themeNames = Theme.getThemeFileNames();
        for (int i=0; i<themeNames.length; i++) {
            themeNames[i] = Language.getText("themeName" + themeNames[i]);
        }
        return themeNames;
    }

    private int getThemeBoxCurrentThemeIndex() {
        int selectedThemeIndex;
          for (selectedThemeIndex=0; selectedThemeIndex<themeBox.getItemCount(); selectedThemeIndex++) {
              if (Theme.getThemeFileNames()[selectedThemeIndex].equals(Theme.getSelectedThemeName())) {
                  return selectedThemeIndex;
              }
          }
        return 0;
    }

    private String[] getLanguageNames() {
        String[] languageNames = Language.getLanguageFileNames();
        for (int i=0; i<languageNames.length; i++) {
            languageNames[i] = Language.getText("langName" + languageNames[i]);
        }
        return languageNames;
    }

    private int getLanguageBoxCurrentLanguageIndex() {
        int selectedLanguageIndex;
          for (selectedLanguageIndex=0; selectedLanguageIndex<languageBox.getItemCount(); selectedLanguageIndex++) {
              if (Language.getLanguageFileNames()[selectedLanguageIndex].equals(Language.getSelectedLanguageName())) {
                  return selectedLanguageIndex;
              }
          }
        return 0;
    }

    private void refreshPanel() {
        this.removeAll();
        initComponents();
        this.revalidate();
        this.repaint();
    }

    public class LoginHandler implements ActionListener {

        private String userName;
        private String password;
        private String message;

        public void actionPerformed(ActionEvent e) {

            userName = loginPanel.getUserNameField().getText();
            password = new String(loginPanel.getPasswordField().getPassword());

            boolean success = false;

            if (userName.equals("")) {
                message = Language.getText("enterUserNameMessage");
            }
            else if (password.equals("")) {
                message = Language.getText("enterPasswordMessage");
            }
            else {
                UserManager.loginUser(userName, password);
                if (UserManager.getLoginedUser() == null)
                    message = Language.getText("userCouldntFoundMessage");
                else
                    success = true;
            }

            if (!success) {
                JOptionPane.showMessageDialog(null, message);
                loginPanel.cleanFields();
            }
            else
                loginPanel = null;
            refreshPanel();
        }

    }

    private class ThemeBoxHandler implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            Theme.loadTheme((String) Theme.getThemeFileNames()[themeBox.getSelectedIndex()] + ".txt");
            refreshPanel();
        }

    }

    private class LanguageBoxHandler implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            Language.loadLanguage((String) Language.getLanguageFileNames()[languageBox.getSelectedIndex()] + ".txt");
            refreshPanel();
        }

    }

    private class ExitAccountHandler implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            UserManager.setLoginedUser(null);
            exitAccountButton = null;
            refreshPanel();
        }

    }

    private class CloseProgramHandler implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            String message = Language.getText("closeProgramMessage");
            JOptionPane optionPane = new JOptionPane();
            int answer = JOptionPane.showConfirmDialog(null, message, Language.getText("closeButton"), JOptionPane.YES_NO_OPTION);
            if (answer == JOptionPane.YES_OPTION)
                System.exit(0);
        }

    }

}
