 
package fairhelper;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ethem Cem Ozkan
 * Email cemozkan89@hotmail.com
 * No 07110604
 */
public class Defaults
{
    /**
     * varsayılan yardım türlerini ekler
     */
    public static void getHelpKindDefaults()
    {
	  try
	  {
		HelpManager.addHelpKind("Barınma Yardımı", 35, false);
	  } 
	  catch (Exception ex)
	  {
		Logger.getLogger(Defaults.class.getName()).log(Level.SEVERE, null, ex);
	  }
	  try
	  {
		HelpManager.addHelpKind("Yakacak Yardımı", 40, false);
	  } 
	  catch (Exception ex)
	  {
		Logger.getLogger(Defaults.class.getName()).log(Level.SEVERE, null, ex);
	  }
	  try
	  {
		HelpManager.addHelpKind("Maddi Yardım", 25, false);
	  } 
	  catch (Exception ex)
	  {
		Logger.getLogger(Defaults.class.getName()).log(Level.SEVERE, null, ex);
	  }
	  try
	  {
		HelpManager.addHelpKind("Sağlık Yardımı", 35, true);
	  } 
	  catch (Exception ex)
	  {
		Logger.getLogger(Defaults.class.getName()).log(Level.SEVERE, null, ex);
	  }
	  try
	  {
		HelpManager.addHelpKind("Eğitim Yardımı", 35, true);
	  } 
	  catch (Exception ex)
	  {
		Logger.getLogger(Defaults.class.getName()).log(Level.SEVERE, null, ex);
	  }
	  try
	  {
		HelpManager.addHelpKind("Özel Maddi Yardim", 30, true);
	  } 
	  catch (Exception ex)
	  {
		Logger.getLogger(Defaults.class.getName()).log(Level.SEVERE, null, ex);
	  }
	  
	  
    }
}
