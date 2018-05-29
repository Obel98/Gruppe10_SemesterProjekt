package Aquaintance;

import Data.Data_Case;

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

    Data_Case getCase();

    String getDate();

    String getUserName();
}
