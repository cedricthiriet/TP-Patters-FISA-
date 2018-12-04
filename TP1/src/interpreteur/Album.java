package interpreteur;

import java.util.ArrayList;
import java.util.Iterator;

public class Album extends Media implements Iterable<Media>{
    protected ArrayList<Media> als ;
    public Album(int d, String nom) {
        super(d, nom);
        this.als = new ArrayList<>(10);
    }

    public void ajouter(Media... s) {
        for (Media sc : s)
            this.als .add(sc) ;
    }


    @Override
    public String toString() {
        return "Album{" +
                "als=" + als +
                '}';
    }

    public int getNombreDePhotos(){
        int res = 0;
        for(Media m : als)
        {
            res += m.getNombreDePhotos(); // appel recursif : s'il ne s'agit pas d'une photo skip /
            // sinon ajout d'une photo par méthode getNombreDePhotos() dans la classe Photo qui retourne 1 si m est une photo
        }
        return res;
    }

    @Override
    public Iterator<Media> iterator() {
        return this.als.iterator();
    }
}

