package sprint4;

public class Cliente extends Usuario {

	// private int RUT;
	// private String Nombres;
	private String Apellidos;
	private String Telefono;
	private String AFP;
	private int Prevision;
	private String Direccion;
	private String Comuna;
	private int Edad;	
	
	public Cliente (String nombre, String fechaNacimiento, int run, String Apellidos, String Telefono, String AFP, int Prevision, String Direccion, String Comuna, int Edad) {
		super(nombre, fechaNacimiento, run);
		
		this.Apellidos = Apellidos;
		this.Telefono = Telefono;
		this.AFP = AFP;
		this.Prevision = Prevision;
		this.Direccion = Direccion;
		this.Comuna = Comuna;
		this.Edad = Edad;
	}
	
	public String getApellidos() {
		return Apellidos;
	}
	public void setApellidos(String Apellidos) {
		this.Apellidos = Apellidos;
	}
	public String getTelefono() {
		return Telefono;
	}
	public void setTelefono(String Telefono) {
		this.Telefono = Telefono;
	}
	public String getAFP() {
		return AFP;
	}
	public void setAFP(String AFP) {
		this.AFP = AFP;
	}
	public int getPrevision() {
		return Prevision;
	}
	public void setPrevision(int Prevision) {
		this.Prevision = Prevision;
	}
	public String getDireccion() {
		return Direccion;
	}
	public void setDireccion(String Direccion) {
		this.Direccion = Direccion;
	}
	public String getComuna() {
		return Comuna;
	}
	public void setComuna(String Comuna) {
		this.Comuna = Comuna;
	}
	public int getEdad() {
		return Edad;
	}
	public void setEdad(int Edad) {
		this.Edad = Edad;
	}
	@Override
	public String toString() {
	    return "Cliente{" +
	            "rut=" + run +
	            ", nombres='" + nombre + '\'' +
	            ", apellidos='" + Apellidos + '\'' +
	            ", telefono='" + Telefono + '\'' +
	            ", afp='" + AFP + '\'' +
	            ", sistemaSalud=" + Prevision +
	            ", direccion='" + Direccion + '\'' +
	            ", comuna='" + Comuna + '\'' +
	            ", edad=" + Edad +
	            '}';
	}

	public String obtenerNombre() {
		return nombre +" "+ Apellidos;
	
}
	public void obtenerSistemaSalud() {
		if(Prevision==1){
			System.out.println("El sistema de salud del usuario es Fonasa");
		}else if (Prevision ==2) {
			System.out.println("El sistema de salud del usuario es Isapre");
		}else {
			System.out.println("La opcion no es valida");
		}
	}
	@Override
		public void analizarUsuario() {
		super.analizarUsuario();
		System.out.println("Direccion:" + Direccion + " Comuna: " + Comuna);
		}

	}
	
	




