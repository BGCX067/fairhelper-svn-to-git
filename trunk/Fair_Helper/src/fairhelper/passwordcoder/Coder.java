/*
 * Kodlanacak sifreyi ve varsa ikinci anahtari da alarak kodlamayi gerceklestiren
 * class. Extend ettigi CodingEngine classindan gerekli metodlari cagirir ve sifreleme
 * istegini gonderilen verilere gore gerceklestirip geri doner.
 */

package fairhelper.passwordcoder;

/**
 *
 * @author Mustafa Cavus
 * @version     %I%, %G%
 * @since       1.0
 *
 * e-mail: mcavus88@gmail.com
 * 
 */
public class Coder extends CodingEngine {

    /* Constructor parametre olarak anahtar metin alir ve super class olan CodingEngine'e gonderir.
     */
    public Coder(String key) {
        super(key);
    }//Constructor sonu.

    /* Parametre olarak gonderilen metni kodlayarak geri gonderir.
     */
    public String lowSecureCode (String text) {
        return codeString(text);
    }//lowSecureCode sonu.

    /* Parametre olarak aldigi metini, ikinci parametre olarak aldigi anahtar sozcuk
     * ile kodlayarak geri gonderir.
     */
    public String normalSecureCode (String text, String keyWord) {
        keyWord = fixString(keyWord);
        return codeString(text, keyWord);
    }//normalSecureCode sonu.

    /* Parametre olarak bir metin ve anahtar sozcuk alir. Bu anahtar sozcugu kullanarak
     * rasgele baska bir anahtar yaratir ve yarattigi bu rasgele anahtar ile gonderilen
     * metni kodlar. Geriye dondugu metin bu uc metnin de kodlanmis hallerinin birlesimidir.
     */
    public String highSecureCode (String text, String keyWord) {
        keyWord = fixString(keyWord);
        String codedKeyWord = codeString(keyWord);
        String randKey;
        String codedRandKey;
        do {
            randKey = createRandomKey();
            codedRandKey = codeString(randKey, keyWord);
        } while(codedRandKey.indexOf(codedKeyWord) != -1);
        String codedText = codeString(text, randKey);
        return codedRandKey + codedKeyWord + codedText;
    }//highSecureCode sonu.

    /* 6 ile 12 karakter arasi bir rasgele anahtar metin olusturarak geriye bu
     * metni doner.
     */
    private String createRandomKey() {
        int length = 6 + (int)(Math.random()*7);
        int chNum;
        String randomKey = "";
        for (int i=0; i<length; i++) {
            chNum = (int)(Math.random()*getCharList().length());
            randomKey = randomKey + getCharList().substring(chNum, chNum+1);
        }
        for (int i=0; i<randomKey.length(); i++) {
            if (Math.random() < 0.40)
                randomKey = randomKey.substring(0, i) + (randomKey.substring(i, i+1)).toUpperCase() + randomKey.substring(i+1);
        }
        return randomKey;
    }//createRandomKey sonu.
}
