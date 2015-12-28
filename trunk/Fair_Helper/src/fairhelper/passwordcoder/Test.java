/*
 * Sadece test classidir. Deneme amaclidir.
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
public class Test {
    
    public static void main(String[] args) {

        Coder coder = new Coder("h6i3rej9v6kf3tds3o9c5s2oas0");
        Decoder decoder = new Decoder("h6i3rej9v6kf3tds3o9c5s2oas0");
        String codedPassword = coder.highSecureCode("busifreyikirarsanhelalolsun", "Kullanici_Adi");
        System.out.println(codedPassword);
        System.out.println(decoder.highSecureDecode(codedPassword, "Kullanici_Adi"));
        
    }
}
