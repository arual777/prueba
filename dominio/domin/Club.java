package domin;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Club {
	

	private String nombre;
	private Map<String, Evento> competencias;
	private HashSet<Deportista> socios;


	public Club(String nombre) {
		this.nombre= nombre;
		competencias= new HashMap<>();
		socios= new HashSet<>();
	}
	
	public void agregarDeportista(Deportista nuevo) {
		socios.add(nuevo);
	}
	
	public Integer getCantidadSocios() {
		
	return socios.size();
	}

	public void crearEvento(TipoDeEvento tipo, String nombre) {
		
		Evento carrera= new Evento(tipo);
		
		competencias.put(nombre, carrera);
	}

	public Integer obtenerCantidadDeEventos() {
		
		return competencias.size();
	}
	
	public Integer inscribirEnEvento(String nombreDelEvento, Deportista aInscribir) throws NoEstaPreparado {
		
		Integer numeroInscripcion=0;
		Evento deseado= competencias.get(nombreDelEvento);
		
		if(competencias.containsKey(nombreDelEvento)&& socios.contains(aInscribir)) {
			
			
			switch(deseado.getTipo()){
			
			case CARRERA_5K:
			case CARRERA_10K:
			case CARRERA_21K:
			case CARRERA_42K:
				if(aInscribir instanceof Corredor) {
					numeroInscripcion= deseado.agregarParticipantes(aInscribir);
				}
				else {
					throw new NoEstaPreparado ("Debe ser un corredor");
				}
			break;
			
			case CARRERA_NATACION_EN_PICINA:
			case CARRERA_NATACION_EN_AGUAS_ABIERTAS:
				if(aInscribir instanceof Inadador) {
					numeroInscripcion= deseado.agregarParticipantes(aInscribir);
				}
				else {
					throw new NoEstaPreparado ("Debe ser un nadador");
				}
			break;
			
			case TRIATLON_SHORT:
			case TRIATLON_OLIMPICO:
			case TRIATLON_MEDIO:
			case TRIATLON_IRONMAN:
				if(aInscribir instanceof  Inadador && aInscribir instanceof Iciclista) {
					numeroInscripcion= deseado.agregarParticipantes(aInscribir);
				}
				else {
					throw new NoEstaPreparado ("Debe ser un nadador y ciclista");
				}
			break;
		}
			
		}
		return numeroInscripcion;
}
}