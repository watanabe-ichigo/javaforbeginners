package javaforbeginners;

public class Animation extends MyFrame {
	public void run() {
		setColor(0,128,0);
		int y = 170;
		int x = 30;
	
		//5-1
		/*while(y>=80) {//永久に繰り返す
			//⑴画面を消す
			clear();
			//⑵四角形を表示する
			setColor(0,128,0);
			fillOval (x,y,100,100);
			
			y-=5;
			
			sleep(0.016);
			
		}
		while(x<=400) {//永久に繰り返す
			//⑴画面を消す
			clear();
			//⑵四角形を表示する
			setColor(0,128,0);
			fillOval (x,y,100,100);
			
			x+=5;
			
			sleep(0.016);*/
		//5-2
		/*y = 80;
		while(y<=200) {//永久に繰り返す
		//⑴画面を消す
		clear();
		//⑵四角形を表示する
		setColor(0,128,0);
		fillOval (x,y,10,10);
		
		y+=5;
		x+=5;
		sleep(0.016);
		
	}
	while(x>=30) {//永久に繰り返す
		//⑴画面を消す
		clear();
		//⑵四角形を表示する
		setColor(0,128,0);
		fillOval (x,y,10,10);
		
		x-=5;
		
		sleep(0.016);
		

	}
	while(y>=80) {//永久に繰り返す
		//⑴画面を消す
		clear();
		//⑵四角形を表示する
		setColor(0,128,0);
		fillOval (x,y,10,10);
		
		y-=5;
		x+=5;
		sleep(0.016);
		
	}*/
		//5－3
		/*for(int i = 0; i < 3; i++) {
			
		
			
			
			
			
			while(x<=170) {//永久に繰り返す
				//⑴画面を消す
				clear();
				//⑵四角形を表示する
				setColor(0,128,0);
				fillOval (x,100,10,10);
				
				x+=5;
				
				sleep(0.016);
			
				
			}
			while(x>=30) {//永久に繰り返す
				//⑴画面を消す
				clear();
				//⑵四角形を表示する
				setColor(0,128,0);
				fillOval (x,100,10,10);
				
				x-=5;
				
				sleep(0.016);
			
				
			}*/
		//5-EX
/*		while(true) {
			
			while(x<=170) {//永久に繰り返す
				//⑴画面を消す
				clear();
				//⑵四角形を表示する
				setColor(0,128,0);
				fillOval (x,80,10,10);
				
				x+=5;
				
				sleep(0.016);
			}
			y = 80;
			while(y<=170) {//永久に繰り返す
			//⑴画面を消す
			clear();
			//⑵四角形を表示する
			setColor(0,128,0);
			fillOval (x,y,10,10);
			
			y+=5;
			
			sleep(0.016);
			}
			while(x>=30) {//永久に繰り返す
				//⑴画面を消す
				clear();
				//⑵四角形を表示する
				setColor(0,128,0);
				fillOval (x,170,10,10);
				
				x-=5;
				
				sleep(0.016);
			}
			while(y>=80) {//永久に繰り返す
			//⑴画面を消す
			clear();
			//⑵四角形を表示する
			setColor(0,128,0);
			fillOval (x,y,10,10);
			
			y-=5;
			
			sleep(0.016);
			
		}*/
			y=40;
			x=30;
			int z=10;
			int v=10;
			while(true) {
				//⑴画面を消す
				clear();
				//⑵四角形を表示する
				setColor(0,128,0);
				fillOval (x,y,10,10);
				
				if(y==z*4) {
					while(x<=100) {
						clear();
						//⑵四角形を表示する
						setColor(0,128,0);
						fillOval (x,y,10,10);
						
						x+=5;
						sleep(0.016);
						
					}
				
				}
				
					else if(y==v*7) {
					while(x>=30) {
						clear();
						//⑵四角形を表示する
						setColor(0,128,0);
						fillOval (x,y,10,10);
						
						x-=5;
						sleep(0.016);
						
					}
				
					
				
				}
				sleep(0.016);
				y+=5;
				z=z*4;
				v=v*7;
				if(y==250) {
					y=40;
					
				}
				
				
			}
			
			
			
		}
		
	
	


	}
	





