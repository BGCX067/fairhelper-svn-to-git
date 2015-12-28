
/*
 * helpPanel.java
 *
 * Created on 18.Kas.2009, 21:01:56
 */

package fairhelper.panels;

import fairhelper.language.Language;
import fairhelper.theme.Theme;
import javax.swing.*;

/**
 *
 * @author Ethem Cem Ozkan
 * Email cemozkan89@hotmail.com
 * No 07110604
 */
public class ManageHelpsMainPanel extends JPanel
{

    /** Creates new form helpPanel */
    public ManageHelpsMainPanel()
    {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        helpHouseButton = new javax.swing.JButton();
        helpPersonButton = new javax.swing.JButton();

        setBackground(Theme.getColor("backgroundColor2"));
        setPreferredSize(new java.awt.Dimension(620, 480));

        helpHouseButton.setBackground(Theme.getColor("buttonBackgroundColor1"));
        helpHouseButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        helpHouseButton.setForeground(Theme.getColor("buttonForegroundColor1"));
        helpHouseButton.setText(Language.getText("manageHouseHelpsPanelButton"));

        helpPersonButton.setBackground(Theme.getColor("buttonBackgroundColor1"));
        helpPersonButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        helpPersonButton.setForeground(Theme.getColor("buttonForegroundColor1"));
        helpPersonButton.setText(Language.getText("managePersonHelpsPanelButton"));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(170, 170, 170)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(helpPersonButton, javax.swing.GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE)
                    .addComponent(helpHouseButton, javax.swing.GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE))
                .addContainerGap(199, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addComponent(helpHouseButton)
                .addGap(46, 46, 46)
                .addComponent(helpPersonButton)
                .addContainerGap(263, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    public JButton getHelpHouseButton() {
        return helpHouseButton;
    }

    public JButton getHelpPersonButton() {
        return helpPersonButton;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton helpHouseButton;
    private javax.swing.JButton helpPersonButton;
    // End of variables declaration//GEN-END:variables

}
