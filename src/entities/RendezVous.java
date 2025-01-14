package entities;

import java.util.Date;

public class RendezVous {
    private Date dateProgrammation;
    private Date dateRDV;
    private String etat;
    private Creneau creneau;
    private Patient patient;
    private Medecin medecin;

    // Constructors
    public RendezVous() {

    }

    public RendezVous(Date dateProgrammation, Date dateRDV, String etat, Creneau creneau, Patient patient, Medecin medecin) {
        this.dateProgrammation = dateProgrammation;
        this.dateRDV = dateRDV;
        this.etat = etat;
        this.creneau = creneau;
        this.patient = patient;
        this.medecin = medecin;
    }

    public Date getDateProgrammation() {
        return dateProgrammation;
    }

    public void setDateProgrammation(Date dateProgrammation) {
        this.dateProgrammation = dateProgrammation;
    }

    public Date getDateRDV() {
        return dateRDV;
    }

    public void setDateRDV(Date dateRDV) {
        this.dateRDV = dateRDV;
    }

    public String getEtat() {
        return etat;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }

    public Creneau getCreneau() {
        return creneau;
    }

    public void setCreneau(Creneau creneau) {
        this.creneau = creneau;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Medecin getMedecin() {
        return medecin;
    }

    public void setMedecin(Medecin medecin) {
        this.medecin = medecin;
    }

    @Override
    public String toString() {
        return "RendezVous {\ndateProgrammation => " + dateProgrammation + "\n" + 
               "dateRDV => " + dateRDV + "\n" +
               "creneau => " + creneau + "\n" +
               "etat => " + etat + "\n" +
               "patient => " + patient + "\n" +
               "medecin => " + medecin + "\n" +
               "}";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((dateProgrammation == null) ? 0 : dateProgrammation.hashCode());
        result = prime * result + ((dateRDV == null) ? 0 : dateRDV.hashCode());
        result = prime * result + ((etat == null) ? 0 : etat.hashCode());
        result = prime * result + ((creneau == null) ? 0 : creneau.hashCode());
        result = prime * result + ((patient == null) ? 0 : patient.hashCode());
        result = prime * result + ((medecin == null) ? 0 : medecin.hashCode());
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
        RendezVous other = (RendezVous) obj;
        if (dateProgrammation == null) {
            if (other.dateProgrammation != null)
                return false;
        } else if (!dateProgrammation.equals(other.dateProgrammation))
            return false;
        if (dateRDV == null) {
            if (other.dateRDV != null)
                return false;
        } else if (!dateRDV.equals(other.dateRDV))
            return false;
        if (etat == null) {
            if (other.etat != null)
                return false;
        } else if (!etat.equals(other.etat))
            return false;
        if (creneau == null) {
            if (other.creneau != null)
                return false;
        } else if (!creneau.equals(other.creneau))
            return false;
        if (patient == null) {
            if (other.patient != null)
                return false;
        } else if (!patient.equals(other.patient))
            return false;
        if (medecin == null) {
            if (other.medecin != null)
                return false;
        } else if (!medecin.equals(other.medecin))
            return false;
        return true;
    }

}
