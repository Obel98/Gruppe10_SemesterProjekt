package Business;

public class Borger {

    private String name;
    private String lastName;
    private String address;
    private String phoneNumber;
    private String email;
    //private case Sag;
    private String contact;
    //private ArrayList<Sag> history;
    private String password;
    private String CPR;

    public Borger(String CPR, String name, String lastName, String address, String phoneNumber, String email) {
        this.CPR = CPR;
        this.name = name;
        this.lastName = lastName;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;

        this.password = password;

        //this.case =Sag();
        this.contact = contact;
        //this.ArrayList < Sag > history;

    }

    public String getCPR() {
        return CPR;
    }

    public void setCPR(String CPR) {
        this.CPR = CPR;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
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

}

