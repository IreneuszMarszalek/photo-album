package pl.sdacademy.data;

public class AlbumParameter {
    private final String name;
    private final String indexes;

    public AlbumParameter(String name, String indexes) {
        this.name = name;
        this.indexes = indexes;
    }

    public String getName() {
        return name;
    }

    public String getIndexes() {
        return indexes;
    }
}
