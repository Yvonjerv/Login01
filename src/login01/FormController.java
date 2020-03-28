/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login01;

import com.jfoenix.controls.JFXDatePicker;
import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;

/**
 * FXML Controller class
 *
 * @author YVON
 */
public class FormController implements Initializable {

   @FXML
    private JFXTextField txtFirstName;

    @FXML
    private JFXTextField txtLastName;

    @FXML
    private JFXTextField txtEmail;

    @FXML
    private JFXTextField txtGender;

    @FXML
    private JFXDatePicker txtDob;

    @FXML
    private Button btnSave;

   PreparedStatement preparedStatement;
    Connection connection;
    
    @FXML
    private Label lblStatus;

    public FormController() throws SQLException {
        connection = (Connection) DBConnector.conDB();
    }
 @FXML
    private void FormEvents(ActionEvent event) {
//check if not empty
        
        if (event.getSource() == btnSave) {
            saveData();
        }
      
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    private void saveData() {
            try {
            String st = "INSERT INTO wip_users ( firstname, lastname, email, gender, dob) VALUES (?,?,?,?,?)";
            preparedStatement = (PreparedStatement) connection.prepareStatement(st);
            preparedStatement.setString(1, txtFirstName.getText());
            preparedStatement.setString(2, txtLastName.getText());
            preparedStatement.setString(3, txtEmail.getText());
            preparedStatement.setString(4, txtGender.getText());
            preparedStatement.setString(5, txtDob.getValue().toString());
            
            preparedStatement.executeUpdate();
            lblStatus.setTextFill(Color.GREEN);
            lblStatus.setText("Added Successfully"); 
             } catch (SQLException ex) {
            System.err.println(ex.getMessage());
            lblStatus.setTextFill(Color.TOMATO);
            lblStatus.setText(ex.getMessage());
           
        }
    }
}
