package javaforbeginners;

public class Car  {
	int x,y;
	public Car(int x,int y) {
		this.x=x;
		this.y=y;
	}
	
	
		public void draw(MyFrame frame) {
			
			
			
			frame.fillRect(x,y,30,10);
			frame.fillRect(x-15,y+10,60,20);
			frame.fillOval(x-15,y+25,20,20);
			frame.fillOval(x+23,y+25,20,20);
			
			
			
		
		
	}
		
	
	

}
