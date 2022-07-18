package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private Button button;

    @FXML
    private Label label;

    @FXML
    private PasswordField password;

    @FXML
    private TextField username;

    @FXML
    void btnOnClicked(ActionEvent event) {

        if(username.getText().equals("Anderson") && password.getText().equals("1234567")){

            label.setText("Bem Vindo!");

        }
        else{

            label.setText("Username ou Password Incorretos");
        }



    }

}
