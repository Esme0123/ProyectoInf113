package proyecto_cvs;
import java.util.Scanner;
import db_clases.*;
public class principal {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//prueba
		empleado empleado1=new empleado();
		Scanner leer=new Scanner(System.in);
		System.out.print("Ingresa el rol del empleado: ");
		empleado1.setRol(leer.nextLine());
		System.out.print("Ingrese el nombre de usuario del empleado: ");
		empleado1.setName_user(leer.nextLine());
		System.out.print("Ingresa la contraseña: ");
		empleado1.setPassword(leer.nextLine());
		leer.close();
		empleadoDB empDB=new empleadoDB();
		empDB.agregarEmpleado(empleado1);
		
	}

}
