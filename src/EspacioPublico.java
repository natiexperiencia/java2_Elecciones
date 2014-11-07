
public class EspacioPublico{

	private String tipo, nombre, calleDireccion;
	private int numeroDireccion;
	private double ancho, largo;
	private boolean intemperie;

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
		double result = this.getAncho()*this.getLargo();
		return result;
	}
	
	public String getNombre(){
		return nombre;
	}
	public void setNombre(String nombre){
		this.nombre = nombre;
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
	public double getLargo(){
		return largo;
	}
	public void setLargo(double largo){
		this.largo = largo;
	}
	public double getAncho(){
		return ancho;
	}
	public void setLargo(int largo){
		this.largo = largo;
	}
	public String getTipo(){
		return tipo;
	}
	public void setTipo(String tipo){
		this.tipo = tipo;
	}
	public boolean getIntemperie(){
		return intemperie;
	}
	public void setIntemperie(boolean intemperie){
		this.intemperie = intemperie;
	}
}