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
import javafx.scene.control.TextArea;
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
    private Label AdminIDLabel;
    @FXML
    private Button backButton;
    @FXML
    private Button addToCaseButton;
    @FXML
    private Button attachFileButton;
    @FXML
    private Button caseEvaulationButton;
    @FXML
    private Label caseIDLabel;
    @FXML
    private Label caseStatusLabel;
    @FXML
    private Label IDLabel;
    @FXML
    private Label firstNameLabel;
    @FXML
    private Label lastNameLabel;
    @FXML
    private Label addressLabel;
    @FXML
    private Label phonenumberLabel;
    @FXML
    private Label emailLabel;
    @FXML
    private Label dateLabel;
    @FXML
    private Label caseworkerLabel;
    @FXML
    private TextArea CaseTextArea;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        UI = PresentationFacade.getUI();
        caseIDLabel.setText(String.valueOf(UI.getID()));
        firstNameLabel.setText(UI.getFirtName());
        lastNameLabel.setText(UI.getLastName());
        phonenumberLabel.setText((String.valueOf(UI.getPhoneNumber())));
        emailLabel.setText((UI.getEmail()));
        CaseTextArea.setText((String.valueOf(UI.getJournal())));
        caseStatusLabel.setText(UI.getStatus());
        addressLabel.setText(UI.getAddresse());
    }

    @FXML
    private void backOnAction(ActionEvent event) {
        Stage stage = (Stage) backButton.getScene().getWindow();
        stage.close();
    }

}
