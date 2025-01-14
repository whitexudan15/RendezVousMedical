package entities;

public abstract class Utilisateur {
    protected String nom;
    protected String prenom;
    protected String email;
    protected String password;
    protected String role;
    protected int age;

    public Utilisateur() {
    }

    /**
     * Constructs a new Utilisateur (User) object with the specified attributes.
     *
     * @param nom The last name of the user
     * @param prenom The first name of the user
     * @param email The email address of the user
     * @param password The password of the user
     * @param role The role of the user (e.g., admin, user)
     * @param age The age of the user
     */
    public Utilisateur(String nom, String prenom, String email, String password, String role, int age) {
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.password = password;
        this.role = role;
        this.age = age;
    }

    // Getters and setters
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @override
    /**
     * Returns a string representation of the object.
     *
     * @return a string representation of the object
     */
    public abstract String toString();

    @Override
    /**
     * Returns a hash code value for the object. This method is abstract and must be implemented
     * by subclasses to provide a specific implementation of hash code calculation for the object.
     *
     * @return a hash code value for this object
     */
    public abstract int hashCode();


    @Override
    /**
     * Indicates whether some other object is "equal to" this one.
     * The equals method implements an equivalence relation on non-null object references.
     * It is reflexive, symmetric, and transitive.
     *
     * @param obj the reference object with which to compare
     * @return true if this object is the same as the obj argument; false otherwise
     */
    public abstract boolean equals(Object obj);

}
