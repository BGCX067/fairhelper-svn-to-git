/**
 * Dil dosyalarının okunması ve istenilen metnin gönderilmesinden sorumlu calss.
 */

package fairhelper.language;

import fairhelper.Settings;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FilenameFilter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;

/**
 *
 * @author Feoran
 */
public class Language {

    private static File file;
    private static Scanner readText;

    public static void loadLanguage() {
         file = new File("Languages/"+Settings.getLanguageFileName());
         if (!file.exists()) {
            System.exit(0);
         }

         setOptionPaneButtons();

    }

    public static void loadLanguage(String languageFileName) {
         file = new File("Languages/"+languageFileName);
         if (!file.exists()) {
            System.exit(0);
         }

         setOptionPaneButtons();

    }

    public static String getSelectedLanguageName() {
        return file.getName().substring(0, file.getName().indexOf(".txt"));
    }

    public static String getText(String keyWord) {

        try {
            readText = new Scanner(file);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Language.class.getName()).log(Level.SEVERE, null, ex);
        }
        String line;
        while (readText.hasNext()) {
            line = readText.nextLine();
            if (line.indexOf(':') != -1 && deleteBlanks(line).indexOf('#') != 0) {
                if(line.substring(0, line.indexOf(':')).equals(keyWord)) {
                    line = line.substring(line.indexOf(':') + 1);
                    readText.close();
                    return deleteBlanks(line);
                }
            }
        }
        readText.close();
        return "";
    }

    public static void setOptionPaneButtons() {
        UIManager.put("OptionPane.cancelButtonText", getText("cancelButton"));
        UIManager.put("OptionPane.noButtonText", getText("noButton"));
        UIManager.put("OptionPane.okButtonText", getText("okButton"));
        UIManager.put("OptionPane.yesButtonText", getText("yesButton"));
    }

    private static String deleteBlanks(String line) {
        while (line.length() > 0) {
            if (line.charAt(0) == ' ')
                line = line.substring(1);
            else
                return line;
        }
        return line;
    }

    public static String[] getLanguageFileNames() {
        File languageDirectory = new File("Languages/");
        String[] languageFileNames = languageDirectory.list(new TXTFilter());
        for (int i=0; i<languageFileNames.length; i++)
            languageFileNames[i] = languageFileNames[i].substring(0, languageFileNames[i].indexOf(".txt"));
        return languageFileNames;
    }

    private static class TXTFilter implements FilenameFilter {

        public boolean accept(File dir, String name) {
            return (name.endsWith(".txt"));
        }

    }

}
