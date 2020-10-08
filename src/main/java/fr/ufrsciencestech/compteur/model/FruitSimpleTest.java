/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ufrsciencestech.compteur.model;

/**
 *
 * @author td124556
 */
public abstract class FruitSimpleTest {
    abstract FruitSimple createFruit(double prix, String origine);
    abstract FruitSimple createFruitNulle();
    
    
    
    @Test
    public void testGetPrix()
    {
        FruitSimple fs = createFruit(0.5, "France");
        double expected = 0.5;
        double result = fs.getPrix();
        assertTrue(expected == result);
        
    }
 
       public class OrangeTest extends FruitSimpleTest()
            {
               FruitSimple createFruit(double prix, String origine);
               return new Orange (prix,origine); 
            }
         FruitSimple createFruitNull()
           {
               return null;
           }
}

   