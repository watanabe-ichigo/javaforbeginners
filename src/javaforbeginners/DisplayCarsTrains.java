package javaforbeginners;

public class DisplayCarsTrains extends MyFrame {

	

	
	
	
	public void run() {
		Vehicle[] vehicles = new Vehicle[6];
		vehicles[0]=new Car(900,30,5,0);
		vehicles[1]=new Car(90,100,-5,0);
		vehicles[2]=new Train(500,150,5,0);
		vehicles[3]=new Train(500,200,-5,0);
		vehicles[4]=new Truck(10,250,5,0);
		vehicles[5]=new Truck(300,300,5,0);
		
		
		
		

		
		
		while(true){
			clear();
			for(int j=0; j<vehicles.length; j++) {
				vehicles[j].draw(this);
				vehicles[j].move(this);
				
			}
			sleep(0.1);
		}
	}
}
