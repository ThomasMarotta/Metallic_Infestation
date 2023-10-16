package fr.iut.montreuil.metallic_infestation.modele;

import fr.iut.montreuil.metallic_infestation.modele.utilitaire.Case;
import fr.iut.montreuil.metallic_infestation.modele.utilitaire.Environnement;
import fr.iut.montreuil.metallic_infestation.modele.utilitaire.Terrain;

public abstract class ObjetPlacable {
    private Case emplacement;
    private Environnement environnement;
    private Terrain terrain;
    private int cout;

    public ObjetPlacable (Case emplacement, Environnement environnement, Terrain terrain, int cout){
        this.emplacement = emplacement;
        this.environnement = environnement;
        this.terrain = terrain;
        this.cout = cout;
    }

    public abstract void poserElement();
}
