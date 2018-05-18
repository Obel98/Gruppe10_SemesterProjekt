/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import Aquaintance.ICase;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author borga
 */
public class Case implements ICase
{

    private int ID;
    private String firtName;
    private String lastName;
    private int phoneNumber;
    private String email;
    private int birthday;
    private int CPR;
    private String addresse;
    private String journal;
    private String status;

    public Case(int ID, Borger borger, String journal)
    {
        this.ID = ID;
        this.firtName = borger.getFirstName();
        this.lastName = borger.getLastName();
        this.phoneNumber = borger.getPhoneNumber();
        this.email = borger.getEmail();
        this.birthday = borger.getBirthday();
        this.CPR = borger.getCPR();
        this.addresse = borger.getAddress;
        this.journal = journal;
        this.status = "Under behandling";
    }

    @Override
    public String toString()
    {
        return "JournalFormat{" + "ID=" + ID + ", firtName=" + firtName + ", lastName=" + lastName + ", phoneNumber=" + phoneNumber + ", email=" + email + ", birthday=" + birthday + ", CPR=" + CPR + ", addresse=" + addresse + ", journal=" + journal + ", status=" + status + '}';
    }

    @Override
    public int getID()
    {
        return ID;
    }

    @Override
    public String getFirstName()
    {
        return firtName;
    }

    @Override
    public String getLastName()
    {
        return lastName;
    }

    @Override
    public int getPhoneNumber()
    {
        return phoneNumber;
    }

    @Override
    public String getEmail()
    {
        return email;
    }

    @Override
    public int getBirthday()
    {
        return birthday;
    }

    @Override
    public int getCPR()
    {
        return CPR;
    }

    @Override
    public String getAddresse()
    {
        return addresse;
    }

    @Override
    public String getCommentar()
    {
        return journal;
    }

    @Override
    public String getStatus()
    {
        return status;
    }

    @Override
    public ICase getCase(int ID)
    {
        try
        {
            Class.forName("org.postgresql.Driver");
        }
        catch (ClassNotFoundException ex)
        {
            System.out.println(ex);
        }

        try (Connection db = DriverManager.getConnection("jdbc:postgresql://elmer.db.elephantsql.com:5432/jkclsvjn", "jkclsvjn", "5vckjZ8LGdP6g2S6eHLeP5w34mASozc1");
                Statement st = db.createStatement();
                ResultSet rs = st.executeQuery("Select * from casefile where caseid ='" + ID + "'" );)
        {
            String[] result = new String[4];
            while (rs.next())
            {
                int i = 1;
                while (i < rs.getMetaData().getColumnCount())
                {
                    //System.out.print(rs.getString(i) + " ");
                    result[i] = (rs.getString(i));
                    i++;
                }
                //System.out.println(rs.getString(i) + " ");
                result[i] = (rs.getString(i));
            }
            System.out.println(result[0] + result[1] + result[2] + result[3]);
            //return result;
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        return null;
    }

}
