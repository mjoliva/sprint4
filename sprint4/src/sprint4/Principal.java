package sprint4;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Contenedor contenedor = new Contenedor();
		mostrarMenuPrincipal(contenedor);
	}

	public static void mostrarMenuPrincipal(Contenedor contenedor) {

		Scanner scanner = new Scanner(System.in);
		int opcion = 0;

		do {

			System.out.println("===== Menu Principal =====");
			System.out.println("1. Agregar cliente");
			System.out.println("2. Agregar profesional");
			System.out.println("3. Agregar administrativo");
			System.out.println("4. Agregar capacitacion");
			System.out.println("5. Eliminar usuario");
			System.out.println("6. Listar usuarios");
			System.out.println("7. Listar usuarios por tipo");
			System.out.println("8. Listar capacitaciones");
			System.out.println("9. Salir");
			System.out.print("Ingrese una opcion: ");
			opcion = Integer.parseInt(scanner.nextLine());

			switch (opcion) {
			case 1:
				agregarCliente(contenedor);
				break;
			case 2:
				agregarProfesional(contenedor);
				break;
			case 3:
				agregarAdministrativo(contenedor);
				break;
			case 4:
				agregarCapacitacion(contenedor);
				break;
			case 5:
				eliminarUsuario();
				break;
			case 6:
				listarUsuarios();
				break;
			case 7:
				listarUsuariosPorTipo();
				break;
			case 8:
				listarCapacitaciones();
				break;
			case 9:
				System.out.println("Saliendo del programa...");
				break;
			}

		} while (opcion != 9);
		scanner.close();
	}

	private static void listarUsuarios() {
		// TODO Auto-generated method stub

	}

	private static void eliminarUsuario() {
		// TODO Auto-generated method stub

	}

//Ingreso de Datos Cliente
	public static void agregarCliente(Contenedor contenedor) {
		Scanner scanner = new Scanner(System.in);
		// rut cliente
		int run;
		boolean rutValido = false;
		do {
			System.out.println("Ingresa el rut del cliente sin puntos ni guion");
			run = Integer.parseInt(scanner.nextLine());
			if (!Validador.validarRUT(run)) {
				System.out.println("Rut invalido. Por favor ingresalo nuevamente");
			} else {
				rutValido = true;
			}

		} while (!rutValido);
		
		// fecha nacimiento
		String fechaNacimiento;
		boolean fechaNacValido = false;
		do {
			System.out.println("Ingresa la Fecha de nacimiento: ");
			fechaNacimiento = scanner.nextLine();
			if (!Validador.validarFechaNacimiento(fechaNacimiento)) {
				System.out.println("Escriba en formato dd/mm/yyyy");
			} else {
				fechaNacValido = true;
			}
		} while (!fechaNacValido);

		// nombre cliente
		String nombre;
		boolean nombreValido = false;
		do {
			System.out.println("Ingresa nombre cliente: ");
			nombre = scanner.nextLine();
			if (!Validador.validarNombre(nombre, 5, 30)) {
				System.out.println("Escriba entre 5 y 30 caracteres");

			} else {
				nombreValido = true;
			}

		} while (!nombreValido);

		// apellidos cliente

		String Apellidos;
		boolean apellidosValido = false;
		do {
			System.out.println("Ingresa apellidos de cliente: ");
			Apellidos = scanner.nextLine();
			if (!Validador.validarApellidos(Apellidos, 5, 30)) {
				System.out.println("Escriba entre 5 y 30 caracteres");

			} else {
				apellidosValido = true;
			}

		} while (!apellidosValido);
		


		// telefono cliente

		String Telefono;
		boolean telefonoValido = false;
		do {
			System.out.println("Ingresa el telefono del cliente: ");
			Telefono = scanner.nextLine();
			if (!Validador.validarTelefono(Telefono)) {
				System.out.println("teléfono incorrecto");

			} else {
				telefonoValido = true;
			}
		} while (!telefonoValido);

		// AFP cliente

		String AFP;
		boolean AFPValido = false;
		do {
			System.out.println("Ingresa AFP cliente: ");
			AFP = scanner.nextLine();
			if (!Validador.validarAFP(AFP, 4, 30)) {
				System.out.println("Escriba entre 5 y 30 caracteres");
			} else {
				AFPValido = true;
			}
		} while (!AFPValido);

		// prevision
		int Prevision;
		boolean previsionValido = false;
		do {
			System.out.println("Ingresa 1 para Fonasa y 2 para Isapre: ");
			Prevision = Integer.parseInt(scanner.nextLine());
			if (!Validador.validarPrevision(Prevision)) {
				System.out.println("Prevision inválida");
			} else {
				previsionValido = true;
			}
		} while (!previsionValido);
		
		// direccion
		String Direccion;
		boolean direccionValido = false;
		do {
			System.out.println("Ingresa direccion: ");
			Direccion = scanner.nextLine();
			if (!Validador.validarDireccion(Direccion,70)) {
				System.out.println("direccion inválida");
			} else {
				direccionValido = true;
			}
		} while (!direccionValido);
		
		// comuna
		String Comuna;
		boolean comunaValido = false;
		do {
			System.out.println("Ingresa comuna: ");
			Comuna = scanner.nextLine();
			if (!Validador.validarComuna(Comuna,70)) {
				System.out.println("comuna inválida");
			} else {
				comunaValido = true;
			}
		} while (!comunaValido);
		
		// edad
		int Edad;
		boolean edadValido = false;
		do {
			System.out.println("Ingresa edad: ");
			Edad = Integer.parseInt(scanner.nextLine());
			if (!Validador.validarEdad(Edad,1,150)) {
				System.out.println("edad inválida");
			} else {
				edadValido = true;
			}
		} while (!edadValido);

		Cliente nuevoCliente = new Cliente(nombre ,fechaNacimiento, run, Apellidos, Telefono, AFP, Prevision,Direccion, Comuna, Edad);
		contenedor.almacenarCliente(nuevoCliente);
	}

//Ingreso de datos Profesional
	public static void agregarProfesional(Contenedor contenedor) {
		Scanner scanner = new Scanner(System.in);
		int run;
		boolean rutValido = false;
		do {
			System.out.println("Ingresa el rut del cliente sin puntos ni guion");
			run = Integer.parseInt(scanner.nextLine());
			if (!Validador.validarRUT(run)) {
				System.out.println("Rut invalido. Por favor ingresalo nuevamente");
			} else {
				rutValido = true;
			}

		} while (!rutValido);
		
		// fecha nacimiento
		String fechaNacimiento;
		boolean fechaNacValido = false;
		do {
			System.out.println("Ingresa la Fecha de nacimiento: ");
			fechaNacimiento = scanner.nextLine();
			if (!Validador.validarFechaNacimiento(fechaNacimiento)) {
				System.out.println("Escriba en formato dd/mm/yyyy");
			} else {
				fechaNacValido = true;
			}
		} while (!fechaNacValido);

		// nombre
		String nombre;
		boolean nombreValido = false;
		do {
			System.out.println("Ingresa nombre cliente: ");
			nombre = scanner.nextLine();
			if (!Validador.validarNombre(nombre, 5, 30)) {
				System.out.println("Escriba entre 5 y 30 caracteres");

			} else {
				nombreValido = true;
			}

		} while (!nombreValido);

		String titulo;
		boolean validarTitulo = false;
		do {
			System.out.println("Ingresa el titulo del profesional: ");
			titulo = scanner.nextLine();
			if (!Validador.validarTitulo(titulo, 10, 50)) {

				System.out.println("Escriba entre 10 y 50 caracteres");
			} else {
				validarTitulo = true;
			}
		} while (!validarTitulo);

		// fecha 
		String fechaIngreso;
		boolean fechaValido = false;
		do {
			System.out.println("Ingresa la Fecha de ingreso: ");
			fechaIngreso = scanner.nextLine();
			if (!Validador.validarFecha(fechaIngreso)) {
				System.out.println("Escriba en formato dd/mm/yyyy");
			} else {
				fechaValido = true;
			}
		} while (!fechaValido);

		Profesional nuevoProfesional = new Profesional(nombre, fechaNacimiento, run, titulo, fechaIngreso);
		contenedor.almacenarProfesional(nuevoProfesional);
	}

//Ingreso de datos Administrativo
	public static void agregarAdministrativo(Contenedor contenedor) {
		Scanner scanner = new Scanner(System.in);
		int run;
		boolean rutValido = false;
		do {
			System.out.println("Ingresa el rut del cliente sin puntos ni guion");
			run = Integer.parseInt(scanner.nextLine());
			if (!Validador.validarRUT(run)) {
				System.out.println("Rut invalido. Por favor ingresalo nuevamente");
			} else {
				rutValido = true;
			}

		} while (!rutValido);
		
		// fecha nacimiento
		String fechaNacimiento;
		boolean fechaNacValido = false;
		do {
			System.out.println("Ingresa la Fecha de nacimiento: ");
			fechaNacimiento = scanner.nextLine();
			if (!Validador.validarFechaNacimiento(fechaNacimiento)) {
				System.out.println("Escriba en formato dd/mm/yyyy");
			} else {
				fechaNacValido = true;
			}
		} while (!fechaNacValido);

		// nombre cliente
		String nombre;
		boolean nombreValido = false;
		do {
			System.out.println("Ingresa nombre cliente: ");
			nombre = scanner.nextLine();
			if (!Validador.validarNombre(nombre, 5, 30)) {
				System.out.println("Escriba entre 5 y 30 caracteres");

			} else {
				nombreValido = true;
			}

		} while (!nombreValido);
		
		String area;
		boolean validarArea = false;
		do {
			System.out.println("Ingresa el Area: ");
			area = scanner.nextLine();
			if (!Validador.validarArea(area, 5, 20)) {
				System.out.println("Area invalida");

			}else {
				validarArea = true;
			}
		}while (!validarArea);
		
		String experienciaPrevia;
		boolean validarExperienciaPrevia = false;
		do{
			System.out.println("Ingresa experiencia previa: ");
			experienciaPrevia = scanner.nextLine();
			if (!Validador.validarExperienciaPrevia(experienciaPrevia, 100)) {
				System.out.println("Escriba menos de 100 caracteres");

			}else {
				validarExperienciaPrevia = true;
				}	
		}while (!validarExperienciaPrevia);
		Administrativo nuevAdministrativo = new Administrativo(nombre, fechaNacimiento, run, area, experienciaPrevia);
		contenedor.almacenarAdministrativo(nuevAdministrativo);
	}


//Ingreso de datos Capacitacion
	public static void agregarCapacitacion(Contenedor contenedor) {

		Scanner scanner = new Scanner(System.in);
		int run;
		boolean rutValido = false;
		do {
			System.out.println("Ingresa el rut del cliente sin puntos ni guion");
			run = Integer.parseInt(scanner.nextLine());
			if (!Validador.validarRUT(run)) {
				System.out.println("Rut invalido. Por favor ingresalo nuevamente");
			} else {
				rutValido = true;
			}

		} while (!rutValido);
		
		// fecha nacimiento
		String fechaNacimiento;
		boolean fechaNacValido = false;
		do {
			System.out.println("Ingresa la Fecha de nacimiento: ");
			fechaNacimiento = scanner.nextLine();
			if (!Validador.validarFechaNacimiento(fechaNacimiento)) {
				System.out.println("Escriba en formato dd/mm/yyyy");
			} else {
				fechaNacValido = true;
			}
		} while (!fechaNacValido);

		// nombre cliente
		String nombre;
		boolean nombreValido = false;
		do {
			System.out.println("Ingresa nombre cliente: ");
			nombre = scanner.nextLine();
			if (!Validador.validarNombre(nombre, 5, 30)) {
				System.out.println("Escriba entre 5 y 30 caracteres");

			} else {
				nombreValido = true;
			}

		} while (!nombreValido);
		
		String dia;
		boolean diaValido = false;
		do {
			System.out.println("Ingresa el Dia: ");
			dia = scanner.nextLine();
			if (!Validador.validarDia(dia)) {
				System.out.println("Dia invalido");

			}else {
				diaValido = true;
			}
		}while (!diaValido);
		
		String Hora;
		boolean horaValido = false;
		do {
			System.out.println("Ingresa hora: ");
			Hora = scanner.nextLine();
			if (!Validador.validarHora(Hora)) {
				System.out.println("Formato de hora invalido");

			}else {
				horaValido = true;
			}
		}while (!horaValido);
		
		String Lugar;
		boolean lugarValido = false;
		do {
			System.out.println("Ingresa el Lugar: ");
			Lugar = scanner.nextLine();
			if (!Validador.validarLugar(Lugar,10,50)) {
				System.out.println("Lugar invalido");

			}else {
				lugarValido = true;
			}
		}while (!lugarValido);
		
		int Duracion;
		boolean duracionValido = false;
		do {
			System.out.println("Ingresa la duración: ");
			Duracion = Integer.parseInt(scanner.nextLine());
			if (!Validador.validarDuracion(Duracion,70)) {
				System.out.println("Duracion invalida");

			}else {
				duracionValido = true;
			}
		}while (!duracionValido);
		
		int CantidadAsistentes;
		boolean cantidadAsistentesValido = false;
		do {
			System.out.println("Ingresa la duración: ");
			CantidadAsistentes = Integer.parseInt(scanner.nextLine());
			if (!Validador.validarDuracion(CantidadAsistentes,1000)) {
				System.out.println("Cantidad de asistentes invalida");

			}else {
				cantidadAsistentesValido = true;
			}
		}while (!cantidadAsistentesValido);
		
	}

	public static void eliminiarUsuario() {
		System.out.println("opcion 5");
	}

	public static void listarUsuario() {
		System.out.println("opcion 6");
	}

	public static void listarUsuariosPorTipo() {
		System.out.println("opcion 7");
	}

	public static void listarCapacitaciones() {
		System.out.println("opcion 8");

	}

}
