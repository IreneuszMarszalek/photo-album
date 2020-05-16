package pl.sdacademy.album;

import pl.sdacademy.data.AlbumParameter;

import java.util.Scanner;

public class AlbumCreationParametersProvider {
    public AlbumParameter fetchAlbumParams() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj nazwę albumu:");
        String albumName = scanner.nextLine();
        System.out.println("Podaj indeksy wybranych zdjęć (0 - 999):");
        String selectedIndexes = scanner.nextLine();

        return new AlbumParameter(albumName, selectedIndexes);
    }
}
