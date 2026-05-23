package Entites;

public class Agence {
    private int Num;
    private String Nom;
    private String Adresse;
    private String Contact;
    private String Email;
    private int nbpersonne;

    public Agence() {
    }

    public Agence(int num, String nom, String adresse, String contact, String email, int nbpersonne) {
        Num = num;
        Nom = nom;
        Adresse = adresse;
        Contact = contact;
        Email = email;
        this.nbpersonne = nbpersonne;
    }

    public int getNum() {
        return Num;
    }

    public void setNum(int num) {
        Num = num;
    }

    public String getNom() {
        return Nom;
    }

    public void setNom(String nom) {
        Nom = nom;
    }

    public String getAdresse() {
        return Adresse;
    }

    public void setAdresse(String adresse) {
        Adresse = adresse;
    }

    public String getContact() {
        return Contact;
    }

    public void setContact(String contact) {
        Contact = contact;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public int getNbpersonne() {
        return nbpersonne;
    }

    public void setNbpersonne(int nbpersonne) {
        this.nbpersonne = nbpersonne;
    }
}
