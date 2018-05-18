package Business;

import Data.Borger;

public class Case implements Aquaintance.ICase {

    private int ID;
    private String firstName;
    private String lastName;
    private int phoneNumber;
    private String email;
    private int birthday;
    private int CPR;
    private String addresse;
    private String commentar;
    private String status;
    private Borger borger;
    private String date;

    public Case(int ID, String commentar, Borger borger, String date)
    {
        this.ID = ID;
        this.commentar = commentar;
        this.status = "Under behandling";
        this.borger = borger;
        this.date = date;
    }

    public Borger getBorger()
    {
        return borger;
    }

    public void setBorger(Borger borger)
    {
        this.borger = borger;
    }

    public String getDate()
    {
        return date;
    }

    public void setDate(String date)
    {
        this.date = date;
    }

    
    
    public void setID(int ID) {
        this.ID = ID;
    }

    public void setFirstName(String firtName) {
        this.firstName = firtName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setBirthday(int birthday) {
        this.birthday = birthday;
    }

    public void setCPR(int CPR) {
        this.CPR = CPR;
    }

    public void setAddresse(String addresse) {
        this.addresse = addresse;
    }

    public void setCommentar(String commentar) {
        this.commentar = commentar;
    }

    public void setStatus(String status) { this.status = status; }

    @Override
    public int getID() {
        return ID;
    }

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public int getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public int getBirthday() {
        return birthday;
    }

    @Override
    public int getCPR() {
        return CPR;
    }

    @Override
    public String getAddresse() {
        return addresse;
    }

    @Override
    public String getCommentar() {
        return commentar;
    }

    @Override
    public String getStatus(){return status;}
}
