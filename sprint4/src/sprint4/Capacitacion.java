package sprint4;

public class Capacitacion {
	private static int contador = 0;
	private int identificador;
	private int RUT;
	private String Dia;
	private String Hora;
	private String Lugar;
	private int Duracion;
	private int CantidadAsistentes;
	
	public Capacitacion (int RUT, String Dia, String Hora, String Lugar, int Duracion, int CantidadAsistentes) {
		contador++;
		this.identificador = contador;
		this.RUT = RUT;
		this.Dia = Dia;
		this.Hora = Hora;
		this.Lugar = Lugar;
		this.Duracion = Duracion;
		this.CantidadAsistentes = CantidadAsistentes;
	}
	public int getIdentificador(){
		return identificador;
	}
	public int getRUT() {
		return RUT;
	}
	public void setRUT(int RUT) {
		this.RUT = RUT;
	}
	public String getDia() {
		return Dia;
	}
	public void setDia(String Dia) {
		this.Dia = Dia;
	}
	public String getHora() {
		return Hora;
	}
	public void setHora(String Hora) {
		this.Hora = Hora;
	}
	public String getLugar() {
		return Lugar;
	}
	public void setLugar(String Lugar) {
		this.Lugar = Lugar;
	}
	public int getDuracion() {
		return Duracion;
	}
	public void setDuracion(int Duracion) {
		this.Duracion = Duracion;
	}
	public int getCantidadAsistentes() {
		return CantidadAsistentes;
	}
	public void setCantidadAsistentes(int CantidadAsistentes) {
		this.CantidadAsistentes = CantidadAsistentes;
	}
	@Override
	public String toString() {
	    return "Capacitacion{" +
	            "identificador=" + identificador +
	            ", rutCliente=" + RUT +
	            ", dia='" + Dia + '\'' +
	            ", hora='" + Hora + '\'' +
	            ", lugar='" + Lugar + '\'' +
	            ", duracion=" + Duracion +
	            ", cantidadAsistentes=" + CantidadAsistentes +
	            '}';
	}
	public String mostrarDetalle() {
		
		
		
		return "La capacitación será en "+ Lugar +" a las "+Hora+" del día "
				+ ""+Dia+", y durará "+Duracion+" minutos";
	}
}


