import java.util.*;
import java.io.*;
public class Main{

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String opcion = "no",nombre = null, apellido = null, calleDireccion = null, nombreInmueble = null, tipo = null, alcalde = null, presidente = null, lema = null;
		int edad = 0, numeroDireccion = 0, poblacion = 0, censo = 0, componentes = 0, ano = 0;
		double largo = 0, ancho = 0;
		boolean intemperie = false, ganador = false;

//Habitante1
		try{
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
		}catch(Exception ioe){
			System.out.println("Error (0 = null): "+ioe);
		}

		Habitante uno = new Habitante(nombre, apellido, edad, calleDireccion, numeroDireccion);
		uno.setNombre(nombre);
		uno.setApellido(apellido);
		uno.setEdad(edad);
		uno.setCalleDireccion(calleDireccion);
		uno.setNumeroDireccion(numeroDireccion);

		System.out.println("\nAqui tu habitante: ");
		System.out.println("--------------------------------------");
		System.out.println("Nombre: "+uno.getNombre());
		System.out.println("Apellido: "+uno.getApellido());
		System.out.println("Edad:"+uno.getEdad());
		System.out.println("Direccion: "+uno.direccion());
		System.out.println("--------------------------------------");

//Habitente2
		try{
			System.out.println("\nVamos a crear un segundo habitante...");
			System.out.println("\nIngresa el nombre: ");
			nombre = sc.nextLine();
			nombre = sc.nextLine();
			System.out.println("\nahora ingresa el apellido: ");
			apellido = sc.nextLine();
			System.out.println("\nescribe el nombre de la calle donde vive: ");
			calleDireccion = sc.nextLine();
			System.out.println("\nel numero de la calle: ");
			numeroDireccion = sc.nextInt();
			System.out.println("\npara acabar introduce la edad: ");
			edad = sc.nextInt();
		}catch(Exception ioe){
			System.out.println("Error (0 = null): "+ioe);
		}

		Habitante dos = new Habitante(nombre, apellido, edad, calleDireccion, numeroDireccion);
		dos.setNombre(nombre);
		dos.setApellido(apellido);
		dos.setEdad(edad);
		dos.setCalleDireccion(calleDireccion);
		dos.setNumeroDireccion(numeroDireccion);

		System.out.println("\nAqui tu habitante: ");
		System.out.println("--------------------------------------");
		System.out.println("Nombre: "+dos.getNombre());
		System.out.println("Apellido: "+dos.getApellido());
		System.out.println("Edad:"+dos.getEdad());
		System.out.println("Direccion: "+dos.direccion());
		System.out.println("--------------------------------------");

//Habitente3
		try{
			System.out.println("\nVamos a crear un tercer habitante...");
			System.out.println("\nIngresa el nombre: ");
			nombre = sc.nextLine();
			nombre = sc.nextLine();
			System.out.println("\nahora ingresa el apellido: ");
			apellido = sc.nextLine();
			System.out.println("\nescribe el nombre de la calle donde vive: ");
			calleDireccion = sc.nextLine();
			System.out.println("\nel numero de la calle: ");
			numeroDireccion = sc.nextInt();
			System.out.println("\npara acabar introduce la edad: ");
			edad = sc.nextInt();
		}catch(Exception ioe){
			System.out.println("Error (0 = null): "+ioe);
		}

		Habitante tres = new Habitante(nombre, apellido, edad, calleDireccion, numeroDireccion);
		tres.setNombre(nombre);
		tres.setApellido(apellido);
		tres.setEdad(edad);
		tres.setCalleDireccion(calleDireccion);
		tres.setNumeroDireccion(numeroDireccion);

		System.out.println("\nAqui tu habitante: ");
		System.out.println("--------------------------------------");
		System.out.println("Nombre: "+tres.getNombre());
		System.out.println("Apellido: "+tres.getApellido());
		System.out.println("Edad:"+tres.getEdad());
		System.out.println("Direccion: "+tres.direccion());
		System.out.println("--------------------------------------");

//Habitente4
		try{
			System.out.println("\nVamos a crear un cuarto habitante...");
			System.out.println("\nIngresa el nombre: ");
			nombre = sc.nextLine();
			nombre = sc.nextLine();
			System.out.println("\nahora ingresa el apellido: ");
			apellido = sc.nextLine();
			System.out.println("\nescribe el nombre de la calle donde vive: ");
			calleDireccion = sc.nextLine();
			System.out.println("\nel numero de la calle: ");
			numeroDireccion = sc.nextInt();
			System.out.println("\npara acabar introduce la edad: ");
			edad = sc.nextInt();
		}catch(Exception ioe){
			System.out.println("Error (0 = null): "+ioe);
		}

		Habitante cuatro = new Habitante(nombre, apellido, edad, calleDireccion, numeroDireccion);
		cuatro.setNombre(nombre);
		cuatro.setApellido(apellido);
		cuatro.setEdad(edad);
		cuatro.setCalleDireccion(calleDireccion);
		cuatro.setNumeroDireccion(numeroDireccion);

		System.out.println("\nAqui tu habitante: ");
		System.out.println("--------------------------------------");
		System.out.println("Nombre: "+cuatro.getNombre());
		System.out.println("Apellido: "+cuatro.getApellido());
		System.out.println("Edad:"+cuatro.getEdad());
		System.out.println("Direccion: "+cuatro.direccion());
		System.out.println("--------------------------------------");

//Habitente5
		try{
			System.out.println("\nVamos a crear un quinto habitante...");
			System.out.println("\nIngresa el nombre: ");
			nombre = sc.nextLine();
			nombre = sc.nextLine();
			System.out.println("\nahora ingresa el apellido: ");
			apellido = sc.nextLine();
			System.out.println("\nescribe el nombre de la calle donde vive: ");
			calleDireccion = sc.nextLine();
			System.out.println("\nel numero de la calle: ");
			numeroDireccion = sc.nextInt();
			System.out.println("\npara acabar introduce la edad: ");
			edad = sc.nextInt();
		}catch(Exception ioe){
			System.out.println("Error (0 = null): "+ioe);
		}

		Habitante cinco = new Habitante(nombre, apellido, edad, calleDireccion, numeroDireccion);
		cinco.setNombre(nombre);
		cinco.setApellido(apellido);
		cinco.setEdad(edad);
		cinco.setCalleDireccion(calleDireccion);
		cinco.setNumeroDireccion(numeroDireccion);

		System.out.println("\nAqui tu habitante: ");
		System.out.println("--------------------------------------");
		System.out.println("Nombre: "+cinco.getNombre());
		System.out.println("Apellido: "+cinco.getApellido());
		System.out.println("Edad:"+cinco.getEdad());
		System.out.println("Direccion: "+cinco.direccion());
		System.out.println("--------------------------------------");
//Inmueble


		try{
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
		}catch(Exception ioe){
			System.out.println("Error  (0 = null): "+ioe);
		}

		Inmueble inmueble = new Inmueble(nombreInmueble, calleDireccion, numeroDireccion, largo, ancho);

		inmueble.setNombre(nombreInmueble);
		inmueble.setCalleDireccion(calleDireccion);
		inmueble.setNumeroDireccion(numeroDireccion);
		inmueble.setLargo(largo);
		inmueble.setAncho(ancho);

		System.out.println("\nTu inmueble ha sido creado: ");
		System.out.println("--------------------------------------");
		System.out.println("\nNombre: "+inmueble.getNombre());
		System.out.println("Direccion: "+inmueble.direccion());
		System.out.println("Superficie: "+inmueble.superficie());
		System.out.println("--------------------------------------");
		
//Espacio público

		try{
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
			do{
				System.out.println("\n¿Esta a la intemperie?(si/no): ");
				opcion = sc.nextLine();
			}while(!opcion.equalsIgnoreCase("si") && !opcion.equalsIgnoreCase("no"));
			if(opcion.equalsIgnoreCase("si")){
				intemperie = true;
			}else{
				intemperie = false;
			}
		}catch(Exception ioe){
			System.out.println("Error  (0 = null)(intemperie = no: "+ioe);
		}

		EspacioPublico espacio = new EspacioPublico(nombre, tipo, calleDireccion, numeroDireccion, ancho, largo, intemperie);

		espacio.setNombre(nombre);
		espacio.setCalleDireccion(calleDireccion);
		espacio.setNumeroDireccion(numeroDireccion);
		espacio.setAncho(ancho);
		espacio.setLargo(largo);
		espacio.setTipo(tipo);
		espacio.setIntemperie(intemperie);

		System.out.println("\nEl espacio público...");
		System.out.println("--------------------------------------");
		System.out.println("\nNombre: "+espacio.getNombre());
		System.out.println("\nDireccion: "+espacio.direccion());
		System.out.println("\nSuperficie: "+espacio.superficie());
		System.out.println("\nTipo: "+espacio.getTipo());
		if(intemperie = true){
			System.out.println("\nEl espacio está a la intemperie.");
		}else{
			System.out.println("\nEl espacio está cubierto.");
		}
		System.out.println("--------------------------------------");

//Ayuntamiento

		try{
			System.out.println("\nAhora crearemos un Ayuntamiento...");
			System.out.println("\nescribe el nombre del Ayuntamiento: ");
			nombre = sc.nextLine();
			System.out.println("escribe la calle donde está: ");
			calleDireccion = sc.nextLine();
			System.out.println("escribe el numero de la calle: ");
			numeroDireccion = sc.nextInt();
			System.out.println("escribe el nombre del alcalde: ");
			alcalde = sc.nextLine();
			alcalde = sc.nextLine();
			System.out.println("¿Cuantos habitantes tiene el pueblo del Ayuntamiento en cuestión?: ");
			poblacion = sc.nextInt();
			System.out.println("\n¿cuantos de esos habitantes pueden votar (censados): ");
			censo = sc.nextInt();
		}catch(Exception ioe){
			System.out.println("Error  (0 = null): "+ioe);
		}

		Ayuntamiento ayunta = new Ayuntamiento(nombre, alcalde, calleDireccion, numeroDireccion, poblacion, censo);

		ayunta.setNombre(nombre);
		ayunta.setAlcalde(alcalde);
		ayunta.setCalleDireccion(calleDireccion);
		ayunta.setNumeroDireccion(numeroDireccion);
		ayunta.setPoblacion(poblacion);
		ayunta.setCenso(censo);

		System.out.println("\nEste es tu Ayuntamiento...");
		System.out.println("--------------------------------------");
		System.out.println("\nNombre: "+ayunta.getNombre());
		System.out.println("Alaclde: "+ayunta.getAlcalde());
		System.out.println("Direccion: "+ayunta.direccion());
		System.out.println("Poblacion: "+ayunta.getPoblacion());
		System.out.println("Censo: "+ayunta.getCenso());
		System.out.println("--------------------------------------");

//Partidos
		//Partido1

		try{
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
		}catch(Exception ioe){
			System.out.println("Error  (0 = null)");
		}

		Partido partido1 = new Partido(nombre, presidente, lema, componentes, ano);

		partido1.setNombre(nombre);
		partido1.setPresidente(presidente);
		partido1.setLema(lema);
		partido1.setComponentes(componentes);
		partido1.setAno(ano);

		System.out.println("\nEl partido número 1...");
		System.out.println("--------------------------------------");
		System.out.println("\nNombre: "+partido1.getNombre());
		System.out.println("Presidente: "+partido1.getPresidente());
		System.out.println("Lema: "+partido1.getLema());
		System.out.println("Componentes: "+partido1.getComponentes());
		System.out.println("Fundado en: "+partido1.getAno());
		System.out.println("--------------------------------------");

		//partido2

		try{
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
		}catch(Exception ioe){
			System.out.println("Error  (0 = null): ");
		}

		Partido partido2 = new Partido(nombre, presidente, lema, componentes, ano);

		partido2.setNombre(nombre);
		partido2.setPresidente(presidente);
		partido2.setLema(lema);
		partido2.setComponentes(componentes);
		partido2.setAno(ano);

		System.out.println("\nEl partido número 2...");
		System.out.println("--------------------------------------");
		System.out.println("\nNombre: "+partido2.getNombre());
		System.out.println("Presidente: "+partido2.getPresidente());
		System.out.println("Lema: "+partido2.getLema());
		System.out.println("Componentes: "+partido2.getComponentes());
		System.out.println("Fundado en: "+partido2.getAno());
		System.out.println("--------------------------------------");

		//Partido3

		try{
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
		}catch(Exception ioe){
			System.out.println("Error  (0 = null): ");
		}

		Partido partido3 = new Partido(nombre, presidente, lema, componentes, ano);

		partido3.setNombre(nombre);
		partido3.setPresidente(presidente);
		partido3.setLema(lema);
		partido3.setComponentes(componentes);
		partido3.setAno(ano);

		System.out.println("\nEl partido número 3...");
		System.out.println("--------------------------------------");
		System.out.println("\nNombre: "+partido3.getNombre());
		System.out.println("Presidente: "+partido3.getPresidente());
		System.out.println("Lema: "+partido3.getLema());
		System.out.println("Componentes: "+partido3.getComponentes());
		System.out.println("Fundado en: "+partido3.getAno());
		System.out.println("--------------------------------------");

		//Partido 4

		try{
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
		}catch(Exception ioe){
			System.out.println("Error  (0 = null): ");
		}

		Partido partido4 = new Partido(nombre, presidente, lema, componentes, ano);

		partido4.setNombre(nombre);
		partido4.setPresidente(presidente);
		partido4.setLema(lema);
		partido4.setComponentes(componentes);
		partido4.setAno(ano);

		System.out.println("\nEl partido número 4...");
		System.out.println("--------------------------------------");
		System.out.println("\nNombre: "+partido4.getNombre());
		System.out.println("Presidente: "+partido4.getPresidente());
		System.out.println("Lema: "+partido4.getLema());
		System.out.println("Componentes: "+partido4.getComponentes());
		System.out.println("Fundado en: "+partido4.getAno());
		System.out.println("--------------------------------------");

		//Partido 5

		try{
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
		}catch(Exception ioe){
			System.out.println("Error  (0 = null): ");
		}

		Partido partido5 = new Partido(nombre, presidente, lema, componentes, ano);

		partido5.setNombre(nombre);
		partido5.setPresidente(presidente);
		partido5.setLema(lema);
		partido5.setComponentes(componentes);
		partido5.setAno(ano);

		System.out.println("\nEl partido número 5...");
		System.out.println("--------------------------------------");
		System.out.println("\nNombre: "+partido5.getNombre());
		System.out.println("Presidente: "+partido5.getPresidente());
		System.out.println("Lema: "+partido5.getLema());
		System.out.println("Componentes: "+partido5.getComponentes());
		System.out.println("Fundado en: "+partido5.getAno());
		System.out.println("--------------------------------------");

//Crear archivo listadoPartidos.txt
		File archivo = new File("./listadoPartidos.txt");
		System.out.println("\nCreando archivo con nombres de los partidos.....");
		try{
			if(archivo.createNewFile()){
				System.out.println("\nArchivo creado correctamente");
			}
		}catch(IOException ioe){
			ioe.printStackTrace();
		}

//Escribir en listadoPartidos.txt atributos separados por comas
		try{
			System.out.println("\nEscribiendo en el archivo 'listadoPartidos.txt'....");
			FileWriter escritor = new FileWriter(archivo);
			escritor.append(partido1.getNombre()+","+partido1.getPresidente()+","+partido1.getLema()+","+partido1.getComponentes()+","+partido1.getAno()+"\n");
			escritor.append(partido2.getNombre()+","+partido2.getPresidente()+","+partido2.getLema()+","+partido2.getComponentes()+","+partido2.getAno()+"\n");
			escritor.append(partido3.getNombre()+","+partido3.getPresidente()+","+partido3.getLema()+","+partido3.getComponentes()+","+partido3.getAno()+"\n");
			escritor.append(partido4.getNombre()+","+partido4.getPresidente()+","+partido4.getLema()+","+partido4.getComponentes()+","+partido4.getAno()+"\n");
			escritor.append(partido5.getNombre()+","+partido5.getPresidente()+","+partido5.getLema()+","+partido5.getComponentes()+","+partido5.getAno()+"\n");
			escritor.close();
			System.out.println("\nArchivo listo para lectura\n");
		}
		catch(IOException e){
					System.out.println("Error: "+e);
				}

//Crear archivo censo.txt
		File archivoCenso = new File("./censo.txt");
		System.out.println("\nCreando archivo con datos de habitantes");
		try{
			if(archivoCenso.createNewFile()){
				System.out.println("\nArchivo creado correctamente");
			}
		}catch(IOException ioe){
			ioe.printStackTrace();
		}

//Escribir en archivo censo.txt datos de habitantes

		try{
			System.out.println("\nEscribiendo en el archivo 'censo.txt'....");
			FileWriter escritorCenso = new FileWriter(archivoCenso);
			if(uno.getEdad()>=18){
				escritorCenso.append(uno.getNombre()+","+uno.getApellido()+","+uno.getEdad()+","+uno.direccion()+"\n");
			}
			if(dos.getEdad()>=18){
				escritorCenso.append(dos.getNombre()+","+dos.getApellido()+","+dos.getEdad()+","+dos.direccion()+"\n");
			}
			if(tres.getEdad()>=18){
				escritorCenso.append(tres.getNombre()+","+tres.getApellido()+","+tres.getEdad()+","+tres.direccion()+"\n");
			}
			if(cuatro.getEdad()>=18){
				escritorCenso.append(cuatro.getNombre()+","+cuatro.getApellido()+","+cuatro.getEdad()+","+cuatro.direccion()+"\n");
			}
			if(cinco.getEdad()>=18){
				escritorCenso.append(cinco.getNombre()+","+cinco.getApellido()+","+cinco.getEdad()+","+cinco.direccion()+"\n");
			}
			escritorCenso.close();
			System.out.println("\nArchivo listo para lectura");
		}catch(IOException e){
			System.out.println("Error: "+e);
		}

//Leer lineas del archivo listadoPartidos.txt
		try{		
			FileInputStream fis = new FileInputStream(archivo);
			InputStreamReader isr = new InputStreamReader(fis, "UTF8");
       		BufferedReader br = new BufferedReader(isr);

       		ArrayList<String> partidos = new ArrayList<String>();

        	String linea = br.readLine();
        	while(linea!=null){
        		partidos.add(linea);
        		linea=br.readLine();
        	}

//Mostrar lineas leidas del archivo listadoPartidos.txt
        	System.out.println("\nContenido de archivo listadoPartidos.txt: ");
        	for(int i=0; i<partidos.size(); i++){
        		System.out.println(partidos.get(i));
        	}

        	System.out.println("\nLimpiando la memoria....");
        	partidos.clear();
		}catch(FileNotFoundException n){
			System.out.println("Error "+n);    
        }
        catch(IOException ie){
        	System.out.println("Error "+ie);
        }

//Leer lineas del contenido del archivo censo.txt
        try{
        	FileInputStream fis = new FileInputStream(archivoCenso);
        	InputStreamReader isr = new InputStreamReader(fis, "UTF8");
        	BufferedReader br = new BufferedReader(isr);

        	ArrayList<String> habitantes = new ArrayList<String>();

        	String linea = br.readLine();
        	while(linea!=null){
        		habitantes.add(linea);
        		linea=br.readLine();
        	}

//Mostrar lineas leidas desde censo.txt
        	System.out.println("\nContenido archivo censo.txt: ");
        	for(int i=0; i<habitantes.size(); i++){
        		System.out.println(habitantes.get(i));
        	}
        	System.out.println("\nLimpiando la memoria.....");
        	habitantes.clear();
        
        }catch(FileNotFoundException ie){
        	System.out.println("Error: "+ie);
        }
        catch(IOException n){
        	System.out.println("Error: "+n);
        }
	}
}