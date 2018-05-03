/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

/**
 * FXML Controller class
 *
 * @author rasmu
 */
public class ViewCase implements Initializable {

    @FXML
    private Button saveButton;
    @FXML
    private Button saveDraftButton;
    @FXML
    private Label datoLabel;
    @FXML
    private Label caseworkerLabel;
    @FXML
    private Label caseTextLabel;
    @FXML
    private Label caseIDLabel;
    @FXML
    private Label caseStatusLabel;
    @FXML
    private Label IDLabel;
    @FXML
    private Label nameLabel;
    @FXML
    private Label addressLabel;
    @FXML
    private Label phoneNumberLabel;
    @FXML
    private Label emailLabel;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void SaveAction(ActionEvent event) {
    }

    @FXML
    private void saveDraftAction(ActionEvent event) {
    }
    
}
