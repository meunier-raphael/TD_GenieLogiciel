/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ufrsciencestech.compteur.view;

import fr.ufrsciencestech.compteur.model.Orange;
import fr.ufrsciencestech.compteur.view.VueConsole;
import fr.ufrsciencestech.compteur.model.Panier;
import fr.ufrsciencestech.compteur.model.PanierPleinException;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author celine
 */
public class VueConsoleTest {
    VueConsole vuec;
    Panier m;
    
    public VueConsoleTest() {
    }
    
    @Before
    public void setUp() {
        vuec = new VueConsole();
        m = new Panier(10);
    }
        
    @Test
    public void testUpdate() throws PanierPleinException {
        System.out.println("update");    
       
        //si on oublie d'ajouter la vue comme observateur du modele, elle ne se met pas à jour correctement
        assertEquals(vuec.getTrace(), "Valeur initiale : " + 0);
        //m.setCompteur(4);                 
        assertTrue(m.getTaillePanier() == 4);
        assertEquals(vuec.getTrace(), "Valeur initiale : " + 0);   //aucune influence sur la vue
        
        //si on ajoute la vue comme observateur du modele, elle se met à jour correctement
        assertEquals(vuec.getTrace(), "Valeur initiale : " + 0);
        m.addObserver(vuec);    //on ajoute la vue comme observateur du modele
        //on passe par la methode setCompteur de la classe Modele :
        //m.setCompteur(2);
        assertTrue(m.getTaillePanier() == 2);
        assertEquals(vuec.getTrace(), "Nouvelle valeur : " + 2);  //mise à jour correcte
        
        //on passe par la methode update de la classe Modele :
        m.ajout(new Orange());
        assertTrue(m.getTaillePanier() == 4);
        assertEquals(vuec.getTrace(), "Nouvelle valeur : " + 4);  //mise à jour correcte
        
        //on passe par la methode update de la classe Modele (en decrementant trop) :
        m.ajout(new Orange());
        assertTrue(m.getTaillePanier() == 0);
        assertEquals(vuec.getTrace(), "Nouvelle valeur : " + 0);  //mise à jour correcte
    }
}
