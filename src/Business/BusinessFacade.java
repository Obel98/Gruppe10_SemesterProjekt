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
     * Setter Method for Case
     * Sets a Case to attribute sag.
     * @param ID Sets a Case based on the ID given, to the attribute sag.
     */
    @Override
    public void setCase(int ID) 
    {
        ICase temp = data.getCase(ID);
        sag = new Case(temp);
    }

    /**
     * Getter Method for ID 
     * Returns the value of ID from a Case.
     * @return int
     */
    @Override
    public int getID() 
    {
        return sag.getID();
    }

    /**
     * Getter Method for firstname 
     * Returns the value of firstname from a Case.
     * @return String
     */
    @Override
    public String getFirstName() 
    {
        return sag.getFirstName();
    }

    /**
     * Getter Method for lastname 
     * Returns the value of lastname from a Case.
     * @return String
     */
    @Override
    public String getLastName() 
    {
        return sag.getLastName();
    }

    /**
     * Getter Method for phonenumber 
     * Returns the value of phonenumber from a Case.
     * @return int
     */
    @Override
    public int getPhoneNumber() 
    {
        return sag.getPhoneNumber();
    }

    /**
     * Getter Method for email 
     * Returns the value of email from a Case.
     * @return String
     */
    @Override
    public String getEmail() 
    {
        return sag.getEmail();
    }

    /**
     * Getter Method for birthday 
     * Returns the value of birthday from a Case.
     * @return String
     */
    @Override
    public String getBirthday() 
    {
        return sag.getBirthday();
    }

    /**
     * Getter Method for CPR
     * Returns the value of CPR from a Case.
     * @return int
     */
    @Override
    public int getCPR() 
    {
        return sag.getCPR();
    }

    /**
     * Getter Method for address 
     * Returns the value of address from a Case.
     * @return String
     */
    @Override
    public String getAddress() 
    {
        return sag.getAddress();
    }

    /**
     * Getter Method for journal 
     * Returns the value of journal from a Case.
     * @return String
     */
    @Override
    public String getJournal() 
    {
        return sag.getJournal();
    }

    /**
     * Getter Method for status 
     * Returns the value of status from a Case.
     * @return String
     */
    @Override
    public String getStatus() 
    {
        return sag.getStatus();
    }

    /**
     * Getter Method for username 
     * Returns the value of username from a Case.
     * @return String
     */
    @Override
    public String getUsername() 
    {
        return sag.getUserName();
    }

    /**
     * Validate Method for username 
     * Returns: true if the username is present in the database / false if the username is not present in the database.
     * @param username to be checked if present in the database.
     * @return boolean
     */
    @Override
    public boolean validateUsername(String username) 
    {
        return data.validateUserName(username);
    }

    /**
     * Validate Method for password 
     * Returns: true if the password is associated with the username in the database / false if the password is not associated with the username in the database.
     * @param username to be checked in the database.
     * @param password to be checked if associated with username in the database.
     * @return boolean
     */
    @Override
    public boolean validatePassword(String username, String password) 
    {
        return data.validatePassword(username, password);
    }

    /**
     * Getter Method for userType 
     * Returns the value of type from a User in the database.
     * @param username to be checked in the database.
     * @param password to be checked in the database.
     * @return String
     */
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

    @Override
    public String showPassword(String username)
    {
        return data.showPassword(username);
    }

}
