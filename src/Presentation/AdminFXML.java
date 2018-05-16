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
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author rasmu
 */
public class AdminFXML implements Initializable {

    private IBusiness business;
    @FXML
    private Label AdminIDLabel;
    @FXML
    private Button logOutButton;
    @FXML
    private MenuItem menuButton;

    public AdminFXML() {
    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    public void injectData(IBusiness business) {
        this.business = business;
    }

    @FXML
    private void logOutOnAction(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("LogInScreen.fxml"));

        Scene logIn = new Scene(root);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(logIn);
        stage.show();
    }

    @FXML
    private void changePassword(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("ResetPassword.fxml"));
        Stage stage = new Stage();
        Parent root = loader.load();
        stage.setScene(new Scene(root));
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.initOwner(menuButton.getParentPopup().getOwnerWindow());
        stage.showAndWait();
    }

    void injectBusiness(IBusiness Business) {
        this.business = business;
    }

}
