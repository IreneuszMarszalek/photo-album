package pl.sdacademy.repos;

import pl.sdacademy.data.album;

public class AlbumRepository {
    private static final int HOW_MANY_ALBUMS = 1000;
    private static album[] albums = new album[HOW_MANY_ALBUMS];

    int lastIndex = 0;

    public void addAlbum (album album){
        albums[lastIndex] = album;
        lastIndex++;
    }

    public void deleteAlbum (int index){
        if (index <= lastIndex){
            for (int i = index; i<lastIndex;i++) {
                if (i + 1 <= lastIndex) {
                    albums[i] = albums[i+1];
                }else{
                    break;
                }
            }
            lastIndex--;
        }else {
            System.out.println("Album does not exist");
        }
    }

    public void present(){
        System.out.println("There is " + (lastIndex) + " albums");
    }

    public void presentDetails(){
        int index = 0;
        if (lastIndex > 0) {
            for (album album : albums) {
                if(index<lastIndex) {
                    System.out.println("Album: #" + (index+1) + " name:" + album.getName());
                    index++;
                }else {
                    break;
                }
            }
        }else{
            System.out.println("There is no albums");
        }
    }

}
