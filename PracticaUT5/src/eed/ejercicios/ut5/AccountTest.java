package eed.ejercicios.ut5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AccountTest {

	@Test
	void testIngresar() throws Exception {
		Account cuenta = new Account("prueba", "1234567890");
		cuenta.setBalance(100);
		cuenta.ingresar(200);
		assertEquals(300.00, cuenta.disponible());
	}

	@Test
	void testRetirar() {
		fail("Not yet implemented");
	}

}
