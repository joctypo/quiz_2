package view;


import processing.core.PApplet;

public class Main extends PApplet {

	Cuadrado[][] matriz;
	int tama�ox;
	int tama�oy;
	int tipo=1;
	int tamano=20;
	int pos=20;
	

	public static void main(String[] args) {
		
		PApplet.main("view.Main");
	}
	
	
	public void settings() {
		size (600,400);
		
		
	}
	
	public void setup() {
		matriz = new Cuadrado[30][20];
		tama�ox=30;
		tama�oy=20;
		
		
		for (int x=0; x < 20; x++) {
			
			 if (x % 2 == 0) {
			    	
			    	tipo=1;
			    }else {
			    	
			    	tipo=0;
			    	
			    }
			  for (int y=0; y < 30; y++) {
			 
			    	
			    	matriz[y][x]=new Cuadrado((pos*y),(pos*x),tipo, null);
			    	
			   
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
			 	
			   matriz[y][x].pintar();
			   
			   
			  }
			}
		

}
	

}
