
/*
 * AddPersonHelpPanel.java
 *
 * Created on 20.Kas.2009, 12:54:49
 */

package fairhelper.panels;

import fairhelper.DateNow;
import fairhelper.Help;
import fairhelper.HelpData;
import fairhelper.HouseManager;
import fairhelper.Person;
import fairhelper.language.Language;
import javax.swing.*;

/**
 *
 * @author Ethem Cem Ozkan
 * Email cemozkan89@hotmail.com
 * No 07110604
 */
public class AddPersonHelpPanel extends JPanel
{
    private Help object;
    /** Creates new form AddPersonHelpPanel */
    public AddPersonHelpPanel(Help help)
    {
	  object=help;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        addPersonHelpTcNoField = new javax.swing.JTextField();
        addPersonHelpAddButton = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(620, 480));

        jLabel1.setText(Language.getText("tcNoLabel"));

        addPersonHelpAddButton.setText(Language.getText("addButton"));
        addPersonHelpAddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPersonHelpAddButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(194, 194, 194)
                        .addComponent(jLabel1)
                        .addGap(59, 59, 59)
                        .addComponent(addPersonHelpTcNoField, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(260, 260, 260)
                        .addComponent(addPersonHelpAddButton)))
                .addContainerGap(196, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(124, 124, 124)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(addPersonHelpTcNoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addComponent(addPersonHelpAddButton)
                .addContainerGap(244, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addPersonHelpAddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPersonHelpAddButtonActionPerformed
	  Person person=HouseManager.getPerson(addPersonHelpTcNoField.getText());
	  if(person!=null)
	  {
		HelpData data=new HelpData(object, DateNow.now());
		HouseManager.addHelp(data, person);
		JOptionPane.showMessageDialog(null, Language.getText("helpAddedMessage"));
	  }
	  else
		JOptionPane.showMessageDialog(null, Language.getText("personCouldntFoundMessage"));

    }//GEN-LAST:event_addPersonHelpAddButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addPersonHelpAddButton;
    private javax.swing.JTextField addPersonHelpTcNoField;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables

}
