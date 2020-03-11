import controlP5.ControlP5;
import controlP5.Textfield;
import processing.core.PApplet;
import processing.core.PFont;

public class User {
	String usuario;
	String contra;
	String email;
	PApplet app;
	ControlP5 cp5;
	
	
	public User(PApplet app) {
		this.app = app;
		cp5 = new ControlP5(app);
		PFont font = app.createFont ("arial", 20);
		
		cp5.addTextfield("usuario")
		.setPosition(16,304)
		.setSize(342,52)
		.setColor(app.color(0))
		.setColorBackground(app.color(255,255,255,30))
		.setFont(font)
		;
		cp5.addTextfield("contra")
		.setPosition(16,420)
		.setSize(342,52)
		.setColor(app.color(0))
		.setColorBackground(app.color(255,255,255,30))
		.setFont(font)
		;
		
	}
	
	
	public void getInfo() {
		usuario = cp5.get(Textfield.class,"usuario").getText();
		contra = cp5.get(Textfield.class,"contra").getText();
		System.out.println(usuario);
		System.out.println(contra);
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getContra() {
		return contra;
	}

	public void setContra(String contra) {
		this.contra = contra;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public PApplet getApp() {
		return app;
	}

	public void setApp(PApplet app) {
		this.app = app;
	}

	public ControlP5 getCp5() {
		return cp5;
	}

	public void setCp5(ControlP5 cp5) {
		this.cp5 = cp5;
	}

}
