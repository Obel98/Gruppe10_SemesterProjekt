/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Aquaintance.IBusiness;
import Aquaintance.IPresentation;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Mads Obel Jensen
 */
public class PresentationFacade implements Aquaintance.IPresentation {

    private IBusiness Business;
    private static IPresentation UI;
    private Stage stage = new Stage();

    public static IPresentation getUI() {
        return UI;
    }

    @Override
    public void injectBusiness(IBusiness business) {
        this.Business = business;
    }

    @Override
    public void start() {
        try
        {
            Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));

            Scene logIn = new Scene(root);

            stage.setScene(logIn);
            stage.show();
        } catch (IOException ex)
        {
            Logger.getLogger(PresentationFacade.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void loadHome() {
        System.out.println("Not supported yet.");
    }

    @Override
    public int getID() {
        return Business.getID();
    }

    @Override
    public String getFirtName() {
        return Business.getFirtName();
    }

    @Override
    public String getLastName() {
        return Business.getLastName();
    }

    @Override
    public int getPhoneNumber() {
        return Business.getPhoneNumber();
    }

    @Override
    public String getEmail() {
        return Business.getEmail();
    }

    @Override
    public int getBirthday() {
        return Business.getBirthday();
    }

    @Override
    public int getCPR() {
        return Business.getCPR();
    }

    @Override
    public String getAddresse() {
        return Business.getAddresse();
    }

    @Override
    public String getJournal() {
        return Business.getJournal();
    }

}
