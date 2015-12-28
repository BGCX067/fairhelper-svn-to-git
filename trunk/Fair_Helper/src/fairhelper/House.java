
package fairhelper;
import java.io.Serializable;
import java.util.*;


public class House implements Serializable {
    private String surname;
    private int id;
    private ArrayList<Person> persons=new ArrayList<Person>();
    private ArrayList<HelpData> helps=new ArrayList<HelpData>();
    private int helpPoint;

    public void setHelpPoint(int helpPoint) {
	  this.helpPoint = helpPoint;
    }
    public static String[] findHelp(House object)
    {
	  ArrayList<HelpData> array=object.getHelps();
	  ArrayList<String> helpNames=new ArrayList<String>();
	  for(int i=0;i<array.size();i++)
	  {
		helpNames.add(i,array.get(i).getHelp().getHelptype());
	  }
	  String[] a=new String[helpNames.size()];
	  for(int j=0;j<helpNames.size();j++)
	  {
		a[j]=helpNames.get(j);
	  }
	  return a;
    }

    public House(String name)
    {
	  surname=name;
    }
    public String getSurname()
    {
	  return surname;
    }

    public int getId()
    {
	  return id;
    }

    public ArrayList<HelpData> getHelps() {
	  return helps;
    }
    
    public ArrayList<Person> getPersons() {
        return persons;
    }

    public void setPersons(ArrayList<Person> persons) {
        this.persons = persons;
    }

    public void setSurname(String surname)
    {
	  this.surname = surname;
    }

    public void setId(int id)
    {
	  this.id = id;
    }

    public int getHelpPoint() {
        return helpPoint;
    }
    /**
     * alınan helpData nesnesini helps arrayine atar
     * @param obj
     */
    public void sendHouseHelp(HelpData obj)
    {
	  helps.add(obj);

    }
    /**
     * alınan helpData nesnesini helps arrayinden siler
     * @param obj
     */
    public void delHouseHelp(HelpData obj)
    {
	  for(int i=0;i<helps.size();i++)
	  {
		if(helps.get(i).getHelp().getHelptype().equals(obj.getHelp().getHelptype()))
		{
		    helps.remove(i);
		}
	  }
    }

}
