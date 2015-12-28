
package fairhelper;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 *
 * @author Ethem Cem Ozkan
 * Email cemozkan89@hotmail.com
 * No 07110604
 */
public class DateNow
{
    public static String now()
    {
	  Calendar cal = Calendar.getInstance();
	  SimpleDateFormat sdf = new SimpleDateFormat("dd MM yyyy");
	  return sdf.format(cal.getTime());
    }

}
