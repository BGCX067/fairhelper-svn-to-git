
package fairhelper;

import java.io.*;


public class User implements Serializable
{
    private String userName;
    private String password;
    private String firstName;
    private String surName;
    private int id;
    private int privilegesId;

    public User(String userName, String password, String firstName, String surName, int userPrivilegesId)
    {
	  this.userName = userName;
	  this.password = password;
	  this.firstName = firstName;
	  this.surName = surName;
          this.privilegesId = userPrivilegesId;
    }

    public User(String userName, String password, String firstName, String surName, String userPrivilegesName)
    {
	  this.userName = userName;
	  this.password = password;
	  this.firstName = firstName;
	  this.surName = surName;
          this.privilegesId = UserManager.getPrivileges(userPrivilegesName).getId();
    }

    public String getUserName()
    {
	  return userName;
    }

    public String getPassword()
    {
	  return password;
    }

    public String getFirstName()
    {
	  return firstName;
    }

    public String getSurname()
    {
	  return surName;
    }

    public int getId()
    {
	  return id;
    }

    public int getPrivilegesId() {
        return privilegesId;
    }

    public void setUserName(String username)
    {
	  this.userName = username;
    }

    public void setPassword(String password)
    {
	  this.password = password;
    }

    public void setFirstName(String name)
    {
	  this.firstName = name;
    }

    public void setSurName(String surname)
    {
	  this.surName = surname;
    }

    public void setId(int id)
    {
	  this.id = id;
    }

    public void setPrivilegesId(int privilegesId) {
        this.privilegesId = privilegesId;
    }

}
