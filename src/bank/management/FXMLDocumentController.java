/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank.management;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXDatePicker;
import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

/**
 *
 * @author Tareq
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
    @FXML
    private JFXTextField firstname;

    @FXML
    private JFXTextField lastname;

    @FXML
    private JFXTextField email;

    @FXML
    private JFXTextField password;

    @FXML
    private JFXComboBox status;

    @FXML
    private JFXComboBox gender;
    @FXML
    private JFXButton regist;

    @FXML
    private JFXDatePicker birthdate;
    public ObservableList<String>list_gender=FXCollections.observableArrayList("Male","Female");
    public ObservableList<String>list_status=FXCollections.observableArrayList("Admin","Employee","Client");
    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
    @FXML
    void Register(ActionEvent event) {

    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        gender.setItems(list_gender);
        status.setItems(list_status);
    }    
    
}
