package Data;

import Aquaintance.IBorger;

public class Borger implements IBorger {

    private String firstname;
    private String lastname;
    private String address;
    private int phoneNumber;
    private String email;
    private String contact;
    private String password;
    private int CPR;
    private int birthday;
    private String username;

    public Borger(int CPR, String name, String lastName, String address, int phoneNumber, String email) {
        this.CPR = CPR;
        this.firstname = name;
        this.lastname = lastName;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;

        //this.case =Sag();
        //this.ArrayList < Sag > history;

    }

    public int getCPR() {
        return CPR;
    }

    public void setCPR(int CPR) {
        this.CPR = CPR;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstName(String name) {
        this.firstname = name;
    }

    public String getLastName() {
        return lastname;
    }

    public void setLastName(String lastName) {
        this.lastname = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public int getBirthday()
    {
        return birthday;
    }

    public void setBirthday(int birthday)
    {
        this.birthday = birthday;
    }

    public String getUsername()
    {
        return username;
    }

    public void setUsername(String username)
    {
        this.username = username;
    }
}

