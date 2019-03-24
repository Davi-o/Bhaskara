package model;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Davi Alves
 * @since 23/03/2019
 * @version 1.0 Aragorn Version
 */
public class CalculoTest {
    private static final Calculo calc = new Calculo();
    
    public CalculoTest() { }
    
    @BeforeClass
    public static void setUpClass() {}
    
    @AfterClass
    public static void tearDownClass() { }
    
    @Before
    public void setUp() {
        calc.setValueA(1);
        calc.setValueB(2);
        calc.setValueC(-15);
    }
    
    @After
    public void tearDown() { }

    /**
     * Test of bhaskara method, of class Calculo.
     */
    @org.junit.Test
    public void testBhaskara() {
        assertEquals("O Valor de x1 é: 30.0\nO valor de x2 é: -34.0", calc.bhaskara());
    }//TENHO QUE RESOLVER O CALCULO DE BHASKARA
   
}
