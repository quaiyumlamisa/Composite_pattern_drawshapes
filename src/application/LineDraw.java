package application;
import javafx.scene.shape.Line;
public class LineDraw  implements Ishape
{

	  double x1;
	  double y1;
	  double x2;	  
	  double y2;
	  
	  public LineDraw(double x1,double y1,double x2,double y2)
	  {
		  this.x1=x1;
		  this.x2=x2;
		  this.y1=y1;
		  this.y2=y2;
		  
	  }
	@Override
	public Line draw() 
	{
		Line line1 = new Line();
		
		line1.setStartX(x1); 
    	line1.setStartY(y1); 
    	line1.setEndX(x2); 
    	line1.setEndY(y2);
    	
		return line1;
    	
    	

		
	}
}
