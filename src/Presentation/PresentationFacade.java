/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Aquaintance.IBusiness;
import Aquaintance.ICase;
import Aquaintance.IPresentation;
import Business.Case;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 *
 * @author Mads Obel Jensen
 */
public class PresentationFacade implements Aquaintance.IPresentation
{

    private static IBusiness Business;
    private static IPresentation UI;
    private Stage stage = new Stage();

    public PresentationFacade()
    {
    }

    public static IPresentation getUI()
    {
        if (UI == null)
        {
            UI = new PresentationFacade();
        }
        return UI;
    }

    @Override
    public void injectBusiness(IBusiness business)
    {
        this.Business = business;
    }

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

    @Override
    public int getID()
    {
        return Business.getID();
    }

    @Override
    public String getFirstName()
    {
        return Business.getFirstName();
    }

    @Override
    public String getLastName()
    {
        return Business.getLastName();
    }

    @Override
    public int getPhoneNumber()
    {
        return Business.getPhoneNumber();
    }

    @Override
    public String getEmail()
    {
        return Business.getEmail();
    }

    @Override
    public String getBirthday()
    {
        return Business.getBirthday();
    }

    @Override
    public int getCPR()
    {
        return Business.getCPR();
    }

    @Override
    public String getAddress()
    {
        return Business.getAddress();
    }

    @Override
    public String getJournal()
    {
        return Business.getJournal();
    }

    @Override
    public String getStatus()
    {
        return Business.getStatus();
    }

    @Override
    public String getUsername()
    {
        return Business.getUsername();
    }

    @Override
    public void getCase(int ID)
    {
        Business.getCase(ID);
    }
}
