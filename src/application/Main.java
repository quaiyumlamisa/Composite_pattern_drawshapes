package application;
	
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;


public class Main extends Application {
	@Override
	public void start(Stage stage) {
		try {
			    
			    Button circle=new Button("Circle"); 
			    Button rectangle=new Button("Rectangle");
			    Button line=new Button("Line");	    
			    HBox box1 = new HBox(5);
		        box1.setPadding(new Insets(100,100 ,100,100));
		        box1.setSpacing(40);
		        box1.setStyle("-fx-background-color: #336699;");
		        box1.setPrefSize(600,200);
		        box1.getChildren().addAll(line,circle,rectangle);
		        
		       
                circle.setOnAction(e->{
		        		        	
		        	StackPane root2=new StackPane();
		        	CircleDraw c=new CircleDraw(330,200,50);
		        	root2.getChildren().add(c.draw());
		        	Scene scene2=new Scene(root2, 200, 200);
		        	Stage stage2=new Stage();	        	
		        	stage2.setScene(scene2);
		        	stage2.show();
		        	 
		        });
		       
		       
		      		        
		        line.setOnAction(e ->
		        {
		        	
		        	StackPane root3=new StackPane();
		        	LineDraw l=new LineDraw(0,20,100,20);		        	
		        	root3.getChildren().add(l.draw());
		        	Scene scene3=new Scene(root3, 200, 200);
		        	Stage stage3=new Stage();	        	
		        	stage3.setScene(scene3);
		        	stage3.show();
		        		        
		        });
		        
		        
		        rectangle.setOnAction(e -> 
		        {
		        
		        
		        	StackPane root4=new StackPane();
		        	root4.getChildren().add((Node) new RectangleDraw(50,50,80, 100).draw());
		        	Scene scene4=new Scene(root4, 200, 200);
		        	Stage stage4=new Stage();
		  		    stage4.setScene(scene4);
		        	stage4.show();
			    });
		        
		        
		        stage.setTitle("Draw shapes"); 
		        Scene scene=new Scene(box1, 600, 200);
		        stage.setScene(scene);
		        stage.show();  
		        
		        
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
