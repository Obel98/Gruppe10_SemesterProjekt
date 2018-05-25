package Business;

/**
 * Administrator class Used for Administrator information.
 *
 * @author Gruppe10
 */
public class Administrator extends User implements Aquaintance.IAdmin
{

    public Administrator(int CPR, String firstname, String lastname, String address, int phoneNumber, String email, int cpr, String birthday, String username)
    {
        super(CPR, firstname, lastname, address, phoneNumber, email, cpr, birthday, username);
    }

    /**
     * Constructor for Administrator
     *
     * @param name Sets the name of the Administrator.
     * @param id Sets the id of the Administrator.
     */
    @Override
    public void createUser(int CPR, String firstname, String lastname, String address, int phoneNumber, String email, int cpr, String birthday, String usernam, String type, String password)
    {
        
    }

    public void setPass()
    {

    }

    public void setUsername()
    {

    }

    public void setUserRights()
    {

    }
}
