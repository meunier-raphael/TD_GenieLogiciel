/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ufrsciencestech.compteur.model;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author rm748761
 */
public class FruitTest {
    
    public FruitTest() {
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
     * Test of isSeedless method, of class Fruit.
     */
    @Test
    public void testIsSeedless() {
        System.out.println("isSeedless");
        Fruit instance = new FruitImpl();
        boolean expResult = false;
        boolean result = instance.isSeedless();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPrix method, of class Fruit.
     */
    @Test
    public void testGetPrix() {
        System.out.println("getPrix");
        Fruit instance = new FruitImpl();
        double expResult = 0.0;
        double result = instance.getPrix();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getOrigine method, of class Fruit.
     */
    @Test
    public void testGetOrigine() {
        System.out.println("getOrigine");
        Fruit instance = new FruitImpl();
        String expResult = "";
        String result = instance.getOrigine();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Fruit.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object o = null;
        Fruit instance = new FruitImpl();
        boolean expResult = false;
        boolean result = instance.equals(o);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Fruit.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Fruit instance = new FruitImpl();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class FruitImpl implements Fruit {

        public boolean isSeedless() {
            return false;
        }

        public double getPrix() {
            return 0.0;
        }

        public String getOrigine() {
            return "";
        }

        public boolean equals(Object o) {
            return false;
        }

        public String toString() {
            return "";
        }
    }
    
}
