package prueba;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import domin.Club;
import domin.Corredor;
import domin.Deportista;
import domin.Evento;
import domin.NoEstaPreparado;
import domin.TipoDeEvento;

public class PruebaClub {
	
	@Test
	public void queSeAgregueUnSocio() {
		Club loqui= new Club("loqui");
		Deportista nuevo= new Deportista("Jorge", 23);
		loqui.agregarDeportista(nuevo);
		
		Integer ve=1;
		Integer vo= loqui.getCantidadSocios();
		
		assertEquals(ve, vo);
	}
	
	
	@Test
	public void queSeCreeUnEventoyQueSeInscriban() throws NoEstaPreparado {
		Club loqui= new Club("loqui");
		loqui.crearEvento(TipoDeEvento.CARRERA_5K, "Carrera de 5km");
		
		Corredor nuevo= new Corredor("Jorge", 23, 30, 30);
		loqui.agregarDeportista(nuevo);
		loqui.inscribirEnEvento("Carrera de 5km", nuevo);
		
		Integer ve=1;
		Integer vo= loqui.obtenerCantidadDeEventos();
		assertEquals(ve, vo);
		
	}
	
	

}
