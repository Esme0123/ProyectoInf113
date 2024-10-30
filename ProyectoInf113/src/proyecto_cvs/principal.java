package proyecto_cvs;
import java.util.Scanner;

//import proyecto_cvs.*;
public class principal {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		conexion c1=new conexion();
		cliente cl1=new cliente();
		cl1.setApellido("Mejia");
		cl1.setCelular(1123123);
		System.out.print(cl1.getApellido());
		//prueba
		c1.conectar();
		Scanner leer=new Scanner(System.in);
		System.out.print("Ingresa el rol del empleado: ");
		String e1=leer.nextLine();
		System.out.print("Ingresa la identificacion del empleado: ");
		String e1_1=leer.nextLine();
		System.out.print("Ingresa la hora de ingreso: ");
		empleado empleado1=new empleado(e1_1,"administrador","15:00","18:00",1);
		empleadoDB empDB=new empleadoDB();
		empDB.agregarEmpleado(empleado1);

		//conexion c1=new conexion();
		conexion.conectar();
		try (leer) {  // ¿que se intenta declarar aqui?
			System.out.print("Ingresa el rol del empleado: ");
			String e1_2=leer.nextLine();
			System.out.print("Ingresa la identificacion del empleado: ");
			String e11=leer.nextLine();
			System.out.print("Ingresa la hora de ingreso: ");
			String e111=leer.nextLine();
			System.out.print("Ingresa la hora de salida: ");
			String e1111=leer.nextLine();
			empleado empleado2=new empleado(e1_2,e11,e111,e1111,1);
			empleadoDB empDB_1=new empleadoDB();
			empDB_1.agregarEmpleado(empleado2);
		}
	}

}
