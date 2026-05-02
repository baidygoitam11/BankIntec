package Entites;

import java.util.Date;

public class Compte {
    private int code ;
    private float solde ;
    private int nbComptes;
    private Date createdDate;
    private Date updatedDate;

    public Compte(int code, float solde, int nbComptes, Date createdDate, Date updatedDate) {
        this.code = code;
        this.solde = solde;
        this.nbComptes = nbComptes;
        this.createdDate = createdDate;
        this.updatedDate = updatedDate;
    }

    public void verser(float mt){
        solde += mt;

    }
    public void retirer(float mt){
        solde -= mt;
    }

    @Override
    public String toString() {


        return "Compte{" +
                "code=" + code +
                ", solde=" + solde +
                ", nbComptes=" + nbComptes +
                ", createdDate=" + createdDate +
                ", updatedDate=" + updatedDate +
                '}';
    }
}
