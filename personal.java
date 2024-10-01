package proyecto_cvs;

public class personal {
	private double salario;
	private String nombre;
	private boolean contrato;
	private int ci;
	private int celular;
	private String hora_ingreso;
	private String hora_salida;
	private String genero;
	public personal() {
		// TODO Auto-generated constructor stub
	}
	public personal(double salario, String nombre, boolean contrato, int ci, int celular, String hora_ingreso,
			String hora_salida, String genero) {
		this.salario = salario;
		this.nombre = nombre;
		this.contrato = contrato;
		this.ci = ci;
		this.celular = celular;
		this.hora_ingreso = hora_ingreso;
		this.hora_salida = hora_salida;
		this.genero = genero;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public boolean isContrato() {
		return contrato;
	}
	public void setContrato(boolean contrato) {
		this.contrato = contrato;
	}
	public int getCi() {
		return ci;
	}
	public void setCi(int ci) {
		this.ci = ci;
	}
	public int getCelular() {
		return celular;
	}
	public void setCelular(int celular) {
		this.celular = celular;
	}
	public String getHora_ingreso() {
		return hora_ingreso;
	}
	public void setHora_ingreso(String hora_ingreso) {
		this.hora_ingreso = hora_ingreso;
	}
	public String getHora_salida() {
		return hora_salida;
	}
	public void setHora_salida(String hora_salida) {
		this.hora_salida = hora_salida;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
