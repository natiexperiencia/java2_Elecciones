
public class Partido{

	String nombre, presidente, lema;
	int componentes, ano;
	boolean ganador;

	public Partido(String nombre, String presidente, String lema, int componentes, int ano, boolean ganador){
		nombre = nombre;
		presidente = presidente;
		lema = lema;
		componentes = componentes;
		ano = ano;
		ganador = ganador;
	}
	public String getNombre(){
		return nombre;
	}
	public void setNombre(String nombre){
		nombre = nombre;
	}
	public String getPresidente(){
		return presidente;
	}
	public void setPresidente(String presidente){
		presidente = presidente;
	}
	public String getLema(){
		return lema;
	}
	public void setLema(String lema){
		lema = lema;
	}
	public int getComponentes(){
		return componentes;
	}
	public void setComponentes(int componentes){
		componentes = componentes;
	}
	public int getAno(){
		return ano;
	}
	public void setAno(int ano){
		ano = ano;
	}
	public boolean getGanador(){
		return ganador;
	}
	public void setGanador(boolean ganador){
		ganador = ganador;
	}
}