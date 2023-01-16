package Maven.TP1;
import java.util.*;
public class Secteur {
    private TypeAnimal typeAnimauxDansSecteur;
    List<Animal> animauxDansSecteur ;

    public Secteur(TypeAnimal type, int nbvisiteurMaxParSecteur) {
    }

    void ajouterAnimal(Animal m) throws AnimalDansMauvaisSecteurException {
        if (m.getTypeAnimal() != typeAnimauxDansSecteur) {
            throw new AnimalDansMauvaisSecteurException("Animal of this type  cannot be added to this sector of type ");
        }
        animauxDansSecteur.add(m);
    }
    int getNombreAnimaux(){
        return animauxDansSecteur.size();
    }
    TypeAnimal obtenirType(){
        return typeAnimauxDansSecteur;
    }
}
