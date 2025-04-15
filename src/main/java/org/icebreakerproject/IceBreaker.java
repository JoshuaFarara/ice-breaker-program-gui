package org.icebreakerproject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
//import javafx.scene.control.Button;
//import javafx.scene.control.Label;
//import javafx.scene.control.RadioButton;
//import javafx.scene.control.TextField;
//import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class IceBreaker extends Application {

//	add window datamembers
	final int WINDOW_WIDTH = 805;
	final int WINDOW_HEIGHT = 600;
//	Add Nodes
	final Button btnAttendance = new Button("Attendance");
	final Button btnSlideActivities = new Button("Slide Activities");
	final Button btnQuiz = new Button("Quiz");
	final Button btnCodeSubmission = new Button("Code Submission");
	final Button btnPresentation = new Button("Presentation");
	final Button btnEC = new Button("EC");

	Button[] arrButtons = {btnAttendance, btnSlideActivities, btnQuiz, btnCodeSubmission, btnPresentation};
	protected ArrayList<Button> listButtons = new ArrayList<>(Arrays.asList(arrButtons));
	
	
//	Create COnstructors to create default IceBreaker Program 
//	public IceBreaker() {
//		
//	}
//	
	
	
	
	@Override // Override the start method in the Application class
	public void start(Stage primaryStage) {
		final DropShadow shadow=new DropShadow();
		
		//Adding background image
		ImageView imageView = new ImageView("src/main/resources/images/sweetHeartCircleFront.jpg");
		imageView.setFitHeight(WINDOW_HEIGHT);
		imageView.setFitWidth(WINDOW_WIDTH);
		imageView.setOpacity(.25); // add opacity to an image
		
		//Home/Main Text
		Text text=new Text();
		text.setText("Welcome To The IceBreaker");
		text.setFont(Font.font("Abyssinica SIL", FontWeight.EXTRA_BOLD, 20.0));
		text.setFill(Color.BLUE);
	    text.setX(100);
	    text.setY(100);

		Pane pane = new Pane(); // pane is used to show the text on the screen, used before showing gridpane
		pane.getChildren().add(text);
		
		 
		BorderPane borderPane = new BorderPane(); //adding a border pane to hold the buttons dynamically
		HBox hBoxTop = new HBox();
		//Will need to replace GridPane for scalability.
		GridPane gridPane = new GridPane();
		
//		for (int i = 0; i < 5; i++) {
//			
//			hBoxTop.getChildren().add(gridPane);
//		}
		
		// gridpane before adding the drop shadows, these buttons are now below.
//		gridPane.add(imageView,);
//		pane.getChildren().addAll(btnAttendance, btnSlideActivities, btnQuiz, btnCodeSubmission, btnPresentation);
//		gridPane.add(btnAttendance, 0, 4);
//		gridPane.add(btnSlideActivities, 1, 4);
//		gridPane.add(btnQuiz, 2, 4);
//		gridPane.add(btnCodeSubmission, 3, 4);
//		gridPane.add(btnPresentation, 4, 4);
		
		
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
		
		//Better to place buttons with a for loop
		// Adding buttons to the gridpane layout
	    gridPane.add(btnAttendance, 0, 4);
	    gridPane.add(btnSlideActivities, 1, 4);
		gridPane.add(btnQuiz, 2, 4);
		gridPane.add(btnCodeSubmission, 3, 4);
		gridPane.add(btnPresentation, 4, 4);
		gridPane.add(btnEC, 5, 4);
		
//		Creating the border pane layout below.
//		hBoxTop.add(btnAttendance);
		
		
		// Adding stackpane to hold the background image, pane, and buttons on the gridpane
		StackPane layout = new StackPane();
		layout.getChildren().addAll(imageView,pane, gridPane );

		Scene scene = new Scene(layout, WINDOW_WIDTH, WINDOW_HEIGHT);
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
