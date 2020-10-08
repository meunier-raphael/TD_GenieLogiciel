/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ufrsciencestech.compteur.model;

import static java.lang.Math.abs;
import java.util.ArrayList;
import java.util.Observable;

/**
 *
 * @author celine
 */
public class Panier extends Observable{
    private ArrayList<Fruit> fruits;  //attribut pour stocker les fruits
    private int contenanceMax;        //nb maximum d'oranges que peut contenir le panier
	
    //groupe 1
    public Panier(int contenanceMax){  //initialise un panier vide ayant une certaine contenance maximale (precisee en parametre)
        this.contenanceMax = abs(contenanceMax);
        this.fruits = new ArrayList<Fruit>();
    }

    @Override
    public String toString(){  //affichage de ce qui est contenu dans le panier : liste des fruits presents
        String toString = "Contenu du Panier : \n";
        for (Fruit fruit : fruits) {
          toString += fruit.toString() + '\n';
        }
        return toString;
    }
    
    //groupe 2
    public ArrayList<Fruit> getFruits() {  //accesseur du premier attribut
        return fruits;
    }

    public void setFruits(ArrayList<Fruit> fruits) { //modificateur du premier attribut
        this.fruits = fruits;
    }

    public int getTaillePanier(){  //accesseur retournant le nombre d'element dans l'array list fruits
        return this.fruits.size();
    }
    
    public int getContenanceMax(){  //accesseur du second attribut
	return this.contenanceMax;
    }

    //groupe 3
    public Fruit getFruit(int i){  //accesseur retournant le fruit contenu dans le panier a l'emplacement n°i ou null s'il n'y a rien a cet emplacement
        if(i < this.fruits.size()) 
            return this.fruits.get(i);
        return null;
    }
    
    public void setFruit(int i, Fruit f){  //modificateur du fruit contenu dans le panier a l'emplacement n°i par f (s'il y a bien deja un fruit a cet emplacement, ne rien faire sinon)
        if(i < this.fruits.size())
            this.fruits.set(i, f);
    }
    
    public boolean estVide(){  //predicat indiquant que le panier est vide
	return this.fruits.isEmpty();    //modifie par C. Roudet
    }
    
    public boolean estPlein(){  //predicat indiquant que le panier est plein
	return this.fruits.size() == this.contenanceMax;
    }

    //groupe 4
    public void ajout(Fruit o) throws PanierPleinException{  //ajoute le fruit o a la fin du panier si celui-ci n'est pas plein
        if(o == null)
            return;
        if(!estPlein()){
            fruits.add(o);
        }
        else 
            throw new PanierPleinException();
        setChanged();                //marks this Observable object as having been changed; the hasChanged method will now return true
        notifyObservers(getTaillePanier());
    }

    //groupe 5
    public void retrait() throws PanierVideException{ //retire le dernier fruit du panier si celui-ci n'est pas vide
        if(!estVide()){
            fruits.remove(fruits.size()-1);
        }
        else 
        {
            throw new PanierVideException();
        }
        setChanged();                //marks this Observable object as having been changed; the hasChanged method will now return true
        notifyObservers(getTaillePanier());
    }

    //groupe 6
    public double getPrix(){  //calcule le prix du panier par addition des prix de tous les fruits contenus dedans
        double prix = 0;
        for(Fruit f : fruits)
        {
            prix += f.getPrix();
        }
	return prix;
    }
    
    //groupe 7
    public void boycotteOrigine(String origine){  //supprime du panier tous les fruits provenant du pays origine
	int i = 0;					//A
	while(i < fruits.size()){			//B
            if(fruits.get(i).getOrigine().equals(origine)) //C
		fruits.remove(i);			//D
            else								 
		i++ ;					//E
        }
    }
        
    //groupe 8    
    @Override
    public boolean equals(Object o){  ///predicat pour tester si 2 paniers sont equivalents : s'ils contiennent exactement les memes fruits
        if (o == null || getClass() != o.getClass()) 
            return false;
        Panier p = (Panier)o;
        if(p.getTaillePanier() != this.getTaillePanier() )
            return false;

        for (int i = 0; i < this.getTaillePanier(); i++) 
        {
            if (!p.getFruit(i).equals(this.getFruit(i))) 
                return false;
        }
        return true;
    }
    
    
    
    
    
    
    
    /*public Panier(){
        compteur = 0;
    }
    public void update(int incr) {
        compteur += incr;
        if(compteur < 0)
            compteur = 0;
        
        setChanged();                //marks this Observable object as having been changed; the hasChanged method will now return true
        notifyObservers(getCompteur());   //if this object has changed, as indicated by the hasChanged method, then notify all of its observers and then call the clearChanged method to indicate that this object has no longer changed
    }

    /**
     * @return the compteur
     */
    /*public int getCompteur() {
        return compteur;
    }*/

    /**
     * @param compteur the compteur to set
     */
    /*public void setCompteur(int compteur) {
        this.compteur = compteur;
        if(this.compteur < 0)
            this.compteur = 0;
        
        setChanged();                //marks this Observable object as having been changed; the hasChanged method will now return true
        notifyObservers(getCompteur());   //if this object has changed, as indicated by the hasChanged method, then notify all of its observers and then call the clearChanged method to indicate that this object has no longer changed
    }*/
    
}
