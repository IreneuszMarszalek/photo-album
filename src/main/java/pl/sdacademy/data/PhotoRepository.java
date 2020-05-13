package pl.sdacademy.data;

import java.time.LocalDate;

public class PhotoRepository {
    private static final int HOW_MANY_PHOTOS = 1000;
    private static Photo[] photos = init();

    public static Photo[] getPhotos() {
        // FIXME: zablokowac po części zaawansownej mozliwosc zmiany
        return photos;
    }

    public static Photo getPhotoAt(int index){
        return photos[index];
    }

    private static Photo[] init() {
        // TODO: poprawić po zapoznaniu się z elementami zaawansowanymi
        Photo[] allphotos = new Photo[HOW_MANY_PHOTOS];
        Photo photo;
        // TODO: zmienić na obsługe np plików
        for (int i = 1; i <=HOW_MANY_PHOTOS ; i++) {
            photo = new Photo("Ph" + normalizePhotoNumber(i), LocalDate.now());
            allphotos[i-1] = photo;
        }
        return allphotos;
    }

    private static String normalizePhotoNumber(int i) {
        if (i< 10){
            return "000" + i;
        }
        if (i< 100){
            return "00" + i;
        }
        if (i< 1000){
            return "0" + i;
        }
        return String.valueOf(i);
    }
}
