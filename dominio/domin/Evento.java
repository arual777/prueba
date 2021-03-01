package domin;

import java.util.HashMap;
import java.util.Map;

public class Evento {
	
	private TipoDeEvento tipo;
	private Integer numeroInscripcion;
	private Map <Integer,Deportista> participantes;
	
	public Evento(TipoDeEvento tipo) {
		super();
		this.tipo = tipo;
		this.numeroInscripcion = 0;
		this.participantes = new HashMap <Integer, Deportista>();
	}

	public TipoDeEvento getTipo() {
		return tipo;
	}

	public void setTipo(TipoDeEvento tipo) {
		this.tipo = tipo;
	}

	public Integer getNumeroInscripcion() {
		return numeroInscripcion;
	}

	public void setNumeroInscripcion(Integer numeroInscripcion) {
		this.numeroInscripcion = numeroInscripcion;
	}

	public Map<Integer, Deportista> getParticipantes() {
		return participantes;
	}

	public void setParticipantes(Map<Integer, Deportista> participantes) {
		this.participantes = participantes;
	}
	
	public Integer agregarParticipantes(Deportista nuevo) {
		
		participantes.put(++this.numeroInscripcion, nuevo); //por qué el ++??como sabe el numero de inscripcion de cada depostista? no tendría que hacer nuevo.getNumerode Inscripcion??
		return numeroInscripcion;
	}

}
