package presentation;

import dao.Etudiant;
import dao.EtudiantDAO;
import metier.EtudiantManager;

public class Main {
    public static void main(String []args){
        EtudiantDAO etudiantDAO = new EtudiantDAO();
        EtudiantManager etudiantManager =new EtudiantManager(etudiantDAO);
        Etudiant e1 = new Etudiant("id1","nom1","prenom1","email1@gmail.com");
        Etudiant e2 = new Etudiant("id2","nom2","prenom2","email2@gmail.com");
        Etudiant e3 = new Etudiant("id3","nom3","prenom3","email3@gmail.com");
        Etudiant e4 = new Etudiant("id4","nom4","prenom4","email4@gmail.com");
        etudiantManager.addEtudiant(e1);
        etudiantManager.addEtudiant(e2);
        etudiantManager.addEtudiant(e3);
        etudiantManager.addEtudiant(e4);
        System.out.println(etudiantManager.getAllEtudiants());



    }

}
