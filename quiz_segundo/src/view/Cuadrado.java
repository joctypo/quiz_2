package view;
import processing.core.PApplet;
public class Cuadrado implements Runnable{
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
	
	public int getPosX() {
		return posX;
	}

	public void setPosX(int posX) {
		this.posX = posX;
	}

	public int getPosY() {
		return posY;
	}

	public void setPosY(int posY) {
		this.posY = posY;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public int getTamano() {
		return tamano;
	}

	public void setTamano(int tamano) {
		this.tamano = tamano;
	}

	@Override
	public void run() {
		mover();
		try {
			
			Thread.sleep(10);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		
	}
	
	public void mover() {
		
		this.posY=posY-20;
		this.posX=posX-20;
		
	}


	
	
	
	
}
