package javaforbeginners;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Car extends Vehicle implements KeyListener  {
	
	
	
	
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

		@Override//キーボードから文字が入力された場合に実行
		public void keyTyped(KeyEvent e) {
			// TODO 自動生成されたメソッド・スタブ
			
		}

		@Override//キーが押された時
		public void keyPressed(KeyEvent e) {
			// TODO 自動生成されたメソッド・スタブ
			if(e.getKeyCode()==KeyEvent.VK_LEFT) {
				vx=-5;
			}
			if(e.getKeyCode()==KeyEvent.VK_RIGHT) {
				vx=5;
			}
			if(e.getKeyCode()==KeyEvent.VK_UP) {
				vy=-5;
			}
			if(e.getKeyCode()==KeyEvent.VK_DOWN) {
				vy=5;
			}
		}

		@Override//押されていたキーが話された時
		public void keyReleased(KeyEvent e) {
			// TODO 自動生成されたメソッド・スタブ
			if(e.getKeyCode()==KeyEvent.VK_LEFT) {
				vx=0;
			}
			if(e.getKeyCode()==KeyEvent.VK_RIGHT) {
				vx=0;
			}
			if(e.getKeyCode()==KeyEvent.VK_UP) {
				vy=0;
			}
			if(e.getKeyCode()==KeyEvent.VK_DOWN) {
				vy=0;
			}
		}
		
		
	
	

}
