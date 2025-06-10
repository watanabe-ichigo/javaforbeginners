package javaforbeginners;

public class Car extends Vehicle  {
	
	
	
	
		public Car(int x, int y, int vx, int vy) {
		super(x, y, vx, vy);
		// TODO 自動生成されたコンストラクター・スタブ
	}

		public void draw(MyFrame frame) {
			
			
			
			frame.fillRect(x,y,30,10);
			frame.fillRect(x-15,y+10,60,20);
			frame.fillOval(x-15,y+25,20,20);
			frame.fillOval(x+23,y+25,20,20);
			
			
			
		
		
	}
		
		
	
	

}
