package ru.specialist.fxapp;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

public class MainWinController implements Initializable {

    @FXML
    private Label labelHello;

    @FXML
    private TextField txtName;
    
    private WelcomeModel model = new WelcomeModel();

    @FXML
    void onHello(ActionEvent event) {
    	//model.setUserName(txtName.getText());
    	//labelHello.setText(model.getWelcomeString());
    	//String userName = txtName.getText();
    	//String welcome = String.format("Welcome, %s!", userName);
    	//labelHello.setText(welcome);

    }

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		//txtName.setOnKeyPressed( e->{onHello(new ActionEvent());} );
		txtName.textProperty().bindBidirectional(model.userNameProperty());
		labelHello.textProperty().bind(model.welcomeStringProperty());
	}
	
}
