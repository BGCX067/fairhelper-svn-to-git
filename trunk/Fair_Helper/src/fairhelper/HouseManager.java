
package fairhelper;

import fairhelper.language.Language;
import java.util.ArrayList;
import fairhelper.readwrite.*;
import java.io.File;
import javax.swing.JOptionPane;



public class HouseManager
{

    private static ArrayList<House> houseList;

    private static ArrayList<House> removedHouseList;

    private static File housesFile;


    /**
     * Dosyadan okunan hane verilerini listeye yukler.
     */
    public static void loadHouseList()
    {
        housesFile = new File(Settings.getHousesFileName());

        if(housesFile.exists())
            houseList = (ArrayList<House>)ArrayReader.load(Settings.getHousesFileName());
        else
            houseList = new ArrayList<House>();

    }

    /**
     * Hane listesini dosyaya yazar.
     */
    public static void saveHouseList() {
        ArrayWriter.writeArray(houseList, Settings.getHousesFileName());
    }

    public static void addHouse(String surname)
    {
	  addHouse(new House(surname));
    }

    public static void addHouse(House newHouse) {
        if (houseList.isEmpty())
            newHouse.setId(0);
        else
            newHouse.setId(houseList.get(houseList.size()-1).getId() + 1);
            houseList.add(newHouse);
            saveHouseList();
    }

    public static int findHouse(int number)
    {
	  for(int i=0;i<houseList.size();i++)
	  {
		if(houseList.get(i).getId()==number)
		    return i;
	  }
	  return -1;
    }
    public static House findHouse(String name)
    {
	  for(int i=0;i<houseList.size();i++)
	  {
		if(houseList.get(i).getSurname().equals(name))
		    return houseList.get(i);
	  }
	  return null;
    }
    /**
     * verilen yardımın kişi veya hanede kayıtlı olup olmadığına bakıyor
     * @param help
     * @return
     */
    public static boolean findHelp(Help help)
    {
	  boolean result=false;
	  if(help.getHelpForPerson()==true)//kişiyse
	  {
		for(int i=0;i<houseList.size();i++)
		{
		    for(int j=0;j<houseList.get(i).getPersons().size();j++)
		    {
			  for(int q=0;q<houseList.get(i).getPersons().get(j).getHelps().size();q++)
			  {
				if(houseList.get(i).getPersons().get(j).getHelps().get(q).getHelp().getHelptype().equals(help.getHelptype()))
				{
				    result=true;
				    return result;
				}

			  }
		    }
		}
	  }
	  else if(help.getHelpForPerson()==false)//haneyse
	  {
		for(int i=0;i<houseList.size();i++)
		{
		    for(int j=0;j<houseList.get(i).getHelps().size();j++)
		    {
			  if(houseList.get(i).getHelps().get(j).getHelp().getHelptype().equals(help.getHelptype()))
			  {
				result=true;
				return result;
			  }
		    }
		}
	  }
	  return result;
    }
    public static House getHouse(int index) {
        return houseList.get(index);
    }

    public static void removeHouse(int number)
    {
	  int index=findHouse(number);
	  if(index!=-1) {
		houseList.remove(index);
                saveHouseList();
          }
	  else
		System.out.println("hane bulunamadi.");
    }
    public static void addHelp(HelpData helpData,Object nesne)
    {
	  String text=nesne.getClass().getName();
	  String texty=text.substring(text.lastIndexOf(".")+1);
	  if((texty.equals("House"))&&(helpData.getHelp().getHelpForPerson()==false))
	  {
		if(helpData.getHelp().getHelpForPerson()!=false)
		    System.out.println("yardim haneye yapılamaz");
		else
		{
		    House object=(House)nesne;
		    if(helpData.getHelp().getPoint()>=object.getHelpPoint())
		    {
			  object.sendHouseHelp(helpData);
			  update((House)nesne,object);
		    }
		    else
			  JOptionPane.showMessageDialog(null, Language.getText("notEnoughHelpPointMessage"));
		}
	  }
	  else if(texty.equals("Person")&&(helpData.getHelp().getHelpForPerson()==true))
	  {
		if(helpData.getHelp().getHelpForPerson()!=true)
		    System.out.println("yardim kişiye yapılamaz");
		else
		{
		    Person object=(Person)nesne;
		    if(helpData.getHelp().getPoint()>=object.getHelpPoint())
		    {
			  object.sendHelp(helpData);
			  update((Person)nesne,object);
		    }
		    else
			  JOptionPane.showMessageDialog(null, Language.getText("notEnoughHelpPointMessage"));
		}
	  }
	  
    }
    public static void deleteHelp(HelpData helpData,Object nesne)
    {
	  String text=nesne.getClass().getName();
	  String texty=text.substring(text.lastIndexOf(".")+1);
	  if(texty.equals("House"))
	  {
		House obj=(House)nesne;
		obj.delHouseHelp(helpData);
		update((House)nesne,obj);
	  }
	  else if(texty.equals("Person"))
	  {
		Person obj=(Person)nesne;
		obj.delHelp(helpData);
		update((Person)nesne, obj);
	  }
	  
    }
    
    /**Soyadı gönderilen hanenin indexini geriye döner.
     * @param surname Soyadı.
     * @return Hane houseList icinde bulunursa bulunan hanenin indexi, bulunamazsa -1
     */
    private static int getHouseIndex(String surname) {
        for(int i=0; i<houseList.size(); i++)
	{
		if( houseList.get(i).getSurname().equals(surname) )
		{
                    return i;
		}
	}
        return -1;

    }

    public static House[] getHouseArray() {

        House[] array = new House[houseList.size()];

        houseList.toArray(array);

        return array;

    }

    public static String[] getHouseNameArray() {
        String[] houseNameArray = new String[houseList.size()];
        for (int i=0; i<houseList.size(); i++) {
            houseNameArray[i] = houseList.get(i).getSurname();
        }
        return houseNameArray;
    }

    /** Haneye kişi ekler.
     * @param house Kişinin ekleneceği hane objesi.
     * @param person Eklenecek kişi objesi.
     */
    public static void addPerson(House house, Person person) {
        house.getPersons().add(person);
        saveHouseList();
    }

    
    /** Haneye kişi ekler.
     * @param house Kişinin ekleneceği hane objesi.
     * @param person Eklenecek kişi objesi.
     */
    public static void addPerson(int houseID, Person person) {
        houseList.get(findHouse(houseID)).getPersons().add(person);
        saveHouseList();
    }

    /** Kişiyi siler.
     * @param person Kişi objesi.
     */
    public static void removePerson(Person person) {
        getPersonHouse(person).getPersons().remove(person);
        saveHouseList();
    }

    /** Kişiyi siler.
     * @param person Kişi objesi.
     */
    public static void removePerson(String tcNumber) {
        removePerson(getPerson(tcNumber));
    }

    /** @return Bütün kayıtlı kişi objelerinin arrayi.
     */
    public static Person[] getPersonArray() {
        ArrayList<Person> personsList = new ArrayList<Person>();
        for (int i=0; i<houseList.size(); i++) {
            for (int k=0; k<houseList.get(i).getPersons().size(); k++) {
                personsList.add(houseList.get(i).getPersons().get(k));
            }
        }
        return (Person[]) personsList.toArray();
    }

    /** Gönderilen kişinin bulunduğu haneyi geriye döner.
     * @param person Kişi objesi.
     * @return Gönderilen kişi objesinin yer aldığı hane.
     */
    public static House getPersonHouse(Person person) {
        for (int i=0; i<houseList.size(); i++) {
            for (int k=0; k<houseList.get(i).getPersons().size(); k++) {
                if (houseList.get(i).getPersons().get(k).getTc().equals(person.getTc()))
                    return houseList.get(i);
            }
        }
        return null;
    }

    /** Gönderilen kişinin bulunduğu haneyi geriye döner.
     * @param person Kişi objesi.
     * @return Gönderilen kişi objesinin yer aldığı hane.
     */
    public static House getPersonHouse(String tcNumber) {
        for (int i=0; i<houseList.size(); i++) {
            for (int k=0; k<houseList.get(i).getPersons().size(); k++) {
                if (houseList.get(i).getPersons().get(k).getTc().equals(tcNumber))
                    return houseList.get(i);
            }
        }
        return null;
    }

    /** TC Kimlik Numarasını aldığı kişi objesini geriye döner.
     * @param idNumber TC Kimlik Numarası.
     * @return TC Kimlik Numarası gönderilen kişi objesi.
     */
    public static Person getPerson(String tcNumber) {
        for (int i=0; i<houseList.size(); i++) {
            for (int k=0; k<houseList.get(i).getPersons().size(); k++) {
                if (houseList.get(i).getPersons().get(k).getTc().equals(tcNumber))
                    return houseList.get(i).getPersons().get(k);
            }
        }
        return null;
    }

    /** Kişi TC Kimlik Numarasının başka bir hane ile aynı olup olmadığını kontrol eder.
     * @param idNumber TC Kimlik Numarası.
     * @return TC Kimlik Numarası başka bir hane ile aynı ise false. Değilse true.
     */
    public static boolean personTcUnique(String tcNumber) {
        if (getPerson(tcNumber) == null)
            return true;
        return false;
    }
    public static void update(Object old,Object notold)
    {
	  String text=old.getClass().getName();
	  String texty=text.substring(text.lastIndexOf(".")+1);
	  if(texty.equals("House"))
	  {
		House obj=(House)old;
		House nesne=(House)notold;
		for(int i=0;i<houseList.size();i++)
		{
		    if((houseList.get(i).getSurname().equals(obj.getSurname()))&&(houseList.get(i).getId()==obj.getId()))
		    {
                        houseList.set(i, nesne);
			saveHouseList();
		    }
		}
	  }
	  else if(texty.equals("Person"))
	  {
		Person obj=(Person)old;
		Person nesne=(Person)notold;
		House hane=HouseManager.getPersonHouse(obj);
		removePerson(obj);
		addPerson(hane, nesne);//Objenin hanesi olmadığı için oluyo

	  }
    }
    /**
     * verilen help objesinin eklebildiği haneleri array olarak döndürür
     * @param help
     * @return
     */
    public static House[] findHouseHelpable(Help help)
    {
	  House[] houses;
	  ArrayList<House> helpAble=new ArrayList<House>();
	  int point=help.getPoint();
	  int a=0;
	  for(int i=0;i<houseList.size();i++)
	  {
		if(houseList.get(i).getHelpPoint()<=point)
		{
		    helpAble.add(a, houseList.get(i));
		    a++;
		}
	  }
	  if(helpAble.isEmpty())
		return null;
	  else
		houses=(House[])helpAble.toArray();

	  return houses;
    }
    public static Person[] findPersonHelpable(Help help)
    {
	  Person[] persons;
	  ArrayList<Person> helpAble=new ArrayList<Person>();
	  int point=help.getPoint();
	  int a=0;
	  for(int i=0;i<houseList.size();i++)
	  {
		for(int j=0;j<houseList.get(i).getPersons().size();j++)
		{
		    if(houseList.get(i).getPersons().get(j).getHelpPoint()<=point)
		    {
			  helpAble.add(a,houseList.get(i).getPersons().get(j));
			  a++;
		    }
		}
	  }
	  if(helpAble.isEmpty())
		return null;
	  else
		persons=(Person[]) helpAble.toArray();
	  return persons;
    }
    

}
