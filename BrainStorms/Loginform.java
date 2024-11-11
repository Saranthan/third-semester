//java program to showcase the working of javaFx

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.Eventhandler;
import javafx.event;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.Stage;
import javafx.scene.*;
class LoginForm extends Application{
	private String username="admin";
	private String password="admin";
	private int attempt=0;
	public static void start(Stage PrimaryStage){
		PrimaryStage.setTitle("Login Form");
		GridPane grid=new GridPane();
		grid.setAlignment(Pos.CENTER);
		grid.setHgap(10);
		grid.setVgap(10);
	}
}
		