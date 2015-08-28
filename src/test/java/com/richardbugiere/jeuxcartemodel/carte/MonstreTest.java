/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.richardbugiere.jeuxcartemodel.carte;

import com.richardbrugiere.jeuxcartemodel.carte.Automate;
import com.richardbrugiere.jeuxcartemodel.carte.Effet;
import com.richardbrugiere.jeuxcartemodel.carte.EffetImpl.Attaque;
import com.richardbrugiere.jeuxcartemodel.carte.EffetImpl.AttaqueImpl.AttPendantAttaque;
import com.richardbrugiere.jeuxcartemodel.carte.EffetImpl.AttaqueImpl.AttPendantDefense;
import com.richardbrugiere.jeuxcartemodel.carte.EffetImpl.Blocage;
import com.richardbrugiere.jeuxcartemodel.carte.EffetImpl.Destruction;
import com.richardbrugiere.jeuxcartemodel.carte.EvenementImpl.DansDeck;
import com.richardbrugiere.jeuxcartemodel.carte.Monstre;
import com.richardbrugiere.jeuxcartemodel.carte.Position;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author damien
 */
public class MonstreTest {

    @Test
    public void devraitConstruireUnMonstreValid() {
        Monstre m = new Monstre(4, 5, automateValid());
        assertEquals(m.getAttaque(), new Integer(4));
        assertEquals(m.getDefense(), new Integer(5));
    }

    @Test
    public void devraitPasConstruireUnMonstreValidAvecAttaqueNull() {
        try {
            new Monstre(null, 5,  automateValid());
            fail();
        } catch (IllegalArgumentException e) {
            assertNotNull(e.getMessage());
        }
    }

    @Test
    public void devraitPasConstruireUnMonstreValidAvecDefenseNull() {
        try {
            new Monstre(4, null,  automateValid());
            fail();
        } catch (IllegalArgumentException e) {
            assertNotNull(e.getMessage());
        }
    }

    @Test
    public void devraitPasConstruireUnMonstreValidAvecAttaqueVide() {
        try {
            new Monstre(new Integer(""), 5,  automateValid());
            fail();
        } catch (IllegalArgumentException e) {
            assertNotNull(e.getMessage());
        }
    }

    @Test
    public void devraitPasConstruireUnMonstreValidAvecDefenseVide() {
        try {
            new Monstre(4, new Integer(""),  automateValid());
            fail();
        } catch (IllegalArgumentException e) {
            assertNotNull(e.getMessage());
        }
    }

    @Test
    public void devraitBaissePvMonstreAdverse() {
        Monstre adversaire = new Monstre(4, 5,  automateValid());
        Monstre monstreAttaquant = new Monstre(4, 5,  automateValid());
        monstreAttaquant.attaque(adversaire);
        assertEquals(monstreAttaquant.getDefense(), new Integer(5));
        assertEquals(monstreAttaquant.getAttaque(), new Integer(4));
        assertEquals(adversaire.getDefense(), new Integer(1));
        assertEquals(adversaire.getAttaque(), new Integer(4));
    }

    @Test
    public void devraitPasAttaquerMonstreAdverseNull() {
        Monstre monstreAttaquant = new Monstre(4, 5,  automateValid());
        try {
            monstreAttaquant.attaque(null);
        } catch (IllegalArgumentException e) {
            assertNotNull(e.getMessage());
        }
    }

    @Test
    public void devraitPasAttaquerMonstreAdverseAvec0PointDef() {
        Monstre monstreAttaquant = new Monstre(4, 5,  automateValid());
        Monstre adversaire = new Monstre(4, 0,  automateValid());
        try {
            monstreAttaquant.attaque(adversaire);
        } catch (IllegalArgumentException e) {
            assertNotNull(e.getMessage());
        }
    }
    @Test
    public void devraitAvoirUnePositionDansDeck(){
         Monstre monstre = new Monstre(4, 5,  automateValid());
         assertTrue(monstre.getAutomate().getPositionActuelle() instanceof DansDeck);
    }
      @Test
    public void devraitEffectuerUnEffetAttaque2() {
        Monstre monstre = new Monstre(new Integer(4), new Integer(5),automate(new AttPendantAttaque(2)));
        Monstre monstreAdverse = new Monstre(new Integer(4), new Integer(10),automateValid());
        monstre.attaque(monstreAdverse);
        assertEquals(monstreAdverse.getDefense(), new Integer(4));
    }

    @Test
    public void devraitEffectuerUnEffetBlocage() {
        Monstre monstre = new Monstre(new Integer(4), new Integer(5),automateValid());
        Monstre monstreAdverse = new Monstre(new Integer(4), new Integer(10),automate(new Blocage()));
        monstre.attaque(monstreAdverse);
        assertEquals(monstreAdverse.getDefense(), new Integer(10));
    }
    
    @Test
    public void devraitEffectuerUnEffetDestruction() {
        Monstre monstre = new Monstre(new Integer(4), new Integer(5),automate(new Destruction()));
        Monstre monstreAdverse = new Monstre(new Integer(4), new Integer(10),automateValid());
        monstre.destruction(monstreAdverse);
        assertEquals(monstreAdverse.getDefense(), new Integer(0));
    }
    
    
    private Automate automate(Effet effet){
        List<Effet> listeEffet = new ArrayList<>();
        listeEffet.add(effet);
        Map<String, Position> map = new HashMap<>();
         map.put("deck",new DansDeck(listeEffet));
         return new Automate(map);
    }
    private Automate automateValid(){
        List<Effet> listeEffet = new ArrayList<>();
        listeEffet.add(new Attaque(2));
        Map<String, Position> map = new HashMap<>();
         map.put("deck",new DansDeck(null));
         return new Automate(map);
    }
}
