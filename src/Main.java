import java.util.*;
public class Main{

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String nombre, apellido, calleDireccion, nombreInmueble;
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
		System.out.println("Nombre: "+uno.getNombre());
		System.out.println("Apellido: "+uno.getApellido());
		System.out.println("Edad:"+uno.getEdad());
		System.out.println("Direccion: "+uno.direccion());

//Inmueble

		System.out.println("\nAhora crearemos un inmueble...");
		System.out.println("\nIngresa el nombre: ");
		nombreInmueble = sc.nextLine();		
		nombreInmueble = sc.nextLine();
		System.out.println("\nescribe la calle donde está: ");
		calleDireccion = sc.nextLine();
		System.out.println("\nel numero de la calle: ");
		numeroDireccion = sc.nextInt();
		System.out.println("\n¿cuantos metros tiene de ancho?: ");
		ancho = sc.nextDouble();
		System.out.println("\n¿cuantos metros tiene de largo?: ");
		largo = sc.nextDouble();

		Inmueble inmueble = new Inmueble(nombreInmueble, calleDireccion, numeroDireccion, largo, ancho);

		inmueble.setNombre(nombreInmueble);
		inmueble.setCalleDireccion(calleDireccion);
		inmueble.setNumeroDireccion(numeroDireccion);
		inmueble.setLargo(largo);
		inmueble.setAncho(ancho);

		System.out.println("\nTu inmueble ha sido creado: ");
		System.out.println("\nNombre: "+inmueble.getNombre());
		System.out.println("Direccion: "+inmueble.direccion());
		System.out.println("Superficie: "+inmueble.superficie());
		
//Espacio público

		System.out.println("\nAhora un espacio público...");
		System.out.println("\nIngresa el nombre: ");
		nombre = sc.nextLine();
		System.out.println("\nescribe la calle donde está: ");
		calleDireccion = sc.nextLine();
		System.out.println("\nel numero de la calle: ");
		numeroDireccion = sc.nextInt();
		System.out.println("\n¿cuantos metros tiene de ancho?: ");
		ancho = sc.nextDouble();
		System.out.println("\n¿cuantos metros tiene de largo?: ");
		largo = sc.nextDouble();
		System.out.println();

	}
}