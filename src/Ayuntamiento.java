
public class Ayuntamiento{

	String nombre, alcalde, calleDireccion;
	int numeroDireccion, poblacion, censo;

	public Ayuntamiento(String nombre, String alcalde, String calleDireccion, int numeroDireccion, int poblacion, int censo){
		nombre = nombre;
		alcalde = alcalde;
		calleDireccion = calleDireccion;
		numeroDireccion = numeroDireccion;
		poblacion = poblacion;
		censo = censo;
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
	public String getAlcalde(){
		return alcalde;
	}
	public void setAlcalde(String alcalde){
		alcalde = alcalde;
	}
	public int getPoblacion() {
		return poblacion;
	}
	public void setPoblacion(int poblacion){
		poblacion = poblacion;
	}
	public int getCenso(){
		return censo;
	}
	public void setCenso(int censo){
		censo = censo;
	}

}