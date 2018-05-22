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
import javafx.scene.control.TextArea;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author borga
 */
public class SecretaryHomeFXMLController implements Initializable {

    private IBusiness business;
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
    private Label firstNameLabel1;
    @FXML
    private Label lastNameLabel1;
    @FXML
    private Label PhonenumberLabel;
    @FXML
    private Label emailLabel;
    @FXML
    private Label caseStatusLabel;
    @FXML
    private TextArea caseTextArea;
    @FXML
    private Label caseIDLabel1;
    @FXML
    private Label firstNameLabel11;
    @FXML
    private Label lastNameLabel11;
    @FXML
    private Label PhonenumberLabel1;
    @FXML
    private Label emailLabel1;
    @FXML
    private Label caseStatusLabel1;
    @FXML
    private TextArea caseTextArea1;
    @FXML
    private Label caseIDLabel11;
    @FXML
    private Label firstNameLabel111;
    @FXML
    private Label lastNameLabel111;
    @FXML
    private Label PhonenumberLabel11;
    @FXML
    private Label emailLabel11;
    @FXML
    private Label caseStatusLabel11;
    @FXML
    private TextArea caseTextArea11;
    @FXML
    private Label caseIDLabel111;
    @FXML
    private Label firstNameLabel1111;
    @FXML
    private Label lastNameLabel1111;
    @FXML
    private Label PhonenumberLabel111;
    @FXML
    private Label emailLabel111;
    @FXML
    private Label caseStatusLabel111;
    @FXML
    private TextArea caseTextArea111;

    /**
     * Initializes the controller class.
     */
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
        try 
        {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("FXML/LogInScreen.fxml"));
            Pane root = loader.load();
            LogInScreenController controller = loader.getController();
            controller.injectBusiness(business);
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            Scene logIn = new Scene(root);

            stage.setScene(logIn);
            stage.show();
            stage.setResizable(false);
        } catch (IOException ex) 
        {
            Logger.getLogger(PresentationFacade.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


    @FXML
    private void changePassword(ActionEvent event) {
    }

    void injectBusiness(IBusiness Business) {
        this.business = business;
    }
    
}
