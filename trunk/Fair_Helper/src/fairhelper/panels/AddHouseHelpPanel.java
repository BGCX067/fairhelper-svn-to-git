
/*
 * AddHouseHelpPanel.java
 *
 * Created on 20.Kas.2009, 12:39:14
 */

package fairhelper.panels;

import fairhelper.DateNow;
import fairhelper.Help;
import fairhelper.HelpData;
import fairhelper.House;
import fairhelper.HouseManager;
import fairhelper.language.Language;
import javax.swing.*;

/**
 *
 * @author Ethem Cem Ozkan
 * Email cemozkan89@hotmail.com
 * No 07110604
 */
public class AddHouseHelpPanel extends JPanel
{
    private Help object;

    /** Creates new form AddHouseHelpPanel */
    public AddHouseHelpPanel(Help help)
    {
	  object=help;
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        addHouseHelpHouseNameField = new javax.swing.JTextField();
        addHouseHelpButton = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(620, 480));

        jLabel1.setText(Language.getText("houseLabel"));

        addHouseHelpButton.setText(Language.getText("addButton"));
        addHouseHelpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addHouseHelpButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addComponent(jLabel1)
                        .addGap(114, 114, 114)
                        .addComponent(addHouseHelpHouseNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(250, 250, 250)
                        .addComponent(addHouseHelpButton)))
                .addContainerGap(172, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(161, 161, 161)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(addHouseHelpHouseNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(72, 72, 72)
                .addComponent(addHouseHelpButton)
                .addContainerGap(191, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addHouseHelpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addHouseHelpButtonActionPerformed
	  String name=addHouseHelpHouseNameField.getText();
	  if(name!=null)
	  {
		House house=HouseManager.findHouse(name);
		HelpData obj=new HelpData(object, DateNow.now());
		HouseManager.addHelp(obj, house);
		JOptionPane.showMessageDialog(null, Language.getText("helpAddedMessage"));
	  }
	  else
		JOptionPane.showMessageDialog(null, Language.getText("houseCouldntFoundMessage"));
    }//GEN-LAST:event_addHouseHelpButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addHouseHelpButton;
    private javax.swing.JTextField addHouseHelpHouseNameField;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables

}
