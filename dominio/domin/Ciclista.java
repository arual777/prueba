package domin;

public class Ciclista extends Deportista implements Iciclista{

	private TipoBici tipoPreferido;
	
	public Ciclista(String nombre, Integer numeroSocio, TipoBici tipoPreferido) {
		super(nombre, numeroSocio);
		this.tipoPreferido=tipoPreferido;
	}

	public TipoBici getTipoPreferido() {
		return tipoPreferido;
	}

}
