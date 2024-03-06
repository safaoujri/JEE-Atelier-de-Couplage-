package dao;

import java.util.ArrayList;
import java.util.List;

public class EtudiantDAO {
    private List<Etudiant> etudiants=new ArrayList<>();

    public Etudiant addEtudiant(Etudiant etudiant){
        for (Etudiant etu : etudiants){
            if(etu.equals(etudiant)){
                return null;
            }

        }
        etudiants.add(etudiant);
        return etudiant;
    }
    public Etudiant getEtudiantByEmail(String email){
        for(Etudiant etu : etudiants){
            if(etu.getEmail().equals(email)){
                return etu;

            }
        }
        return null;
    }
    public List<Etudiant> getAllEtudiant(){
        return etudiants;

    }
}
