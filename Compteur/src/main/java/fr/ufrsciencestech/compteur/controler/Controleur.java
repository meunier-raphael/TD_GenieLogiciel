/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ufrsciencestech.compteur.controler;

import fr.ufrsciencestech.compteur.view.*;
import fr.ufrsciencestech.compteur.model.*;
import java.awt.*;
import java.awt.event.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author celine
 */
public class Controleur implements ActionListener {
    private Panier m;
    private VueG vg;
    
    @Override
    public void actionPerformed(ActionEvent e){   //Invoked when an action occurs
        if(((Component)e.getSource()).getName().equals("Plus"))
            try {
                m.ajout(new Orange());
        } catch (PanierPleinException ex) {
            Logger.getLogger(Controleur.class.getName()).log(Level.SEVERE, null, ex);
        }
        else
            try {
                m.retrait();
        } catch (PanierVideException ex) {
            Logger.getLogger(Controleur.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void setModele(Panier m){
        this.m = m;
    }
    public void setVue(VueG vg){
        this.vg = vg;
    }
}
