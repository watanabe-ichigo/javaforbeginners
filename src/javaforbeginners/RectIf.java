package javaforbeginners;

public class RectIf extends MyFrame {
	public void run() {
		setColor(0,0,0);
		int x = 30;
		/*for(int i = 0 ; i < 10 ; i++) {
			if(i==4) {
				fillRect(x,100,10,100);
			}else {
				fillRect(x,80,10,100);
			}
			x+=20;
		}
		int y =100;
		for(int i = 0; i<10;i++) {
			fillRect(x,y,10,100);
			x+=20;
			y+=20;
			
		}
		int z =30;
		int j =30;
		for(int i = 0; i<10;i++) {
			fillRect(j,200,10,z);
			z+=20;
			j+=20;
			
		}
		for(int i = 0; i<10;i++) {
			fillRect(j,250,10,100);
			
			j+=20;
		
			
		}*/
		int c = 0;
		int o = 0;
		int r = 0;
		int v =0;
		for(int i = 0; i < 20; i++) {
			fillRect(x,100,10,100);
			x+=20;
			setColor(c,o,r);
			
			v++;
			
			if(v >8) {
			c-=20;
			o-=20;
			r-=20;
		}else  {
			c+=20;
			o+=20;
			r+=20;

	}
	}
	}
}
