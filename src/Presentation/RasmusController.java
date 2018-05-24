package Presentation;

import javafx.fxml.FXML;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

public class RasmusController {

    @FXML
    private WebView webView;

    @FXML
    private void initialize() {
        WebEngine engine = webView.getEngine();
        engine.load("https://www.youtube.com/watch?v=oHg5SJYRHA0");
    }
}
