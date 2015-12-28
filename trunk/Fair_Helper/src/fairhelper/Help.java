
package fairhelper;

import java.io.Serializable;


public class Help implements Serializable
{
    private String helptype;
    private int point;
    private boolean person;//sadece person içinse true olcak
    public Help(String help)
    {
	  helptype=help;
    }
    public Help(String help,int number,boolean person)
    {
	  helptype=help;
	  point=number;
	  this.person=person;
    }
    public String getHelptype()
    {
	  return helptype;
    }


    public int getPoint() {
	  return point;
    }

    public void setPoint(int point) {
	  this.point = point;
    }
    
    public boolean getHelpForPerson() {
        return person;
    }
}
