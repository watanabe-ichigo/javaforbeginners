package javaforbeginners;

import java.util.Vector;

public class CarVector extends MyFrame {
	public void run() {
		Vector<Car> cars=new Vector<Car>();
		cars.add(new Car(50,50,1,0));
		cars.add(new Car(50,100,2,0));
		cars.add(new Car(50,150,3,0));
		cars.add(new Car(50,200,4,0));
		cars.add(new Car(50,250,5,0));
		
		while(true) {
			clear();
			for (int j=0; j<cars.size(); j++) {
				
				cars.get(j).draw(this);
				cars.get(j).move(this);
				
			}
			sleep(0.1);
		

}
	}
}
