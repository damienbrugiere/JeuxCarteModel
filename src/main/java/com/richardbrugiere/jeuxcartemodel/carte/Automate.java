/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.richardbrugiere.jeuxcartemodel.carte;

import com.richardbrugiere.jeuxcartemodel.carte.EvenementImpl.DansDeck;
import java.util.Map;
import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author damien
 */
public class Automate implements Observer, Evenement{
    private Map<String, Position> positions;
    private Position positionActuelle;

    public Automate(Map<String, Position> positions) {
        this.positions = positions;
        this.setPositionDeck();
    }

    @Override
    public void attaque(Monstre monstre) {
        positionActuelle.attaque(monstre);
    }

    @Override
    public boolean bloquer(Monstre monstre) {
        return positionActuelle.bloquer(monstre);
    }


    @Override
    public void booster(Monstre monstre) {
        positionActuelle.booster(monstre);
    }

    @Override
    public void soigner(Monstre monstre) {
        positionActuelle.soigner(monstre);
    }

    @Override
    public void destruction(Monstre monstre) {
        positionActuelle.destruction(monstre);
    }

    @Override
    public void mort(Monstre monstre) {
       positionActuelle.mort(monstre);
    }

    public void setPositions(Map<String, Position> positions) {
        this.positions = positions;
    }

    public void setPositionActuelle(Position positionActuelle) {
        this.positionActuelle = positionActuelle;
    }
    
    private void setPositionDeck(){
        this.positionActuelle =  positions.get("deck");
    }
    
    private void setPositionMain(){
        this.positionActuelle =  positions.get("main");
    }
    private void setPositionTerrain(){
        this.positionActuelle =  positions.get("terrain");
    }
     private void setPositionCimetiere(){
        this.positionActuelle =  positions.get("cimetiere");
    }

    public Position getPositionActuelle() {
        return positionActuelle;
    }

     
    @Override
    public void update(Observable o, Object arg) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void defendre(Monstre monstre) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
