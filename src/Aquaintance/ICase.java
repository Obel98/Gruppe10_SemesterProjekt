package Aquaintance;

/**
 *
 * @author ProjektGruppe 10.
 */
public interface ICase {

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

    ICase getCase();

    String getDate();

    String getUserName();
}
