package metier;

import dao.Etudiant;
import dao.EtudiantDAO;
import java.util.List;
public class EtudiantManager {
    public EtudiantDAO etudiantDAO ;

    public EtudiantManager(EtudiantDAO etudiantDAO) {
        this.etudiantDAO = etudiantDAO;
    }
    public Etudiant addEtudiant(Etudiant etudiant){
        if(etudiantDAO.getEtudiantByEmail(etudiant.getEmail())==null){
            etudiantDAO.addEtudiant(etudiant);
            return etudiant;
        }
        else{
            System.out.println("l'etudiant existe déja");
            return null;
        }

    }
    public List<Etudiant> getAllEtudiants(){
        return etudiantDAO.getAllEtudiant();
    }

}
