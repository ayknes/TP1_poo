package Maven.TP1;
import java.io.*;
import java.util.*;
public class Zoo {
    private int  visiteurs ;
    private List<Secteur> secteursAnimaux;
    private int nbvisiteurMaxParSecteur;

    public Zoo(int visiteurs) {
        this.visiteurs=visiteurs;
    }

    void ajouterSecteur(TypeAnimal type){
        Secteur newSecteur = new Secteur(type, nbvisiteurMaxParSecteur);
        secteursAnimaux.add(newSecteur);
    }
    void nouveauVisiteur() throws LimiteVisiteurException {
        if(visiteurs>nbvisiteurMaxParSecteur) throw new LimiteVisiteurException("vous avez depaser la capaciter");
        visiteurs++;
    }
    int getLimiteVisiteur(){
        return nbvisiteurMaxParSecteur;
    }
    void nouvelAnimal(Animal m) throws AnimalDansMauvaisSecteurException {
        for (Secteur secteur : secteursAnimaux) {
            if (secteur.obtenirType() == m.getTypeAnimal()) {
                secteur.ajouterAnimal(m);
                return;
            }
        }
        throw new AnimalDansMauvaisSecteurException("No sector for animal of type: " + m.getTypeAnimal());
    }
    int nombreAnimaux(){ int nbAnimaux = 0;
        for (Secteur secteur : secteursAnimaux) {
            nbAnimaux += secteur.getNombreAnimaux();
        }
        return nbAnimaux;}
}
