package Entites;

import java.util.Date;

public class ComptePayant extends Compte {
    public ComptePayant(int code, float solde, int nbComptes, Date createdDate, Date updatedDate) {
        super(code, solde, nbComptes, createdDate, updatedDate);
    }

    @Override
    public void verser(float mt) {
        super.verser(mt);
    }

    @Override
    public void retirer(float mt) {
        super.retirer(mt);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
