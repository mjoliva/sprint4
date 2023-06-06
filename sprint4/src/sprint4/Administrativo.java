package sprint4;

public class Administrativo extends Usuario {
	
	private String area;
	private String experienciaPrevia;
	
	public Administrativo (String nombre, String fechaNacimiento, int run) {
		super(nombre, fechaNacimiento, run);
	}

	public Administrativo (String nombre, String fechaNacimiento, int run, String area,String experienciaPrevia ) {
		super(nombre, fechaNacimiento, run);
		this.area = area;
		this.experienciaPrevia = experienciaPrevia;
	}
	

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getexperienciaPrevia() {
		return experienciaPrevia;
	}

	public void setexperienciaPrevia(String experienciaPrevia) {
		this.experienciaPrevia = experienciaPrevia;
	}

	@Override
	public String toString() {
		return "Administrativo [area=" + area + ", experienciaPrevia=" + experienciaPrevia + "]";
	}
	
	@Override
	public void analizarUsuario() {
	super.analizarUsuario();
	System.out.println("Area:" + area+ " Experiencia previa: " + experienciaPrevia);
	}

}
