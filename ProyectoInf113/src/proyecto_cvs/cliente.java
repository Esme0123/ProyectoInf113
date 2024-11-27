package proyecto_cvs;

public class cliente extends persona{
	private int ci;
	private int id_persona;
	public cliente() {
		// TODO Auto-generated constructor stub
	}
	public cliente(int ci, int id_persona) {
		this.ci = ci;
		this.id_persona = id_persona;
	}
	public cliente(String nombre, String apellido, int celular, int ci, int id_persona) {
		super(nombre, apellido, celular);
		this.ci = ci;
		this.id_persona = id_persona;
	}
	public int getCi() {
		return ci;
	}
	public void setCi(int ci) {
		this.ci = ci;
	}
	public int getId_persona() {
		return id_persona;
	}
	public void setId_persona(int id_persona) {
		this.id_persona = id_persona;
	}
	
	public void ocuparMesa() {
		this.getApellido();
	}

}
