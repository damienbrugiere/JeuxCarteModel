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
public abstract class Carte {
    private List<Evenement> evenementsDeLaCarte;
    private Evenement evenementEnCours;
    protected Carte(List<Evenement> evenementsDeLaCarte,Evenement evenementEnCours) {
        this.evenementsDeLaCarte = evenementsDeLaCarte;
        this.evenementEnCours= evenementEnCours;
    }
}
