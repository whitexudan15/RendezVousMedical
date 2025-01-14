package entities;

import java.util.List;

public class Medecin extends Utilisateur {
    private String matricule;
    private String specialite;
    private List<Creneau> creneaux;

    // Constructor

    /**
     * Constructor for the Medecin class.
     * This constructor does not take any parameters.
     */
    public Medecin() {
    
    }


    /**
     * Represents a medical professional with specific attributes.
     *
     * @param matricule The unique identifier for the medical professional
     * @param nom The last name of the medical professional
     * @param prenom The first name of the medical professional
     * @param email The email address of the medical professional
     * @param password The password of the medical professional
     * @param role The role of the medical professional
     * @param age The age of the medical professional
     * @param specialite The specialty of the medical professional
     */
    public Medecin(String matricule, String nom, String prenom, String email, String password, String role, int age, String specialite) {
        super(nom, prenom, email, password, role, age);
        this.matricule = matricule;
        this.specialite = specialite;
    }

    /**
     * Gets the specialty of the person.
     *
     * @return The specialty of the person.
     */
    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }
    
    public String getSpecialite() {
        return specialite;
    }

    public void setSpecialite(String specialite) {
        this.specialite = specialite;
    }

    public List<Creneau> getCreneaux() {
        return creneaux;
    }

    public void setCreneaux(List<Creneau> creneaux) {
        this.creneaux = creneaux;
    }

    /**
     * Returns a string representation of the Medecin object, including all its attributes.
     *
     * @return A string representation of the Medecin object
     */
    @Override
    public String toString() {
        return "Medecin {\n" + 
            "matricule => " + matricule + "\n" +  // Unique identifier for each user
            "nom => " + nom + "\n" +
            "prenom => " + prenom + "\n" +
            "email => " + email + "\n" +
            "password => " + password + "\n" +
			"role => " + role + "\n" +
            "age => " + age + "\n" +
            "specialite => " + specialite + "\n" +
            "creneaux => " + creneaux + "\n" +
            "}";
    }
    
    /**
     * Generates a hash code value for this object based on its fields.
     *
     * @return A hash code value for this object
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((matricule == null) ? 0 : matricule.hashCode());
        result = prime * result + ((nom == null) ? 0 : nom.hashCode());
        result = prime * result + ((prenom == null) ? 0 : prenom.hashCode());
        result = prime * result + ((email == null) ? 0 : email.hashCode());
        result = prime * result + ((password == null) ? 0 : password.hashCode());
        result = prime * result + ((role == null) ? 0 : role.hashCode());
		result = prime * result + ((specialite == null) ? 0 : specialite.hashCode());
		result = prime * result + ((creneaux == null) ? 0 : creneaux.hashCode());
        result = prime * result + age;
        return result;
    }

    /**
     * Indicates whether some other object is "equal to" this one.
     *
     * @param obj The object to compare this instance with.
     * @return True if the objects are considered equal, false otherwise.
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Medecin other = (Medecin) obj;
        if (matricule == null) {
            if (other.matricule != null)
                return false;
        }else if (!matricule.equals(other.matricule))
            return false;
        if (nom == null) {
            if (other.nom != null)
                return false;
        } else if (!nom.equals(other.nom))
            return false;
        if (prenom == null) {
            if (other.prenom != null)
                return false;
        } else if (!prenom.equals(other.prenom))
            return false;
        if (email == null) {
            if (other.email != null)
                return false;
        } else if (!email.equals(other.email))
            return false;
        if (password == null) {
            if (other.password != null)
                return false;
        } else if (!password.equals(other.password))
            return false;
        if (role == null) {
            if (other.role != null)
                return false;
        } else if (!role.equals(other.role))
            return false;
        if (age != other.age)
            return false;
        if (specialite != null) {
            if (other.specialite != null)
                return false;
        } else if (!specialite.equals(other.specialite))
            return false;
        if (creneaux == null) {
            if (other.creneaux != null)
                return false;
        }else if (!creneaux.equals(other.creneaux))
            return false;
        return true;
    }

}
