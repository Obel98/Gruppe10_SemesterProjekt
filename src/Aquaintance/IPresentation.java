package Aquaintance;

/**
 * IPresentation interface
 */
public interface IPresentation
{

    void injectBusiness(IBusiness business);

    void start();

    void getCase(int ID);

    int getID();

    String getFirstName();

    String getLastName();

    int getPhoneNumber();

    String getEmail();

    String getBirthday();

    int getCPR();

    String getAddress();

    String getJournal();

    String getStatus();

    String getUsername();

    void setPassword(String oldPassword, String newPassword);

    boolean validateUsername(String username);

    boolean validatePassword(String username, String password);

    String getUserType(String username, String password);
    
    String showPassword(String username);

}
