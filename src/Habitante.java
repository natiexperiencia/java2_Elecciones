
public class Habitante {

	private String nombre, apellido, calleDireccion, voto;
	private int edad, numeroDireccion;

	public Habitante (String nombre, String apellido, int edad, String calleDireccion, int numeroDireccion ){
		nombre = nombre;
		apellido = apellido;
		edad = edad;
		calleDireccion = calleDireccion;
		numeroDireccion = numeroDireccion;
	}
	public Habitante(){}

	public String direccion(){
		String stringNumeroDireccion = Integer.toString(this.getNumeroDireccion());
		String direccion = this.getCalleDireccion()+ " " + stringNumeroDireccion;
		return direccion;
	}

	public String getNombre(){
		return nombre;
	}
	public void setNombre(String nombre){
		this.nombre = nombre;
	}
	public String getApellido(){
		return apellido;
	}
	public void setApellido(String apellido){
		this.apellido = apellido;
	}
	public int getEdad(){
		return edad;
	}
	public void setEdad(int edad){
		this.edad = edad;
	}
	public String getCalleDireccion(){
		return calleDireccion;
	}
	public void setCalleDireccion(String calleDireccion){
		this.calleDireccion = calleDireccion;
	}
	public int getNumeroDireccion(){
		return numeroDireccion;
	}
	public void setNumeroDireccion(int numeroDireccion){
		this.numeroDireccion = numeroDireccion;
	}
	public String getVoto(){
		return voto;
	}
	public void setVoto(String voto){
		this.voto = voto;
	}
}