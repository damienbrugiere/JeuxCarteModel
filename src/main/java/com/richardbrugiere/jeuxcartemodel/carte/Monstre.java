/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.richardbrugiere.jeuxcartemodel.carte;

import java.util.List;

/**
 *
 * @author damien
 */
public class Monstre extends Carte {

    private Integer attaque;
    private Integer defense;

    public Monstre(Integer attaque, Integer defense, Automate automate) {
        super(automate);
        if (attaque == null || defense == null) {
            throw new IllegalArgumentException("L'attaque ou la défense d'un monstre ne peut pas être null");
        }
        this.attaque = attaque;
        this.defense = defense;
    }

    @Override
    public void attaque(Monstre monstreAdverse) {
        super.attaque(monstreAdverse);
        monstreAdverse.prendDesDegats(attaque);
    }

    public void prendDesDegats(Integer attaque) {
        if(!bloquer(this)){
            this.defense -= attaque;
        }
    }
    
    public void detruit() {
        this.defense = 0;
    }

    public void boostAttaque(Integer boost) {
        this.attaque += boost;
    }

    public void boostDefense(Integer boost) {
        this.attaque += boost;
    }

    public Integer getAttaque() {
        return attaque;
    }

    public Integer getDefense() {
        return defense;
    }

    @Override
    public boolean bloquer(Monstre monstre) {
        return super.getAutomate().bloquer(monstre);
    }

    

    @Override
    public void defendre(Monstre monstre) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void booster(Monstre monstre) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void soigner(Monstre monstre) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mort(Monstre monstre) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
