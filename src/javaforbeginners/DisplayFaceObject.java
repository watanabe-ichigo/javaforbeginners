package javaforbeginners;

public class DisplayFaceObject extends MyFrame { 
	public void run() {
		Face face1=new Face(50,50);
		
		face1.draw(this);
		
		Face face2=new Face(200,100);
		
		face2.draw(this);
		
		Face face3=new Face(100,75);
		
		face3.draw(this);
	}
}
