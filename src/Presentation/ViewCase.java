/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Aquaintance.IBusiness;
import Aquaintance.IPresentation;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.stage.Modality;
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
    private Button attachFileButton;
    @FXML
    private Label caseIDLabel;
    @FXML
    private Label caseStatusLabel;
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
    private TextArea CaseTextArea;
    @FXML
    private Button addToCaseButton;
    @FXML
    private Button caseEvaulationButton;
    @FXML
    private Label IDLabel;
    @FXML
    private Label dateLabel;
    @FXML
    private Label caseworkerLabel;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        UI = PresentationFacade.getUI();
        UI.getCase(3);
        caseIDLabel.setText(String.valueOf(UI.getID()));
        firstNameLabel.setText(UI.getFirstName());
        lastNameLabel.setText(UI.getLastName());
        phonenumberLabel.setText((String.valueOf(UI.getPhoneNumber())));
        emailLabel.setText((UI.getEmail()));
        CaseTextArea.setText((String.valueOf(UI.getJournal())));
        caseStatusLabel.setText(UI.getStatus());
        addressLabel.setText(UI.getAddress());
        IDLabel.setText(UI.getUsername());
    }

    @FXML
    private void backOnAction(ActionEvent event) {
        Stage stage = (Stage) backButton.getScene().getWindow();
        stage.close();
    }

    @FXML
    private void caseEvaluationOnAction(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("FXML/DetermineTreatment.fxml"));
        Stage stage = new Stage();
        Parent root = loader.load();
        stage.setResizable(false);
        stage.setScene(new Scene(root));
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.initOwner(caseEvaulationButton.getScene().getWindow());
        stage.showAndWait();

    }

    @FXML
    private void addToCaseOnAction(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("FXML/caseComment.fxml"));
        Stage stage = new Stage();
        Parent root = loader.load();
        stage.setScene((new Scene(root)));
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.initOwner(addToCaseButton.getScene().getWindow());
        stage.showAndWait();
    }

    @FXML
    private void attachFileOnAction(ActionEvent event) {
    }

}
