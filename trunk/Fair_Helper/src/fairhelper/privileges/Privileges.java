/**
 * Kullanici yetkilerinden sorumlu class.
 */

package fairhelper.privileges;

import java.io.Serializable;

/**
 *
 * @author Mustafa Cavus
 */
public class Privileges implements Serializable {

    private String privilegeName;
    private int id;
    private int[] manageUserPriviledges;
    private boolean manageHouse;
    private boolean deleteHouse;
    private boolean manageHelp;

    public Privileges(String privilegeName)
    {
        this.privilegeName = privilegeName;

        manageUserPriviledges = null;
        manageHouse = false;
        deleteHouse = false;
        manageHelp = false;

    }

    /**
     * @return yetki adi.
     */
    public String getPrivilegeName() {
	  return privilegeName;
    }

    /**
     * @return Yetki id
     */
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDeleteHouse(boolean deleteHouse) {
        this.deleteHouse = deleteHouse;
    }

    public void setManageHelp(boolean manageHelp) {
        this.manageHelp = manageHelp;
    }

    public void setManageHouse(boolean manageHouse) {
        this.manageHouse = manageHouse;
    }

    public boolean getDeleteHouse() {
        return deleteHouse;
    }

    public boolean getManageHelp() {
        return manageHelp;
    }

    public boolean getManageHouse() {
        return manageHouse;
    }

    /**
     * Yonetilebilecek kullanici turlerlini tutan manageUserPrivileges icin set
     * metodu.
     * @param priviledges Obje olarak gonderilern yetkiler.
     */
    public void setManageUserPriviledges (Privileges[] priviledges) {
        manageUserPriviledges = new int[priviledges.length];
        for (int i=0; i<priviledges.length; i++) {
            manageUserPriviledges[i] = priviledges[i].getId();
        }
    }

    /**
     * Yonetilebilecek kullanici turlerlini tutan manageUserPrivileges icin set
     * metodu.
     * @param priviledges int olarak gonderilern yetki IDleri.
     */
    public void setManageUserPriviledges (int[] priviledgeIds) {
        manageUserPriviledges = new int[priviledgeIds.length];
        for (int i=0; i<priviledgeIds.length; i++) {
            manageUserPriviledges[i] = priviledgeIds[i];
        }
    }

    /**
     * Yonetilebilecek kullanici turlerlini tutan manageUserPrivileges'e yeni yetki
     * ekler.
     * @param privilege Obje olarak gonderilen yetki.
     */
    public void addManageUserPriveledge (Privileges privilege) {
        int[] newManageUserPrivileges;
        int i = 0;
        if (manageUserPriviledges == null)
            newManageUserPrivileges = new int[1];
        else {
            newManageUserPrivileges = new int[manageUserPriviledges.length + 1];
            for (i=0; i<manageUserPriviledges.length; i++)
                newManageUserPrivileges[i] = manageUserPriviledges[i];
        }
        newManageUserPrivileges[i] = privilege.getId();
        setManageUserPriviledges(newManageUserPrivileges);
    }

    /**
     * Yonetilebilecek kullanici turlerlini tutan manageUserPrivileges'e yeni yetki
     * ekler.
     * @param privilege int olarak gonderilen yetki ID.
     */
    public void addManageUserPriveledge (int privilegeId) {
        int[] newManegeUserPrivileges;
        int i = 0;
        if (manageUserPriviledges == null)
            newManegeUserPrivileges = new int[1];
        else
            newManegeUserPrivileges = new int[manageUserPriviledges.length + 1];
        for (i=0; i<manageUserPriviledges.length; i++)
            newManegeUserPrivileges[i] = manageUserPriviledges[i];
        newManegeUserPrivileges[i] = privilegeId;
        setManageUserPriviledges(newManegeUserPrivileges);

    }

    /**
     * Yetki adi gonderilen kullanici turunu yonetme hakkini doner.
     * @param priviledgeName Yetki adi.
     * @return Yonetme hakki. (guncelleme)
     */
    public boolean getManageUserPriviledge (int priviledgeId) {
        if (manageUserPriviledges == null)
            return false;
        for (int i=0; i<manageUserPriviledges.length; i++)
            if (priviledgeId == manageUserPriviledges[i])
                return true;
        return false;
    }

    /**
     * Yetkisi gonderilen kullanici turunu yonetme hakkini doner.
     * @param priviledgeName Yetki.
     * @return Yonetme hakki. (guncelleme)
     */
    public boolean getManageUserPriviledge (Privileges priviledge) {
        if (manageUserPriviledges == null)
            return false;
        for (int i=0; i<manageUserPriviledges.length; i++)
            if (priviledge.getId() == manageUserPriviledges[i])
                return true;
        return false;
    }

    public int[] getManageUserPriviledges() {
        return manageUserPriviledges;
    }
    

}
