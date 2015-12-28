
/*
 * helpKindPanel.java
 *
 * Created on 18.Kas.2009, 21:03:06
 */

package fairhelper.panels;

import fairhelper.HelpManager;
import fairhelper.Settings;
import fairhelper.language.Language;
import fairhelper.theme.Theme;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

/**
 *
 * @author Ethem Cem Ozkan
 * Email cemozkan89@hotmail.com
 * No 07110604
 */
public class AddHelpKindPanel extends JPanel
{

    /** Creates new form helpKindPanel */
    public AddHelpKindPanel()
    {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addHelpKindHelpNameField = new javax.swing.JTextField();
        addHelpKindAddButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        addHelpKindKisiCheck = new javax.swing.JCheckBox();
        addHelpKindHouseCheck = new javax.swing.JCheckBox();
        addHelpKindHelpPointField = new javax.swing.JSpinner();

        setBackground(Theme.getColor("backgroundColor2"));
        setPreferredSize(new java.awt.Dimension(620, 480));

        addHelpKindAddButton.setBackground(Theme.getColor("buttonBackgroundColor1"));
        addHelpKindAddButton.setForeground(Theme.getColor("buttonForegroundColor1"));
        addHelpKindAddButton.setText(Language.getText("addButton"));
        addHelpKindAddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addHelpKindAddButtonActionPerformed(evt);
            }
        });

        jLabel1.setForeground(Theme.getColor("labelColor1"));
        jLabel1.setText(Language.getText("helpKindHelpNameLabel"));

        jLabel2.setForeground(Theme.getColor("labelColor1"));
        jLabel2.setText(Language.getText("helpKindPointLabel"));

        jLabel3.setForeground(Theme.getColor("labelColor1"));
        jLabel3.setText(Language.getText("personOrHouseLabel"));

        addHelpKindKisiCheck.setBackground(Theme.getColor("backgroundColor2"));
        addHelpKindKisiCheck.setForeground(Theme.getColor("labelColor1"));
        addHelpKindKisiCheck.setText(Language.getText("personLabel"));
        addHelpKindKisiCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addHelpKindKisiCheckActionPerformed(evt);
            }
        });

        addHelpKindHouseCheck.setBackground(Theme.getColor("backgroundColor2"));
        addHelpKindHouseCheck.setForeground(Theme.getColor("labelColor1"));
        addHelpKindHouseCheck.setText(Language.getText("houseLabel"));
        addHelpKindHouseCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addHelpKindHouseCheckActionPerformed(evt);
            }
        });

        addHelpKindHelpPointField.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addComponent(jLabel2))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(addHelpKindKisiCheck)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(addHelpKindHouseCheck)
                                            .addGap(18, 18, 18))
                                        .addComponent(addHelpKindHelpPointField, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(1, 1, 1))
                                .addComponent(addHelpKindHelpNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addHelpKindAddButton)
                            .addGap(76, 76, 76))))
                .addGap(195, 195, 195))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(146, 146, 146)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(addHelpKindHelpNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(addHelpKindHelpPointField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(addHelpKindKisiCheck)
                    .addComponent(addHelpKindHouseCheck))
                .addGap(42, 42, 42)
                .addComponent(addHelpKindAddButton)
                .addContainerGap(134, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
/**
 * girilen bilgilere göre help nesnesi oluşturur ve ilgilli arraye koyar
 * @param evt
 */
    private void addHelpKindAddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addHelpKindAddButtonActionPerformed

	  String name=addHelpKindHelpNameField.getText();
	  Integer object=(Integer)addHelpKindHelpPointField.getValue();
	  int point=object.intValue();
	  boolean person=true;
	  if((addHelpKindKisiCheck.isSelected()))
		person=true;
	  else if(addHelpKindHouseCheck.isSelected())
		person=false;
	  try
	  {
		HelpManager.addHelpKind(name, point, person);
		JOptionPane.showMessageDialog(null, Language.getText("helpAddedMessage"));
	  }
	  catch (Exception ex)
	  {
		JOptionPane.showMessageDialog(null, Language.getText("helpCannotAddMessage"));
	  }
	  
    }//GEN-LAST:event_addHelpKindAddButtonActionPerformed

    private void addHelpKindKisiCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addHelpKindKisiCheckActionPerformed
        addHelpKindHouseCheck.setSelected(false);
    }//GEN-LAST:event_addHelpKindKisiCheckActionPerformed

    private void addHelpKindHouseCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addHelpKindHouseCheckActionPerformed
        addHelpKindKisiCheck.setSelected(false);
    }//GEN-LAST:event_addHelpKindHouseCheckActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addHelpKindAddButton;
    private javax.swing.JTextField addHelpKindHelpNameField;
    private javax.swing.JSpinner addHelpKindHelpPointField;
    private javax.swing.JCheckBox addHelpKindHouseCheck;
    private javax.swing.JCheckBox addHelpKindKisiCheck;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables

}
