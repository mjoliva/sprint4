package sprint4;
import java.time.LocalDate;
import java.time.Period;

public abstract class Usuario implements IAsesoria{
	protected String nombre;
	protected int run;
	protected String fechaNacimiento;
	
	public Usuario () {
	}
	
	public Usuario (String nombre, String fechaNacimiento, int run ) {
		super();
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
		this.run = run;
				
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public int getRun() {
		return run;
	}
	public void setRun(int run) {
		this.run = run;
	}
	@Override
	public String toString() {
		return "Usuario [nombre=" + nombre + ", RUN=" + run + ", fechaNacimiento=" + fechaNacimiento + "]";
	}

	@Override
	public void analizarUsuario() {
		System.out.println("Nombre: " + nombre);
		System.out.println("RUN: " + run);
		
	}
	public void mostrarEdad() {
		LocalDate actual = LocalDate.now();
		LocalDate fnac = LocalDate.parse(fechaNacimiento);
		int edad = Period.between(fnac,actual).getYears();
		System.out.println("Usuario tiene: "+ edad + " años" );
	}

}
