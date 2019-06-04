package Czytelnik.Controller;


import Czytelnik.Model.Czytelnik;
import Czytelnik.Model.Database;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import javax.swing.*;
import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LoginController extends Database implements Initializable {
//    authUsers authUser = new authUsers();

    public LoginController() throws SQLException {
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    @FXML
    private JFXTextField loginfield;
    @FXML
    private JFXPasswordField passfield;

    @FXML
    public void onEnter(ActionEvent ae) throws SQLException {
        Czytelnik czytelnik = new Czytelnik();
        czytelnik.login = loginfield.getText();
        czytelnik.haslo = passfield.getText();
        pobierzCzytelnikow();
//        String hash = authUser.get_SHA_512_SecurePassword(user.password, "projekt");

        if (logowanie(wynik, czytelnik.login, czytelnik.haslo).equals("zalogowany")) {
            FXMLLoader Loader = new FXMLLoader();
            Loader.setLocation(getClass().getResource("../View/Czytelnik.fxml"));
            try {
                Loader.load();
            } catch (IOException ex) {
                Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
            }
            AppController display = Loader.getController();
//            display.setConfig(user);
//            display.setName();
            Parent blah = Loader.getRoot();
            Stage appStage = (Stage) ((Node) ae.getSource()).getScene().getWindow();
            appStage.setScene(new Scene(blah));
            appStage.show();

        } else {
            Alert errorAlert = new Alert(Alert.AlertType.ERROR);
            errorAlert.setHeaderText("Uwaga");
            errorAlert.setContentText("Niepoprawne dane!");
            errorAlert.showAndWait();
        }
    }

    @FXML
    public void LoginTo(MouseEvent event) throws ClassNotFoundException, UnsupportedLookAndFeelException, InstantiationException, IllegalAccessException, SQLException, IOException {
        Czytelnik czytelnik = new Czytelnik();
        czytelnik.login = loginfield.getText();
        czytelnik.haslo = passfield.getText();
        pobierzCzytelnikow();
//        String hash = authUser.get_SHA_512_SecurePassword(user.password, "projekt");

        if (logowanie(wynik, czytelnik.login, czytelnik.haslo).equals("zalogowany")) {
            FXMLLoader Loader = new FXMLLoader();
            Loader.setLocation(getClass().getResource("../View/Czytelnik.fxml"));
            try {
                Loader.load();
            } catch (IOException ex) {
                Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
            }
            AppController display = Loader.getController();
//            display.setConfig(user);
//            display.setName();
            Parent blah = Loader.getRoot();
            Stage appStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            appStage.setScene(new Scene(blah));
            appStage.show();

        } else {
            Alert errorAlert = new Alert(Alert.AlertType.ERROR);
            errorAlert.setHeaderText("Uwaga");
            errorAlert.setContentText("Niepoprawne dane!");
            errorAlert.showAndWait();
        }
    }
}