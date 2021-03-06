package Business;

import Aquaintance.ICase;

/**
 *
 * @author ProjektGruppe 10.
 */
public class Bussiness_Case
{

    private int ID;
    private String firstName;
    private String lastName;
    private int phoneNumber;
    private String email;
    private String birthday;
    private int CPR;
    private String address;
    private String journal;
    private String status;
    private String date;
    private String userName;

    public Bussiness_Case(ICase ic)
    {
        this.ID = ic.getID();
        this.journal = ic.getJournal();
        this.status = "Under behandling";
        this.date = ic.getDate();
        this.CPR = ic.getCPR();
        this.address = ic.getAddress();
        this.birthday = ic.getBirthday();
        this.email = ic.getEmail();
        this.firstName = ic.getFirstName();
        this.lastName = ic.getLastName();
        this.phoneNumber = ic.getPhoneNumber();
        this.userName = ic.getUserName();
    }

    public String getDate()
    {
        return date;
    }

    public void setDate(String date)
    {
        this.date = date;
    }

    public void setID(int ID)
    {
        this.ID = ID;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public void setPhoneNumber(int phoneNumber)
    {
        this.phoneNumber = phoneNumber;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public void setBirthday(String birthday)
    {
        this.birthday = birthday;
    }

    public void setCPR(int CPR)
    {
        this.CPR = CPR;
    }

    public void setAddresse(String address)
    {
        this.address = address;
    }

    public void setComment(String comment)
    {
        this.journal = comment;
    }

    public void setStatus(String status)
    {
        this.status = status;
    }

    public int getID()
    {
        return ID;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public int getPhoneNumber()
    {
        return phoneNumber;
    }

    public String getEmail()
    {
        return email;
    }

    public String getBirthday()
    {
        return birthday;
    }

    public int getCPR()
    {
        return CPR;
    }

    public String getAddress()
    {
        return address;
    }

    public String getJournal()
    {
        return journal;
    }

    public String getStatus()
    {
        return status;
    }

    public String getUserName()
    {
        return userName;
    }
}
