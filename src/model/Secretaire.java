package model;

public class Secretaire extends Utilisateur {
    private String matricule;

    // Constructor
    public Secretaire() {
    	
    }
    
    /**
     * Constructs a new instance of Secretaire with the specified attributes.
     *
     * @param matricule The matricule of the secretary
     * @param nom The last name of the secretary
     * @param prenom The first name of the secretary
     * @param email The email of the secretary
     * @param password The password of the secretary
     * @param role The role of the secretary
     * @param age The age of the secretary
     */
    public Secretaire(String matricule, String nom, String prenom, String email, String password, String role, int age) {
        super(nom, prenom, email, password, role, age);
        this.matricule = matricule;
    }


    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    /**
     * Returns a string representation of the Medecin object.
     *
     * @return A string containing the matricule, nom, prenom, email, password, role, and age of the Medecin.
     */
    @Override
    public String toString() {
        return "Medecin {\n" + 
            "matricule => " + matricule + "\n" +
            "nom => " + nom + "\n" +
            "prenom => " + prenom + "\n" +
            "email => " + email + "\n" +
            "password => " + password + "\n" +
			"role => " + role + "\n" +
            "age => " + age + "\n" +
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
        Secretaire other = (Secretaire) obj;
        if (matricule == null) {
            if (other.matricule != null)
                return false;
        }else if(!matricule.equals(other.matricule))
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
        return true;
    }

    
    
    
}
