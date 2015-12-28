
package fairhelper;

import fairhelper.readwrite.ArrayReader;
import fairhelper.readwrite.ArrayWriter;
import java.io.File;
import java.lang.Exception;
import java.util.ArrayList;


public class HelpManager
{
    private static ArrayList<Help> helptypes;
    /**
     * Yardim türü ekler
     * @param name
     * @param point
     * @param person
     */
    public static void addHelpKind(String name,int point,boolean person) throws Exception
    {
	  boolean a=true;
	  for(int i=0;i<helptypes.size();i++)
	  {
		if(helpExist(name, point))
		    a=false;
	  }
	  if(a==true)
	  {
		helptypes.add(new Help(name,point,person));
		ArrayWriter.writeArray(helptypes, Settings.getHelpTypesFileName());
	  }
	  
	  else
		throw new Exception();
	  
    }
    /**
     * yardim türü siler
     * @param name
     * @param point
     */
    public static void deleteHelpKind(String name,int point) throws Exception
    {
	  for(int i=0;i<helptypes.size();i++)
	  {
		if(helpExist(name, point))
		{
		    helptypes.remove(i);
		    ArrayWriter.writeArray(helptypes, Settings.getHelpTypesFileName());
		}
		else
		    throw new Exception();
	  }
    }

    public static void deleteHelpKind(Help helpKind) throws Exception
    {
          helptypes.remove(getHelpIndex(helpKind.getHelptype(), helpKind.getHelpForPerson()));
	  ArrayWriter.writeArray(helptypes, Settings.getHelpTypesFileName());
    }

    /**
     * verilen yardim türünün punanını değiştirir
     * @param help
     * @param newpoint
     */
    public static void updateHelpKind(Help help,int newpoint) throws Exception
    {
	  for(int i=0;i<helptypes.size();i++)
	  {
		if(helptypes.get(i).getHelptype().equalsIgnoreCase(help.getHelptype()))
		{
		    helptypes.get(i).setPoint(newpoint);
		    ArrayWriter.writeArray(helptypes, Settings.getHelpTypesFileName());
		}
		else
		    throw new Exception();
	  }

    }
    private static boolean helpExist(String name,int point)
    {
	  boolean a=false;
	  for(int i=0;i<helptypes.size();i++)
	  {
		if((helptypes.get(i).getHelptype().equals(name))&&(helptypes.get(i).getPoint()==point))
		    a=true;
	  }
	  return a;
    }
    public static void loadHelpTypes()
    {
	  File userFile=new File(Settings.getHelpTypesFileName());
	  if(userFile.exists())
            helptypes =(ArrayList<Help>) ArrayReader.load(Settings.getHelpTypesFileName());
        else
	  {
            helptypes =new ArrayList<Help>();
		Defaults.getHelpKindDefaults();
	  }
    }

    public static String[] getHouseHelpNameArray() {
        String[] nameArray = new String[helptypes.size()];
        int k=0;
        for (int i=0; i<nameArray.length; i++) {
            if (!helptypes.get(i).getHelpForPerson()) {
                nameArray[k] = helptypes.get(i).getHelptype();
                k++;
            }
        }
        String[] houseHelpNameArray = new String[k];
        for (int i=0; i<houseHelpNameArray.length; i++) {
            houseHelpNameArray[i] = nameArray[i];
        }
        return houseHelpNameArray;

    }

    public static String[] getPersonHelpNameArray() {
        String[] nameArray = new String[helptypes.size()];
        int k=0;
        for (int i=0; i<nameArray.length; i++) {
            if (helptypes.get(i).getHelpForPerson()) {
                nameArray[k] = helptypes.get(i).getHelptype();
                k++;
            }
        }
        String[] houseHelpNameArray = new String[k];
        for (int i=0; i<houseHelpNameArray.length; i++) {
            houseHelpNameArray[i] = nameArray[i];
        }
        return houseHelpNameArray;

    }

    public static Help getHelp(int index) {
        return helptypes.get(index);
    }

    public static Help getHelp(String helpName, boolean forPerson) {
        for (int i=0; i<helptypes.size(); i++) {
            if (helpName.equals(helptypes.get(i).getHelptype()))
                if(forPerson == helptypes.get(i).getHelpForPerson())
                    return helptypes.get(i);
        }
        return null;
    }

    public static int getHelpIndex(String helpName, boolean forPerson) {
        for (int i=0; i<helptypes.size(); i++) {
            if (helpName.equals(helptypes.get(i).getHelptype()))
                if(forPerson == helptypes.get(i).getHelpForPerson())
                    return i;
        }
        return -1;
    }

}
