/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.richardbrugiere.jeuxcartemodel.carte.EffetImpl.AttaqueImpl;

import com.richardbrugiere.jeuxcartemodel.carte.EffetImpl.Attaque;
import com.richardbrugiere.jeuxcartemodel.carte.Monstre;

/**
 *
 * @author damien
 */
public class AttPendantDefense extends Attaque{

    public AttPendantDefense(int attaque) {
        super(attaque);
    }

    @Override
    public void defendre(Monstre monstre) {
        super.attaqueMonstre(monstre);
    }

    

    
    
}
