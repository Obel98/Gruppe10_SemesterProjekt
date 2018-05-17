/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import java.sql.*;

/**
 *
 * @author Obel
 */
public class Database
{

    private final String dburl;
    private final String dbusername;
    private final String dbpassword;
    private static Connection db;

    public Database(String dburl, String dbusername, String dbpassword)
    {
        this.dburl = dburl;
        this.dbusername = dbusername;
        this.dbpassword = dbpassword;
    }

    public ResultSet sendQuery(String query)
    {
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
            return rs;
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        return null;
    }

    public Connection getConnection()
    {
        try
        {
            Class.forName("org.postgresql.Driver");
        }
        catch (ClassNotFoundException ex)
        {
            System.out.println(ex);
        }

        try (Connection db = DriverManager.getConnection("jdbc:postgresql://elmer.db.elephantsql.com:5432/jkclsvjn", "jkclsvjn", "5vckjZ8LGdP6g2S6eHLeP5w34mASozc1");)
        {
            return db;
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        return null;
    }
}
