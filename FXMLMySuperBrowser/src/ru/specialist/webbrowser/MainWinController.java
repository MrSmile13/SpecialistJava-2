package ru.specialist.webbrowser;

import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.Pane;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

public class MainWinController implements Initializable 
{
	
	@FXML
	private TextField txtURL;
	@FXML
	private WebView browser;
	
	

	@FXML
	private void GO(ActionEvent e)
	{
		if (!txtURL.getText().isEmpty())
			browser.getEngine().load(txtURL.getText());
		
	}

	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		txtURL.setText("http://www.specialist.ru");
		txtURL.setOnAction( this::GO );
		GO(new ActionEvent());
	}
	
}
