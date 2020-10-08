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
public abstract class FruitSimple {
     private double prix;
     private String origine;
    
    public boolean isSeedless() {  //predicat indiquant qu'une orange a des pepins
        return false;
    }
    
     public double getPrix(){
	return prix;
    }

      public String getOrigine(){
	return origine;
    }
 
      @Override
    public boolean equals(Object o){  //predicat pour tester si 2 oranges sont equivalentes
        if(o != null && getClass() == o.getClass()){
            FruitSimple or = (FruitSimple) o;
            return (prix == or.prix && origine.equals(or.origine));
        }
        return false;
    }
    
    
}


