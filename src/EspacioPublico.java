
public class EspacioPublico{

	String tipo, nombre, calleDireccion;
	int numeroDireccion;
	double ancho, largo;
	boolean intemperie;

	public EspacioPublico(String nombre, String tipo, String calleDireccion, int numeroDireccion, double ancho, double largo, boolean intemperie){
		nombre = nombre;
		tipo = tipo;
		calleDireccion = calleDireccion;
		numeroDireccion = numeroDireccion;
		ancho = ancho;
		largo = largo;
		intemperie = intemperie;
	}

	public String direccion(){
		String stringNumeroDireccion = Integer.toString(this.getNumeroDireccion());
		String direccion = this.getCalleDireccion() + stringNumeroDireccion;
		return direccion;
	}
	public double superficie(){
		double result = 2*this.getAncho()+2*this.getLargo();
		return result;
	}
	
	public String getNombre(){
		return nombre;
	}
	public void setNombre(String nombre){
		nombre = nombre;
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
	public double getLargo(){
		return largo;
	}
	public void setLargo(double largo){
		largo = largo;
	}
	public double getAncho(){
		return ancho;
	}
	public void setLargo(int largo){
		largo = largo;
	}
	public String getTipo(){
		return tipo;
	}
	public void setTipo(String tipo){
		tipo = tipo;
	}
	public boolean getIntemperie(){
		return intemperie;
	}
	public void setIntemperie(boolean intemperie){
		intemperie = intemperie;
	}
}