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
 * FXML Controller ViewCase class
 * Used to handle the ViewCase screen.
 * implements Initializable
 * @author Gruppe 10.
 */
public class ViewCase implements Initializable 
{

    //Attributes of the ViewCase controller class.
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
     * Initializes the ViewCase controller class.
     * Sets values into labels
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) 
    {
        UI = PresentationFacade.getUI();
        UI.getCase(4);
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

    /**
     * Handles the backOn action
     * Closes the scene.
     * @param event
     */
    @FXML
    private void backOnAction(ActionEvent event) 
    {
        Stage stage = (Stage) backButton.getScene().getWindow();
        stage.close();
    }

    /**
     * Handles the caseEvaluationOn action
     * Shows DetermineTreatment.fxml on use
     * @param event
     * @throws IOException
     */
    @FXML
    private void caseEvaluationOnAction(ActionEvent event) throws IOException 
    {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("FXML/DetermineTreatment.fxml"));
        Stage stage = new Stage();
        Parent root = loader.load();
        stage.setResizable(false);
        stage.setScene(new Scene(root));
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.initOwner(caseEvaulationButton.getScene().getWindow());
        stage.showAndWait();

    }

    /**
     * Handles the addToCaseOn action
     * Shows caseComment.fxml on use
     * @param event
     * @throws IOException
     */
    @FXML
    private void addToCaseOnAction(ActionEvent event) throws IOException 
    {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("FXML/caseComment.fxml"));
        Stage stage = new Stage();
        Parent root = loader.load();
        stage.setScene((new Scene(root)));
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.initOwner(addToCaseButton.getScene().getWindow());
        stage.showAndWait();
    }

    /**
     * Handles the attachFileOn action
     * No implementation.
     * @param event
     */
    @FXML
    private void attachFileOnAction(ActionEvent event) 
    {
    }

}
