/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.richardbrugiere.jeuxcartemodel.carte.EffetImpl;

import com.richardbrugiere.jeuxcartemodel.carte.Effet;
import com.richardbrugiere.jeuxcartemodel.carte.Monstre;

/**
 *
 * @author damien
 */
public class Destruction extends Effet{

    @Override
    public void destruction(Monstre monstre) {
        monstre.detruit();
    }

    
}
