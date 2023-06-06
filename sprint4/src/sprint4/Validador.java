package sprint4;
import java.text.SimpleDateFormat;
import java.text.ParseException;

public class Validador {
	// Validar RUN
    public static boolean validarRUT(int RUT) {
	    return RUT < 99_999_999;
    }
   
    // Validar nombre 
    public static boolean validarNombre(String nombre, int minCar, int maxCar) {
    	
        if (nombre.length() < minCar || nombre.length() > maxCar) {
            return false;
        }
        return true;
    }
    
    // Validar fechaNacimiento
    public static boolean validarFechaNacimiento(String fechaNacimiento) {
        if (fechaNacimiento.isEmpty()) {
          return false;
        }

        SimpleDateFormat formatoFechaNacimiento = new SimpleDateFormat("dd/mm/yyyy");
        formatoFechaNacimiento.setLenient(false);
        try {
        	formatoFechaNacimiento.parse(fechaNacimiento);
          return true;
        } catch (ParseException e) {
          return false;
        }
      }
    
    
    
    // Validar apellidos
    public static boolean validarApellidos(String apellidos, int minCar, int maxCar) {
    	
        if (apellidos.length() < minCar || apellidos.length() > maxCar) {
            return false;
        }
        return true;
    }
    
    
    // Validar Telefono
    public static boolean validarTelefono(String telefono) {
    	
    
	    if (telefono.matches("\\d+")) {
	        return  true;
	    }
	    return false;
    }
    
	// Validar AFP
    
    public static boolean validarAFP(String AFP, int minCar, int maxCar) {
    	
        if (AFP.length() < minCar || AFP.length() > maxCar) {
            return false;
        }
        return true;
    }
    
    // Validar Prevision
    
    public static boolean validarPrevision(int Prevision) { 	 
    	
    	if (Prevision > 2 || Prevision < 1) {
    		return false;
    	}
    	return true;
    }
    
    // Validar Direccion
    
    public static boolean validarDireccion(String direccion, int maxCar) {
    	
        if (direccion.length() > maxCar) {
            return false;
        }
        return true;
    }
    
    // Validar Comuna
    
    public static boolean validarComuna(String comuna, int maxCar) {
    	
        if (comuna.length() > maxCar) {
            return false;
        }
        return true;
    }
    
	// Validar Edad
    
    public static boolean validarEdad(int edad, int minNum, int maxNum) {
    	
        if (edad < minNum || edad > maxNum) {
            return false;
        }
        return true;
    }
    
    // Validar titulo
    
    public static boolean validarTitulo(String titulo, int minCar, int maxCar) {
    	
        if (titulo.length() < minCar || titulo.length() > maxCar) {
            return false;
        }
        return true;
    }
    
    
    // Validar experienciaPrevia
    
    public static boolean validarExperienciaPrevia(String experienciaPrevia, int maxCar) {
    	
        if (experienciaPrevia.length() > maxCar) {
            return false;
        }
        return true;
    }
    
    
    // Validar area
    
    public static boolean validarArea(String area, int minCar, int maxCar) {
    	
        if (area.length() < minCar || area.length() > maxCar) {
            return false;
        }
        return true;
    }
    
  //----------
  //Capacitacion
  //----------
    
    // Valdar dia 
    
    public static boolean validarDia(String dia) {
    	String[] diasDeLaSemana = { "lunes", "martes", "miércoles", "jueves", "viernes", "sábado", "domingo" };
        for (String diaDeLaSemana : diasDeLaSemana) {
        	if (dia.equals(diaDeLaSemana)) {        
        		return true;
        	}
        }
        	return false;
    }
    
    // Validar CantidadAsistentes
    
    public static boolean validarCantidadAsistentes(int CantidadAsistentes) {
	    if (CantidadAsistentes > 1000) {
	        return false;
	    }
	    return true;
    }
    // Validar Lugar
    public static boolean validarLugar(String Lugar,int minCar,int maxCar) {
        // Lógica de validación.
    	 if (Lugar.length() > minCar || maxCar < Lugar.length()){
    		    // La cadena es válida
    		 return true;
         } else {
             // La cadena no es válida
        	 return false;
         }
    }
    
    // Validar Duración
    public static boolean validarDuracion(int Duracion,int maxCar) {
        // Lógica de validación.
    	 if (maxCar > Duracion){
    		    // La cadena es válida
    		 return true;
         } else {
             // La cadena no es válida
        	 return false;
         }
}

//----------
//Accidente
//----------
    //Validar Hora
    public static boolean validarHora(String Hora) {
        if (Hora.isEmpty()) {
          return false;
        }
        SimpleDateFormat formatoHora = new SimpleDateFormat("hh:mm");
        formatoHora.setLenient(false);
        try {
          formatoHora.parse(Hora);
          return true;
        } catch (ParseException e) {
          return false;
        }
      }
    //Validar Fecha
    public static boolean validarFecha(String Fecha) {
        if (Fecha.isEmpty()) {
          return false;
        }

        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/mm/yyyy");
        formatoFecha.setLenient(false);
        try {
          formatoFecha.parse(Fecha);
          return true;
        } catch (ParseException e) {
          return false;
        }
      }
    public static boolean validarOrigen(String origen,int minCar,int maxCar) {
        // Lógica de validación.
    	 if (origen.length() > minCar && maxCar < origen.length()){
    		    // La cadena es válida
    		 return true;
         } else {
             // La cadena no es válida
        	 return false;
         }
}
    	 
public static boolean validarConsecuencias(String consecuencias,int minCar,int maxCar) {
        // Lógica de validación.
    	 if (consecuencias.length() > minCar && maxCar < consecuencias.length()){
    		    // La cadena es válida
    		 return true;
         } else {
             // La cadena no es válida
        	 return false;
         }
}
//--------------
//VistasTerreno
//--------------
public static boolean validarComentarios(String comentarios,int minCar,int maxCar) {
		// Lógica de validación.
		if (comentarios.length() > minCar && maxCar < comentarios.length()){
		 // La cadena es válida
			return true;
		} else {
			// La cadena no es válida
			return false;
		}
}
//---------
//Revision
//---------
public static boolean validarDetalle(String detalle,int minCar,int maxCar) {
	// Lógica de validación.
	if (detalle.length() > minCar && maxCar < detalle.length()){
	 // La cadena es válida
		return true;
	} else {
		// La cadena no es válida
		return false;
	}
}
  

    
}