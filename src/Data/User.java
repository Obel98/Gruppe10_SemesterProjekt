package Data;

public class User implements Aquaintance.IUser
{

    private String firstName;
    private String lastName;
    private String address;
    private String email;
    private String username;
    private int CPR;
    private int phoneNumber;
    private String birthday;

    public User(String firstName, String lastName, String address, String email, String type, String username, int CPR, int phoneNumber, String birthday)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.email = email;
        this.username = username;
        this.CPR = CPR;
        this.phoneNumber = phoneNumber;
        this.birthday = birthday;
    }

    @Override
    public String getFirstname()
    {
        return firstName;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    @Override
    public String getLastname()
    {
        return lastName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    @Override
    public String getAddress()
    {
        return address;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }

    @Override
    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    @Override
    public String getUsername()
    {
        return username;
    }

    public void setUsername(String username)
    {
        this.username = username;
    }

    @Override
    public int getCPR()
    {
        return CPR;
    }

    public void setCPR(int CPR)
    {
        this.CPR = CPR;
    }

    @Override
    public int getPhoneNumber()
    {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber)
    {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String getBirthday()
    {
        return birthday;
    }

    public void setBirthday(String birthday)
    {
        this.birthday = birthday;
    }

}
