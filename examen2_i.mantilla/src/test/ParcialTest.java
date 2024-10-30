package test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;

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
    public void testRaicesCuadratica() throws Exception {
        
        double[] expectedRaices = {2.0, 1.0}; 
        assertArrayEquals(expectedRaices, this.parcial.raicesCuadratica(1, -3, 2), 0.001);

       
        assertThrows(Exception.class, () -> this.parcial.raicesCuadratica(0, 0, 0));
    }

    @Test
    public void testRaiz() throws Exception {
      
        assertEquals(1.0, this.parcial.raiz(1, -3, 2), 0.001);

     
        assertThrows(Exception.class, () -> this.parcial.raiz(1, 1, 1));
    }
}
