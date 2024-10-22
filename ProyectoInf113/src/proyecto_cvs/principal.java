package proyecto_cvs;
import proyecto_cvs.*;
public class principal {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		conexion c1=new conexion();
		//c1.conectar();
		cliente cl1=new cliente();
		cl1.setApellido("Mejia");
		cl1.setCelular(1123123);
		System.out.print(cl1.getApellido());
		//prueba
	}

}
