package Aquaintance;

/**
 *
 * @author ProjektGruppe 10.
 */
public interface IBusiness {

    void injectData(IData data);

    void setCase(int ID);

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

    boolean validateUsername(String username);

    boolean validatePassword(String username, String password);

    String getUserType(String username, String password);

}
