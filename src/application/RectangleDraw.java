package application;

public class RectangleDraw extends Composite
{
	 double x, y, h, w;
	 
	 LineDraw l1;
	 LineDraw l2;
	 LineDraw l3;
	 LineDraw l4;
	 
	 
	 RectangleDraw(double x,double y, double h, double w)
	 {
		 this.x=x;
		 this.y=y;
		 this.h=h;
		 this.w=w;
		 
	 }

	@Override
	public void buildshape() {
		
		l1=new LineDraw(x,y, x+w, y);
		l2=new LineDraw(x,y, x, y+h);
		l3=new LineDraw(x+w,y, x+w, y+h);
		l4=new LineDraw(x,y+h, x+w, y+h);
		
		shape.add(l1);
		shape.add(l2);
		shape.add(l3);
		shape.add(l4);
		
		
		
		// TODO Auto-generated method stub
		
	}
	
	
	
}
