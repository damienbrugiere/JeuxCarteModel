/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.richardbrugiere.jeuxcartemodel.carte;

import com.richardbrugiere.jeuxcartemodel.carte.EvenementImpl.DansDeck;
import java.util.List;
import java.util.Observable;

/**
 *
 * @author damien
 */
public abstract class Carte extends Observable implements Evenement{
    private Automate automate;
    protected Carte(Automate automate) {
        this.automate=  automate;
        this.addObserver(automate);
    }

    public Automate getAutomate() {
        return automate;
    }
    public void setAutomate(Automate automate){
        this.automate = automate;
    }

    @Override
    public void attaque(Monstre monstre) {
         if (monstre == null || monstre.getDefense() <= 0) {
            throw new IllegalArgumentException("Monstre null ou avec 0 pv");
        }
        automate.attaque(monstre);
    }

    @Override
    public void destruction(Monstre monstre) {
        automate.destruction(monstre);
    }
    
    
}
