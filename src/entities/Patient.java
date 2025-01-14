package entities;

public class Patient extends Utilisateur {
    
    // Constructor
    public Patient() {
    
    }

    public Patient(String nom, String prenom, String email, String password, String role, int age) {
        super(nom, prenom, email, password, role, age);
    }

    @Override
    public String toString() {
        return "Patient {" +
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
        Patient other = (Patient) obj;
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
