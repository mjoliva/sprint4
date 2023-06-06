package sprint4;
import java.util.ArrayList;
import java.util.List;


public class Contenedor {
	
	private List<IAsesoria> aseso;
	private List<Capacitacion> capa;
	
	public Contenedor() {
		aseso = new ArrayList<>();
		capa = new ArrayList<>();
		
	}	
	

	public void almacenarCliente(Cliente clie) {
		aseso.add(clie);

	}
	public void almacenarProfesional(Profesional profe) {
		aseso.add(profe);

	}
	
	public void almacenarAdministrativo(Administrativo adm) {
		aseso.add(adm);

	}
	
	public void almacenarCapacitacion(Capacitacion capaci) {
		capa.add(capaci);

	}
	
    public void eliminarUsuario(int run) {
        aseso.removeIf(asesoria -> asesoria.getRun() == run);

    }
    

    public void listarUsuarios() {
        for (IAsesoria asesoria : aseso) {
            if (asesoria instanceof Usuario) {
                Usuario usuario = (Usuario) asesoria;
                System.out.println(usuario.toString());
            }
        }
    }

    public void listarUsuariosPorTipo(String tipo) {
        for (IAsesoria asesoria : aseso) {
            if (asesoria instanceof Cliente && tipo.equalsIgnoreCase("cliente")) {
                System.out.println(asesoria.toString());
            } else if (asesoria instanceof Profesional && tipo.equalsIgnoreCase("profesional")) {
                System.out.println(asesoria.toString());
            } else if (asesoria instanceof Administrativo && tipo.equalsIgnoreCase("administrativo")) {
                System.out.println(asesoria.toString());
            } else if (asesoria instanceof Usuario && tipo.equalsIgnoreCase("usuario")) {
                System.out.println(asesoria.toString());
            }
        }
    }
    
    

    public void listarCapacitaciones() {
        for (Capacitacion capacitacion : capa) {
            System.out.println("Capacitacion:");
            System.out.println("Identificador: " + capacitacion.getIdentificador());
            System.out.println("RUT Cliente: " + capacitacion.getRUT());
            System.out.println("Dia: " + capacitacion.getDia());
            System.out.println("Hora: " + capacitacion.getHora());
            System.out.println("Lugar: " + capacitacion.getLugar());
            System.out.println("Duracion: " + capacitacion.getDuracion());
            System.out.println("Cantidad de asistentes: " + capacitacion.getCantidadAsistentes());

            // Obtener cliente asociado a la capacitación
            Cliente cliente = null;
            for (IAsesoria asesoria : aseso) {
                if (asesoria instanceof Cliente && ((Cliente) asesoria).getRun() == capacitacion.getRUT()) {
                    cliente = (Cliente) asesoria;
                    break;
                }
            }

            if (cliente != null) {
                System.out.println("Cliente asociado:");
                System.out.println("RUT: " + cliente.getRun());
                System.out.println("Nombres: " + cliente.getNombre());
                System.out.println("Apellidos: " + cliente.getApellidos());
                System.out.println("Telefono: " + cliente.getTelefono());
                System.out.println("AFP: " + cliente.getAFP());
                System.out.println("Sistema de salud: " + cliente.getPrevision());
                System.out.println("Direccion: " + cliente.getDireccion());
                System.out.println("Comuna: " + cliente.getComuna());
                System.out.println("Edad: " + cliente.getEdad());
            }

            System.out.println("------------------------");
        }
    }



}
