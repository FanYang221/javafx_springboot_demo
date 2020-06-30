package com.gauss.fxboot.demo.controller;


import com.gauss.fxboot.demo.service.IUserService;
import de.felixroske.jfxsupport.FXMLController;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import org.springframework.beans.factory.annotation.Autowired;

import java.net.URL;
import java.util.ResourceBundle;

@FXMLController
public class LoginStageController implements Initializable {


    @FXML
    private TextField username;

    @FXML
    private TextField password;

    @FXML
    private Button loginButton;

    @Autowired
    private IUserService userService;


    @FXML
    private void login(){
        String account = username.getCharacters().toString();
        String pwd = password.getCharacters().toString();
        userService.loginVerify(account, pwd);
    }


    public void initialize(URL location, ResourceBundle resources) {

    }
}
