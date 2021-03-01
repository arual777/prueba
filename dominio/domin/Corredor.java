package domin;

public class Corredor extends Deportista implements Icorredor{

	private Integer kmEntrenados;
	private Integer distanciaPreferida;
	
	public Corredor(String nombre, Integer numeroSocio, Integer kmEntrenados, Integer distanciaPreferida) {
		
		super(nombre, numeroSocio);
		this.kmEntrenados = kmEntrenados;
		this.distanciaPreferida = distanciaPreferida;
	}
		
	@Override
		public Integer getKmEntrenados() {
			return kmEntrenados;
		}


	@Override
		public void setKmEntrenados(Integer kmEntrenados) {
			this.kmEntrenados = kmEntrenados;
		}

	@Override
		public Integer getDistanciaPreferida() {
			return distanciaPreferida;
			
		}

	@Override
		public void setDistanciaPreferida(Integer distanciaPreferida) {
			this.distanciaPreferida = distanciaPreferida;
		}
		
	}
	
