package gruppe10_semesterprojekt;

public class Sagsbehandler {

    
    private String name;
    private String id;
    private String password;
    private String phoneNumber;
    private String email;

    public Sagsbehandler(String name, String phoneNumber, String email)
    {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.id = generateId(name);
        this.password = generatePassword();
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }
    
    public String getId()
    {
        return id;
    }
    
    private String generateId(String name)
    {
        String generatedId = name;
        return generatedId;
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }
    
    private String generatePassword()
    {
        String generatedPassword = "superSecretPassword";
        return generatedPassword;
    }

    public String getPhoneNumber()
    {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber)
    {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

}
