package application;
import java.util.ArrayList;
import javafx.scene.Node;

import javafx.scene.Group;

public  abstract class Composite implements Ishape {

	ArrayList<Ishape>shape=new ArrayList<Ishape>();
	Group group;
	  
	public abstract void buildshape();
	  
	 
	  
	  public Object draw()
	  {
		group=new Group();
		buildshape();
		
		for(int i=0;i<shape.size();i++)
		{
			shape.get(i).draw();
			group.getChildren().add( (Node) shape.get(i).draw() );
		}
		return group;
		  
	  }
}
