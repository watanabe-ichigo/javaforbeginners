package javaforbeginners;

public class Car  {
	int x,y,vx,vy;
	public Car(int x,int y,int vx) {
		this.x=x;
		this.y=y;
		this.vx=vx;
		
	}
	
	
		public void draw(MyFrame frame) {
			
			
			
			frame.fillRect(x,y,30,10);
			frame.fillRect(x-15,y+10,60,20);
			frame.fillOval(x-15,y+25,20,20);
			frame.fillOval(x+23,y+25,20,20);
			
			
			
		
		
	}
		public void move() {
			x+=vx;
			
			if(x>=400) {
				x=0;
			}
			vx+=2;
		}
		
	
	

}
