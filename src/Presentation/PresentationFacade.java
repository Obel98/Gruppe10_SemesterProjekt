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

    private IBusiness business;
    private static IPresentation UI;
    private Stage stage = new Stage();
    
    public static IPresentation getUI()
    {
        return UI;
    }

    @Override
    public void injectBusiness(IBusiness business) {
        this.business = business;
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
    public void loadHome(){

 }

    
}
