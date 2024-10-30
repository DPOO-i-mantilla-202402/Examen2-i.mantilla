package test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTimeout;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.Duration;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import logica.Parcial;

public class ParcialTest {
	

	private Parcial parcial;

	@BeforeEach
	public void setUp() {
		this.parcial = new Parcial();
	}
	
	@Test
	public void raicesCuadradas() throws Exception {
		assertEquals(5.0, this.parcial.division(10.0, 2.0));
		assertThrows(Exception.class, () -> this.calculadora.division(0,0,0));
	}
	
	@Test
	public void raiz() throws Exception {
		assertEquals(5.0, this.parcial.division(10.0, 2.0));
		assertThrows(Exception.class, () -> this.parcial.division(0,0,0));
	}

}
