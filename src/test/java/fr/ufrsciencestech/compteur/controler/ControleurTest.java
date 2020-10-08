/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ufrsciencestech.compteur.controler;

import fr.ufrsciencestech.compteur.view.VueGraphSwing;
import fr.ufrsciencestech.compteur.model.Panier;
import java.awt.event.ActionEvent;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author celine
 */
public class ControleurTest {
    Controleur c1;
    Controleur c2;
    Panier m1;
    Panier m2;
    VueGraphSwing vueg;
    ActionEvent einc;
    ActionEvent edec;

    public ControleurTest() {
    }
    
    @Before
    public void setUp(){
        c1 = new Controleur();
        c2 = new Controleur();
        m1 = new Panier(10);
        m2 = new Panier(10);
        vueg = new VueGraphSwing(); 
        c1.setModele(m1);
        
        edec = new ActionEvent(vueg.getDec(), 1, "dec");
        einc = new ActionEvent(vueg.getInc(), 0, "inc");
    }
    

    /**
     * Test of actionPerformed method, of class Controleur.
     */
    @Test   //ignorer pour fonctionner dans Jenkins
    public void testActionPerformed() {
        System.out.println("actionPerformed");

        assertTrue(m1.getTaillePanier() == 0);
        c1.actionPerformed(einc);
        assertTrue(m1.getTaillePanier() == 1);

        c1.actionPerformed(edec);
        assertTrue(m1.getTaillePanier() == 0);
    }
    
    /**
     * Test of actionPerformed method, of class Controleur.
     */
    @Test   //ignorer pour fonctionner dans Jenkins
    public void testActionPerformedSet() {
        System.out.println("actionPerformedSet");
        assertTrue(m1.getTaillePanier() == 0);
        //m1.setCompteur(3);
        
        c1.actionPerformed(einc);
        assertTrue(m1.getTaillePanier() == 4);
        
        c1.actionPerformed(edec);
        assertTrue(m1.getTaillePanier() == 3);
    }
    
    /**
     * Test of actionPerformed method, of class Controleur.
     */
    @Test  //ignore pour fonctionner dans Jenkins
    public void testActionPerformedVide() {
        System.out.println("actionPerformedVide");
        assertTrue(m1.getTaillePanier() == 0);
        
        c1.actionPerformed(edec);
        assertTrue(m1.getTaillePanier() == 0);
    }

    /**
     * Test of setPanier method, of class Controleur.
     */
    @Test  //ignore pour fonctionner dans Jenkins
    public void testSetModele() {
        System.out.println("setModele");
        c1.setModele(m2);
        c1.actionPerformed(einc);
        assertTrue(m2.getTaillePanier() == 1);
    }
    
}
