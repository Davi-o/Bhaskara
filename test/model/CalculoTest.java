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
        assertEquals("O Valor de x1 é: 3.0\nO valor de x2 é: -5.0", calc.results("result"));
        assertEquals("1.0X² + 2.0X + -15.0 = 0 \n" +
                     "\n" +
                     " x = -2.0±√2.0² -4 * 1.0 * -15.0 / 2 * 1.0\n" +
                     " x = -2.0±√4.0 -60.0 / 2.0\n" +
                     " x = -2.0±√64.0 / 2.0\n" +
                     " x = -2.0± 8.0 / 2.0\n" +
                     "\n" +
                     " x¹ = -2.0- 8.0 / 2.0\n" +
                     " x¹ = -10.0 / 2.0\n" +
                     " x¹ = -5.0\n" +
                     "\n" +
                     " x² = -2.0+ 8.0 / 2.0\n" +
                     " x² = -6.0 / 2.0\n" +
                     " x² = -3.0", calc.results("resolution"));
    }//TENHO QUE RESOLVER O CALCULO DE BHASKARA
   
}
