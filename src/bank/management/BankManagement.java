/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank.management;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

/**
 *
 * @author Tareq
 */
public class BankManagement extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
  
 public class Person
  {
private String Name,Emai,Gender,Bithdate,Address,Password;
        public Person()
        {
        }
        public void setName(String Name) {
            this.Name = Name;
        }

        public String getName() {
            return Name;
        }

        public String getEmai() {
            return Emai;
        }

        public String getGender() {
            return Gender;
        }

        public String getBithdate() {
            return Bithdate;
        }

        public String getAddress() {
            return Address;
        }

        public String getPassword() {
            return Password;
        }

        public void setEmai(String Emai) {
            this.Emai = Emai;
        }

        public void setGender(String Gender) {
            this.Gender = Gender;
        }

        public void setBithdate(String Bithdate) {
            this.Bithdate = Bithdate;
        }

        public void setAddress(String Address) {
            this.Address = Address;
        }

        public void setPassword(String Password) {
            this.Password = Password;
        }

        public Person(String Name, String Emai, String Gender, String Bithdate, String Address, String Password) {
            this.Name = Name;
            this.Emai = Emai;
            this.Gender = Gender;
            this.Bithdate = Bithdate;
            this.Address = Address;
            this.Password = Password;
        }
     public void Display()
     {
         JOptionPane.showMessageDialog(null,"Name "+getName()+"\nEmail "+getEmai()
                 +"\nGender "+getGender()+"\nPassword "+getPassword());
     }
     
  }
 class Bank
 {
     private String ID,Location,Phone;
     private  float Rate;
     private Person Manager;

        public Bank(String ID, String Location, String Phone, float Rate, Person Manager) {
            this.ID = ID;
            this.Location = Location;
            this.Phone = Phone;
            this.Rate = Rate;
            this.Manager = Manager;
        }

        public String getID() {
            return ID;
        }

        public String getLocation() {
            return Location;
        }

        public String getPhone() {
            return Phone;
        }

        public float getRate() {
            return Rate;
        }

        public Person getManager() {
            return Manager;
        }

        public void setID(String ID) {
            this.ID = ID;
        }

        public void setLocation(String Location) {
            this.Location = Location;
        }

        public void setPhone(String Phone) {
            this.Phone = Phone;
        }

        public void setRate(float Rate) {
            this.Rate = Rate;
        }

        public void setManager(Person Manager) {
            this.Manager = Manager;
        }
     
 }
 class Admain extends Person
 {

        public Admain() {
        }

        public Admain(String Name, String Emai, String Gender, String Bithdate, String Address, String Password) {
            super(Name, Emai, Gender, Bithdate, Address, Password);
        }
     
 }
 class Client extends Person
 {

        public Client() {
        }

        public Client(String Name, String Emai, String Gender, String Bithdate, String Address, String Password) {
            super(Name, Emai, Gender, Bithdate, Address, Password);
        }
     
 }
 class Employee extends Person
 {

        public Employee() {
        }

        public Employee(String Name, String Emai, String Gender, String Bithdate, String Address, String Password) {
            super(Name, Emai, Gender, Bithdate, Address, Password);
        }
     
 }
}
