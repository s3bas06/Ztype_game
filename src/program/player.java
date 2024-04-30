package program;

import javax.swing.ImageIcon;

public class player extends ImageIcon {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int x;
	int y;
	int width;
	int height;
	ImageIcon textura;
	Boolean lanzar;
	
	public player(int x, int y, int width, int height, ImageIcon textura, Boolean lanzar) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.textura = textura;
		this.lanzar = lanzar;
	}

	public Boolean getLanzar() {
		return lanzar;
	}

	public void setLanzar(Boolean lanzar) {
		this.lanzar = lanzar;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public ImageIcon getTextura() {
		return textura;
	}

	public void setTexura(ImageIcon textura) {
		this.textura = textura;
	}
	
	public boolean colision(player paredes[]) {
		int tam = paredes.length;
		for(int i =0; i<tam-1  ; i++) {
			if(
				((this.getX()	+ this.getWidth()) >= (paredes[i].getX())) && 
				((this.getX()) <= (paredes[i].getX() + paredes[i].getWidth())) &&
				(this.getY() + this.getHeight() >= paredes[i].getY()) &&
				(this.getY() <= (paredes[i].getY() + paredes[i].getHeight()))
				) {
				return true;
			}			
		}
		
		return false;
		
	}
	
	
	
	
}
