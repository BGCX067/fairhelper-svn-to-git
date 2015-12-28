
package fairhelper.readwrite;
import java.util.*;
import java.io.*;
import fairhelper.*;
/**
 *
 * @author Ethem Cem Ozkan
 * Email cemozkan89@hotmail.com
 * No 07110604
 */
public class ArrayWriter
{
     /**
     * ArrayListi arraye dönüstürüp users.dat dosyasına yazar
     * @param array
     */
    public static void writeArray(ArrayList array, String fileName)
    {
	  Object[] liste=new Object[array.size()];
	  for(int i=0;i<array.size();i++)
	  {
		liste[i]=(Object)array.get(i);
	  }
	  ObjectOutputStream output = null;
	  try
	  {

		output = new ObjectOutputStream(new FileOutputStream(fileName));
	  }
	  catch (IOException ex)
	  {
		System.exit(0);
	  }
	  try
	  {
		output.writeObject(liste);
		output.close();

	  }
	  catch(IOException ex)
	  {
		System.exit(0);
	  }
    }

}
