package view;


import processing.core.PApplet;

public class Main extends PApplet {

	int [][] matriz;
	int tama�ox;
	int tama�oy;
	int tipo;
	int tamano=20;
	int pos=20;
	

	public static void main(String[] args) {
		
		PApplet.main("view.Main");
	}
	
	
	public void settings() {
		size (600,400);
		
		
	}
	
	public void setup() {
		matriz = new int[30][20];
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
			    	
			    	matriz[y][x] = tipo;
			    }else {
			    	
			    	matriz[y][x] = tipo;
			    	
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

		for (int x=0; x < 20; x++) {
			  for (int y=0; y < 30; y++) {
			    if (matriz[y][x]==1) {
			    	fill(0);
			    }else {
			    	fill(255);
			    }
			    
			    rect(pos*y,pos*x,tamano,tamano);
				  
			  }
			}
		

}
	

}
