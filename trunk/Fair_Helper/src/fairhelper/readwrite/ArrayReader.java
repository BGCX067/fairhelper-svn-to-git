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
public class ArrayReader
{
  
    /**
     *Dosyadan arrayin tümünü okur
     * @return
     */
    public static ArrayList load(String fileName)
    {
	  ObjectInputStream input=null;
	  try
	  {
		input=new ObjectInputStream(new FileInputStream(fileName));
	  }
	  catch(IOException ex)
	  {
		System.out.println(ex.getMessage());
	  }
	  ArrayList<Object> array=new ArrayList<Object>();
	  Object[] cikti=new Object[100];
	  try
	  {
		cikti=(Object[])input.readObject();
	  }
	  catch(Exception ex)
	  {
		System.out.println(ex.getMessage());
	  }

	  for (int b=0;b<cikti.length;b++)
	  {
		array.add(cikti[b]);
	  }
	  return array;
    }

}
