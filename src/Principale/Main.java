package Principale;

import Entites.*;
import View.PersonneForm;

import java.util.Date;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        new PersonneForm().setVisible(true);
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");
        //Declarations des Objet
        Compte l1 = new Compte(12,2395,3,new Date(),new Date());
        Compte l2 = new Compte(19,233495,5,new Date(),new Date());
        Compte l3 = new Compte(62,2395,9,new Date(),new Date());
        Compte l4 = new Compte(92,567,8,new Date(),new Date());
        Compte l5 = new Compte(12,2395,4,new Date(),new Date());
        System.out.println(l1.toString());
        System.out.println(l2.toString());
        System.out.println(l3.toString());
        System.out.println(l4.toString());
        System.out.println(l5.toString());
        CompteEpargne lE1 = new CompteEpargne(12,2337,3,new Date(),new Date());
        CompteEpargne lE2 = new CompteEpargne(19,233775,4,new Date(),new Date());
        CompteEpargne lE3 = new CompteEpargne(16,23377,7,new Date(),new Date());
        CompteEpargne lE4 = new CompteEpargne(197,237837,4,new Date(),new Date());
        CompteEpargne lE5 = new CompteEpargne(156,98337,38,new Date(),new Date());
        System.out.println(lE1.toString());
        System.out.println(lE2.toString());
        System.out.println(lE3.toString());
        System.out.println(lE4.toString());
        System.out.println(lE5.toString());
        CompteSimple lS1 = new CompteSimple(12,2337,3,new Date(),new Date());
        CompteSimple lS2 = new CompteSimple(14,2337,6,new Date(),new Date());
        CompteSimple lS3 = new CompteSimple(12,2337,1,new Date(),new Date());
        CompteSimple lS4 = new CompteSimple(12,2337,5,new Date(),new Date());
        CompteSimple lS5 = new CompteSimple(13,2334,4,new Date(),new Date());
        System.out.println(lS1.toString());
        System.out.println(lS2.toString());
        System.out.println(lS3.toString());
        System.out.println(lS4.toString());
        System.out.println(lS5.toString());
        ComptePayant Cp1 = new ComptePayant(23,12345,5,new Date(),new Date());
        ComptePayant Cp2= new ComptePayant(12,12345,6,new Date(),new Date());
        ComptePayant Cp3 = new ComptePayant(43,12345,56,new Date(),new Date());
        ComptePayant Cp4= new ComptePayant(21,12345,45,new Date(),new Date());
        ComptePayant Cp5 = new ComptePayant(12,12345,233,new Date(),new Date());
        System.out.println(Cp1.toString());
        System.out.println(Cp2.toString());
        System.out.println(Cp3.toString());
        System.out.println(Cp4.toString());
        System.out.println(Cp5.toString());
        Personne p1= new Personne(3,"Goïta","Baïdy",22,"BKO","62-69-93-37",new Date(),new Date(),new Date());
        Personne p2= new Personne(76,"Diallo","Medmo",10,"SAN","76-86-45-46",new Date(),new Date(),new Date());
        Personne p3= new Personne(36,"Diak","DIAWRRA",20,"BNB","54-67-23-54",new Date(),new Date(),new Date());
        Personne p4= new Personne(45,"Ag","Moussa",11,"BKO","65-57-89-09",new Date(),new Date(),new Date());
        Personne p5= new Personne(7,"Bassoum","Amadou",12,"BKO","13-35-76-45",new Date(),new Date(),new Date());
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
        System.out.println(p5.toString());

    }
}