/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadoratester;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author gema
 */
public class CalculadoraTest {
    
    public CalculadoraTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of suma method, of class Calculadora.
     */
    @Test
    public void testSuma() {
        System.out.println("suma");
        double num = 10.0;
        double num2 = 5.0;
        double expResult = 15.0;
        double result = Calculadora.suma(num, num2);
        assertEquals(expResult, result, 0.0);
        
    }

    /**
     * Test of resta method, of class Calculadora.
     */
    @Test
    public void testResta() {
        System.out.println("resta");
        double num = 10.0;
        double num2 = 2.0;
        double expResult = 8.0;
        double result = Calculadora.resta(num, num2);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of multiplicar method, of class Calculadora.
     */
    @Test
    public void testMultiplicar() {
        System.out.println("multiplicar");
        double num = 3.0;
        double num2 = 2.0;
        double expResult = 6.0;
        double result = Calculadora.multiplicar(num, num2);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of dividir method, of class Calculadora.
     */
    @Test
    public void testDividir() {
        System.out.println("dividir");
        double num = 10.0;
        double num2 = 2.0;
        double expResult = 5.0;
        double result = Calculadora.dividir(num, num2);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
