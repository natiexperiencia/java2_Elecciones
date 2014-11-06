import java.util.*;
public class Main{

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String nombre, apellido, calleDireccion;
		int edad, numeroDireccion;
		double largo, ancho;

//Habitante
		System.out.println("\nBuenas,\nvamos a crear un habitante...");
		System.out.println("\nIngresa el nombre: ");
		nombre = sc.nextLine();
		System.out.println("\nahora ingresa el apellido: ");
		apellido = sc.nextLine();
		System.out.println("\nescribe el nombre de la calle donde vive: ");
		calleDireccion = sc.nextLine();
		System.out.println("\nel numero de la calle: ");
		numeroDireccion = sc.nextInt();
		System.out.println("\npara acabar introduce la edad: ");
		edad = sc.nextInt();

		Habitante uno = new Habitante(nombre, apellido, edad, calleDireccion, numeroDireccion);
		uno.setNombre(nombre);
		uno.setApellido(apellido);
		uno.setEdad(edad);
		uno.setCalleDireccion(calleDireccion);
		uno.setNumeroDireccion(numeroDireccion);

		System.out.println("\nAqui tu habitante: ");
		System.out.println(uno.getNombre());
		System.out.println(uno.getApellido());
		System.out.println(uno.getEdad());
		System.out.println(uno.direccion());

//Inmueble

		System.out.println("\nAhora crearemos un inmueble...");
		System.out.println("\nIngresa el nombre: ");
		nombre = sc.nextLine();
		System.out.println("\nescribe la calle donde está: ");


		

	}
}