/*
 * Sifre kodlama islemlerini gerceklestiren class. Parametre olarak gonderilen
 * bir anahtar sozcukten yola cikarak gonderilen sifreyi kodlamak ve kodlanmis
 * sifreyi cozmek icin gerekli metodlari icerir.
 */

package fairhelper.passwordcoder;

import java.util.Locale;
import java.util.StringTokenizer;

/**
 * 
 * @author Mustafa Cavus
 * @version     %I%, %G%
 * @since       1.0
 *
 * e-mail: mcavus88@gmail.com
 *
 */
public abstract class CodingEngine
{

    private String key; //sifreleme anahtari
    private String charList; //36 tane karakter burada tutulur.

    /* Constructor parametre olarak String turunde sifreleme anahtari alir ve "key" degiskenine
     * atar. ayrica "charList" degiskenine sirasiyla tum karakterleri atar.
     */
    protected CodingEngine (String key)
    {

        this.key = key;
        charList = "0123456789abcdefghijklmnopqrstuvwxyz";
	  //bunu bi dosya şeklinde yapcak daha gösterişli olmazmı :)
	  //çünkü tüm şifreleme programları öyle çalışıyo :D

    }// Constructor sonu.

    //charList icin get metodu.
    protected String getCharList()
    {
        return charList;
    }//getCharList sonu.

    /* Parametre olarak String turunde bir anahtar alan createMatrix metodu,
     * bu anahtardan yola cikarak 6X6 lik bir matris olusturur. Bu matris tamamen "charList"
     * degiskeninin icerdigi karakterlerden olusur.
     */
    private String[][] createMatrix (String keyChars)
    {
        keyChars = fixString(keyChars);
        int i = 0;
        keyChars = keyChars.toLowerCase(Locale.US);
        String preMatrix = keyChars.substring(i, i+1);
        i++;
        while (preMatrix.length() < 36) {
            while (charExists(preMatrix, keyChars.substring(i, i+1))) {
                keyChars = keyChars.substring(0, i) + changeCharForward(keyChars.substring(i, i+1)) + keyChars.substring(i+1);
            }
            preMatrix = preMatrix + keyChars.substring(i, i+1);
            i = ++i%keyChars.length();
        }

        String[][] matrix = new String[6][6];
        i = 0;
        for (int column=0; column<6; column++) {
            for (int row=0; row<6; row++) {
                matrix[row][column] = preMatrix.substring(i, i+1);
                i++;
            }
        }
        return matrix;
    }// createMatrix sonu.

    /* Iki adet String turunde parametre alir. "ch" parametresi bir karakterden
     * olusur. Eger "ch" parametresinin icerdigi tek karakter "list"in icinde
     * varsa geriy        at hm1.PasswordCoder.Main.main(Main.java:22)e true doner. Icermiyorsa false doner. Kontrol sirasinda
     * kucuk buyuk harf ayirimi yapmaz.
     */
    private boolean charExists (String list, String ch) {
        for (int i=0; i<list.length(); i++) {
            if (ch.equalsIgnoreCase(list.substring(i, i+1))) {
                return true;
            }
        }
        return false;
    }// charExists sonu.

    /* Parametre olarak String turunde bir karakter alir. Bu karakterin "charList"
     * icerisindeki siralamaya gore bir onunde yer alan karakteri geriye doner.
     * Eger gonderilen parametre "charList"de sonuncu siradaysa "charList"deki
     * ilk karakteri geriye donecektir.
     */
    private String changeCharForward (String ch) {
        ch = ch.toLowerCase(Locale.US);
        return charList.substring((charList.indexOf(ch)+1)%charList.length(), ((charList.indexOf(ch)+1)%charList.length())+1);
    }// changeCharForward sonu.

    /* Parametre olarak String turunde bir karakter alir. Bu karakterin "charList"
     * icerisindeki siralamaya gore bir arkasinda yer alan karakteri geriye doner.
     * Eger gonderilen parametre "charList"de ilk siradaysa "charList"deki
     * son karakteri geriye donecektir.
     */
    private String changeCharBackward (String ch) {
        ch = ch.toLowerCase(Locale.US);
        return charList.substring((charList.indexOf(ch)+charList.length()-1)%charList.length(), ((charList.indexOf(ch)+charList.length()-1)%charList.length())+1);
    }// changeCharBackward sonu.

    /* Parametre olarak String turunde bir metin alir ve bu metni gerekli metodlari
     * kullanarak kodlar ve metnin kodlanmis halini geriye doner. Kodlamak icin
     * anahtar olarak sadece "key" degiskeninde kayitli olan metni kullanir.
     */
    protected String codeString (String str) {
        String[][] matrix = createMatrix(mixKeys(key));
        String lastCh = "";
        int groupNumber = str.length()/2;
        if (str.length()%2 == 1)
            lastCh = str.substring(groupNumber*2);
        String[] group = new String[groupNumber];
        group = separate(str);
        for (int i=0; i<groupNumber; i++) {
            group[i] = codeGroup(matrix, group[i]);
        }
        String codedStr = moveLetters(connect(group) + lastCh);
        codedStr = correctLetters(str, codedStr);
        return codedStr;
    }//codeString sonu.

    /* Parametre olarak String turunde iki metin alir ve birinci metni gerekli metodlari
     * kullanarak kodlar ve metnin kodlanmis halini geriye doner. Kodlamak icin
     * anahtar olarak "key" degiskeninde kayitli olan metin ile gonderilen ikinci
     * parametrenin karisimini kullanir.
     */
    protected String codeString (String str, String secondKey) {
        String[][] matrix = createMatrix(mixKeys(secondKey));
        String lastCh = "";
        int groupNumber = str.length()/2;
        if (str.length()%2 == 1)
            lastCh = str.substring(groupNumber*2);
        String[] group = new String[groupNumber];
        group = separate(str);
        for (int i=0; i<groupNumber; i++) {
            group[i] = codeGroup(matrix, group[i]);
        }
        String codedStr = moveLetters(connect(group) + lastCh);
        codedStr = correctLetters(str, codedStr);
        return codedStr;
    }// codeString sonu.

    /* Parametre olarak String turunde bir kodlanmis metin alir ve bu metni
     * gerekli metodlari kullanarak cozumler ve cozumlenmis metni geriye
     * doner. Cozumlemek icin anahtar olarak sadece "key" degiskeninde kayitli
     * olan metni kullanir.
     */
    protected String decodeString (String str) {
        String[][] matrix = createMatrix(mixKeys(key));
        String capitalAlerts = findCapitalAlerts(str);
        str = eraseCapitalAlerts(str);
        String oldStr = str;
        str = removeLetters(str);
        String lastCh = "";
        int groupNumber = str.length()/2;
        if (str.length()%2 == 1)
            lastCh = str.substring(groupNumber*2);
        String[] group = new String[groupNumber];
        group = separate(str);
        for (int i=0; i<groupNumber; i++) {
            group[i] = decodeGroup(matrix, group[i]);
        }
        str =  connect(group)  + lastCh;
        str = reCorrectLetters(oldStr, str);
        str = correctAlertedCapitals(str, capitalAlerts);
        return str;
    }// decodeString sonu.

    /* Parametre olarak String turunde bir kodlanmis metin bir de ikinci anahtar
     * metni alir ve birinci metni gerekli metodlari kullanarak cozumler ve cozumlenmis
     * metni geriye doner. Cozumlemek icin anahtar olarak "key" degiskeninde kayitli
     * olan metin ile gonderilen ikinci parametrenin karisimini kullanir.
     */
    protected String decodeString (String str, String secondKey) {
        String[][] matrix = createMatrix(mixKeys(secondKey));
        String capitalAlerts = findCapitalAlerts(str);
        str = eraseCapitalAlerts(str);
        String oldStr = str;
        str = removeLetters(str);
        String lastCh = "";
        int groupNumber = str.length()/2;
        if (str.length()%2 == 1)
            lastCh = str.substring(groupNumber*2);
        String[] group = new String[groupNumber];
        group = separate(str);
        for (int i=0; i<groupNumber; i++) {
            group[i] = decodeGroup(matrix, group[i]);
        }
        str =  connect(group)  + lastCh;
        str = reCorrectLetters(oldStr, str);
        str = correctAlertedCapitals(str, capitalAlerts);
        return str;
    }//decodeString sonu.

    /* Parametre olarak String turunde bir matris ve String turunde bir karakter
     * alir. Gonderilen karakterin matris icerisindeki konumunu bulup geriye String
     * turunde iki rakamdan olusan bu konumu doner. Birinci rakam sutunu ikinci
     * rakam da satiri temsil eder. Eger karakter matris icerisinde bulunamazsa
     * geriye null deger doner.
     */
    private String findLocation (String[][] matrix, String ch) {
        String location;
        for (int column=0; column<6; column++) {
            for (int row=0; row<6; row++) {
                if (ch.equalsIgnoreCase(matrix[row][column])) {
                    return Integer.toString(row) + Integer.toString(column);
                }
            }
        }
        return null;
    }// findLocation sonu.

    /* Parametre olarak String turunde bir matris ve String turunde bir konum alir.
     * Bu konum iki rakamdan olusur. Birinci rakam stunu ikinci rakam satiri temsil
     * eder. Geriye dondugu deger matrisin bu konumdaki degeridir.
     */
    private String findChar (String[][] matrix, String location) {
        int row = Integer.parseInt(location.substring(0, 1));
        int column = Integer.parseInt(location.substring(1, 2));
        return matrix[row][column];
    }// findChar sonu.

    /* Parametre olarak String turunde bir matris ve String turunde iki karakterden
     * olusan bir metin alir. Bu iki karakterin matris uzerindeki konumlarindan
     * yararlanarak bu iki karakteri kodlayip geriye iki karakterin kodlanmis
     * halinden olusan bir String doner.
     */
    private String codeGroup (String[][] matrix, String gr) {
        String locCh1 = findLocation(matrix, gr.substring(0, 1));
        String locCh2 = findLocation(matrix, gr.substring(1, 2));
        int ch1Row = Integer.parseInt(locCh1.substring(0, 1));
        int ch1Column = Integer.parseInt(locCh1.substring(1, 2));
        int ch2Row = Integer.parseInt(locCh2.substring(0, 1));
        int ch2Column = Integer.parseInt(locCh2.substring(1, 2));
        if (ch1Row == ch2Row) {
            locCh1 = Integer.toString(ch1Row) + Integer.toString((ch1Column+1)%matrix.length);
            locCh2 = Integer.toString(ch2Row) + Integer.toString((ch2Column+1)%matrix.length);
        } else if (ch1Column == ch2Column) {
            locCh1 = Integer.toString((ch1Row+1)%matrix.length) + Integer.toString(ch1Column);
            locCh2 = Integer.toString((ch2Row+1)%matrix.length) + Integer.toString(ch2Column);
        } else {
            locCh1 = Integer.toString(ch1Row) + Integer.toString(ch2Column);
            locCh2 = Integer.toString(ch2Row) + Integer.toString(ch1Column);
        }
        String codedGroup = findChar(matrix, locCh1) + findChar(matrix, locCh2);
        return codedGroup;
        
    }// codeGroup sonu.

    /* Parametre olarak String turunde bir matris ve String turunde iki karakterden
     * olusan bir kodlanmis metin alir. Bu iki karakterin matris uzerindeki konumlarindan
     * yararlanarak bu iki karakteri cozumleyip geriye iki karakterin cozumlenmis
     * halinden olusan bir String doner.
     */
    private String decodeGroup (String[][] matrix, String gr) {
        String locCh1 = findLocation(matrix, gr.substring(0, 1));
        String locCh2 = findLocation(matrix, gr.substring(1, 2));
        int ch1Row = Integer.parseInt(locCh1.substring(0, 1));
        int ch1Column = Integer.parseInt(locCh1.substring(1, 2));
        int ch2Row = Integer.parseInt(locCh2.substring(0, 1));
        int ch2Column = Integer.parseInt(locCh2.substring(1, 2));
        if (ch1Row == ch2Row) {
            locCh2 = Integer.toString(ch2Row) + Integer.toString((ch2Column+matrix.length-1)%matrix.length);
            locCh1 = Integer.toString(ch1Row) + Integer.toString((ch1Column+matrix.length-1)%matrix.length);
        } else if (ch1Column == ch2Column) {
            locCh2 = Integer.toString((ch2Row+matrix.length-1)%matrix.length) + Integer.toString(ch2Column);
            locCh1 = Integer.toString((ch1Row+matrix.length-1)%matrix.length) + Integer.toString(ch1Column);
        } else {
            locCh1 = Integer.toString(ch1Row) + Integer.toString(ch2Column);
            locCh2 = Integer.toString(ch2Row) + Integer.toString(ch1Column);
        }
        String codedGroup = findChar(matrix, locCh1) + findChar(matrix, locCh2);
        return codedGroup;
    }// decodeGroup sonu.

    /* Parametre olarak String turunde bir metin alir ve bu metni iki karakterli
     * gruplara ayirarak geriye her elemaninin iki karakterli grup icerdigi
     * String dizisi doner. Parametredeki metnin karakter sayisi tek ise son
     * karakter isleme alinmaz.
     */
    private String[] separate (String str) {
        int groupNumber = str.length()/2;
        String[] groups = new String[groupNumber];
        int k=0;
        for (int i=0; i<groupNumber; i++) {
            groups[i] = str.substring(k, k+2);
            k += 2;
        }
        return groups;
    }// separate sonu.

    /* Parametre olarak her elemaninin iki karakterli grup icerdigi String dizisi
     * alir. Bu gruplari birlestirerek geriye butun bir String turunde metin doner.
     */
    private String connect (String[] group) {
        String connected = "";
        for (int i=0; i<group.length; i++) {
            connected = connected + group[i];
        }
        return connected;
    }// connect sonu.

    /* Parametre olarak String turunde bir ikinci anahtar metni alir. Ikinci bir
     * anahtar kullanilmasi durumunda "key" degiskenindeki anahtar metni ile
     * bu metoda gonderilen ikinci parametre, ikisinden sirayla birer harf eklenerek
     * karistirilir ve bu karistirilmis son anahtar metni geriye donulur.
     */
    private String mixKeys (String secondKey) {
        String finalKey = "";
        int i=0;
        if (key.length()<=secondKey.length()) {
            for (i=0; i<key.length(); i++) {
                finalKey = finalKey + key.substring(i, i+1) + secondKey.substring(i, i+1);
            }
            finalKey = finalKey + secondKey.substring(i);
        }
        else {
            for (i=0; i<secondKey.length(); i++) {
                finalKey = key.substring(i, i+1) + secondKey.substring(i, i+1);
            }
            finalKey = finalKey + key.substring(i);
        }
        return finalKey;
    }// mixKeys sonu.

    /* Parametre olarak String turunde iki metin alir. Bu metinlerden birincisi
     * kodlanmamis metni, ikincisi de kodlanmis metni temsil eder. Kodlama isleminden
     * sonra harflerin buyuk ya da kucuk olusu korunmamissa, bu metod kodlanmis
     * metni ilk metin ile karsilastirarak gerekli duzenlemeyi yapar ve son halini
     * geriye doner.
     */
    private String correctLetters (String str, String codedStr) {
        String correctedStr = "";
        String capitalAlert = "";
        for (int i=0; i<codedStr.length(); i++) {
            if (!isNumber(str.substring(i, i+1))) {
                if (!controlCapitalLetter(str.substring(i, i+1))) {
                    if (isNumber(codedStr.substring(i, i+1))) {
                        if (capitalAlert.length()==0)
                            capitalAlert = Integer.toString(i);
                        else
                            capitalAlert = capitalAlert + " " + Integer.toString(i);
                    }
                }
            }
            if (controlCapitalLetter(str.substring(i, i+1)))
                correctedStr = correctedStr + (codedStr.substring(i, i+1)).toUpperCase(Locale.US);
            else
                correctedStr = correctedStr + (codedStr.substring(i, i+1));
        }
        int[] ca = locateCapitalAlerts(capitalAlert);
        if (!capitalAlert.equals("")) {
            for (int k=0; k<ca.length; k++) {
                ca[k] += k;
                correctedStr = correctedStr.substring(0, ca[k]) + "!" + correctedStr.substring(ca[k]);
            }
        }
        return correctedStr;
    }// correctLetters sonu.

    /* Parametre olarak String turunde iki metin alir. bu metinlerden birincisi
     * kodlanmis metni, ikincisi de cozumlenmis metni temsil eder.
     * kodlandiktan sonra tekrar cozumlenen metinde harflerin buyuk veya kucuk
     * olusu korunmamissa, bu metod duzenlemeyi yapar ve son halini geriye doner.
     */
    private String reCorrectLetters (String str, String decodedStr) {
        String recorrectedStr = "";
        for (int i=0; i<decodedStr.length(); i++) {
            if (controlCapitalLetter(str.substring(i, i+1)))
                recorrectedStr = recorrectedStr + (decodedStr.substring(i, i+1)).toUpperCase(Locale.US);
            else
                recorrectedStr = recorrectedStr + (decodedStr.substring(i, i+1));
        }
        return recorrectedStr;
    }// reCorrectLetters sonu.

    /* Bazi durumlarda kodlanmamis metin kodlandiktan sonra kucuk harflere karsilik
     * bir sayi gelirse cozumlendiginde buyuk harf olarak gorulecektir. Bunu onlemek
     * icin kodlanmis metinde bazi "!" isaretleri gorulecektir. Bu metod bu isaretlerin
     * yerini tespit ederek String turunde her birinin yerini sirali olarak veren bir
     * metin geriye doner.
     */
    private String findCapitalAlerts (String str) {
        String capitalAlert = "";
        for (int i = 0; i<str.length(); i++) {
            if (str.substring(i, i+1).equals("!"))
                if (capitalAlert.length()==0)
                            capitalAlert = Integer.toString(i);
                        else
                            capitalAlert = capitalAlert + " " + Integer.toString(i);
        }
        return capitalAlert;
    }// findCapitalAlerts sonu.

    /* Bazi durumlarda kodlanmamis metin kodlandiktan sonra kucuk harflere karsilik
     * bir sayi gelirse cozumlendiginde buyuk harf olarak gorulecektir. Bunu onlemek
     * icin kodlanmis metinde bazi "!" isaretleri gorulecektir. Bu metod bu işaretleri
     * silerek metnin son halini String turunde geriye doner.
     */
    private String eraseCapitalAlerts (String str) {
        for (int i = 0; i<str.length(); i++) {
            if (str.substring(i, i+1).equals("!"))
                str = str.substring(0, i) + str.substring(i+1);
        }
        return str;
    }// eraseCapitalAlerts sonu.

    /* Bu metod harfin sayiya donusmesi nedeniyle buyuk gorunen kucuk harfleri tekrar
     * kuculterek geriye metnin son halini String turunde doner.
     */
    private String correctAlertedCapitals (String str, String capitalAlerts) {
        if (!capitalAlerts.equals("")) {
            int[] ca = locateCapitalAlerts(capitalAlerts);
            for (int i=0; i<ca.length; i++) {
                ca[i] -= i;
                str = str.substring(0, ca[i]) + (str.substring(ca[i], ca[i]+1)).toLowerCase(Locale.US) + str.substring(ca[i]+1);
            }
        }
        return str;
    }

    /* Parametre olarak String turunde capitalAlert konumlarini tutan metni alir
     * ve bu konumlari tek tek bir sayi dizisine atar ve bu int turundeki diziyi
     * geri doner.
     */
    private int[] locateCapitalAlerts (String capitalAlerts) {
        StringTokenizer st = new StringTokenizer(capitalAlerts);
        int count = 0;
        for (int i=0; i<capitalAlerts.length(); i++) {
            if ((capitalAlerts.substring(i, i+1)).equals(" "))
                    count++;
        }
        int[] ca = new int[count+1];
        count = 0;
        while (st.hasMoreTokens()) {
            ca[count] = Integer.parseInt(st.nextToken());
            count++;
        }
        return ca;
    }// locateCapitalAlerts

    /* String turunde gonderilen bir harfin buyuk harf olup olmadigini kontrol eder.
     * Buyuk harf ise geriye true, degilse false doner.
     */
    private boolean controlCapitalLetter (String letter) {
        if (letter.toUpperCase(Locale.US).equals(letter))
            return true;
        else
            return false;
    }// controlCapitalLetter sonu.

    /* Parametre olarak gonderilen metni ikili gruplara ayirip sonra bu gruplardaki
     * harflerin yerlerini degistirerek tekrar gruplandiran ve metnin son halini
     * String turunde geriye doner.
     */
    public String changeLetters (String str) {
        int groupNumber = str.length()/2;
        String[] group = separate(str);
        for (int i=0; i<groupNumber; i++) {
            group[i] = group[i].substring(1, 2) + group[i].substring(0, 1);
        }
        if (str.length()%2 == 1)
            return correctLetters(str, connect(group)) + str.substring(groupNumber*2);
        else
            return correctLetters(str, connect(group));
    }// changeLetters sonu.

    /* Parametre olarak gonderilen bir karakterin rakam olup olmadigini kontrol
     * eder. Eger rakam ise geriye true, degilse false doner.
     */
    private boolean isNumber (String ch) {
        for (int i=0; i<=9; i++) {
            if (ch.equals(Integer.toString(i)))
                return true;
        }
        return false;
    }

    /* Parametre olarak gonderilen metnin tum karakterlerini "charList" sirasina
     * gore metnin uzunlugu kadar ileri kaydirir.
     */
    private String moveLetters (String str) {
        String changedStr = "";
        String changedCh = "";
        for (int i=0; i<str.length(); i++) {
            if (str.substring(i, i+1).equals("!"))
                    changedCh = "!";
            else {
                changedCh = str.substring(i, i+1);
                for (int k=0; k<str.length(); k++) {
                        changedCh = changeCharForward(changedCh);
                }
            }
            changedStr = changedStr + changedCh;
        }
        return changedStr;
    }// moveLetters sonu.

    /* Parametre olarak gonderilen metnin tum karakterlerini "charList" sirasina
     * gore metnin uzunlugu kadar geriye kaydirir.
     */
    private String removeLetters (String str) {
        String changedStr = "";
        String changedCh = "";
        for (int i=0; i<str.length(); i++) {
            if (str.substring(i, i+1).equals("!"))
                    changedCh = "!";
            else {
                changedCh = str.substring(i, i+1);
                for (int k=0; k<str.length(); k++) {
                        changedCh = changeCharBackward(changedCh);
                }
            }
            changedStr = changedStr + changedCh;
        }
        return changedStr;
    }// removeLeters sonu.

    /* Anahtar metin isleme alinamayacak ozel karakterler iceriyorsa bu karakterleri
     * silerek geriye duzgun bir metin donecektir.
     */
    public String fixString(String key) {
        String fixedKey = "";
        for (int i = 0; i<key.length(); i++) {
            if (charLegal(key.substring(i, i+1)))
                fixedKey = fixedKey + key.substring(i, i+1);
        }
        return fixedKey;
    }// fixKey sonu.

    /* Parametre olarak String turunde bir karakter alan bu metod aldigi karakterin
     * charList içerisinde var olup olmadigini kontrol eder. Eger varsa true, yoksa
     * false deger doner.
     */
    private boolean charLegal (String ch) {
        if(ch.equals("İ") || ch.equals("ı")) {
            return false;
        }
        for (int i=0; i<charList.length(); i++) {
            if (ch.equalsIgnoreCase(charList.substring(i, i+1)))
                return true;
        }
        return false;
    }// charLegal sonu.

}
