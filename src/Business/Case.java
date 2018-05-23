package Business;

import Aquaintance.ICase;

public class Case implements Aquaintance.ICase {

    private int ID;
    private String firstName;
    private String lastName;
    private int phoneNumber;
    private String email;
    private String birthday;
    private int CPR;
    private String address;
    private String journal;
    private String status;
    private String date;
    private String userName;

    public Case(ICase ic) {
        this.ID = ic.getID();
        this.journal = ic.getJournal();
        this.status = "Under behandling";
        this.date = ic.getDate();
        this.CPR = ic.getCPR();
        this.address = ic.getAddress();
        this.birthday = ic.getBirthday();
        this.email = ic.getEmail();
        this.firstName = ic.getFirstName();
        this.lastName = ic.getLastName();
        this.phoneNumber = ic.getPhoneNumber();
        this.userName = ic.getUserName();
    }

    @Override
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
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

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public void setCPR(int CPR) {
        this.CPR = CPR;
    }

    public void setAddresse(String address) {
        this.address = address;
    }

    public void setCommentar(String commentar) {
        this.journal = commentar;
    }

    public void setStatus(String status) {
        this.status = status;
    }

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
    public String getBirthday() {
        return birthday;
    }

    @Override
    public int getCPR() {
        return CPR;
    }

    @Override
    public String getAddress() {
        return address;
    }

    @Override
    public String getJournal() {
        return journal;
    }

    @Override
    public String getStatus() {
        return status;
    }

    @Override
    public ICase getCase() {
        return null;
    }

    @Override
    public String getUserName() {
        return userName;
    }
}
