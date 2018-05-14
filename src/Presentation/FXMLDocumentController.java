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
import javafx.fxml.Initializable;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 * @author Obel
 */
public class FXMLDocumentController implements Initializable {

    private IPresentation UI;
    private IBusiness Business;

    @FXML
    private PasswordField PasswordBox;

    @FXML
    private TextField UsernameBox;

    @FXML
    private Button LogOnButton;

    @FXML
    private Button ResetPasswordButton;
    private Label passwordMsgLable;

    @FXML
    void LogOnAction(ActionEvent event) throws IOException {

        if ("admin".equals(UsernameBox.getText()) && "admin".equals(PasswordBox.getText())) {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("HomeFXML.fxml"));
            Pane homeRoot = loader.load();
            HomeFXMLController controller = loader.getController();
            controller.injectBusiness(Business);
            Scene home = new Scene(homeRoot);
            Stage appStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            appStage.setScene(home);
            appStage.show();

            System.out.println("Vellykket!");
        } else {
            passwordMsgLable.setText("Inncorrect password or username, Try again!");
            passwordMsgLable.setTextFill(Color.rgb(210, 39, 30));

        }
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        UI = PresentationFacade.getUI();
    }

    @FXML
    private void ResetPasswordAction(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("ForgotPassword.fxml"));
        Stage stage = new Stage();
        Parent root = loader.load();
        stage.setScene(new Scene(root));
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.initOwner(ResetPasswordButton.getScene().getWindow());
        stage.showAndWait();
    }

    public void injectBusiness(IBusiness business) {
        this.Business = business;
    }

    private void LogOnAction(KeyEvent event) throws IOException{
        

    }

    @FXML
    private void pressEnter(KeyEvent event) throws IOException {
        if (event.getCode().equals(KeyCode.ENTER)) {
            if ("admin".equals(UsernameBox.getText()) && "admin".equals(PasswordBox.getText())) {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("HomeFXML.fxml"));
                Pane homeRoot = loader.load();
                HomeFXMLController controller = loader.getController();
                controller.injectBusiness(Business);
                Scene home = new Scene(homeRoot);
                Stage appStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                appStage.setScene(home);
                appStage.show();

                System.out.println("Vellykket!");
            } else {
                passwordMsgLable.setText("Inncorrect password or username, Try again!");
                passwordMsgLable.setTextFill(Color.rgb(210, 39, 30));

            }
        }
    }
}
