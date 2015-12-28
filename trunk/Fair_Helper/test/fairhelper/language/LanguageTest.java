/**
 * Dil paketini test eder.
 */

package fairhelper.language;

import fairhelper.Settings;

/**
 *
 * @author Feoran
 */
public class LanguageTest {

    public static void main (String [] args) {
        Settings.loadSettings();
        Language.loadLanguage();
        System.out.println(Language.getText("themeNameDark"));
    }

}
