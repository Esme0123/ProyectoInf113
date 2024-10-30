package proyecto_cvs;

public class cliente extends persona{
	private int ci;
	public cliente() {
		// TODO Auto-generated constructor stub
	}
	public cliente(String nombre, String apellido, int celular, int ci) {
		super(nombre, apellido, celular);
		this.ci = ci;
	}

	public int getCi() {
		return ci;
	}

	public void setCi(int ci) {
		this.ci = ci;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
