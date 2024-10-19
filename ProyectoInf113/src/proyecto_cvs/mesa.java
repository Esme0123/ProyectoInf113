package proyecto_cvs;

public class mesa {
	private int num;
	private int capacidad;
	private boolean estado;
	public mesa() {
		// TODO Auto-generated constructor stub
	}
	public mesa(int num, int capacidad, boolean estado) {
		this.num = num;
		this.capacidad = capacidad;
		this.estado = false;//por defecto liberada
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public int getCapacidad() {
		return capacidad;
	}
	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}
	public boolean isEstado() {
		return estado;
	}
	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	public void reservar() {
		if(!estado) {
			estado=true;
			System.out.println("La mesa "+num+" ha sido reservada.");
		}
		else {
			System.out.println("La mesa "+num+" ya está reservada.");
		}
	}
	public void liberar() {
		if (estado) {
            estado = false;
            System.out.println("La mesa " +num+ " ha sido liberada.");
        } 
		else {
            System.out.println("La mesa " +num+ " ya está libre.");
        }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
