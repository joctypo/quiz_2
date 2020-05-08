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
		matriz = new Cuadrado[20][30];
		tama�ox=30;
		tama�oy=20;
		
		
		for (int y=0; y < 30; y++) {
			
			 if (y % 2 == 0) {
			    	
			    	tipo=1;
			    }else {
			    	
			    	tipo=0;
			    	
			    }
			  for (int x=0; x < 20; x++) {
			 
			    	
			    matriz[x][y]=new Cuadrado((pos*y),(pos*x),tipo, null);
			   
			   
			    if (tipo==1) {
			    	
			    	tipo=0;
			    }else {
			    	
			    	tipo=1;
			    }
			  }
			}
		//System.out.println(matriz[20][19].getTipo()); 
		
	}
	
	public void draw() {
		
		background(150);

		for (int y=0; y < 30; y++) {
			
			  for (int x=0; x < 20; x++) {
			 	
				  if (matriz[x][y].getTipo()==1) {
						
						fill(0);
						
					}else {
						
						fill(255);
					}
					
					rect(matriz[x][y].getPosX(),matriz[x][y].getPosY(),matriz[x][y].getTamano(),matriz[x][y].getTamano());
			   
			  }
			}
		

}
	

}
