import java.util.Arrays;

public class AlbumArrayList extends AlbumList {
    private Album[] albums; // The array to store albums
    private int size; // Number of albums currently in the list
    
    // Constructor
    public AlbumArrayList() {
        // Initialize the array and size
        albums = new Album[2];
        size = 0;
    }

    public AlbumArrayList(int i) {
        // Initialize the array and size
        albums = new Album[i];
        size = 0;
    }
    
    // Add an album
    @Override
    public void add(Album album) {
        // Check if array needs resizing and add album
        if (album.getArtist() == null || album.getAlbum() == null ){
            return;
        }
        if (size == albums.length){
            resize();
        }
        albums[size++] = album;
    }
    
    // Remove an album
    @Override
    public Album remove(int index) {
        // Remove album at index and return it
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        Album albumToRemove = albums[index];
        for (int i = index; i < size - 1; i++) {
            albums[i] = albums[i + 1];
        }
        size = size-1;
        albums [size] = null;
        return albumToRemove;
    }

    @Override
    public Album remove(Album targetA) {
        for (int i = 0; i < size; i++) {
            if (albums[i].equals(targetA)) {
                return remove(i);
            }
        }
        return null; // Return null if the album was not found
    }
    
    // Get album at a particular index
    @Override
    public Album get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        return albums[index];
    }
    
    @Override
    public void set(int idx, Album newA){
        if (idx < 0 || idx >= size){
            throw new IndexOutOfBoundsException("Index: "+ idx + ", Size: "+ size);
        }
        albums[idx] = newA;
    }
    public int size(){
        return this.size;
    }


    // Other methods from AlbumList abstract class...
    
    // Private helper method to resize the array
    private void resize() {
        int newCapacity = albums.length * 2;
        albums = Arrays.copyOf(albums, newCapacity);
    }
    
    // Main method for testing
    public static void main(String[] args) {
        // Test AlbumArrayList here
        AlbumArrayList list = new AlbumArrayList();
    }
}
