package proyecto_cvs;
import java.util.Scanner;

//import proyecto_cvs.*;
public class principal {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//prueba
//		Scanner leer=new Scanner(System.in);
//		System.out.print("Ingresa el rol del empleado: ");
//		String rol=leer.nextLine();
//		System.out.print("Ingresa la identificacion del empleado: ");
//		String e1_1=leer.nextLine();
//		System.out.print("Ingresa la hora de ingreso: ");
//		leer.close();
//		empleado empleado1=new empleado(e1_1, rol,"15:00","18:00",1);
//		empleadoDB empDB=new empleadoDB();
		
		mesa m1 = new mesa(5, 10, false);
		mesaDB dbr1 = new mesaDB();
//		dbr1.agregarMesa(m1);
		dbr1.eliminarMesa(4);
	}

}
