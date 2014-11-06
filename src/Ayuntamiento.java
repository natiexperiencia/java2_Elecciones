
public class Ayuntamiento{

	private String nombre, alcalde, calleDireccion;
	private int numeroDireccion, poblacion, censo;

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
	public String getAlcalde(){
		return alcalde;
	}
	public void setAlcalde(String alcalde){
		this.alcalde = alcalde;
	}
	public int getPoblacion() {
		return poblacion;
	}
	public void setPoblacion(int poblacion){
		this.poblacion = poblacion;
	}
	public int getCenso(){
		return censo;
	}
	public void setCenso(int censo){
		this.censo = censo;
	}

}