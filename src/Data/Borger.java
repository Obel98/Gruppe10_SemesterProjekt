package Data;

/**
 * Borger class Used for Borger information. implements IBorger
 *
 * @author Gruppe10
 */
public class Borger implements Aquaintance.IBorger
{

    //Attributes for the Borger class.
    private String firstname;
    private String lastname;
    private String address;
    private int phoneNumber;
    private String email;
    private String password;
    private int CPR;
    private String birthday;
    private String username;

    /**
     * Constructor for Borger
     *
     * @param CPR Sets the CPR of the Borger.
     * @param firstname
     * @param name Sets the name of the Borger.
     * @param lastName Sets the lastName of the Borger.
     * @param address Sets the address of the Borger.
     * @param phoneNumber Sets the phoneNumber of the Borger.
     * @param cpr
     * @param birthday
     * @param email Sets the email of the Borger.
     * @param username
     */
    public Borger(int CPR, String firstname, String lastName, String address, int phoneNumber, String email, int cpr, String birthday, String username)
    {
        this.CPR = CPR;
        this.firstname = firstname;
        this.lastname = lastName;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.CPR = cpr;
        this.birthday = birthday;
        this.username = username;
    }

    /**
     * Getter Method for CPR Returns the value of CPR.
     *
     * @return int
     */
    @Override
    public int getCPR()
    {
        return CPR;
    }

    /**
     * Setter Method for CPR Sets the CPR attribute to the given value.
     *
     * @param CPR to be set as CPR.
     */
    public void setCPR(int CPR)
    {
        this.CPR = CPR;
    }

    /**
     * Getter Method for firstName Returns the value of firstName.
     *
     * @return String
     */
    @Override
    public String getFirstname()
    {
        return firstname;
    }

    /**
     * Setter Method for firstName Sets the firstName attribute to the given
     * value.
     *
     * @param name to be set as firstName.
     */
    public void setFirstname(String name)
    {
        this.firstname = name;
    }

    /**
     * Getter Method for lastName Returns the value of lastName.
     *
     * @return String
     */
    @Override
    public String getLastname()
    {
        return lastname;
    }

    /**
     * Setter Method for lastName Sets the lastName attribute to the given
     * value.
     *
     * @param lastName to be set as lastName.
     */
    public void setLastname(String lastName)
    {
        this.lastname = lastName;
    }

    /**
     * Getter Method for address Returns the value of address.
     *
     * @return String
     */
    @Override
    public String getAddress()
    {
        return address;
    }

    /**
     * Setter Method for address Sets the address attribute to the given value.
     *
     * @param address to be set as address.
     */
    public void setAddress(String address)
    {
        this.address = address;
    }

    /**
     * Getter Method for phoneNumber Returns the value of phoneNumber.
     *
     * @return int
     */
    @Override
    public int getPhoneNumber()
    {
        return phoneNumber;
    }

    /**
     * Setter Method for phoneNumber Sets the phoneNumber attribute to the given
     * value.
     *
     * @param phoneNumber to be set as phoneNumber.
     */
    public void setPhoneNumber(int phoneNumber)
    {
        this.phoneNumber = phoneNumber;
    }

    /**
     * Getter Method for email Returns the value of email.
     *
     * @return String
     */
    @Override
    public String getEmail()
    {
        return email;
    }

    /**
     * Setter Method for email Sets the email attribute to the given value.
     *
     * @param email to be set as email.
     */
    public void setEmail(String email)
    {
        this.email = email;
    }

    /**
     * Getter Method for password Returns the value of password.
     *
     * @return String
     */
    @Override
    public String getPassword()
    {
        return password;
    }

    /**
     * Getter Method for birthday Returns the value of birthday.
     *
     * @return String
     */
    @Override
    public String getBirthday()
    {
        return birthday;
    }

    /**
     * Setter Method for birthday Sets the birthday attribute to the given
     * value.
     *
     * @param birthday to be set as birthday.
     */
    public void setBirthday(String birthday)
    {
        this.birthday = birthday;
    }

    /**
     * Getter Method for username Returns the value of username.
     *
     * @return String
     */
    @Override
    public String getUsername()
    {
        return username;
    }

    /**
     * Setter Method for username Sets the username attribute to the given
     * value.
     *
     * @param username to be set as username.
     */
    public void setUsername(String username)
    {
        this.username = username;
    }

    @Override
    public void setPassword(String newPassword, String oldPassword)
    {
        Database db = new Database();
        db.sendQuery("Update users set password = '" + newPassword + "' where password = '" + oldPassword + "'");
    }
}
