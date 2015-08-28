package com.richardbrugiere.jeuxcartemodel.carte.EffetImpl.AttaqueImpl;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.richardbrugiere.jeuxcartemodel.carte.EffetImpl.Attaque;
import com.richardbrugiere.jeuxcartemodel.carte.Monstre;

/**
 *
 * @author damien
 */
public class AttPendantAttaque extends Attaque{

    public AttPendantAttaque(int attaque) {
        super(attaque);
    }

    @Override
    public void attaque(Monstre monstre) {
        super.attaqueMonstre(monstre);
    }
}
