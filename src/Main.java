
import java.util.ArrayList;

import controlP5.ControlP5;
import controlP5.Textfield;
import processing.core.PApplet;
import processing.core.PFont;
import processing.core.PImage;

public class Main extends PApplet {
	
	PImage registro, registroN, login, loginN, 
			inicioR, inicioL, inicio, shop, shopC, shopN,
			flecha, flechaI, cambio, cambioP, barra, user, home, lupa,
			tl, sl, xl, yl, teslax, teslas, teslat, teslay, tres, ese, equis, ye,
			historial, tcom, scom, ycom, xcom, tadd,sadd,yadd,xadd, hora;
	
	int pantalla;
	
	ControlP5 control, controlP;
	Textfield username, contra;

	
	
	ArrayList<User> usuario = new ArrayList<User>();
	
	boolean foto2, foto3;
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PApplet.main("Main");

	}
	
	public void settings() {
		size(375, 812);
		
	}
	
	public void setup() {
		pantalla = 0;
		foto2 = false;
		foto3 = false;
		
		usuario.add(new User("test","test","text"));
		
		control = new ControlP5(this);
		controlP = new ControlP5(this);
		PFont font = createFont ("arial", 20);
		
		username = control.addTextfield("")
		.setPosition(16,304)
		.setSize(342,52)
		.setColorBackground(355)
		.setColorActive(355)
		.setColorLabel(355)
		.setColorCaptionLabel(355)
		.setColorForeground(355)
		.setFont(font)
		;
		
		contra = control.addTextfield(" ")
		.setPosition(16,420)
		.setSize(342,52)
		.setColorBackground(355)
		.setColorActive(355)
		.setColorLabel(355)
		.setColorCaptionLabel(355)
		.setColorForeground(355)
		.setFont(font)
		;
		
		inicio = loadImage("imagenes/inicio.png");
		inicioL = loadImage("imagenes/inicioL.png");
		inicioR = loadImage("imagenes/inicioR.png");
		login = loadImage("imagenes/login.png");
		loginN = loadImage("imagenes/loginNegro.png");
		registro = loadImage("imagenes/registro.png");
		registroN = loadImage("imagenes/registroNegro.png");
		shop = loadImage("imagenes/shop.png");
		shopC = loadImage("imagenes/shopCompleto.png");
		shopN = loadImage("imagenes/shopNegro.png");
		flecha = loadImage("imagenes/flechaDer.png");
		flechaI = loadImage("imagenes/flechaIzq.png");
		cambio = loadImage("imagenes/cambioP2.png");
		cambioP = loadImage("imagenes/cambioP.png");
		barra = loadImage("imagenes/barra.png");
		user = loadImage("imagenes/user.png");
		home = loadImage("imagenes/home.png");
		lupa = loadImage("imagenes/lupa.png");
		tl = loadImage("imagenes/tesla3largo.png");
		sl = loadImage("imagenes/teslaSlargo.png");
		xl = loadImage("imagenes/teslaXlargo.png");
		yl = loadImage("imagenes/teslaYlargo.png");
		tres = loadImage("imagenes/3.png");
		equis = loadImage("imagenes/x.png");
		ye = loadImage("imagenes/y.png");
		ese = loadImage("imagenes/s.png");
		historial = loadImage("imagenes/Historial.png");
		tcom = loadImage("imagenes/3co.png");
		scom = loadImage("imagenes/sco.png");
		ycom = loadImage("imagenes/yco.png");
		xcom = loadImage("imagenes/xco.png");
		hora = loadImage("imagenes/hora.png");
		sadd = loadImage("imagenes/sadd.png");
		yadd = loadImage("imagenes/yadd.png");
		tadd = loadImage("imagenes/3add.png");
		xadd = loadImage("imagenes/xadd.png");
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
			
			username.hide();
			contra.hide();
			
			image(hora,0,0);
			break;
		case 1:
			//pantalla de login (email y contra)
			image(login,0,0);
			if(mouseX > 36 && mouseX < 336 && mouseY > 737 && mouseY < 788) {
				image(loginN,0,0);
			}
			
			username.show();
			contra.show();
			
			break;
		case 2:
			//pantalla de registro (nombre, email y contra)
			image(registro,0,0);
			if(mouseX > 36 && mouseX < 336 && mouseY > 737 && mouseY < 788) {
				image(registroN,0,0);
			}
			
			username.hide();
			contra.hide();
			break;
		case 3:
			//pantalla de compra
			image(shop,-20,0);
			if(mouseX > 124 && mouseY > 648 && mouseX < 252 && mouseY < 686) {
				image(shopN,-20,0);
			}
			
			//interaccion cambio de fotos
			if(foto2 == false && foto3 == false) {
				noStroke();
				fill(0);
				ellipse(164,570,12,12);
			}
			if (foto2 == true) {
				image(cambio,-20,227);
				noStroke();
				fill(0);
				ellipse(189,570,12,12);
			}
			if (foto3 == true) {
				image(cambioP,-20,227);
				noStroke();
				fill(0);
				ellipse(212,570,12,12);
			}
			
			
			//interaccion flechas
			if(mouseX > 319 && mouseX < 373 && mouseY > 390 && mouseY < 430) {
				image(flecha,318,388,36,36);
			}else {
				image(flecha,320,390,30,30);
			}
			
			if(mouseX > 15 && mouseX < 55 && mouseY > 390 && mouseY < 430) {
				image(flechaI,13,388,36,36);
			}else {
				image(flechaI,15,390,30,30);
			}
			
			//interaccion barra inferior
			image(barra,0,728);
			if(mouseX > 57 && mouseY > 744 && mouseX < 85 && mouseY < 780) {
				image(home,0,728);
			}
			if(mouseX > 171 && mouseY > 744 && mouseX < 206 && mouseY < 780) {
				image(lupa,0,728);
			}
			if(mouseX > 291 && mouseY > 744 && mouseX < 320 && mouseY < 780) {
				image(user,0,728);
			}
			
			
			username.hide();
			contra.hide();
			image(hora,0,0);
			break;
		case 4:
			//pantalla de modelos
			image(shopC,0,0);
			image(barra,0,728);
			
			//interaccion fotos
			if(mouseX > 20 && mouseY > 87 && mouseX < 355 && mouseY < 200) {
				image(tl, -20,55);
			}
			if(mouseX > 20 && mouseY > 255 && mouseX < 355 && mouseY < 390) {
				image(sl, -20,230);
			}
			if(mouseX > 20 && mouseY > 444 && mouseX < 355 && mouseY < 560) {
				image(yl, -20,419);
			}
			if(mouseX > 20 && mouseY > 610 && mouseX < 355 && mouseY < 717) {
				image(xl, -20,590);
			}
			
			
			//interaccion barras
			if(mouseX > 57 && mouseY > 744 && mouseX < 85 && mouseY < 780) {
				image(home,0,728);
			}
			if(mouseX > 171 && mouseY > 744 && mouseX < 206 && mouseY < 780) {
				image(lupa,0,728);
			}
			if(mouseX > 291 && mouseY > 744 && mouseX < 320 && mouseY < 780) {
				image(user,0,728);
			}
			
			username.hide();
			contra.hide();
			image(hora,0,0);
			break;
		case 5:
			//pantalla usuario
			image(historial,0,0);
			image(barra,0,728);
			
			//interaccion barras
			if(mouseX > 57 && mouseY > 744 && mouseX < 85 && mouseY < 780) {
				image(home,0,728);
			}
			if(mouseX > 171 && mouseY > 744 && mouseX < 206 && mouseY < 780) {
				image(lupa,0,728);
			}
			if(mouseX > 291 && mouseY > 744 && mouseX < 320 && mouseY < 780) {
				image(user,0,728);
			}
			
			
			image(hora,0,0);
			break;
		case 6:
			//carro tesla 3
			image(tres,0,0);
			
			if(mouseX > 27 && mouseX < 690 && mouseY > 669 && mouseY < 709) {
				image(tadd,0,0);
			}
			if(mouseX > 220 && mouseX < 350 && mouseY > 669 && mouseY < 709) {
				image(tcom,0,0);
			}
			
			image(barra,0,728);
			
			
			//interaccion barras
			if(mouseX > 57 && mouseY > 744 && mouseX < 85 && mouseY < 780) {
				image(home,0,728);
			}
			if(mouseX > 171 && mouseY > 744 && mouseX < 206 && mouseY < 780) {
				image(lupa,0,728);
			}
			if(mouseX > 291 && mouseY > 744 && mouseX < 320 && mouseY < 780) {
				image(user,0,728);
			}
			
			
			image(hora,0,0);
			break;
		case 7:
			//carro tesla s
			image(ese,0,0);
			
			if(mouseX > 27 && mouseX < 690 && mouseY > 669 && mouseY < 709) {
				image(sadd,0,0);
			}
			if(mouseX > 220 && mouseX < 350 && mouseY > 669 && mouseY < 709) {
				image(scom,0,0);
			}
			
			image(barra,0,728);
			
			
			//interaccion barras
			if(mouseX > 57 && mouseY > 744 && mouseX < 85 && mouseY < 780) {
				image(home,0,728);
			}
			if(mouseX > 171 && mouseY > 744 && mouseX < 206 && mouseY < 780) {
				image(lupa,0,728);
			}
			if(mouseX > 291 && mouseY > 744 && mouseX < 320 && mouseY < 780) {
				image(user,0,728);
			}
			
			
			image(hora,0,0);
			break;
		case 8:
			//carro tesla y
			image(ye,0,0);
			
			if(mouseX > 27 && mouseX < 690 && mouseY > 669 && mouseY < 709) {
				image(yadd,0,0);
			}
			if(mouseX > 220 && mouseX < 350 && mouseY > 669 && mouseY < 709) {
				image(ycom,0,0);
			}
			
			image(barra,0,728);
			
			
			//interaccion barras
			if(mouseX > 57 && mouseY > 744 && mouseX < 85 && mouseY < 780) {
				image(home,0,728);
			}
			if(mouseX > 171 && mouseY > 744 && mouseX < 206 && mouseY < 780) {
				image(lupa,0,728);
			}
			if(mouseX > 291 && mouseY > 744 && mouseX < 320 && mouseY < 780) {
				image(user,0,728);
			}
			
			
			image(hora,0,0);
			break;
		case 9:
			//carro tesla x
			image(equis,0,0);
			
			
			if(mouseX > 27 && mouseX < 690 && mouseY > 669 && mouseY < 709) {
				image(xadd,0,0);
			}
			if(mouseX > 220 && mouseX < 350 && mouseY > 669 && mouseY < 709) {
				image(xcom,0,0);
			}
			
			image(barra,0,728);
			
			
			//interaccion barras
			if(mouseX > 57 && mouseY > 744 && mouseX < 85 && mouseY < 780) {
				image(home,0,728);
			}
			if(mouseX > 171 && mouseY > 744 && mouseX < 206 && mouseY < 780) {
				image(lupa,0,728);
			}
			if(mouseX > 291 && mouseY > 744 && mouseX < 320 && mouseY < 780) {
				image(user,0,728);
			}
			
			
			image(hora,0,0);
			break;
		}
			
		
		fill(355,0,0);
		textSize(9);
		text("x=" + mouseX+ "y=" + mouseY, mouseX, mouseY);
		
	}
	
	public void mousePressed() {
		
		switch(pantalla) {
		case 0:
			//home
			if(mouseX > 105 && mouseX < 270 && mouseY > 213 && mouseY < 254) {
				pantalla = 1;
			}
			if(mouseX > 105 && mouseX < 270 && mouseY > 282 && mouseY < 325) {
				pantalla = 2;
			}
			break;
		case 1:
			//login
			if(mouseX > 36 && mouseX < 336 && mouseY > 737 && mouseY < 788) {
				pantalla = 3;
			}
			break;
		case 2:
			//register
			if(mouseX > 36 && mouseX < 336 && mouseY > 737 && mouseY < 788) {
				pantalla = 3;
			}
			break;
		case 3:
			//shop
			if(mouseX > 124 && mouseY > 648 && mouseX < 252 && mouseY < 686) {
				pantalla = 4;
			}
			
			//cambio de fotos inicio
			if(mouseX > 319 && mouseX < 373 && mouseY > 390 && mouseY < 430) {
				if(foto2 == false && foto3 == false) {
					foto2 = true;
				}else if(foto2 == true && foto3 == false) {
					foto3 = true;
					foto2 = false;
				}
			}
			if(mouseX > 15 && mouseX < 55 && mouseY > 390 && mouseY < 430) {
				if(foto3 == true && foto2 == false) {
					foto3 = false;
					foto2 = true;
				}else if(foto2 == true && foto3 == false) {
					foto2 = false;
					foto3 = false;
				}
			}
			
			
			if(mouseX > 57 && mouseY > 744 && mouseX < 85 && mouseY < 780) {
				pantalla = 3;
			}
			if(mouseX > 171 && mouseY > 744 && mouseX < 206 && mouseY < 780) {
				pantalla = 4;
			}
			if(mouseX > 291 && mouseY > 744 && mouseX < 320 && mouseY < 780) {
				pantalla = 5;
			}
			
			break;
		case 4:
			//modelos
			
			//compra de carro
			if(mouseX > 20 && mouseY > 87 && mouseX < 355 && mouseY < 200) {
				pantalla = 6;
			}
			if(mouseX > 20 && mouseY > 255 && mouseX < 355 && mouseY < 390) {
				pantalla = 7;
			}
			if(mouseX > 20 && mouseY > 444 && mouseX < 355 && mouseY < 560) {
				pantalla = 8;
			}
			if(mouseX > 20 && mouseY > 610 && mouseX < 355 && mouseY < 717) {
				pantalla = 9;
			}
			
			//cambio barra
			if(mouseX > 57 && mouseY > 744 && mouseX < 85 && mouseY < 780) {
				pantalla = 3;
			}
			if(mouseX > 171 && mouseY > 744 && mouseX < 206 && mouseY < 780) {
				pantalla = 4;
			}
			if(mouseX > 291 && mouseY > 744 && mouseX < 320 && mouseY < 780) {
				pantalla = 5;
			}
			
			break;
		case 5:
			//usuario
			
			//cambio barra
			if(mouseX > 57 && mouseY > 744 && mouseX < 85 && mouseY < 780) {
				pantalla = 3;
			}
			if(mouseX > 171 && mouseY > 744 && mouseX < 206 && mouseY < 780) {
				pantalla = 4;
			}
			if(mouseX > 291 && mouseY > 744 && mouseX < 320 && mouseY < 780) {
				pantalla = 5;
			}
			
			break;
		case 6:
			//cambio barra
			if(mouseX > 57 && mouseY > 744 && mouseX < 85 && mouseY < 780) {
				pantalla = 3;
			}
			if(mouseX > 171 && mouseY > 744 && mouseX < 206 && mouseY < 780) {
				pantalla = 4;
			}
			if(mouseX > 291 && mouseY > 744 && mouseX < 320 && mouseY < 780) {
				pantalla = 5;
			}
			
			break;
		case 7:
			//cambio barra
			if(mouseX > 57 && mouseY > 744 && mouseX < 85 && mouseY < 780) {
				pantalla = 3;
			}
			if(mouseX > 171 && mouseY > 744 && mouseX < 206 && mouseY < 780) {
				pantalla = 4;
			}
			if(mouseX > 291 && mouseY > 744 && mouseX < 320 && mouseY < 780) {
				pantalla = 5;
			}
			
			break;
		case 8:
			//cambio barra
			if(mouseX > 57 && mouseY > 744 && mouseX < 85 && mouseY < 780) {
				pantalla = 3;
			}
			if(mouseX > 171 && mouseY > 744 && mouseX < 206 && mouseY < 780) {
				pantalla = 4;
			}
			if(mouseX > 291 && mouseY > 744 && mouseX < 320 && mouseY < 780) {
				pantalla = 5;
			}
			
			break;
		case 9:
			//cambio barra
			if(mouseX > 57 && mouseY > 744 && mouseX < 85 && mouseY < 780) {
				pantalla = 3;
			}
			if(mouseX > 171 && mouseY > 744 && mouseX < 206 && mouseY < 780) {
				pantalla = 4;
			}
			if(mouseX > 291 && mouseY > 744 && mouseX < 320 && mouseY < 780) {
				pantalla = 5;
			}
			
			break;
		
			
		}
	}
	
}


