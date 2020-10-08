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
public class OrangeTest {
    
    public OrangeTest() {
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
     * Test of getPrix method, of class Orange.
     */
    @Test
    public void testGetPrix() {
        System.out.println("getPrix");
        Orange instance = new Orange();
        double expResult = 0.0;
        double result = instance.getPrix();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPrix method, of class Orange.
     */
    @Test
    public void testSetPrix() {
        System.out.println("setPrix");
        double prix = 0.0;
        Orange instance = new Orange();
        instance.setPrix(prix);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getOrigine method, of class Orange.
     */
    @Test
    public void testGetOrigine() {
        System.out.println("getOrigine");
        Orange instance = new Orange();
        String expResult = "";
        String result = instance.getOrigine();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setOrigine method, of class Orange.
     */
    @Test
    public void testSetOrigine() {
        System.out.println("setOrigine");
        String origine = "";
        Orange instance = new Orange();
        instance.setOrigine(origine);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Orange.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Orange instance = new Orange();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Orange.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object o = null;
        Orange instance = new Orange();
        boolean expResult = false;
        boolean result = instance.equals(o);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isSeedless method, of class Orange.
     */
    @Test
    public void testIsSeedless() {
        System.out.println("isSeedless");
        Orange instance = new Orange();
        boolean expResult = false;
        boolean result = instance.isSeedless();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class Orange.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Orange.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
