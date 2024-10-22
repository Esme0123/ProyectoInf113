package proyecto_cvs;
import java.util.Scanner;

import proyecto_cvs.*;
public class principal {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		conexion c1=new conexion();
		c1.conectar();
		Scanner leer=new Scanner(System.in);
		System.out.print("Ingresa el rol del empleado: ");
		String e1=leer.nextLine();
		/*System.out.print("Ingresa la identificacion del empleado: ");
		String e1=leer.nextLine();
		System.out.print("Ingresa la hora de ingreso: ");*/
		empleado empleado1=new empleado(e1,"administrador","15:00","18:00",1);
		empleadoDB empDB=new empleadoDB();
		empDB.agregarEmpleado(empleado1);
	}

}
