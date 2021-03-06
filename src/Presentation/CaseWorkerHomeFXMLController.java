package Presentation;

import Aquaintance.IBusiness;
import Aquaintance.ICase;
import Aquaintance.IPresentation;
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
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 * FXML Controller CaseWorkerHomeFXMLController class
 * Used to handle the CaseWorker homescreen.
 * implements Initializable
 * @author Gruppe 10.
 */
public class CaseWorkerHomeFXMLController implements Initializable 
{

    //Attributes of the CaseWorkerHomeFXMLController class.
    private IBusiness Business;
    private IPresentation UI;
    private ICase sag;

    @FXML
    private Button logOutButton;
    @FXML
    private Label AdminIDLabel;
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
    @FXML
    private TextArea caseTextArea;
    @FXML
    private Button viewCaseButton;
    @FXML
    private MenuItem menuButton;
    @FXML
    private VBox VBox;

    /**
     * Inject Method for Business
     * @param business Sets the businessLayer to use.
     */
    public void injectBusiness(IBusiness business) 
    {
        this.Business = business;
    }

    /**
     * Method addCase
     * Shows casePreview.fxml when called
     * @throws IOException
     */
    private void addCase() throws IOException 
    {
        Pane newVBox = FXMLLoader.load(getClass().getResource("FXML/casePreview.fxml"));
        VBox.getChildren().add(newVBox);
    }

    /**
     * Initializes the CaseWorkerHomeFXMLController class.
     * Sets values into labels
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) 
    {
        UI = PresentationFacade.getUI();
        UI.getCase(3);
        caseIDLabel.setText(String.valueOf(UI.getID()));
        firstNameLabel.setText(String.valueOf(UI.getFirstName()));
        lastNameLabel.setText(String.valueOf(UI.getLastName()));
        PhonenumberLabel.setText((String.valueOf(UI.getPhoneNumber())));
        emailLabel.setText(String.valueOf((UI.getEmail())));
        caseTextArea.setText((String.valueOf(UI.getJournal())));
        caseStatusLabel.setText(UI.getStatus());

        try 
        {
            addCase();
        } catch (IOException ex) 
        {
            Logger.getLogger(CaseWorkerHomeFXMLController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Handles the logOut action
     * Shows LogInScreen.fxml on use
     * @param event
     * @throws IOException
     */
    @FXML
    private void LogOutAction(ActionEvent event) throws IOException 
    {
        /*Parent root = FXMLLoader.load(getClass().getResource("FXML/LogInScreen.fxml"));
        Scene logIn = new Scene(root);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(logIn);
        stage.show();*/
        try 
        {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("FXML/LogInScreen.fxml"));
            Pane root = loader.load();
            LogInScreenController controller = loader.getController();
            controller.injectBusiness(Business);
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

    /**
     * Handles the viewCase action
     * Shows viewCase.fxml on use
     * @param event
     * @throws IOException
     */
    @FXML
    private void viewCaseAction(ActionEvent event) throws IOException 
    {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("FXML/viewCase.fxml"));
        Stage stage = new Stage();
        Parent root = loader.load();
        stage.setScene(new Scene(root));
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.initOwner(viewCaseButton.getScene().getWindow());
        stage.showAndWait();
    }

    /**
     * Handles the changePassword action
     * Shows ResetPassword.fxml on use
     * @param event
     * @throws IOException
     */
    @FXML
    private void changePassword(ActionEvent event) throws IOException 
    {
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
