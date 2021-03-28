import static org.junit.Assert.*;

import org.junit.Test;

public class DepositoCombustibleTest {
	DepositoCombustible depot = new DepositoCombustible(10.0,5.2);

	
	@Test
	public void testGetDepositoNivel() {
		assertEquals(5.2,depot.getDepositoNivel(),0);
		
	}

	@Test
	public void testGetDepositoMax() {
		assertEquals(10.0,depot.getDepositoMax(),0);
	}

	@Test
	public void testEstaVacio() {
		assertFalse(depot.estaVacio());
	}

	@Test
	public void testEstaLleno() {
		assertFalse(depot.estaLleno());
	}

	@Test
	public void mitadCapacidad() {
		boolean mitadCapacidad;
		if(depot.getDepositoNivel()==(depot.getDepositoMax()/2)) {
			mitadCapacidad = true;
		}else {
			mitadCapacidad = false;
			
		}
	}

	@Test
	public void testConsumir() {
		depot.consumir(3);
		assertEquals(2.2, depot.getDepositoNivel(),0);
		depot.consumir(-3);
		assertEquals(5.2, depot.getDepositoNivel(),0);
	}
	
}
