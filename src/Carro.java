import processing.core.PApplet;

public abstract class Carro {
	
	String nombre;
	int precio;
	String descrip;
	PApplet app;
	
	public Carro(int precio, PApplet app) {
		this.precio = precio;
		this.nombre = "carro";
		this.descrip= "texto";
		this.app = app;
	}
	
	public void registro() {
		
	}
	
	public abstract void comprar();

}
