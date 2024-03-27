package modell;

public class NyomtathatoUtod extends KonkretOs implements Nyomtathato{

    @Override
    public String tipus() {
        String os = super.tipus();
        return os + "<-- nyomtathato";
    }

    @Override
    public String toString() {
        String os = super.toString();
        return os + "NyomtathatoUtod{" + '}';
    }
    
    @Override
    public void nyomtat() {
        
    }
    
}
