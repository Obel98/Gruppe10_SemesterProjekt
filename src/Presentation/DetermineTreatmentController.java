package Presentation;

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
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 * FXML Controller DetermineTreatmentController class
 * Used to handle the Determine Treatment screen.
 * implements Initializable
 * @author Gruppe 10.
 */
public class DetermineTreatmentController implements Initializable 
{

    //Attributes of the DetermineTreatmentController class.
    @FXML
    private Button backButton;
    @FXML
    private Label AdminIDLabel;
    @FXML
    private Button savaButton;
    @FXML
    private Button benefitsButton;

    /**
     * Initializes the DetermineTreatmentController class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) 
    {
        // TODO
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
     * Handles the SaveOn action
     * No implementation.
     * @param event
     */
    @FXML
    private void SaveOnAction(ActionEvent event) 
    {
    }

    /**
     * Handles the benefitsOn action
     * Shows BenifitsWindow.fxml on use
     * @param event
     * @throws IOException
     */
    @FXML
    private void benefitsOnAction(ActionEvent event) throws IOException 
    {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("FXML/BenifitsWindow.fxml"));
        Stage stage = new Stage();
        Parent root = loader.load();
        stage.setScene(new Scene(root));
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.initOwner(benefitsButton.getScene().getWindow());
        stage.showAndWait();
    }

}
