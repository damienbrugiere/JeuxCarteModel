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
public class Attaque extends Effet{
    private int attaque;

    public Attaque(int attaque) {
        this.attaque = attaque;
    }

    protected void attaqueMonstre(Monstre monstre){
        monstre.prendDesDegats(attaque);
    }
    
}
