
public class Inmueble{

	double largo, ancho;
	String nombre, calleDireccion;
	int numeroDireccion;

	public Inmueble(String nombre, String calleDireccion, int numeroDireccion, double largo, double ancho){
		nombre = nombre;
		calleDireccion = calleDireccion;
		numeroDireccion = numeroDireccion;
		largo = largo;
		ancho = ancho;
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

}