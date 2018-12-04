package interpreteur;

public class Photo extends Media {
    protected String auteur;
    protected String nomFichier;
    public Photo(int d, String nom, String auteur, String nomFichier) {
        super(d, nom);
        this.auteur = auteur;
        this.nomFichier = nomFichier;
    }

    public int getNombreDePhotos(){
        return 1; // retourne directement 1 car la méthode est implémenté dans album (on somme dans album par appel recursif
    }

    @Override
    public String toString() {
        return "Photo{" +
                "auteur='" + auteur + '\'' +
                ", annee=" + annee +
                ", nom='" + nom + '\'' +
                '}';
    }
}
