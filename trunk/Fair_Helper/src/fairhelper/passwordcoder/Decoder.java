/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
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
public class Decoder extends CodingEngine {

    /* Constructor parametre olarak anahtar metin alir ve super class olan CodingEngine'e gonderir.
     */
    public Decoder(String key) {
        super(key);
    }//Constructor sonu.

    /* Parametre olarak gonderilen kodlanmis metni cozumleyerek geri gonderir.
     */
    public String lowSecureDecode (String text) {
        return decodeString(text);
    }//lowSecureCode sonu.

    /* Parametre olarak aldigi kodlanmis metini, ikinci parametre olarak aldigi anahtar sozcuk
     * ile cozumleyerek geri gonderir.
     */
    public String normalSecureDecode (String code, String keyWord) {
        keyWord = fixString(keyWord);
        return decodeString(code, keyWord);
    }//normalSecureCode sonu.

    /* Parametre olarak bir metin ve anahtar sozcuk alir. Aldigi metin uc parcadan
     * olusan bir kodlanmis metindir. Bu metin onceden rasgele yaratilmis bir anahtari
     * kullanici adini ve sifreyi kapsar. Bu uc kismi ayirarak cozumledigi ve sonunda
     * buldugu sifre kisminin cozumlenmis halini geriye doner.
     */
    public String highSecureDecode (String code, String keyWord) {
        keyWord = fixString(keyWord);
        String codedKeyWord = codeString(keyWord);
        int breakPoint = code.indexOf(codedKeyWord);
        if (breakPoint == -1)
            return null;
        String randKey = decodeString(code.substring(0, breakPoint), keyWord);
        String text = decodeString(code.substring(breakPoint + codedKeyWord.length()), randKey);
        return text;
    }//highSecuredecode sonu.
}
