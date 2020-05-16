package pl.sdacademy.album;

import static pl.sdacademy.repos.PhotoRepository.getPhotoAt;
import pl.sdacademy.data.AlbumParameter;
import pl.sdacademy.data.album;

public class AlbumCreator {
    // TODO: wykorzystaj pełne rozwiązanie polimofrizmu po poznaniu częsci zaawansowanej
    private final AlbumCreationParametersProvider parametersProvider;

    // TODO: sprawdź zachowanie jeżeli parametry pobierane z pliku (po części zaawansowanej)
    public AlbumCreator(AlbumCreationParametersProvider parametersProvider) {
        this.parametersProvider = parametersProvider;
    }

    public album create() {
        AlbumParameter parameter = parametersProvider.fetchAlbumParams();
        String albumName = parameter.getName();
        String selectedIndexes = parameter.getIndexes();

        String[] indexesStr = selectedIndexes.split(",");
        int[] indexes = new int[indexesStr.length];
        for (int i = 0; i < indexes.length; i++) {
            // TODO: obsłużyć wszystkie błędne z komunikatem i skończyć po sprawdzeniu całości - po poznaniu elementów zaawansowanych
            indexes[i] = Integer.valueOf(indexesStr[i]);
        }

        album album = new album();
        album.setName(albumName);
        for (int i = 0; i < indexes.length; i++) {
            album.addPhotos(getPhotoAt(indexes[i]));
        }
        return album;
    }
}
