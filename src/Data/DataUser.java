/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import Aquaintance.IUser;

/**
 *
 * @author Obel
 */
public class DataUser implements IUser
{
    //Attributes for the Borger class.

    private String firstname;
    private String lastname;
    private String address;
    private int phoneNumber;
    private String email;
    private int CPR;
    private String birthday;
    private String username;

    /**
     * Constructor for Borger
     *
     * @param CPR Sets the CPR of the Borger.
     * @param firstname Sets the name of the Borger.
     * @param lastName Sets the lastName of the Borger.
     * @param address Sets the address of the Borger.
     * @param phoneNumber Sets the phoneNumber of the Borger.
     * @param email Sets the email of the Borger.
     */
    public DataUser(int CPR, String firstname, String lastName, String address, int phoneNumber, String email, String birthday, String username)
    {
        this.CPR = CPR;
        this.firstname = firstname;
        this.lastname = lastName;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.birthday = birthday;
        this.username = username;
    }

    @Override
    public String getUsername()
    {
        return username;
    }

    @Override
    public String getFirstname()
    {
        return firstname;
    }

    @Override
    public String getLastname()
    {
        return lastname;
    }

    @Override
    public String getEmail()
    {
        return email;
    }

    @Override
    public int getPhoneNumber()
    {
        return phoneNumber;
    }

    @Override
    public int getCPR()
    {
        return CPR;
    }

    @Override
    public String getAddress()
    {
        return address;
    }

    @Override
    public String getBirthday()
    {
        return birthday;
    }

}
