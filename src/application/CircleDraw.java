package application;

import javafx.scene.shape.Circle;

public class CircleDraw implements Ishape
{
	double x;
	double y;
	double r;
	
	public CircleDraw(double x,double y,double r)
	{
		this.x=x;
		this.y=y;
		this.r=r;
	}

	@Override
	public Circle draw()
	{
		Circle c=new Circle();
		
		c.setCenterX(x); 
		c.setCenterY(y); 
		c.setRadius(r);
		
		return c;
		
	} 
	
	

}
