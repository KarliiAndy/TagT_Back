package ch21.tagtalent.tagTalentApplication.model;

public class Login {
	private String correo;
	private String password;
	
	public Login(String correo, String password) {
		super();
		this.correo = correo;
		this.password = password;
	}//constructor

	
	public Login() {}//constructor vacío

	public String getCorreo() {
		return correo;
	}//getCorreo

	public void setCorreo(String correo) {
		this.correo = correo;
	}//setCorreo

	public String getPassword() {
		return password;
	}//getPassword

	public void setPassword(String password) {
		this.password = password;
	}//setPassword

	@Override
	public String toString() {
		return "Login [correo=" + correo + ", password=" + password + "]";
	}//toString
	
}//class Login