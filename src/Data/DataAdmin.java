/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

/**
 *
 * @author Obel
 */
public class DataAdmin extends DataUser implements Aquaintance.IAdmin
{

    public DataAdmin(int CPR, String firstname, String lastname, String address, int phoneNumber, String email, int cpr, String birthday, String username)
    {
        super(CPR, firstname, lastname, address, phoneNumber, email, cpr, birthday, username);
    }

    @Override
    public void createUser(int CPR, String firstname, String lastname, String address, int phoneNumber, String email, int cpr, String birthday, String username, String type, String password)
    {
        Database db = new Database();
        db.sendQuery("Insert into users values ('" + firstname + "', '" + lastname + "', '" + address + "', '" + email + "', '"
                + type + "', '" + username + "', '" + CPR + "', '" + phoneNumber + "', '"
                + birthday + "', '" + password + "')");
    }

}
