/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Aquaintance.IBusiness;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author rasmu
 */
public class citizenHomeController implements Initializable {


    
    private IBusiness Business;
    @FXML
    private Button logOutButton;
    @FXML
    private Label AdminIDLabel;
    @FXML
    private MenuItem menuButton;
    @FXML
    private VBox VBox;
    @FXML
    private Label caseIDLabel;
    @FXML
    private Label firstNameLabel;
    @FXML
    private Label lastNameLabel;
    @FXML
    private Label PhonenumberLabel;
    @FXML
    private Label emailLabel;
    @FXML
    private Label caseStatusLabel;


    /**
     * Initializes the controller class.
     */

    public void injectBusiness(IBusiness business) {
        this.Business = business;
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void LogOutAction(ActionEvent event) throws IOException {
        /*Parent root = FXMLLoader.load(getClass().getResource("FXML/LogInScreen.fxml"));

        Scene logIn = new Scene(root);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(logIn);
        stage.show(); */
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("FXML/LogInScreen.fxml"));
            Pane root = loader.load();
            LogInScreenController controller = loader.getController();
            controller.injectBusiness(Business);
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            Scene logIn = new Scene(root);

            stage.setScene(logIn);
            stage.show();
            stage.setResizable(false);
        } catch (IOException ex) {
            Logger.getLogger(PresentationFacade.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void changePassword(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("FXML/ResetPassword.fxml"));
        Stage stage = new Stage();
        Parent root = loader.load();
        stage.setResizable(false);
        stage.setScene(new Scene(root));
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.initOwner(menuButton.getParentPopup().getOwnerWindow());
        stage.showAndWait();
    }

}
