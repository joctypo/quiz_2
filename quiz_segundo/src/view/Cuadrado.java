package view;
import processing.core.PApplet;
public class Cuadrado {
	 private PApplet app;
	 private int posX;
	 private int posY;
	 private int tipo;
	 private int tamano;
	public Cuadrado(int posX, int posY, int tipo, PApplet app) {
		
		this.app=app;
		this.tamano=20;
		this.posX=posX;
		this.posY=posY;
		this.tipo=tipo;
		
		
	}
	
	public void pintar(){
		
		if (tipo==1) {
			
			app.fill(0);
			
		}else {
			
			app.fill(255);
		}
		app.rect(posX,posY,tamano,tamano);
		
	}
	
	
	
	
}
