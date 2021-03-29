import static org.junit.Assert.*;

import org.junit.Test;

public class DepositoCombustibleTestParametros {
	DepositoCombustible depot = new DepositoCombustible(10.0,5.2);
	

	@Test
	public void testFill() {
		depot.fill(1);
		assertEquals(6.2, depot.getDepositoNivel(),0);
	}
	@Test
	
	public void testFill2() {
		depot.fill(14);
		assertEquals(10.0, depot.getDepositoNivel(),0);
	}
	@Test
	public void testFill3() {
		depot.fill(-1);
		assertEquals(5.2, depot.getDepositoNivel(),0);
	}

	@Test
	public void testConsumir() {
		depot.consumir(3);
		assertEquals(2.2, depot.getDepositoNivel(),0);
		depot.consumir(-3);
		assertEquals(5.2, depot.getDepositoNivel(),0);
	}
	@Test
	public void testConsumir2() {
		depot.consumir(6);
		assertEquals(0, depot.getDepositoNivel(),0);
		
	}
	@Test
	public void testConsumi3r() {
		depot.consumir(-3);
		assertEquals(5.2, depot.getDepositoNivel(),0);
	}
	

}
