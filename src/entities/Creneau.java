package entities;

import java.sql.Time;

public class Creneau {
    private Time heureDebut;
    private Time heureFin;

    // Constructor
    public Creneau() {
    
    }

    public Creneau(Time heureDebut, Time heureFin) {
        this.heureDebut = heureDebut;
        this.heureFin = heureFin;
    }

    // Getters and setters

    public Time getHeureDebut() {
        return heureDebut;
    }

    public void setHeureDebut(Time heureDebut) {
        this.heureDebut = heureDebut;
    }

    public Time getHeureFin() {
        return heureFin;
    }

    public void setHeureFin(Time heureFin) {
        this.heureFin = heureFin;
    }

    @Override
    public String toString() {
        return "Creneau {\nheureDebut => " + heureDebut + "\nheureFin => " + heureFin + "\n}";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((heureDebut == null) ? 0 : heureDebut.hashCode());
        result = prime * result + ((heureFin == null) ? 0 : heureFin.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Creneau other = (Creneau) obj;
        if (heureDebut == null) {
            if (other.heureDebut != null)
                return false;
        } else if (!heureDebut.equals(other.heureDebut))
            return false;
        if (heureFin == null) {
            if (other.heureFin != null)
                return false;
        } else if (!heureFin.equals(other.heureFin))
            return false;
        return true;
    }

    // Other methods

}
