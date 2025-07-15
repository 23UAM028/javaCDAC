public class Artist {
	int artist_id;
	String name;
	
	public Artist() {
		this(0,null);
	}
	
	public Artist(int artist_id, String name) {
		this.artist_id = artist_id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Artist [artist_id=" + artist_id + ", name=" + name +"]";
	}

	public int getArtist_id() {
		return artist_id;
	}

	public void setArtist_id(int artist_id) {
		this.artist_id = artist_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
}