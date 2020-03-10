import processing.core.PApplet;
import processing.core.PImage;

public class Main extends PApplet {
	
	PImage registro, registroN, login, loginN, 
			inicioR, inicioL, inicio;
	
	int pantalla;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PApplet.main("Main");

	}
	
	public void settings() {
		size(375, 812);
		
	}
	
	public void setup() {
		pantalla = 0;
		
		inicio = loadImage("imagenes/inicio.png");
		inicioL = loadImage("imagenes/inicioL.png");
		inicioR = loadImage("imagenes/inicioR.png");
		login = loadImage("imagenes/login.png");
		loginN = loadImage("imagenes/loginNegro.png");
		registro = loadImage("imagenes/registro.png");
		registroN = loadImage("imagenes/registroNegro.png");
	}
	
	public void draw() {
		background(0);
		
		
		switch(pantalla) {
		case 0:
			//pantalla de inicio
			image(inicio,0,0);
			if(mouseX > 105 && mouseX < 270 && mouseY > 213 && mouseY < 254) {
				image(inicioL,0,0);
			}
			if(mouseX > 105 && mouseX < 270 && mouseY > 282 && mouseY < 325) {
				image(inicioR,0,0);
			}
			
			break;
		case 1:
			//pantalla de login (email y contra)
			image(login,0,0);
			
			break;
		case 2:
			//pantalla de registro (nombre, email y contra)
			image(registro,0,0);
			
			break;
		}
		
		
		fill(355,0,0);
		textSize(30);
		text("x=" + mouseX+ "y=" + mouseY, mouseX, mouseY);
		
		
		
	}
	
	public void mousePressed() {
		switch(pantalla) {
		case 0:
			if(mouseX > 105 && mouseX < 270 && mouseY > 213 && mouseY < 254) {
				pantalla = 1;
			}
			if(mouseX > 105 && mouseX < 270 && mouseY > 282 && mouseY < 325) {
				pantalla = 2;
			}
			break;
		case 1:
			
			break;
		case 2:
			
			break;
			
			
			
		}
		
	}

}
