package Presentation;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

public class RasmusController {

    @FXML
    private WebView webView;

    @FXML
    private void initialize() {
        WebEngine engine = webView.getEngine();
        engine.load("http://fakebsod.com/windows-8-and-10");
        Platform.setImplicitExit(false);
    }
}
