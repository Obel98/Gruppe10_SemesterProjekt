/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author Obel
 */
public class Database
{

    private final String dburl = "jdbc:postgresql://elmer.db.elephantsql.com:5432/jkclsvjn";
    private final String dbusername = "jkclsvjn";
    private final String dbpassword = "5vckjZ8LGdP6g2S6eHLeP5w34mASozc1";

    public Database()
    {
    }

    public ArrayList<String> sendQuery(String query)
    {
        ArrayList<String> result = new ArrayList<>();
        try
        {
            Class.forName("org.postgresql.Driver");
        }
        catch (ClassNotFoundException ex)
        {
            System.out.println(ex);
        }

        try (Connection db = DriverManager.getConnection(dburl, dbusername, dbpassword);
                Statement st = db.createStatement();
                ResultSet rs = st.executeQuery(query);)
        {
            while (rs.next())
            {
                int i = 1;
                while (i < rs.getMetaData().getColumnCount())
                {
                    //System.out.print(rs.getString(i) + " ");
                    result.add(rs.getString(i));
                    i++;
                }
                //System.out.println(rs.getString(i) + " ");
                result.add(rs.getString(i));
            }
            //System.out.println(result);
            //return result;
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        return result;
    }
}
