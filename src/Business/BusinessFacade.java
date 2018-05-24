package Business;

import Aquaintance.ICase;
import Aquaintance.IData;

/**
 * BusinessFacade class Used for communication with the business layer.
 * implements IBusiness
 *
 * @author Gruppe10
 */
public class BusinessFacade implements Aquaintance.IBusiness
{

    //Attributes for the BusinessFacade class.
    private IData data;
    private Case sag;

    /**
     * Inject Method for Data
     *
     * @param data Sets the dataLayer to use.
     */
    @Override
    public void injectData(IData data)
    {
        this.data = data;
    }

    /**
     * Getter Method for CPR Returns the value of CPR.
     *
     * @return int
     */
    @Override
    public void setCase(int ID)
    {
        ICase temp = data.getCase(ID);
        sag = new Case(temp);
    }

    @Override
    public int getID()
    {
        return sag.getID();
    }

    @Override
    public String getFirstName()
    {
        return sag.getFirstName();
    }

    @Override
    public String getLastName()
    {
        return sag.getLastName();
    }

    @Override
    public int getPhoneNumber()
    {
        return sag.getPhoneNumber();
    }

    @Override
    public String getEmail()
    {
        return sag.getEmail();
    }

    @Override
    public String getBirthday()
    {
        return sag.getBirthday();
    }

    @Override
    public int getCPR()
    {
        return sag.getCPR();
    }

    @Override
    public String getAddress()
    {
        return sag.getAddress();
    }

    @Override
    public String getJournal()
    {
        return sag.getJournal();
    }

    @Override
    public String getStatus()
    {
        return sag.getStatus();
    }

    @Override
    public String getUsername()
    {
        return sag.getUserName();
    }

    @Override
    public boolean validateUsername(String username)
    {
        return data.validateUserName(username);
    }

    @Override
    public boolean validatePassword(String username, String password)
    {
        return data.validatePassword(username, password);
    }

    @Override
    public String getUserType(String username, String password)
    {
        return data.getUserType(username, password);
    }

    @Override
    public void setPassword(String oldPassword, String newPassword)
    {
        data.setPassword(oldPassword, newPassword);
    }

}
