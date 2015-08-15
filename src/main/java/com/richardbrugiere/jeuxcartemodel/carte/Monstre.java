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

    public Monstre(Integer attaque, Integer defense, List<Evenement> evenements,Evenement evenementEnCours) {
        super(evenements,evenementEnCours);
        if (attaque == null || defense == null) {
            throw new IllegalArgumentException("L'attaque ou la défense d'un monstre ne peut pas être null");
        }
        this.attaque = attaque;
        this.defense = defense;
    }

    public void attaque(Monstre monstreAdverse) {
        if (monstreAdverse == null || monstreAdverse.getDefense() <= 0) {
            throw new IllegalArgumentException("Monstre null ou avec 0 pv");
        }
        monstreAdverse.prendDesDegats(attaque);
    }

    public void prendDesDegats(Integer attaque) {
        this.defense -= attaque;
    }

    public void detruction() {
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
}
