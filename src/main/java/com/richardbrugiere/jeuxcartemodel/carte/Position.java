/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.richardbrugiere.jeuxcartemodel.carte;

import com.richardbrugiere.jeuxcartemodel.carte.EffetImpl.Blocage;
import com.richardbrugiere.jeuxcartemodel.carte.EvenementImpl.DansDeck;
import com.richardbrugiere.jeuxcartemodel.carte.EvenementImpl.EnMain;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author damien
 */
public abstract class Position  implements  Evenement{
    private List<Effet> effets;

    public Position(List<Effet> effets) {
        this.effets = effets;
    }

    @Override
    public void attaque(Monstre monstre) {
        if(effets!=null){
            for(Effet e : effets){
                e.attaque(monstre);
            }
        }
    }

    @Override
    public boolean bloquer(Monstre monstre) {
        if(effets == null){
            return false;
        }
        for(Effet e : effets){
            if(e.bloquer(monstre)){
                return true;
            }
        }
        return false;
    }
    

    @Override
    public void booster(Monstre monstre) {
         for(Effet e : effets){
            e.booster(monstre);
        }
    }

    @Override
    public void soigner(Monstre monstre) {
         for(Effet e : effets){
            e.soigner(monstre);
        }
    }

    @Override
    public void destruction(Monstre monstre) {
         for(Effet e : effets){
            e.destruction(monstre);
        }
    }

    @Override
    public void mort(Monstre monstre) {
         for(Effet e : effets){
            e.mort(monstre);
        }
    }

    @Override
    public void defendre(Monstre monstre) {
        for(Effet e : effets){
            e.defendre(monstre);
        }
    }

    
    
    
}
