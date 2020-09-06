/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank.management;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXDatePicker;
import com.jfoenix.controls.JFXTextField;
import com.sun.deploy.util.SessionState.Client;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.ObservableListBase;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author Tareq
 */
public class FXMLDocumentController implements Initializable {
    BankManagement  bm=new BankManagement();
    @FXML
    private Label label;
    @FXML
    private JFXTextField firstname;

    @FXML
    private JFXTextField lastname;

    @FXML
    private JFXTextField email;
    
    @FXML
    private JFXTextField repass;
    
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
    public ObservableList<String>list_status=FXCollections.observableArrayList("Admain","Employee","Client");

    public FXMLDocumentController() {
        
    }
    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
    
    @FXML
    void Register(ActionEvent event)
    {
        String Emial =email.getText();
        if(!password.getText().equals(repass.getText()))
            JOptionPane.showMessageDialog(null,"Two Password Not Matc");
        else if(!isValid(Emial)) 
           email.setStyle("-fx-border-color: red "); 
        else{
    String selectedChoice = (String) status.getSelectionModel().getSelectedItem();
    String selectedChoicegender = (String) gender.getSelectionModel().getSelectedItem();
     try{
         email.setStyle("-fx-border-color: white "); 
     if(selectedChoice.equals("Admain"))
     {
         BankManagement.Person person=bm.new Admain (firstname.getText()+" "+lastname.getText(),email.getText()
                 ,selectedChoicegender,"","",password.getText());
         person.Display();
     }  
     else if(selectedChoice.equals("Employee"))
     {
         BankManagement.Person person=bm.new Employee(firstname.getText()+" "+lastname.getText(),email.getText()
                 ,selectedChoicegender,"","",password.getText());;
         person.Display();
     }
     else if(selectedChoice.equals("Client"))
     {
        BankManagement.Person person=bm.new Client(firstname.getText()+" "+lastname.getText(),email.getText()
                ,selectedChoicegender,"","",password.getText());;
         person.Display();
     }}catch(Exception exception)
     {
         JOptionPane.showMessageDialog(null,"You  Status OR Gender Not Selected");
     }}
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        gender.setItems(list_gender);
        status.setItems(list_status);
    
    }    
    public static boolean isValid(String email)
    {
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+
                "[a-zA-Z0-9_+&*-]+)*@" +
                "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
                "A-Z]{2,7}$";

        Pattern pat = Pattern.compile(emailRegex);
        Matcher matcher=pat.matcher(email);
        if (matcher.matches())
            return true;
        else 
            return false;
    }
}
