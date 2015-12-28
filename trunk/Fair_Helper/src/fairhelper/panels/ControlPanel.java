/**
 * kontrol paneli.
 */

package fairhelper.panels;

import fairhelper.language.Language;
import fairhelper.theme.Theme;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

/**
 *
 * @author Ethem Cem Ozkan
 * No 07110604
 * email cemozkan89@hotmail.com
 */
public class ControlPanel extends JPanel {

    private JTabbedPane tabs;

    public ControlPanel() {

        setBackground(Theme.getColor("backgroundColor1"));

        initCombonents();

    }

    private void initCombonents() {

        tabs = new JTabbedPane();
        tabs.setBackground(Theme.getColor("backgroundColor2"));
        tabs.setForeground(Theme.getColor("labelColor1"));

        tabs.add(Language.getText("mainPageTabTitle"), new UserMainPanel());
        tabs.add(Language.getText("manageUsersTabTitle"), new ManageUsersPanel());
        tabs.add(Language.getText("manageHousesTabTitle"), new ManageHousesPanel());
        tabs.add(Language.getText("manageHelpsTabTitle"), new ManageHelpsPanel());
	  tabs.add(Language.getText("settingsTabTitle"),new SettingsPanel());

        add(tabs);

    }

}
