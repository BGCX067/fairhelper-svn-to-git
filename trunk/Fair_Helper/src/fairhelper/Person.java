
package fairhelper;

import java.io.Serializable;
import java.util.ArrayList;



public class Person implements Serializable
{
    private String name;
    private String surname;
    private String tc;
    private String role;
    private ArrayList<HelpData> helps=new ArrayList<HelpData>();
    private int helpPoint;

    public Person(String name, String surname,String rol, String tc, int helpPoint) {
	  this.name = name;
	  this.surname = surname;
	  this.tc = tc;
	  role=rol;
	  this.helpPoint = helpPoint;
    }

    public Person() {
    }

    public ArrayList<HelpData> getHelps() {
	  return helps;
    }
    public static String[] findHelp(Person object)
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

    public void setName(String name)
    {
	  this.name = name;
    }

    public void setSurname(String surname)
    {
	  this.surname = surname;
    }

    public void setTc(String tc)
    {
	  this.tc = tc;
    }

    public String getName()
    {
	  return name;
    }

    public String getSurname()
    {
	  return surname;
    }

    public String getTc()
    {
	  return tc;
    }

    public int getHelpPoint() {
        return helpPoint;
    }
    /**
     * alınan helpData nesnesini helps arrayine ekler
     * @param obj
     */
    public void sendHelp(HelpData obj)
    {
	  helps.add(obj);
    }
    /**
     * alınan helpData nesnesini helps arrayinden siler
     * @param obj
     */
    public void delHelp(HelpData obj)
    {
	  for(int i=0;i<helps.size();i++)
	  {
		if(helps.get(i).getHelp().getHelptype().equals(obj.getHelp().getHelptype()))
		    helps.remove(i);
	  }
    }

}
