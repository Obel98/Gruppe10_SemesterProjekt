package Aquaintance;

/**
<<<<<<< Updated upstream
 * IData interface
=======
 *
 * @author ProjektGruppe 10.
>>>>>>> Stashed changes
 */
public interface IData {

    ICase getCase(int ID);

    boolean validateUserName(String username);

    boolean validatePassword(String username, String password);

    String getUserType(String username, String password);
}
