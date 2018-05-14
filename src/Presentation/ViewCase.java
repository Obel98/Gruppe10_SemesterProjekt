/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Aquaintance.IBusiness;
import Aquaintance.IPresentation;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author rasmu
 */
public class ViewCase implements Initializable {

    private IPresentation UI;
    private IBusiness business;

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
    @FXML
    private Button addToCaseButton;
    @FXML
    private Button attackFileButton;
    @FXML
    private Button caseEvaulationButton;
    @FXML
    private Button backButton;
    @FXML
    private Label AdminIDLabel;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void backOnAction(ActionEvent event) {
        Stage stage = (Stage) backButton.getScene().getWindow();
        stage.close();
    }

}
