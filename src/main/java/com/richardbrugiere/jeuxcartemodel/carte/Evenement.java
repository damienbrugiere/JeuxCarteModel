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
public interface Evenement {
    void attaque(Monstre monstre);
    boolean bloquer(Monstre monstre);
    void booster(Monstre monstre);
    void soigner(Monstre monstre);
    void destruction(Monstre monstre);
    void mort(Monstre monstre);
    void defendre(Monstre monstre);
}
