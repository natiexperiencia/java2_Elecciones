
public class Habitante {

	String nombre, apellido, calleDireccion, voto;
	int edad, numeroDireccion;

	public Habitante (String nombre, String apellido, int edad, String calleDireccion, int numeroDireccion ){
		nombre = nombre;
		apellido = apellido;
		edad = edad;
		calleDireccion = calleDireccion;
		numeroDireccion = numeroDireccion;
	}

	public String direccion(){
		String stringNumeroDireccion = Integer.toString(this.getNumeroDireccion());
		String direccion = this.getCalleDireccion() + stringNumeroDireccion;
		return direccion;
	}

	public String getNombre(){
		return nombre;
	}
	public void setNombre(String nombre){
		nombre = nombre;
	}
	public String getApellido(){
		return apellido;
	}
	public void setApellido(String apellido){
		apellido = apellido;
	}
	public int getEdad(){
		return edad;
	}
	public void setEdad(int edad){
		edad = edad;
	}
	public String getCalleDireccion(){
		return calleDireccion;
	}
	public void setCalleDireccion(String calleDireccion){
		calleDireccion = calleDireccion;
	}
	public int getNumeroDireccion(){
		return numeroDireccion;
	}
	public void setNumeroDireccion(int numeroDireccion){
		numeroDireccion = numeroDireccion;
	}
	public String getVoto(){
		return voto;
	}
	public void setVoto(String voto){
		voto = voto;
	}
}