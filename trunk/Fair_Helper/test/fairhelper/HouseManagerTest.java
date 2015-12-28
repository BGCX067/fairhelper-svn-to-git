
package fairhelper;

import java.util.ArrayList;
import fairhelper.readwrite.*;
import java.io.File;

/**
 *
 * @author Ethem Cem Ozkan
 * Email cemozkan89@hotmail.com
 * No 07110604
 */
public class HouseManagerTest
{

    private static ArrayList<House> houseList = ArrayReader.load(Settings.getHouseFileName());

    private static File housesFile;


    /**
     * Dosyadan okunan hane verilerini listeye yukler.
     */
    public static void loadHouseList()
    {
        housesFile = new File(Settings.getHousesFileName());

        if(housesFile.exists())
            houseList = ArrayReader.load(Settings.getHousesFileName());
        else
            houseList = new ArrayList<House>();

    }

    /**
     * Hane listesini dosyaya yazar.
     */
    public static void saveHouseList() {
        ArrayWriter.writeArray(houseList, Settings.getUsersFileName());
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

    private static int findHouse(int number)
    {
	  for(int i=0;i<houseList.size();i++)
	  {
		if(houseList.get(i).getId()==number)
		    return i;
	  }
	  return -1;
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
	  if(nesne.getClass().toString().equals("House"))
	  {
		House object=(House)nesne;
		object.sendHouseHelp(helpData);
	  }
	  else if(nesne.getClass().toString().equals("Person"))
	  {
		Person object=(Person)nesne;
		object.sendHelp(helpData);
	  }
    }
    public static Object deleteHelp(HelpData helpData,Object nesne)
    {
	  if(nesne.getClass().toString().equals("House"))
	  {
		House obj=(House)nesne;
		obj.delHouseHelp(helpData);
		return (Object)obj;
	  }
	  else if(nesne.getClass().toString().equals("Person"))
	  {
		Person obj=(Person)nesne;
		obj.delHelp(helpData);
		return (Object)obj;
	  }
	  return null;
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

    /**
     * Metod deniz ve merveye ait.
     * Metod kişilere veya hanelere yapılacak yardımı HelpData olarak alır.
     * HelpData içerisinde yapılacak yardım türünü bulundurur.
     * Bu yardım türü HelpData içerisindeki getHelp() metodu ile çağırılabilir.
     * Yani şu şekilde: help.getHelp()
     * Bu metod ile geri dönülecek yardım türü Help classının bir nesnesidir.
     * Help classı içerisinde yardım türünün kişiye mi haneye mi olduğunu gönderen
     * getHelpForPerson() metodu vardır. Boolean değer döner ve eğer true ise kişiye,
     * false ise haneyedir.
     *
     * Bu metodun yapacağı işe gelince. Gönderilen HelpData nesnesi eğer kişiye yardım türü
     * içeriyorsa kişilere, haneye yardım türü içeriyorsa hanelere yardım edecek.
     * Mesela hanelere yardım edilecekse, gönderilen yardımın muhtaç olan hanelere yapılması
     * sağlanacak. Yani tüm hanelere tek tek bakılacak ve eğer hanenin muhtaçlık puanı yardım türünün
     * puanından düşükse yardım yapılacaktır. Kişilere yardım için de aynı mantık.
     *
     * Gerekebilecek metodlar:
     * addHelp(HelpData yapılacak yardım, Object yardım yapılacak kişi ya da hane objesi);
     * help.getHelp().getHelpForPerson();
     * help.getHelp().getPoint();
     * hane objesi.getHelpPoint();
     * kişi objesi.getHelpPoint();
     *
     * @param help Hanelere veya kişilere edilecek yardım.
     */
    public static void help(HelpData help) {
        
    }

}
