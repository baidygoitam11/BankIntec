import Entites.*;

import java.util.Date;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");
        //Declarations des Objet
        Compte compte1 = new Compte(12,2395,3,new Date(),new Date());
        Compte compte2 = new Compte(19,233495,5,new Date(),new Date());
        Compte compte3 = new Compte(62,2395,9,new Date(),new Date());
        Compte compte4 = new Compte(92,567,8,new Date(),new Date());
        Compte compte5 = new Compte(12,2395,4,new Date(),new Date());
        System.out.println(compte1.toString());
        System.out.println(compte2.toString());
        System.out.println(compte3.toString());
        System.out.println(compte4.toString());
        System.out.println(compte5.toString());
        CompteEpargne E1 = new CompteEpargne(12,2337,3,new Date(),new Date());
        CompteEpargne E2 = new CompteEpargne(19,233775,4,new Date(),new Date());
        CompteEpargne E3 = new CompteEpargne(16,23377,7,new Date(),new Date());
        CompteEpargne E4 = new CompteEpargne(197,237837,4,new Date(),new Date());
        CompteEpargne E5 = new CompteEpargne(156,98337,38,new Date(),new Date());
        System.out.println(E1.toString());
        System.out.println(E2.toString());
        System.out.println(E3.toString());
        System.out.println(E4.toString());
        System.out.println(E5.toString());
        CompteSimple S1 = new CompteSimple(12,2337,3,new Date(),new Date());
        CompteSimple S2 = new CompteSimple(14,2337,6,new Date(),new Date());
        CompteSimple S3 = new CompteSimple(12,2337,1,new Date(),new Date());
        CompteSimple S4 = new CompteSimple(12,2337,5,new Date(),new Date());
        CompteSimple S5 = new CompteSimple(13,2334,4,new Date(),new Date());
        System.out.println(S1.toString());
        System.out.println(S2.toString());
        System.out.println(S3.toString());
        System.out.println(S4.toString());
        System.out.println(S5.toString());
        ComptePayant Cp1 = new ComptePayant(33,12345,10,new Date(),new Date());
        ComptePayant Cp2= new ComptePayant(2,12345,62,new Date(),new Date());
        ComptePayant Cp3 = new ComptePayant(4,12345,66,new Date(),new Date());
        ComptePayant Cp4= new ComptePayant(24,12345,223,new Date(),new Date());
        ComptePayant Cp5 = new ComptePayant(72,12345,23,new Date(),new Date());
        System.out.println(Cp1.toString());
        System.out.println(Cp2.toString());
        System.out.println(Cp3.toString());
        System.out.println(Cp4.toString());
        System.out.println(Cp5.toString());
        Personne p1= new Personne(3,"Baïdy","Goïta",19,"BKO","62-69-93-37",new Date(),new Date(),new Date());
        Personne p2= new Personne(76,"Medmo","Diallo",10,"BKO","76-21-58-53",new Date(),new Date(),new Date());
        Personne p3= new Personne(36,"Diak","Dembelle",22,"KLC","75-61-20-22",new Date(),new Date(),new Date());
        Personne p4= new Personne(45,"ALI","Boire",11,"KLA","65-63-49-19",new Date(),new Date(),new Date());
        Personne p5= new Personne(7,"Moussa","Sy",17,"GAO","93-39-96-49",new Date(),new Date(),new Date());
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
        System.out.println(p5.toString());

    }
}