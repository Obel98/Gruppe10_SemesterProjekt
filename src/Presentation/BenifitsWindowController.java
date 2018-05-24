package Presentation;

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
 * @author ProjektGruppe 10.
 */
public class BenifitsWindowController implements Initializable {

    @FXML
    private Button backButton;
    @FXML
    private Label AdminIDLabel;
    @FXML
    private Button saveButton;

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

    @FXML
    private void saveOnAction(ActionEvent event) {
    }

}
