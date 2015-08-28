/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.richardbrugiere.jeuxcartemodel.carte;

/**
 *
 * @author damien
 */
public abstract class Effet implements Evenement{

    @Override
    public void attaque(Monstre monstre) {
        
    }

    @Override
    public boolean bloquer(Monstre monstre) {
        return false;
    }
    
    @Override
    public void booster(Monstre monstre) {
        
    }

    @Override
    public void soigner(Monstre monstre) {
        
    }

    @Override
    public void destruction(Monstre monstre) {
        
    }

    @Override
    public void mort(Monstre monstre) {
       
    }

    @Override
    public void defendre(Monstre monstre) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
    
}
