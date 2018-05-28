package Data;

import Aquaintance.ICase;
import java.util.ArrayList;

/**
 *
 * @author ProjektGruppe 10.
 */
public class DataFacade implements Aquaintance.IData
{

    private ICase iCase;
    
    @Override
    public ICase getCase(int id)
    {
        Data_Case sag = new Data_Case(id);
        iCase = sag.getCase();
        return iCase;
    }

    @Override
    public boolean validateUserName(String username)
    {
        Database db = new Database();
        ArrayList<String> temp = new ArrayList<>();
        temp = db.sendQuery("SELECT username FROM users");
        return temp.contains(username);
    }

    @Override
    public boolean validatePassword(String username, String password)
    {
        Database db = new Database();
        ArrayList<String> temp = new ArrayList<>();
        temp = db.sendQuery("SELECT password FROM users WHERE username = '" + username + "'");
        return temp.contains(password);
    }

    @Override
    public String getUserType(String username, String password)
    {
        Database db = new Database();
        ArrayList<String> temp = new ArrayList<>();
        temp = db.sendQuery("SELECT type FROM users WHERE username = '" + username + "' AND password = '" + password + "'");
        return temp.toString();
    }

    @Override
    public void setPassword(String oldPassword, String newPassword)
    {
        Database db = new Database();
        db.sendQuery("Update users set password = '" + newPassword + "' where password = '" + oldPassword + "'");
    }

    @Override
    public String showPassword(String username)
    {
        Database db = new Database();
        return db.sendQuery("Select password from users where username ='" + username + "'").get(0);
    }


}
