/*
 * Yapılan yardımın özellikleri burada tutulur.
 */

package fairhelper;

import java.io.Serializable;
import java.util.StringTokenizer;

/**
 *
 * @author Feoran
 */
public class HelpData implements Serializable {

    private Help help;
    private String date;

    /**
     * İlk constructor yardım türünü ve tarih için gün ay ve yılı ayrı ayrı alır.
     * @param help Yardım türü.
     * @param day Gün değerini alır. "07" ya da "23" gibi iki haneli olarak gönderilir.
     * @param month Ay değerini alır. "02" ya da "11" gibi iki haneli olarak gönderilir.
     * @param year Yıl değerini alır. Dört yaneli olmalıdır. "2009" gibi.
     */
    public HelpData(Help help, String day, String month, String year) {

        this.help = help;
        this.date = day + " " + month + " " + year;

    }

    /**
     * İkinci constructor yardım türünü ve tarihi alır.
     * @param help Yardım türü.
     * @param date Tarih bilgisi. Birer boşluk bırakarak "07 02 2008" gibi gönderilmelidir.
     */
    public HelpData(Help help, String date) {

        this.help = help;
        this.date = date;

    }

    public Help getHelp() {
        return help;
    }

    public String getDate() {
        return date;
    }

    public String getDay() {
        StringTokenizer token = new StringTokenizer(date);
        return token.nextToken();
    }

    public String getMonth() {
        StringTokenizer token = new StringTokenizer(date);
        token.nextToken();
        return token.nextToken();
    }

    public String getYear() {
        StringTokenizer token = new StringTokenizer(date);
        token.nextToken();
        return token.nextToken();
    }

}
