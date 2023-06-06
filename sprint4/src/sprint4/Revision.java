package sprint4;

public class Revision {
	
	private static int idcont = 0;
	private int id;
	private int idVisitaTerreno;
	private String nombre;
	private String detalle;
	private int estado;
	
	
	public Revision(int idVisitaTerreno, String nombre, String detalle, int estado) {
		super();
		idcont++;
		this.id = idcont;
		this.idVisitaTerreno = idVisitaTerreno;
		this.nombre = nombre;
		this.detalle = detalle;
		this.estado = estado;
	}


	public int getId() {
		return id;
	}

	public int getIdVisitaTerreno() {
		return idVisitaTerreno;
	}


	public void setIdVisitaTerreno(int idVisitaTerreno) {
		this.idVisitaTerreno = idVisitaTerreno;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getDetalle() {
		return detalle;
	}


	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}


	public int getEstado() {
		return estado;
	}


	public void setEstado(int estado) {
		this.estado = estado;
	}


	@Override
	public String toString() {
		return "Revision [id=" + id + ", idVisitaTerreno=" + idVisitaTerreno + ", nombre=" + nombre + ", detalle="
				+ detalle + ", estado=" + estado + "]";
	}
	
	
	
	
}
