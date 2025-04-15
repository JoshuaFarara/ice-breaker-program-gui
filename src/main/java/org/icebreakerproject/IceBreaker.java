package org.icebreakerproject;

import javafx.application.Application;
import javafx.event.EventHandler;
//import javafx.geometry.HPos;
//import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
//import javafx.scene.control.Button;
//import javafx.scene.control.Label;
//import javafx.scene.control.RadioButton;
//import javafx.scene.control.TextField;
//import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class IceBreaker extends Application {

//	Add Nodes
	final Button btnAttendance = new Button("Attendance");
	final Button btnSlideActivities = new Button("Slide Activities");
	final Button btnQuiz = new Button("Quiz");
	final Button btnCodeSubmission = new Button("Code Submission");
	final Button btnPresentation = new Button("Presentation");


	@Override // Override the start method in the Application class
	public void start(Stage primaryStage) {
		ImageView imageView = new ImageView("src/main/resources/images/sweetHeartCircleFront.jpg");
		imageView.setFitHeight(300);
		imageView.setFitWidth(405);
		imageView.setOpacity(.25);
		
		//Home/Main Text
		Text text=new Text();
		text.setText("Welcome To The IceBreaker");
		text.setFont(Font.font("Abyssinica SIL", FontWeight.EXTRA_BOLD, 20.0));
		text.setFill(Color.BLUE);
	    text.setX(100);
	    text.setY(100);

		Pane pane = new Pane();
		pane.getChildren().add(text);
		 
		GridPane gridPane = new GridPane();
		
		
//		gridPane.add(imageView,);
//		pane.getChildren().addAll(btnAttendance, btnSlideActivities, btnQuiz, btnCodeSubmission, btnPresentation);
//		gridPane.add(btnAttendance, 0, 4);
//		gridPane.add(btnSlideActivities, 1, 4);
//		gridPane.add(btnQuiz, 2, 4);
//		gridPane.add(btnCodeSubmission, 3, 4);
//		gridPane.add(btnPresentation, 4, 4);
		
		final DropShadow shadow=new DropShadow();
// attempt at switch implementation()come back to this later if implimentation makes sense 
		//		switch(btn) {
//		case btnAttendance:
//			
//			break;
//		}
//		Event Handlers for drop SHadow upon hover!
		btnAttendance.addEventHandler(MouseEvent.MOUSE_ENTERED, new EventHandler<MouseEvent>() 
	    {
	    	@Override
	        public void handle(MouseEvent e) 
	    	{
	    		btnAttendance.setEffect(shadow);
	        }
	    });
		btnAttendance.addEventHandler(MouseEvent.MOUSE_EXITED,new EventHandler<MouseEvent>() 
	    {
	    	@Override
	    	public void handle(MouseEvent e) 
	    	{
	    		btnAttendance.setEffect(null);
	    	}
	    });
		
		btnSlideActivities.addEventHandler(MouseEvent.MOUSE_ENTERED, new EventHandler<MouseEvent>() 
	    {
	    	@Override
	        public void handle(MouseEvent e) 
	    	{
	    		btnSlideActivities.setEffect(shadow);
	        }
	    });
		
		btnSlideActivities.addEventHandler(MouseEvent.MOUSE_EXITED,new EventHandler<MouseEvent>() 
	    {
	    	@Override
	    	public void handle(MouseEvent e) 
	    	{
	    		btnSlideActivities.setEffect(null);
	    	}
	    });
		btnQuiz.addEventHandler(MouseEvent.MOUSE_ENTERED, new EventHandler<MouseEvent>() 
	    {
	    	@Override
	        public void handle(MouseEvent e) 
	    	{
	    		btnQuiz.setEffect(shadow);
	        }
	    });
		
		btnQuiz.addEventHandler(MouseEvent.MOUSE_EXITED,new EventHandler<MouseEvent>() 
	    {
	    	@Override
	    	public void handle(MouseEvent e) 
	    	{

	    		btnQuiz.setEffect(null);
	    	}
	    });
		btnCodeSubmission.addEventHandler(MouseEvent.MOUSE_ENTERED, new EventHandler<MouseEvent>() 
	    {
	    	@Override
	        public void handle(MouseEvent e) 
	    	{
	    		btnCodeSubmission.setEffect(shadow);
	        }
	    });
		
		btnCodeSubmission.addEventHandler(MouseEvent.MOUSE_EXITED,new EventHandler<MouseEvent>() 
	    {
	    	@Override
	    	public void handle(MouseEvent e) 
	    	{
	    		btnCodeSubmission.setEffect(null); 		
	    	}
	    });
		btnPresentation.addEventHandler(MouseEvent.MOUSE_ENTERED, new EventHandler<MouseEvent>() 
	    {
	    	@Override
	        public void handle(MouseEvent e) 
	    	{
	    		btnPresentation.setEffect(shadow);
	        }
	    });
		
		btnPresentation.addEventHandler(MouseEvent.MOUSE_EXITED,new EventHandler<MouseEvent>() 
	    {
	    	@Override
	    	public void handle(MouseEvent e) 
	    	{
	    		btnPresentation.setEffect(null);
	    	}
	    });
		
		
	    gridPane.add(btnAttendance, 0, 4);
	    gridPane.add(btnSlideActivities, 1, 4);
		gridPane.add(btnQuiz, 2, 4);
		gridPane.add(btnCodeSubmission, 3, 4);
		gridPane.add(btnPresentation, 4, 4);
		
		
		StackPane layout = new StackPane();
		layout.getChildren().addAll(imageView,pane, gridPane );

		Scene scene = new Scene(layout, 405, 300);
		primaryStage.setTitle("Ice Breaker Program"); // Set title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// sample line in remote
		System.out.println("testing");
		launch(args);
	}

}
