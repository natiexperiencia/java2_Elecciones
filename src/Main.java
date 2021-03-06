import java.util.*;
import java.io.*;
public class Main{

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String opcion = "no",nombre = null, apellido = null, calleDireccion = null, nombreInmueble = null, tipo = null, alcalde = null, presidente = null, lema = null;
		int edad = 0, numeroDireccion = 0, poblacion = 0, censo = 0, componentes = 0, ano = 0;
		double largo = 0, ancho = 0;
		boolean intemperie = false, ganador = false;

		System.out.println("\nCuantos habitantes quieres crear(num): ");
		int cuantos = sc.nextInt();

		ArrayList<Habitante> habitantesList = new ArrayList<Habitante>();
		

		for(int i=0; i < cuantos; i++){
			Habitante persona = new Habitante();
			System.out.println("\nNombre: ");
			nombre = sc.nextLine();
			nombre = sc.nextLine();
			persona.setNombre(nombre);

			System.out.println("\nApellido: ");
			apellido = sc.nextLine();
			persona.setApellido(apellido);

			System.out.println("\nEdad: ");
			edad = sc.nextInt();
			persona.setEdad(edad);

			System.out.println("\nNombre de la calle donde vive: ");
			calleDireccion = sc.nextLine();
			calleDireccion = sc.nextLine();
			persona.setCalleDireccion(calleDireccion);

			System.out.println("\nNumero de la calle donde vive: ");
			numeroDireccion = sc.nextInt();
			persona.setNumeroDireccion(numeroDireccion);

			habitantesList.add(persona);

		}

		for(int i=0; i < habitantesList.size(); i++){
			System.out.println("--------------------------------------------");
    		System.out.println("Nombre: "+(habitantesList.get(i)).getNombre());
    		System.out.println("Apellidos: "+(habitantesList.get(i)).getApellido());
    		System.out.println("Edad: "+(habitantesList.get(i)).getEdad());
    		System.out.println("Direccion: "+(habitantesList.get(i)).direccion());
    		System.out.println("--------------------------------------------");
		}
		
//Inmueble


		try{
			System.out.println("\nAhora crearemos un inmueble...");
			System.out.println("\nIngresa el nombre: ");
			nombreInmueble = sc.nextLine();		
			nombreInmueble = sc.nextLine();
			System.out.println("\nEscribe la calle donde está: ");
			calleDireccion = sc.nextLine();
			System.out.println("\nEl numero de la calle: ");
			numeroDireccion = sc.nextInt();
			System.out.println("\n¿Cuantos metros tiene de ancho?: ");
			ancho = sc.nextDouble();
			System.out.println("\n¿Cuantos metros tiene de largo?: ");
			largo = sc.nextDouble();
		}catch(Exception ioe){
			System.out.println("Error  (0 = null): "+ioe);
		}

		Inmueble inmueble = new Inmueble();

		inmueble.setNombre(nombreInmueble);
		inmueble.setCalleDireccion(calleDireccion);
		inmueble.setNumeroDireccion(numeroDireccion);
		inmueble.setLargo(largo);
		inmueble.setAncho(ancho);

		System.out.println("\nTu inmueble ha sido creado: ");
		System.out.println("--------------------------------------");
		System.out.println("Nombre: "+inmueble.getNombre());
		System.out.println("Direccion: "+inmueble.direccion());
		System.out.println("Superficie: "+inmueble.superficie());
		System.out.println("--------------------------------------");
		
//Espacio público

		try{
			System.out.println("\nAhora un espacio público...");
			System.out.println("\nIngresa el nombre: ");
			nombre = sc.nextLine();
			nombre = sc.nextLine();
			System.out.println("\nEscribe la calle donde está: ");
			calleDireccion = sc.nextLine();
			System.out.println("\nEl numero de la calle: ");
			numeroDireccion = sc.nextInt();
			System.out.println("\n¿Cuantos metros tiene de ancho?: ");
			ancho = sc.nextDouble();
			System.out.println("\n¿Cuantos metros tiene de largo?: ");
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

		EspacioPublico espacio = new EspacioPublico();

		espacio.setNombre(nombre);
		espacio.setCalleDireccion(calleDireccion);
		espacio.setNumeroDireccion(numeroDireccion);
		espacio.setAncho(ancho);
		espacio.setLargo(largo);
		espacio.setTipo(tipo);
		espacio.setIntemperie(intemperie);

		System.out.println("\nEl espacio público...");
		System.out.println("--------------------------------------");
		System.out.println("Nombre: "+espacio.getNombre());
		System.out.println("Direccion: "+espacio.direccion());
		System.out.println("Superficie: "+espacio.superficie());
		System.out.println("Tipo: "+espacio.getTipo());
		if(intemperie == true){
			System.out.println("\nEl espacio está a la intemperie.");
		}else{
			System.out.println("\nEl espacio está cubierto.");
		}
		System.out.println("--------------------------------------");

//Ayuntamiento

		try{
			System.out.println("\nAhora crearemos un Ayuntamiento...");
			System.out.println("\nEscribe el nombre del Ayuntamiento: ");
			nombre = sc.nextLine();
			System.out.println("\nEscribe la calle donde está: ");
			calleDireccion = sc.nextLine();
			System.out.println("\nEscribe el numero de la calle: ");
			numeroDireccion = sc.nextInt();
			System.out.println("\nEscribe el nombre del alcalde: ");
			alcalde = sc.nextLine();
			alcalde = sc.nextLine();
			System.out.println("\n¿Cuantos habitantes tiene el pueblo del Ayuntamiento en cuestión?: ");
			poblacion = sc.nextInt();
			System.out.println("\n¿Cuantos de esos habitantes pueden votar (censados): ");
			censo = sc.nextInt();
		}catch(Exception ioe){
			System.out.println("Error  (0 = null): "+ioe);
		}

		Ayuntamiento ayunta = new Ayuntamiento();

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
			System.out.println("\n¿En que año se fundó?: ");
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
		System.out.println("Nombre: "+partido1.getNombre());
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
		System.out.println("Nombre: "+partido2.getNombre());
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
		System.out.println("Nombre: "+partido3.getNombre());
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
		System.out.println("Nombre: "+partido4.getNombre());
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
		System.out.println("Nombre: "+partido5.getNombre());
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
			FileWriter escritorCenso = new FileWriter(archivoCenso);
			for(int i=0; i > habitantesList.size(); i++){
				escritorCenso.append((habitantesList.get(i)).getNombre()+",");
				escritorCenso.append((habitantesList.get(i)).getApellido()+",");
				escritorCenso.append((habitantesList.get(i)).getEdad()+",");
				escritorCenso.append((habitantesList.get(i)).direccion()+"\n");
			}
		}catch(IOException ioe){
			System.out.println("Error: "+ioe);
		}
/*
		try{
			System.out.println("\nEscribiendo en el archivo 'censo.txt'....");
			FileWriter escritorCenso = new FileWriter(archivoCenso);
			
			escritorCenso.append(uno.getNombre()+","+uno.getApellido()+","+uno.getEdad()+","+uno.direccion()+"\n");
			escritorCenso.append(dos.getNombre()+","+dos.getApellido()+","+dos.getEdad()+","+dos.direccion()+"\n");
			escritorCenso.append(tres.getNombre()+","+tres.getApellido()+","+tres.getEdad()+","+tres.direccion()+"\n");
			escritorCenso.append(cuatro.getNombre()+","+cuatro.getApellido()+","+cuatro.getEdad()+","+cuatro.direccion()+"\n");
			escritorCenso.append(cinco.getNombre()+","+cinco.getApellido()+","+cinco.getEdad()+","+cinco.direccion()+"\n");
			escritorCenso.close();
			System.out.println("\nArchivo listo para lectura");
		}catch(IOException e){
			System.out.println("Error: "+e);
		}
*/
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

//Leer desde archivo listadoPartidos.txt, separar los campos y crear objetos de tipo partido con los atributos leidos y separados
        try{

        	File listaPartidos = new File("./listadoPartidos.txt");
        	FileInputStream fis = new FileInputStream(listaPartidos);
        	InputStreamReader isr = new InputStreamReader(fis, "UTF8");
        	BufferedReader br = new BufferedReader(isr);
        	ArrayList<Partido> partidosCompletos = new ArrayList<Partido>();

        	String linea;

        	linea = br.readLine();
        	while(linea!=null){
        		String [] campos = linea.split(",");
        		Partido partido = new Partido();
        		partido.setNombre(campos[0]);
        		partido.setPresidente(campos[1]);
        		partido.setLema(campos[2]);
        		int compo = Integer.parseInt(campos[3]);
        		partido.setComponentes(compo);
        		int an = Integer.parseInt(campos[4]);
        		partido.setAno(an);
        		partidosCompletos.add(partido);
        		linea = br.readLine();
        	}
        	System.out.println("\nObjetos de tipo partido en ArrayList insertados correctamente...\n");
    		System.out.println("\nLista de los partidos: \n\n");
    		for(int i=0; i < partidosCompletos.size(); i++){
    			System.out.println("--------------------------------------------");
    			System.out.println("Nombre: "+(partidosCompletos.get(i)).getNombre());
    			System.out.println("Apellidos: "+(partidosCompletos.get(i)).getPresidente());
    			System.out.println("Lema: "+(partidosCompletos.get(i)).getLema());
    			System.out.println("Edad: "+(partidosCompletos.get(i)).getComponentes());
    			System.out.println("Direccion: "+(partidosCompletos.get(i)).getAno());
    			System.out.println("--------------------------------------------");
    		}
       	}catch(FileNotFoundException e){
       		System.out.println("Error: "+e);
       	}
       	catch(IOException ioe){
       		System.out.println("Error: "+ioe);
       	}
    

//Leer desde archivo listaHabitantes.txt creado por cualquiera, separar los campos y crear objetos
//de tipo habitante con los atributos leidos y separados
    	
//Utilizamos un ArrayList de tipo objeto, para cada "for" que realice el programa guardará en dicho Array 
//un objeto de tipo habitante con sus atributos
    	try{
    		File listaHabitantes = new File("./listaHabitantes.txt");
    		FileInputStream fis = new FileInputStream(listaHabitantes);
    		InputStreamReader isr = new InputStreamReader(fis);
    		BufferedReader br = new BufferedReader(isr);
    		ArrayList<Habitante> habitantesCompletos = new ArrayList<Habitante>();

    		String linea;

    		linea = br.readLine();
    		while(linea!=null){
    			String [] campos = linea.split(",");
    			int ed = Integer.parseInt(campos[2]);
    			if(ed>=18){
	    			Habitante habitante = new Habitante();
	    			habitante.setNombre(campos[0]);
	    			habitante.setApellido(campos[1]);
	    			
	    			habitante.setEdad(ed);
	    			habitante.setCalleDireccion(campos[3]);
	    			int num = Integer.parseInt(campos[4]);
	    			habitante.setNumeroDireccion(num);
	    			habitantesCompletos.add(habitante);
	    		}
	    		linea = br.readLine();
    		}
    		System.out.println("\nObjetos de tipo habitante en ArrayList insertados correctamente desde archivo listaHabitantes.txt...\n");
    		System.out.println("\nLista de los habitantes con derecho a votar: \n\n");
    		for(int i=0; i < habitantesCompletos.size(); i++){
    			System.out.println("--------------------------------------------");
    			System.out.println("Nombre: "+(habitantesCompletos.get(i)).getNombre());
    			System.out.println("Apellidos: "+(habitantesCompletos.get(i)).getApellido());
    			System.out.println("Edad: "+(habitantesCompletos.get(i)).getEdad());
    			System.out.println("Direccion: "+(habitantesCompletos.get(i)).direccion());
    			System.out.println("--------------------------------------------");
    		}

    	}catch(FileNotFoundException e){
    		System.out.println("Error: "+e);
    	}
    	catch(IOException ioe){
    		System.out.println("Error: "+ioe);
    	}
	}
}