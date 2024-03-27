package modell;

import java.io.Serializable;

public class MenthetoUtod extends KonkretOs implements Serializable{
    private String leiras;

    public MenthetoUtod(String leiras) {
        this(leiras, false);
    }
    
    public MenthetoUtod(String leiras, boolean van) {
        super(van);
        this.leiras = leiras;
    }

    public String getLeiras() {
        return leiras;
    }

    public void setLeiras(String leiras) {
        this.leiras = leiras;
    }

    @Override
    public String tipus() {
        String os = super.tipus();
        return os + "<-- mentheto";
    }
    
    

    @Override
    public String toString() {
        String os = super.toString();
        return os + "MenthetoUtod{" + "leiras=" + leiras + '}';
    }
    
    
    
}
