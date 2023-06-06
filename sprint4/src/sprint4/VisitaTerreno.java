
package sprint4;

public class VisitaTerreno {
	
	private static int idcont = 0;
	private int id;
	private String rutCliente;
	private String dia;
	private String hora;
	private String lugar;
	private String comentarios;
	

	public VisitaTerreno(String rutCliente, String dia, String hora, String lugar, String comentarios) {
		super();
		idcont++;
		this.id = idcont;
		this.rutCliente = rutCliente;
		this.dia = dia;
		this.hora = hora;
		this.lugar = lugar;
		this.comentarios = comentarios;
	}


	public int getId() {
		return id;
	}


	public String getRutCliente() {
		return rutCliente;
	}


	public void setRutCliente(String rutCliente) {
		this.rutCliente = rutCliente;
	}


	public String getDia() {
		return dia;
	}


	public void setDia(String dia) {
		this.dia = dia;
	}


	public String getHora() {
		return hora;
	}


	public void setHora(String hora) {
		this.hora = hora;
	}


	public String getLugar() {
		return lugar;
	}


	public void setLugar(String lugar) {
		this.lugar = lugar;
	}


	public String getComentarios() {
		return comentarios;
	}


	public void setComentarios(String comentarios) {
		this.comentarios = comentarios;
	}


	@Override
	public String toString() {
		return "VisitaTerreno [id=" + id + ", rutCliente=" + rutCliente + ", dia=" + dia + ", hora=" + hora + ", lugar="
				+ lugar + ", comentarios=" + comentarios + "]";
	}
	
	

}
