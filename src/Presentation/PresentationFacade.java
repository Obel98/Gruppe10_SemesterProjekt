package Presentation;

import Aquaintance.IBusiness;
import Aquaintance.IPresentation;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 * PresentationFacade class
 * Used to handle the Admin homescreen.
 * implements IPresentation
 * @author Gruppe 10.
 */
public class PresentationFacade implements Aquaintance.IPresentation
{

    //Attributes of the PresentationFacade class.
    private static IBusiness Business;
    private static IPresentation UI;
    private Stage stage = new Stage();

    /**
     * Private constructor for PresentationFacade
     */
    private PresentationFacade() 
    {
    }

    /**
     * Getter Method for the PresentationFacade.
     * Singleton pattern: Returns the PresentationFacade / if null, a new PresentationFacade is made.
     * @return IPresentation
     */
    public static IPresentation getUI() 
    {
        if (UI == null) 
        {
            UI = new PresentationFacade();
        }
        return UI;
    }

    /**
     * Inject Method for Business
     * @param business Sets the businessLayer to use.
     */
    @Override
    public void injectBusiness(IBusiness business) 
    {
        this.Business = business;
    }

    /**
     * Start Method for PresentationFacade class
     * Shows LogInScreen.fxml.
     */
    @Override
    public void start()
    {
        try
        {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("FXML/LogInScreen.fxml"));
            Pane root = loader.load();
            LogInScreenController controller = loader.getController();
            controller.injectBusiness(Business);

            Scene logIn = new Scene(root);

            stage.setScene(logIn);
            stage.show();
            stage.setResizable(false);
        }
        catch (IOException ex)
        {
            Logger.getLogger(PresentationFacade.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Getter Method for ID.
     * Returns the value of ID from a Case..
     * @return int
     */
    @Override
    public int getID()
    {
        return Business.getID();
    }

    /**
     * Getter Method for firstname.
     * Returns the value of firstname from a Case..
     * @return String
     */
    @Override
    public String getFirstName()
    {
        return Business.getFirstName();
    }

    /**
     * Getter Method for lastname.
     * Returns the value of lastname from a Case..
     * @return String
     */
    @Override
    public String getLastName()
    {
        return Business.getLastName();
    }

    /**
     * Getter Method for phonenumber.
     * Returns the value of phonenumber from a Case..
     * @return int
     */
    @Override
    public int getPhoneNumber()
    {
        return Business.getPhoneNumber();
    }

    /**
     * Getter Method for email.
     * Returns the value of email from a Case..
     * @return String
     */
    @Override
    public String getEmail()
    {
        return Business.getEmail();
    }

    /**
     * Getter Method for birthday.
     * Returns the value of birthday from a Case..
     * @return String
     */
    @Override
    public String getBirthday()
    {
        return Business.getBirthday();
    }

    /**
     * Getter Method for CPR.
     * Returns the value of CPR from a Case..
     * @return int
     */
    @Override
    public int getCPR()
    {
        return Business.getCPR();
    }

    /**
     * Getter Method for address.
     * Returns the value of address from a Case..
     * @return String
     */
    @Override
    public String getAddress()
    {
        return Business.getAddress();
    }

    /**
     * Getter Method for journal.
     * Returns the value of journal from a Case..
     * @return String
     */
    @Override
    public String getJournal()
    {
        return Business.getJournal();
    }

    /**
     * Getter Method for status.
     * Returns the value of status from a Case..
     * @return String
     */
    @Override
    public String getStatus()
    {
        return Business.getStatus();
    }

    /**
     * Getter Method for username.
     * Returns the value of username from a Case..
     * @return String
     */
    @Override
    public String getUsername()
    {
        return Business.getUsername();
    }

    /**
     * Getter Method for Case.
     * Gets a Case with the given ID.
     * @param ID Gets a Case from this value.
     */
    @Override
    public void getCase(int ID)
    {
        Business.setCase(ID);
    }

    /**
     * Setter Method for password.
     * Sets the password to the new value
     * @param oldPassword The old value
     * @param newPassword The new value
     */
    @Override
    public void setPassword(String oldPassword, String newPassword)
    {
        Business.setPassword(oldPassword, newPassword);
    }

    @Override
    public boolean validateUsername(String username)
    {
        return Business.validateUsername(username);
    }

    @Override
    public boolean validatePassword(String username, String password)
    {
        return Business.validatePassword(username, password);
    }

    @Override
    public String getUserType(String username, String password)
    {
        return Business.getUserType(username, password);
    }

    @Override
    public String showPassword(String username)
    {
        return Business.showPassword(username);
    }
}
