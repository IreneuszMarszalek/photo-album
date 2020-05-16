package pl.sdacademy.data;

public class album {
    public static final int ALBUM_SIZE = 50;
    private String name;
    private Photo[] selectedPhotos =new Photo[ALBUM_SIZE];
    // TODO: zmienić na enum jako ćwieczenie po poznaniu w części zawansowanej
    private String[] categories;

    //tylko dostepne w ramach klasy potrzebne do obslugi dodawania
    private int lastIndex;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addPhotos(Photo... selectedPhotos) {
        if(lastIndex == ALBUM_SIZE){
            System.out.println("Album pełen");
            return;
        }
        if(lastIndex+selectedPhotos.length >= ALBUM_SIZE ){
            System.out.println("Album za mało miejsca");
            return;
        }
        for (Photo photo: selectedPhotos){
            this.selectedPhotos[lastIndex++] = photo;
        }
    }

    public void setCategories(String[] categories) {
        this.categories = categories;
    }

    public Photo[] getSelectedPhotos() {
        return selectedPhotos;
    }

    public String[] getCategories() {
        return categories;
    }

    public void present() {
        System.out.println("Album " + name + " zawiera następujące zdjęcia:");
        if (lastIndex == 0) {
            return;
        }
        for (int i = 0; i < lastIndex; i++) {
            System.out.println(selectedPhotos[i].getPhotoName());
        }
    }
}
