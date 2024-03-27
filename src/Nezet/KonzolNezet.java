package Nezet;

import java.util.ArrayList;
import java.util.List;
import modell.KonkretOs;
import modell.MenthetoNyomtathatoUtod;
import modell.MenthetoUtod;
import modell.Nyomtathato;
import modell.NyomtathatoUtod;

public class KonzolNezet {

    private List<KonkretOs> mindenki;
    private List<Nyomtathato> nyomtathato;
    
    
    
    public KonzolNezet() {
        mindenki = new ArrayList<>();
        nyomtathato = new ArrayList<>();

        feltoltMindenki();
        feltoltNyomtathato();
    }

    private void feltoltMindenki() {
        KonkretOs ko1 = new KonkretOs();
        mindenki.add(ko1);
        mindenki.add(new KonkretOs(true));

        MenthetoUtod mu1 = new MenthetoUtod("hello", true);
        mindenki.add(mu1);
        mindenki.add(new MenthetoUtod("hello"));

        NyomtathatoUtod nyu1 = new NyomtathatoUtod();
        mindenki.add(nyu1);
        mindenki.add(new NyomtathatoUtod());

        MenthetoNyomtathatoUtod mnyu1 = new MenthetoNyomtathatoUtod();
        mindenki.add(mnyu1);
        mindenki.add(new MenthetoNyomtathatoUtod());
    }

    private void feltoltNyomtathato() {
        for (KonkretOs ko : mindenki) {
            if (ko instanceof Nyomtathato) {
                nyomtathato.add((Nyomtathato) ko);
            }
        }
    }
    
    public void kiirMindenkit(){
        for (KonkretOs os : mindenki) {
            System.out.println(os);
        }
    }
    
    public void kiirNyomtathatot(){
        for (Nyomtathato ny : nyomtathato) {
            System.out.println(((KonkretOs)ny).tipus());
        }
    }

}
