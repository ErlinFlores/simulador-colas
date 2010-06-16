/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package simuladorcolas;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author a52566
 */
public class GeneradorAleatoriosTest {

    public GeneradorAleatoriosTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of nextUniforme method, of class GeneradorAleatorios.
     */
    @Test
    public void testNextUniforme_0args() {
        System.out.println("nextUniforme");
        //double[] resultados = new double[1000];
        double suma = 0;
        for(int i = 0; i < 1000; ++i)
        {
            suma += GeneradorAleatorios.nextUniforme();
        }
        suma /=1000;
        System.out.println("diferencia de media real y teórica (debe tender a cero): " + Math.abs(suma - 1.0/2));
        assertTrue(Math.abs(suma - 1.0/2) < 2.0/12); // la media menos miy (0.5) debe ser menor que dos veces la varianza
    }

    /**
     * Test of nextUniforme method, of class GeneradorAleatorios.
     */
    @Test
    public void testNextUniforme_int() {
        System.out.println("nextUniforme");
        // TODO review the generated test code and remove the default call to fail.
        int[] resultados = new int[1000];
        int salio;
        for(int i = 0; i < 1000; ++i)
        {
            salio = GeneradorAleatorios.nextUniforme(1000);
            resultados[salio]++;
            //System.out.println("Salió un: " + salio);
        }
    }

    /**
     * Test of nextExponencial method, of class GeneradorAleatorios.
     */
    @Test
    public void testNextExponencial() {
        System.out.println("nextExponencial");
        GeneradorAleatorios instance = new GeneradorAleatorios();
        double expResult = 0.0;
        double result = instance.nextExponencial();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        
    }

}