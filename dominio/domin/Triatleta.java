package domin;

public class Triatleta extends Deportista implements Iciclista, Inadador, Icorredor{

	private TipoBici tipo;
	private String estiloPreferido;
	private Integer kmEntrenados;
	private Integer distanciaPreferida;
	
	public Triatleta(String nombre, Integer numeroSocio, TipoBici tipo, String estiloPreferido, Integer kmEntrenados,
			Integer distanciaPreferida) {
		super(nombre, numeroSocio);
		this.tipo = tipo;
		this.estiloPreferido = estiloPreferido;
		this.kmEntrenados = kmEntrenados;
		this.distanciaPreferida = distanciaPreferida;
}

	

	public String getEstiloPreferido() {
		return estiloPreferido;
	}

	public void setEstiloPreferido(String estiloPreferido) {
		this.estiloPreferido = estiloPreferido;
	}

	public Integer getKmEntrenados() {
		return kmEntrenados;
	}

	public void setKmEntrenados(Integer kmEntrenados) {
		this.kmEntrenados = kmEntrenados;
	}

	public Integer getDistanciaPreferida() {
		return distanciaPreferida;
	}

	public void setDistanciaPreferida(Integer distanciaPreferida) {
		this.distanciaPreferida = distanciaPreferida;
	}

	@Override
	public TipoBici getTipoPreferido() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}