package pl.sdacademy;


import pl.sdacademy.data.PhotoRepository;
import pl.sdacademy.data.album;

import java.util.Scanner;
public class Application {
    public static void main(String[] args) {
        System.out.println("Mam" + PhotoRepository.getPhotos().length);
        System.out.println(PhotoRepository.getPhotos()[0].getPhotoName());

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj indeksy wybranych zdjec (0-999):");
        String selectedIndexes = scanner.nextLine();

        String[] indexStr = selectedIndexes.split(",");
        int [] indexes = new int[indexStr.length];
        for (int i = 0; i < indexes.length; i++) {
            //TODO: obsłuzyć wszystkie błędne z komunikatem i skończyc po sprawdzeniue - po poznniu elementów zaawansowanych
            indexes[i] = Integer.valueOf(indexStr[i]);
        }


    }
}
