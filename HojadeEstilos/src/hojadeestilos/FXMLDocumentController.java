/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hojadeestilos;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;

/**
 *
 * @author josep
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML private AnchorPane panel;
    
    @FXML
    private Label label;
    @FXML
    private Button bnt1;
    @FXML
    private Button btn2;
    @FXML
    private Button btn3;
    @FXML
    private Button btn4;
    
   @FXML 
    private void priEstilo(ActionEvent event) {
       panel.getStylesheets().clear();
       panel.getStylesheets().add("/css/estilo1.css");
    }

    @FXML 
    private void segEstilo(ActionEvent event) {
       panel.getStylesheets().clear();
       panel.getStylesheets().add("/css/estilo2.css");
    }

    @FXML 
    private void terEstilo(ActionEvent event) {
       panel.getStylesheets().clear();
       panel.getStylesheets().add("/css/estilo3.css");
    }    

    @FXML 
    private void reset(ActionEvent event) {
       panel.getStylesheets().clear();
       panel.getStylesheets().add("/css/base.css");
    }   
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
