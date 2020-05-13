package pl.sdacademy.data;

import java.time.LocalDate;

public class Photo {
    private String photoName;
    private LocalDate data;

    public Photo(String photoName, LocalDate data) {
        this.photoName = photoName;
        this.data = data;
    }

    public Photo() {

    }

    public void setPhotoName(String photoName) {
        this.photoName = photoName;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public String getPhotoName() {
        return photoName;
    }

    public LocalDate getData() {
        return data;
    }
}
