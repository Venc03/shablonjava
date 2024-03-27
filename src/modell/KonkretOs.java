package modell;

import java.util.Objects;
import java.util.UUID;

public class KonkretOs {
    private UUID id;
    private boolean van;

    public KonkretOs() {
        this(false);
    }

    public KonkretOs(boolean van) {
        setId();
        this.van = van;
    }

    public UUID getId() {
        return id;
    }

    public void setId() {
        this.id = UUID.randomUUID();
    }

    public boolean isVan() {
        return van;
    }

    public void setVan(boolean van) {
        this.van = van;
    }
    
    public String tipus() {
        
        return "Os";
        
    }

    @Override
    public String toString() {
        return "KonkretOs{" + "id=" + id + ", van=" + van + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final KonkretOs other = (KonkretOs) obj;
        return Objects.equals(this.id, other.id);
    }
    
    
    
}
