/**
 * Album represents an audio production by an artist
 */
public class Album{
	// TODO: add member variables
	private String artist;
    private String album;

	public Album(String nArtist, String nAlbum){
		// TODO: complete constructor
		this.artist = nArtist;
        this.album = nAlbum;
	}

	public Album(String albumString){
		// TODO: complete constructor
		String[] parts = albumString.split(" - ");
        // Assuming the format is always "artist - album"
        if (parts.length == 2) {
            this.artist = parts[0];
            this.album = parts[1];
        } 
	
}

	@Override
	public String toString(){
		// TODO: print as "artist - album"
		return artist + " - " + album;
		
	}

	@Override
	public boolean equals(Object o){
		// TODO: check what o is.  Then check o has same values.
		if (this == o){
		return true;
		}

		if (o instanceof Album){
        Album albumObj = (Album) o;
        return artist.equals(albumObj.artist) && album.equals(albumObj.album); 
		}
		
		return false;
    
}


	public String getArtist() {
		// TODO: return artist name
		return artist;
	}

	public String getAlbum() {
		// TODO: return album name
		return album;
	}
}
	
