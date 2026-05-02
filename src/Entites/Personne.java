
        package Entites;

import java.util.Date;

public class Personne {
    private int Id;
    private String nom;
    private  String prenom;
    private int age;
    private String adress;
    private  String phone;
    private Date dateNaissance;
    private Date createdDate;
    private Date updatedDate;
    private String sex;

    public Personne(int id, String nom, String prenom, int age, String adress, String phone, Date dateNaissance, Date createdDate, Date updatedDate) {
        Id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.adress = adress;
        this.phone = phone;
        this.dateNaissance = dateNaissance;
        this.createdDate = createdDate;
        this.updatedDate = updatedDate;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Date getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Date getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(Date updatedDate) {
        this.updatedDate = updatedDate;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Personne{" +
                "Id=" + Id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", age=" + age +
                ", adress='" + adress + '\'' +
                ", phone='" + phone + '\'' +
                ", dateNaissance=" + dateNaissance +
                ", createdDate=" + createdDate +
                ", updatedDate=" + updatedDate +
                ", sex='" + sex + '\'' +
                '}';
    }
}