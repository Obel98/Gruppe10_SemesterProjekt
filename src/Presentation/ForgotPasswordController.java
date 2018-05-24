package Presentation;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author ProjektGruppe 10.
 */
public class ForgotPasswordController implements Initializable {

    @FXML
    private TextField UserNameTextField;
    @FXML
    private TextField passwordTextField;
    @FXML
    private Button backButton;

    @FXML
    private Label invalidUserName;
    @FXML
    private Button okButton;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void okButtonOnAction(ActionEvent event) {
        if ("admin".equals(UserNameTextField.getText())) {
            passwordTextField.setText("12345");
            invalidUserName.setText("");
        } else {
            invalidUserName.setText("Inncorrect username, Try again!");
            invalidUserName.setTextFill(Color.rgb(210, 39, 30));
            passwordTextField.setText("");
        }
    }

    @FXML

    private void backOnAction(ActionEvent event) {
        Stage stage = (Stage) backButton.getScene().getWindow();
        stage.close();
    }

    @FXML
    private void pressEnter(KeyEvent event) {
        if (event.getCode().equals(KeyCode.ENTER)) {
            if ("admin".equals(UserNameTextField.getText())) {
                passwordTextField.setText("12345");
                invalidUserName.setText("");
            } else if ("sagb".equals(UserNameTextField.getText())) {
                passwordTextField.setText("sagb");
                invalidUserName.setText("");
            } else {
                invalidUserName.setText("Inncorrect username, Try again!");
                invalidUserName.setTextFill(Color.rgb(210, 39, 30));
                passwordTextField.setText("");
            }
        }
    }
}
