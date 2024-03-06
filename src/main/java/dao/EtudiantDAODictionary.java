package dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EtudiantDAODictionary {
    private Map<String, Etudiant> etudiantsMap = new HashMap<>();

    public Etudiant addEtudiant(Etudiant etudiant) {
        etudiantsMap.put(Integer.toString(etudiant.getId()), etudiant);
        return etudiant;
    }

    public Map<String, Etudiant> getAllEtudiants() {
        return etudiantsMap;
    }
}
