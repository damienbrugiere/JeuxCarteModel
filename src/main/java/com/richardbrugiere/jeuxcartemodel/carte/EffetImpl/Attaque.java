/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.richardbrugiere.jeuxcartemodel.carte.EffetImpl;

import com.richardbrugiere.jeuxcartemodel.carte.Carte;
import com.richardbrugiere.jeuxcartemodel.carte.Effet;
import com.richardbrugiere.jeuxcartemodel.carte.Monstre;

/**
 *
 * @author damien
 */
public class Attaque implements Effet{
    private int attaque;

    public Attaque(int attaque) {
        this.attaque = attaque;
    }

    @Override
    public void action(Carte carte) {
        if(carte == null || carte instanceof Monstre ){
            throw new IllegalArgumentException("ce n'est pas une carte monstre ou la carte est null");
        }
        Monstre monstre = (Monstre) carte;
        monstre.prendDesDegats(attaque);
    }
    
    
}
