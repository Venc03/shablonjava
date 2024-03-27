package modell;

import java.io.Serializable;

public class MenthetoNyomtathatoUtod extends KonkretOs implements Nyomtathato, Serializable{

    @Override
    public String tipus() {
        String os = super.tipus();
        return os + "<-- nyomtathato es mentheto";
    }

    @Override
    public String toString() {
        String os = super.toString();
        return os + "MenthetoNyomtathatoUtod{" + '}';
    }
    
    
    
    @Override
    public void nyomtat() {
        
    }
    
}
