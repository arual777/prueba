package domin;

public class Deportista {

	private String nombre;
	private Integer numeroSocio;
	
	public Deportista(String nombre, Integer numeroSocio) {
		super();
		this.nombre = nombre;
		this.numeroSocio = numeroSocio;
	}

	

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getNumeroSocio() {
		return numeroSocio;
	}

	public void setNumeroSocio(Integer numeroSocio) {
		this.numeroSocio = numeroSocio;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((numeroSocio == null) ? 0 : numeroSocio.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Deportista))
			return false;
		Deportista other = (Deportista) obj;
		if (numeroSocio == null) {
			if (other.numeroSocio != null)
				return false;
		} else if (!numeroSocio.equals(other.numeroSocio))
			return false;
		return true;
	}
	
	
	
}
