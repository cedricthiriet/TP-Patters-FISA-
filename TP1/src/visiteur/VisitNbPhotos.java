package visiteur;

public class VisitNbPhotos implements Visiteur{
    private int nbphoto=0;
    @Override
    public int VisitPhoto(Photo p) {
        return 1;
    }

    public int VisitPhoto(Album a) {
    int res=0;
        for(Media m : a.als)
        {
            m.accept(this);
        }
        return res;
    }
}
