package view;


import processing.core.PApplet;

public class Main extends PApplet {

	int [][] matriz;
	int tama�ox;
	int tama�oy;
	int tipo;
	

	public static void main(String[] args) {
		
		PApplet.main("view.Main");
	}
	
	
	public void settings() {
		size (600,400);
		
		
	}
	
	public void setup() {
		tama�ox=30;
		tama�oy=20;
		
		
		for (int x=0; x < 20; x++) {
			
			 if (x % 2 == 0) {
			    	
			    	tipo=1;
			    }else {
			    	
			    	tipo=0;
			    	
			    }
			  for (int y=0; y < 30; y++) {
			    if (y % 2 == 0) {
			    	
			    	matriz[x][y]=1;
			    }else {
			    	
			    	matriz[x][y]=0;
			    	
			    }
			    if (tipo==1) {
			    	
			    	tipo=0;
			    }else {
			    	
			    	tipo=1;
			    }
			  }
			}
		
		
	}
	
	public void draw() {
		
		background(150);


}
	

}
