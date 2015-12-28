/**
 * Cesitli kullanici islemlerinin yurutulecegi class.
 */

package fairhelper;

import fairhelper.passwordcoder.Coder;
import fairhelper.passwordcoder.Decoder;
import fairhelper.privileges.Privileges;
import java.util.ArrayList;

import fairhelper.readwrite.ArrayReader;
import fairhelper.readwrite.ArrayWriter;
import java.io.File;

/**
 *
 * @author Mustafa Cavus
 */

public class UserManager {

    private static ArrayList<User> userList; //Kullanici bilgileri bu liste icerisinde tutulur.

    private static ArrayList<Privileges> privilegeList;

    private static User loginedUser;

    private static File usersFile;
    private static Coder coder;
    private static Decoder decoder;


    /**
     * loadUserList metodu dosyadan okunan kullanici verilerini listeye yukler.
     */
    public static void loadUserList()
    {
        usersFile = new File(Settings.getUsersFileName());
        decoder = new Decoder(Settings.getPasswordCoderKey());
        coder = new Coder(Settings.getPasswordCoderKey());

        privilegeList = new ArrayList<Privileges>();
        loadDefaultPrivileges();
        
        if(usersFile.exists())
            userList =(ArrayList<User>) ArrayReader.load(Settings.getUsersFileName());
        else
            userList = new ArrayList<User>();

        loginedUser = null;
        
    }

    public static void setLoginedUser(User loginedUser) {
        UserManager.loginedUser = loginedUser;
    }

    public static User getLoginedUser() {
        return loginedUser;
    }

    /** addUser metodu gonderilen User objesini listeye ekler.
     * @param newUser listeye eklenecek User objesi.
     *
     */
    public static void addUser(User newUser) {
        if (userList.isEmpty())
            newUser.setId(0);
        else
            newUser.setId(userList.get(userList.size()-1).getId() + 1);
        newUser.setPassword(coder.highSecureCode(newUser.getPassword(), newUser.getUserName()));
        userList.add(newUser);
        ArrayWriter.writeArray(userList, Settings.getUsersFileName());
    }

    /**Gonderilen kullanicinin indexini geriye doner.
     * @param userName Kullanici adi.
     * @return kullanici userList icinde bulunursa bulunan kullanicinin indexi, bulunamazsa -1
     */
    private static int getUserIndex(String userName) {
        for(int i=0; i<userList.size(); i++)
	{
		if( userList.get(i).getUserName().equals(userName) )
		{
                    return i;
		}
	}
        return -1;

    }

    /** Parametre olarak kullanici adini alir ve bu kullanici adini iceren User objesini geriye doner.
     * @param userName Kullanıcı adı.
     * @return Gönderilen kullanıcı adındaki kullanıcı objesi.
     */
    public static User getUser(String userName) {
        for (int i=0; i<userList.size(); i++) {
            if (userName.equals(userList.get(i).getUserName()))
                return userList.get(i);
        }
        return null;
    }

    /** Indexi gonderilen kullaniciyi siler.
     * @param index silinecek objenin indexi.
     *
     */
    public static void removeUser(int index) {
        userList.remove(index);
        ArrayWriter.writeArray(userList, Settings.getUsersFileName());
    }

    /** Gonderilen kullaniciyi siler.
     * @param userName kullanici adi
     *
     */
    public static void removeUser(String userName) {
        int userIndex = getUserIndex(userName);
        if (userIndex != -1)
            removeUser(userIndex);
    }

    /** Guncellenecek kullanicinin eski kullanici adi ile guncellenmis halini User objesi olarak alir guncellemeyi yapar ve kaydeder.
     * @param oldUserName Kullanıcının eski kullanıcı adı.
     * @param user Güncellenmiş kullanıcı objesi.
     */
    public static void updateUser(String oldUserName, User user) {
        user.setPassword(coder.highSecureCode(user.getPassword(), user.getUserName()));
        userList.set(getUserIndex(oldUserName), user);
        ArrayWriter.writeArray(userList, Settings.getUsersFileName());
    }

    /** Kullanici girisini yapar. Eger bu kullanici adi ve sifre dogru ise giris yapan kullanici objesini geri doner.
     * @param userName Kullanıcı adı.
     * @param password Şifre.
     * @return Giriş yapan kullanıcı.
     */
    public static void loginUser(String userName, String password) {

        if (userName.equals(Settings.getSuperAdmin().getUserName()) && password.equals(Settings.getSuperAdmin().getPassword())) {
            setLoginedUser(Settings.getSuperAdmin());
        }
        else {
            User user = getUser(userName);
            if (user == null)
                setLoginedUser(null);
            else if (password.equals(decodePassword(user.getPassword(), user.getUserName())))
                setLoginedUser(user);
        }
    }

     /** Kodlanmis kullanici sifrelerini cozer.
      * @param password Çözümlenecek kodlanmış şifre.
      * @param userName Kullanıcı adı.
      * @return Çözümlenen gerçek şifre.
      */
    public static String decodePassword(String password, String userName) {
        return decoder.highSecureDecode(password, userName);
    }

    /** Parametre olarak gonderilen kullanici adinin gecersiz karakter icerip icermedigini kontrol eder. Gecerli ise true degilse false doner.
     * @param userName Kontrol edilecek kullanıcı adı.
     * @return Kullanıcı adı geçerli ise true, geçersiz ise false.
     */
    public static boolean userNameLegal(String userName) {
        String legalChars = Settings.getUserNameLegalChars();
        for (int i=0; i<userName.length(); i++) {
            if(!charLegal(userName.substring(i, i+1), legalChars))
                return false;
        }
        return true;
    }

    /** Parametre olarak gonderilen sifrenin gecersiz karakter icerip icermedigini kontrol eder. Gecerli ise true degilse false doner.
     * @param password Kontrol edilecek şifre.
     * @return Şifre geçerli ise true, geçersiz ise false.
     */
    public static boolean passwordLegal(String password) {
        String legalChars = Settings.getPasswordLegalChars();
        for (int i=0; i<password.length(); i++) {
            if(!charLegal(password.substring(i, i+1), legalChars))
                return false;
        }
        return true;
    }

    /** Gonderilen tek bir karakterin uygun olup olmadigina gore boolean deger doner.
     * @param ch Kontrol edilecek karakter.
     * @param charList Geçerli karakter listesi.
     * @return Karakter geçerli ise true, geçersiz ise false.
     */
    private static boolean charLegal (String ch, String charList) {
        /* equalsIgnoreCase metodu ı=I ve i=İ olarak kabul ediyor. Gecici olarak
         * daha iyi bir cozum bulana kadar bu harfleri ozel olarak kontrol ettim.
         * */
        if(ch.equals("İ") || ch.equals("ı")) {
            return false;
        }
        for (int i=0; i<charList.length(); i++) {
            if (ch.equalsIgnoreCase(charList.substring(i, i+1)))
                return true;
        }
        return false;
    }

    /** Gonderilen kullanici adinin mevcut olup olmadigini kontrol eder. Ayni kullanici adinda bir kullanici yoksa true varsa false doner.
     * @param userName Kontrol edilecek kullanıcı adı.
     * @return Kullanıcı adı mevcut ise false, değil ise true.
     */
    public static boolean userNameUnique(String userName) {
        if (Settings.getSuperAdmin().getUserName().equals(userName))
            return false;
        if (getUser(userName) == null)
            return true;
        return false;
    }

    /** Kullanici listesini array turunde geri doner.
     * @return Array türünde kullanici listesi.
     */
    public static User[] getUserArray() {

        User[] array = new User[userList.size()];

        userList.toArray(array);

        return array;

    }

    public static String[] getUserNameArray(boolean exceptLoginedUser) {

        String[] userNameArray;

        if (exceptLoginedUser) {
            if (loginedUser.getId() == 0)
                userNameArray = new String[userList.size()];
            else
                userNameArray = new String[userList.size()-1];
            int k=0;
            for(int i=0; i<userList.size(); i++) {
                if (!loginedUser.getUserName().equals(userList.get(i).getUserName())) {
                    userNameArray[k] = userList.get(i).getUserName();
                    k++;
                }
            }
        }
        else {
            userNameArray = new String[userList.size()];
            for(int i=0; i<userList.size(); i++) {
                userNameArray[i] = userList.get(i).getUserName();
            }
        }

        return userNameArray;

    }

    public static String[] getPrivilegesNameArray(boolean privilegeFilter) {
        String[] privilegesNameArray;
        if (privilegeFilter) {
            int id = loginedUser.getPrivilegesId();
            int a = privilegeList.get(id).getManageUserPriviledges().length;
            privilegesNameArray = new String[a];
            int k=0;
            for(int i=0; i<privilegeList.size(); i++) {
                if (getManageUserPrivilage(privilegeList.get(i).getPrivilegeName())) {
                    privilegesNameArray[k] = privilegeList.get(i).getPrivilegeName();
                    k++;
                }
            }
        }
        else {
            privilegesNameArray = new String[privilegeList.size()];
            for(int i=0; i<privilegeList.size(); i++) {
                privilegesNameArray[i] = privilegeList.get(i).getPrivilegeName();
            }
        }
        return privilegesNameArray;
    }

    /**
     * Oturumdaki kullanıcının gönderilen yetki adındaki kullanıcıları yönetme hakkını geri döner.
     * Bu yönetme hakkı ekleme, silme, güncelleme haklarıdır.
     * @param privilagesName Yönetilip yönetilemeyecek olan yetki grubunun adı.
     * @return Yetki var ise true. Yok ise false.
     */
    public static boolean getManageUserPrivilage(String privilagesName) {
        return getPrivileges(loginedUser.getPrivilegesId()).getManageUserPriviledge(getPrivileges(privilagesName));
    }

    /**
     * Oturumdaki kullanıcının hane yönetme yetkisini kontrol eder. Hane ekleme, güncelleme, ve
     * geçici olarak silme yetkileridir.
     * @return Yetki var ise true. Yok ise false.
     */
    public static boolean getManageHousePrivilage() {
        return getPrivileges(loginedUser.getPrivilegesId()).getManageHouse();
    }

    /**
     * Oturumdaki kullanıcının haneyi tamamen silme yetkisini kontrol eder.
     * @return Yetki var ise true. Yok ise false.
     */
    public static boolean getDeleteHousePrivilage() {
        return getPrivileges(loginedUser.getPrivilegesId()).getDeleteHouse();
    }

    /**
     * Oturumdaki kullanıcının kişi yönetme yetkisini kontrol eder. Kişi ekleme, güncelleme, ve
     * geçici olarak silme yetkileridir.
     * @return Yetki var ise true. Yok ise false.
     */
    public static boolean getManageHelpPrivilage() {
        return getPrivileges(loginedUser.getPrivilegesId()).getManageHelp();
    }

    /** Adı gönderilen yetki türünü geri döner.
     * @param privilegesName Yetki adı.
     * @return Yetki.
     */
    public static Privileges getPrivileges(String privilegesName) {
        for (int i=0; i<privilegeList.size(); i++) {
            if (privilegesName.equals(privilegeList.get(i).getPrivilegeName()))
                return privilegeList.get(i);
        }
        return null;
    }

    /** ID si gönderilen yetkiyi geri döner.
     * @param privilegesID Yetki ID
     * @return Yetki.
     */
    public static Privileges getPrivileges(int privilegesID) {
        for (int i=0; i<privilegeList.size(); i++) {
            if (privilegesID == privilegeList.get(i).getId())
                return privilegeList.get(i);
        }
        return null;
    }

    /**
     * Varsayılan yetkiler oluşturulur. Zaten sadece bu 3 yetki olacak ve SuperAdmin
     * yetkisi sadece bir kullanıcıya ait.
     */
    private static void loadDefaultPrivileges() {
        int id = 0;
        Privileges superAdmin = new Privileges("SuperAdmin");
        superAdmin.setId(id);
        id++;
        Privileges admin = new Privileges("Admin");
        admin.setId(id);
        id++;
        Privileges user = new Privileges("User");
        user.setId(id);

        superAdmin.addManageUserPriveledge(admin);
        superAdmin.addManageUserPriveledge(user);
        superAdmin.setDeleteHouse(true);
        superAdmin.setManageHouse(true);
        superAdmin.setManageHelp(true);

        admin.addManageUserPriveledge(admin);
        admin.addManageUserPriveledge(user);
        admin.setDeleteHouse(false);
        admin.setManageHouse(true);
        admin.setManageHelp(true);

        user.addManageUserPriveledge(user);
        user.setDeleteHouse(false);
        user.setManageHouse(true);
        user.setManageHelp(true);

        privilegeList.add(superAdmin);
        privilegeList.add(admin);
        privilegeList.add(user);
    }

}
