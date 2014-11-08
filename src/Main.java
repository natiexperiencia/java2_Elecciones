import java.util.*;
import java.io.*;
public class Main{

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String nombre, apellido, calleDireccion, nombreInmueble, tipo, alcalde, presidente, lema;
		int edad, numeroDireccion, poblacion, censo, componentes, ano;
		double largo, ancho;
		boolean intemperie, ganador;

//Habitante
		System.out.println("\nBuenas,\nvamos a crear un habitante...");
		System.out.println("\nIngresa el nombre: ");
		nombre = sc.nextLine();
		System.out.println("\nahora ingresa el apellido: ");
		apellido = sc.nextLine();
		System.out.println("\nescribe el nombre de la calle donde vive: ");
		calleDireccion = sc.nextLine();
		System.out.println("\nel numero de la calle: ");
		//try{
			numeroDireccion = sc.nextInt();
		
		/*}catch(Exception ioe){
			System.out.println(ioe);
			numeroDireccion = 0;
		}*/
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
		nombre = sc.nextLine();
		System.out.println("\nescribe la calle donde está: ");
		calleDireccion = sc.nextLine();
		System.out.println("\nel numero de la calle: ");
		numeroDireccion = sc.nextInt();
		System.out.println("\n¿cuantos metros tiene de ancho?: ");
		ancho = sc.nextDouble();
		System.out.println("\n¿cuantos metros tiene de largo?: ");
		largo = sc.nextDouble();
		System.out.println("\n¿Que tipo de espacio público es?: ");
		tipo = sc.nextLine();
		tipo = sc.nextLine();
		System.out.println("\n¿Esta cubierto?(true/false): ");
		intemperie = sc.nextBoolean();

		EspacioPublico espacio = new EspacioPublico(nombre, tipo, calleDireccion, numeroDireccion, ancho, largo, intemperie);

		espacio.setNombre(nombre);
		espacio.setCalleDireccion(calleDireccion);
		espacio.setNumeroDireccion(numeroDireccion);
		espacio.setAncho(ancho);
		espacio.setLargo(largo);
		espacio.setTipo(tipo);
		espacio.setIntemperie(intemperie);

		System.out.println("\nEl espacio público...");
		System.out.println("\nNombre: "+espacio.getNombre());
		System.out.println("\nDireccion: "+espacio.direccion());
		System.out.println("\nSuperficie: "+espacio.superficie());
		System.out.println("\nTipo: "+espacio.getTipo());
		System.out.println("\n¿Tiene techo?: "+espacio.getIntemperie());

//Ayuntamiento
		System.out.println("\nAhora crearemos un Ayuntamiento...");
		System.out.println("\nescribe el nombre del Ayuntamiento: ");
		nombre = sc.nextLine();
		nombre = sc.nextLine();
		System.out.println("escribe la calle donde está: ");
		calleDireccion = sc.nextLine();
		System.out.println("escribe el numero de la calle: ");
		numeroDireccion = sc.nextInt();
		System.out.println("escribe el nombre del alcalde: ");
		alcalde = sc.nextLine();
		System.out.println("¿Cuantos habitantes tiene el pueblo del Ayuntamiento en cuestión?: ");
		poblacion = sc.nextInt();
		System.out.println("\n¿cuantos de esos habitantes pueden votar (censados): ");
		censo = sc.nextInt();

		Ayuntamiento ayunta = new Ayuntamiento(nombre, alcalde, calleDireccion, numeroDireccion, poblacion, censo);

		ayunta.setNombre(nombre);
		ayunta.setAlcalde(alcalde);
		ayunta.setCalleDireccion(calleDireccion);
		ayunta.setNumeroDireccion(numeroDireccion);
		ayunta.setPoblacion(poblacion);
		ayunta.setCenso(censo);

		System.out.println("\nEste es tu Ayuntamiento...");
		System.out.println("\nNombre: "+ayunta.getNombre());
		System.out.println("Alaclde: "+ayunta.getAlcalde());
		System.out.println("Direccion: "+ayunta.direccion());
		System.out.println("Poblacion: "+ayunta.getPoblacion());
		System.out.println("Censo: "+ayunta.getCenso());

//Partidos
		//Partido1

		System.out.println("\nPor último vamos a crear 5 partidos políticos diferentes...");
		System.out.println("\nEscribe el nombre del primer partido: ");
		nombre = sc.nextLine();
		nombre = sc.nextLine();
		System.out.println("\nEscribe el nombre del presidente: ");
		presidente = sc.nextLine();
		System.out.println("\nEscribe el lema del partido: ");
		lema = sc.nextLine();
		System.out.println("\n¿Cuantas personas componen el partido?: ");
		componentes = sc.nextInt();
		System.out.println("¿En que año se fundó?: ");
		ano = sc.nextInt();

		Partido partido1 = new Partido(nombre, presidente, lema, componentes, ano);

		partido1.setNombre(nombre);
		partido1.setPresidente(presidente);
		partido1.setLema(lema);
		partido1.setComponentes(componentes);
		partido1.setAno(ano);

		System.out.println("\nEl partido número 1...");
		System.out.println("\nNombre: "+partido1.getNombre());
		System.out.println("Presidente: "+partido1.getPresidente());
		System.out.println("Lema: "+partido1.getLema());
		System.out.println("Componentes: "+partido1.getComponentes());
		System.out.println("Fundado en: "+partido1.getAno());

		//partido2

		System.out.println("\nEscribe el nombre del segundo partido: ");
		nombre = sc.nextLine();
		nombre = sc.nextLine();
		System.out.println("\nEscribe el nombre del presidente: ");
		presidente = sc.nextLine();
		System.out.println("\nEscribe el lema del partido: ");
		lema = sc.nextLine();
		System.out.println("\n¿Cuantas personas componen el partido?: ");
		componentes = sc.nextInt();
		System.out.println("¿En que año se fundó?: ");
		ano = sc.nextInt();

		Partido partido2 = new Partido(nombre, presidente, lema, componentes, ano);

		partido2.setNombre(nombre);
		partido2.setPresidente(presidente);
		partido2.setLema(lema);
		partido2.setComponentes(componentes);
		partido2.setAno(ano);

		System.out.println("\nEl partido número 2...");
		System.out.println("\nNombre: "+partido2.getNombre());
		System.out.println("Presidente: "+partido2.getPresidente());
		System.out.println("Lema: "+partido2.getLema());
		System.out.println("Componentes: "+partido2.getComponentes());
		System.out.println("Fundado en: "+partido2.getAno());

		//Partido3

		System.out.println("\nEscribe el nombre del tercer partido: ");
		nombre = sc.nextLine();
		nombre = sc.nextLine();
		System.out.println("\nEscribe el nombre del presidente: ");
		presidente = sc.nextLine();
		System.out.println("\nEscribe el lema del partido: ");
		lema = sc.nextLine();
		System.out.println("\n¿Cuantas personas componen el partido?: ");
		componentes = sc.nextInt();
		System.out.println("¿En que año se fundó?: ");
		ano = sc.nextInt();

		Partido partido3 = new Partido(nombre, presidente, lema, componentes, ano);

		partido3.setNombre(nombre);
		partido3.setPresidente(presidente);
		partido3.setLema(lema);
		partido3.setComponentes(componentes);
		partido3.setAno(ano);

		System.out.println("\nEl partido número 3...");
		System.out.println("\nNombre: "+partido3.getNombre());
		System.out.println("Presidente: "+partido3.getPresidente());
		System.out.println("Lema: "+partido3.getLema());
		System.out.println("Componentes: "+partido3.getComponentes());
		System.out.println("Fundado en: "+partido3.getAno());

		//Partido 4

		System.out.println("\nEscribe el nombre del cuarto partido: ");
		nombre = sc.nextLine();
		nombre = sc.nextLine();
		System.out.println("\nEscribe el nombre del presidente: ");
		presidente = sc.nextLine();
		System.out.println("\nEscribe el lema del partido: ");
		lema = sc.nextLine();
		System.out.println("\n¿Cuantas personas componen el partido?: ");
		componentes = sc.nextInt();
		System.out.println("¿En que año se fundó?: ");
		ano = sc.nextInt();

		Partido partido4 = new Partido(nombre, presidente, lema, componentes, ano);

		partido4.setNombre(nombre);
		partido4.setPresidente(presidente);
		partido4.setLema(lema);
		partido4.setComponentes(componentes);
		partido4.setAno(ano);

		System.out.println("\nEl partido número 4...");
		System.out.println("\nNombre: "+partido4.getNombre());
		System.out.println("Presidente: "+partido4.getPresidente());
		System.out.println("Lema: "+partido4.getLema());
		System.out.println("Componentes: "+partido4.getComponentes());
		System.out.println("Fundado en: "+partido4.getAno());

		//Partido 5

		System.out.println("\nEscribe el nombre del quinto partido: ");
		nombre = sc.nextLine();
		nombre = sc.nextLine();
		System.out.println("\nEscribe el nombre del presidente: ");
		presidente = sc.nextLine();
		System.out.println("\nEscribe el lema del partido: ");
		lema = sc.nextLine();
		System.out.println("\n¿Cuantas personas componen el partido?: ");
		componentes = sc.nextInt();
		System.out.println("¿En que año se fundó?: ");
		ano = sc.nextInt();

		Partido partido5 = new Partido(nombre, presidente, lema, componentes, ano);

		partido5.setNombre(nombre);
		partido5.setPresidente(presidente);
		partido5.setLema(lema);
		partido5.setComponentes(componentes);
		partido5.setAno(ano);

		System.out.println("\nEl partido número 5...");
		System.out.println("\nNombre: "+partido5.getNombre());
		System.out.println("Presidente: "+partido5.getPresidente());
		System.out.println("Lema: "+partido5.getLema());
		System.out.println("Componentes: "+partido5.getComponentes());
		System.out.println("Fundado en: "+partido5.getAno());
	}
}