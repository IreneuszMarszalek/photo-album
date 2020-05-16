package pl.sdacademy;

import pl.sdacademy.album.AlbumCreationParametersProvider;
import pl.sdacademy.album.AlbumCreator;
import pl.sdacademy.data.album;
import pl.sdacademy.repos.PhotoRepository;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        System.out.println("Mam " + PhotoRepository.getPhotos().length + " zdjęć!");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę albumów");
        int numberOfAlbums = scanner.nextInt();

        for (int i = 0; i < numberOfAlbums; i++) {
            AlbumCreationParametersProvider parametersProvider = new AlbumCreationParametersProvider();
            AlbumCreator creator = new AlbumCreator(parametersProvider);
            album album = creator.create();

            album.present();
        }
    }
}
