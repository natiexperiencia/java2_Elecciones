
public class Partido{

	private String nombre, presidente, lema;
	private int componentes, ano;
	private boolean ganador;

	public Partido(String nombre, String presidente, String lema, int componentes, int ano){
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
		this.nombre = nombre;
	}
	public String getPresidente(){
		return presidente;
	}
	public void setPresidente(String presidente){
		this.presidente = presidente;
	}
	public String getLema(){
		return lema;
	}
	public void setLema(String lema){
		this.lema = lema;
	}
	public int getComponentes(){
		return componentes;
	}
	public void setComponentes(int componentes){
		this.componentes = componentes;
	}
	public int getAno(){
		return ano;
	}
	public void setAno(int ano){
		this.ano = ano;
	}
	public boolean getGanador(){
		return ganador;
	}
	public void setGanador(boolean ganador){
		this.ganador = ganador;
	}
}