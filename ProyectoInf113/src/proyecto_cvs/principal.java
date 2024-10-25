package proyecto_cvs;
import java.util.Scanner;

//import proyecto_cvs.*;
public class principal {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//conexion c1=new conexion();
		conexion.conectar();
		try (Scanner leer = new Scanner(System.in)) {
			System.out.print("Ingresa el rol del empleado: ");
			String e1=leer.nextLine();
			System.out.print("Ingresa la identificacion del empleado: ");
			String e11=leer.nextLine();
			System.out.print("Ingresa la hora de ingreso: ");
			String e111=leer.nextLine();
			System.out.print("Ingresa la hora de salida: ");
			String e1111=leer.nextLine();
			empleado empleado1=new empleado(e1,e11,e111,e1111,1);
			empleadoDB empDB=new empleadoDB();
			empDB.agregarEmpleado(empleado1);
		}
	}

}
