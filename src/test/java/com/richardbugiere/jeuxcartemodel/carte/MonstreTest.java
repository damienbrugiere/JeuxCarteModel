/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.richardbugiere.jeuxcartemodel.carte;

import com.richardbrugiere.jeuxcartemodel.carte.Monstre;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author damien
 */
public class MonstreTest {

    @Test
    public void devraitConstruireUnMonstreValid() {
        Monstre m = new Monstre(4, 5, null,null);
        assertEquals(m.getAttaque(), new Integer(4));
        assertEquals(m.getDefense(), new Integer(5));
    }

    @Test
    public void devraitPasConstruireUnMonstreValidAvecAttaqueNull() {
        try {
            new Monstre(null, 5, null,null);
            fail();
        } catch (IllegalArgumentException e) {
            assertNotNull(e.getMessage());
        }
    }

    @Test
    public void devraitPasConstruireUnMonstreValidAvecDefenseNull() {
        try {
            new Monstre(4, null, null,null);
            fail();
        } catch (IllegalArgumentException e) {
            assertNotNull(e.getMessage());
        }
    }

    @Test
    public void devraitPasConstruireUnMonstreValidAvecAttaqueVide() {
        try {
            new Monstre(new Integer(""), 5, null,null);
            fail();
        } catch (IllegalArgumentException e) {
            assertNotNull(e.getMessage());
        }
    }

    @Test
    public void devraitPasConstruireUnMonstreValidAvecDefenseVide() {
        try {
            new Monstre(4, new Integer(""), null,null);
            fail();
        } catch (IllegalArgumentException e) {
            assertNotNull(e.getMessage());
        }
    }

    @Test
    public void devraitBaissePvMonstreAdverse() {
        Monstre adversaire = new Monstre(4, 5, null,null);
        Monstre monstreAttaquant = new Monstre(4, 5, null,null);
        monstreAttaquant.attaque(adversaire);
        assertEquals(monstreAttaquant.getDefense(), new Integer(5));
        assertEquals(monstreAttaquant.getAttaque(), new Integer(4));
        assertEquals(adversaire.getDefense(), new Integer(1));
        assertEquals(adversaire.getAttaque(), new Integer(4));
    }

    @Test
    public void devraitPasAttaquerMonstreAdverseNull() {
        Monstre monstreAttaquant = new Monstre(4, 5, null,null);
        try {
            monstreAttaquant.attaque(null);
        } catch (IllegalArgumentException e) {
            assertNotNull(e.getMessage());
        }
    }

    @Test
    public void devraitPasAttaquerMonstreAdverseAvec0PointDef() {
        Monstre monstreAttaquant = new Monstre(4, 5, null,null);
        Monstre adversaire = new Monstre(4, 0, null,null);
        try {
            monstreAttaquant.attaque(adversaire);
        } catch (IllegalArgumentException e) {
            assertNotNull(e.getMessage());
        }
    }
}
