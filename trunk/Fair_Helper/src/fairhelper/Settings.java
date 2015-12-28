/**
 * Program ilk acildiginda veya calisma sirasinda ayarlar bu class uzerinden
 * cagirilir.
 * */

package fairhelper;

import fairhelper.language.Language;
import fairhelper.theme.Theme;
import java.awt.Dimension;

/**
 *
 * @author Mustafa Cavus
 */
public class Settings {

    private static String usersFileName; //Kullanici verilerinin kaydedilecegi dosya adi.
    private static String passwordCoderKey; //Kullanici sifrelerinin kodlanmasi icin kullanilan anahtar metin.
    private static String userNameLegalChars;//Kullanici adi icin gecerli karakterler.
    private static String passwordLegalChars;//Sifre icin gecerli karakterler.
    private static String housesFileName;//House verilerinin kaydedilceği dosya adı
    private static String languageFileName;//Dil dosyasının adı.
    private static String themeFileName;//Tema dosyasının adı.
    private static String helpTypesFileName;//Help türlerinin tutulduğu dosya adı
    
    private static User superAdmin;

    private static Dimension frameSize;

    /**
     * Bu metod program ilk acildiginda gerekli ayarlarin yuklenmesi icindir.
     * 
     * */
    public static void loadSettings () {

        usersFileName = "users.dat";
	  housesFileName = "houses.dat";
	  helpTypesFileName = "helps.dat";
        passwordCoderKey = "ub4kf8p0ac2jx17wim3toq5r";
	  userNameLegalChars = "abcçdefgğhıijklmnoöpqrsştuüvwyz1234567890";
	  passwordLegalChars = "abcçdefgğhıijklmnoöpqrsştuüvwyz1234567890";
        languageFileName = "TR.txt";
        themeFileName = "Dark.txt";

        frameSize = new Dimension(800, 600);

        Theme.loadTheme();
        Language.loadLanguage();
        UserManager.loadUserList();
        HouseManager.loadHouseList();
	  HelpManager.loadHelpTypes();

        superAdmin = new User("admin", "admin", "Super", "Admin", "SuperAdmin");

    }

    /**
     * usersFileName get metodu.
     * @return Kullanici adinin kaydedilecegi dosya adi.
     */
    public static String getUsersFileName() {
        return usersFileName;
    }

    public static void setHelpTypesFileName(String helpTypesFileName) {
	  Settings.helpTypesFileName = helpTypesFileName;
    }

    public static void setHousesFileName(String housesFileName) {
	  Settings.housesFileName = housesFileName;
    }

    public static void setUsersFileName(String usersFileName) {
	  Settings.usersFileName = usersFileName;
    }
    
    public static String getHousesFileName() {
        return housesFileName;
    }

    public static String getLanguageFileName() {
        return languageFileName;
    }

    public static String getThemeFileName() {
        return themeFileName;
    }

    public static String getPasswordCoderKey() {
        return passwordCoderKey;
    }

    public static String getUserNameLegalChars() {
        return userNameLegalChars;
    }

    public static String getPasswordLegalChars() {
        return passwordLegalChars;
    }

    public static User getSuperAdmin() {
        return superAdmin;
    }

    public static Dimension getFrameSize() {
        return frameSize;
    }

    public static String getHouseFileName() {
	  return housesFileName;
    }

    public static String getHelpTypesFileName() {
	  return helpTypesFileName;
    }

    
    
}
