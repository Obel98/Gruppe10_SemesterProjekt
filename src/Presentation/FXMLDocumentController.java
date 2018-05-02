/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * @author Obel
 */
public class FXMLDocumentController implements Initializable
{

    @FXML
    private TextField PasswordBox;

    @FXML
    private TextField UsernameBox;

    @FXML
    private Button LogOnButton;

    @FXML
    private Button ResetPasswordButton;

    @FXML
    void LogOnAction(ActionEvent event) throws IOException
    {
        if ("administrator".equals(UsernameBox.getText()) && "admin".equals(PasswordBox.getText()))
        {
            Parent homeRoot = FXMLLoader.load(getClass().getResource("HomeFXML.fxml"));
            Scene home = new Scene(homeRoot);
            Stage appStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            appStage.setScene(home);
            appStage.show();
            System.out.println("Vellykket!");
        }
    }

    @Override
    public void initialize(URL location, ResourceBundle resources)
    {

    }

    @FXML
    private void ResetPasswordAction(ActionEvent event)
    {
    }
}
