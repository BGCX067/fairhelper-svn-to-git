/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package fairhelper.theme;

import fairhelper.Settings;
import java.awt.Color;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FilenameFilter;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Feoran
 */
public class Theme {

    private static File file;
    private static Scanner readText;

    public static void loadTheme() {
         file = new File("Themes/"+Settings.getThemeFileName());
         if (!file.exists()) {
            System.exit(0);
         }

    }

    public static void loadTheme(String themeFileName) {
         file = new File("Themes/"+themeFileName);
         if (!file.exists()) {
            System.exit(0);
         }

    }

    public static String getSelectedThemeName() {
        return file.getName().substring(0, file.getName().indexOf(".txt"));
    }

    public static Color getColor(String keyWord) {
        try {
            readText = new Scanner(file);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Theme.class.getName()).log(Level.SEVERE, null, ex);
        }
        String line;
        while (readText.hasNext()) {
            line = readText.nextLine();
            if (line.indexOf(':') != -1 && deleteBlanks(line).indexOf('#') != 0) {
                if(line.substring(0, line.indexOf(':')).equals(keyWord)) {
                    line = line.substring(line.indexOf(':') + 1);
                    readText.close();
                    return findColor(deleteBlanks(line));
                }
            }
        }
        readText.close();
        return null;
    }

    private static String deleteBlanks(String line) {
        StringTokenizer st = new StringTokenizer(line);
        if (st.hasMoreTokens()) {
            return st.nextToken();
        }
        return line;
    }

    private static Color findColor(String colorName) {
        if (colorName.charAt(0) == '#')
            return Color.decode(colorName);
        if (colorName.equalsIgnoreCase("BLACK"))
            return Color.BLACK;
        if (colorName.equalsIgnoreCase("BLUE"))
            return Color.BLUE;
        if (colorName.equalsIgnoreCase("CYAN"))
            return Color.CYAN;
        if (colorName.equalsIgnoreCase("DARK_GRAY"))
            return Color.DARK_GRAY;
        if (colorName.equalsIgnoreCase("GRAY"))
            return Color.GRAY;
        if (colorName.equalsIgnoreCase("GREEN"))
            return Color.GREEN;
        if (colorName.equalsIgnoreCase("LIGHT_GRAY"))
            return Color.LIGHT_GRAY;
        if (colorName.equalsIgnoreCase("MAGENTA"))
            return Color.MAGENTA;
        if (colorName.equalsIgnoreCase("ORANGE"))
            return Color.ORANGE;
        if (colorName.equalsIgnoreCase("PINK"))
            return Color.PINK;
        if (colorName.equalsIgnoreCase("RED"))
            return Color.RED;
        if (colorName.equalsIgnoreCase("WHITE"))
            return Color.WHITE;
        if (colorName.equalsIgnoreCase("YELLOW"))
            return Color.YELLOW;
        else
            return null;
    }

    public static String[] getThemeFileNames() {
        File themeDirectory = new File("Themes/");
        String[] themeFileNames = themeDirectory.list(new TXTFilter());
        for (int i=0; i<themeFileNames.length; i++)
            themeFileNames[i] = themeFileNames[i].substring(0, themeFileNames[i].indexOf(".txt"));
        return themeFileNames;
    }

    private static class TXTFilter implements FilenameFilter {

        public boolean accept(File dir, String name) {
            return (name.endsWith(".txt"));
        }

    }

}
