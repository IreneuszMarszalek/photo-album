package pl.sdacademy;

import pl.sdacademy.album.AlbumCreationParametersProvider;
import pl.sdacademy.album.AlbumCreator;
import pl.sdacademy.data.album;
import pl.sdacademy.repos.AlbumRepository;
import pl.sdacademy.repos.PhotoRepository;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        System.out.println("Mam " + PhotoRepository.getPhotos().length + " zdjęć!");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę albumów");
        int numberOfAlbums = scanner.nextInt();
        AlbumCreationParametersProvider parametersProvider = new AlbumCreationParametersProvider();
        AlbumRepository albumRepository = new AlbumRepository();
        for (int i = 0; i < numberOfAlbums; i++) {
            AlbumCreator creator = new AlbumCreator(parametersProvider);
            album album = creator.create();
            album.present();
            albumRepository.addAlbum(album);
        }

        albumRepository.present();
        albumRepository.presentDetails();
        System.out.println("I delete album #0");
        albumRepository.deleteAlbum(0);
        albumRepository.present();
        albumRepository.presentDetails();

    }
}
