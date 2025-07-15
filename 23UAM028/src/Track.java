public class Track {
	int track_id;
	String title;
	int album_id;
	int artist_id;
	
	public Track(int track_id, String title, int album_id, int artist_id) {
		this.track_id = track_id;
		this.title = title;
		this.album_id = album_id;
		this.artist_id = artist_id;
	}

	@Override
	public String toString() {
		return "Track [track_id=" + track_id + ", title="+ title + ", album_id=" + album_id + ", artist_id=" +artist_id +"]";
	
	}

	public int getTrack_id() {
		return track_id;
	}

	public void setTrack_id(int track_id) {
		this.track_id = track_id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getAlbum_id() {
		return album_id;
	}

	public void setAlbum_id(int album_id) {
		this.album_id = album_id;
	}

	public int getArtist_id() {
		return artist_id;
	}

	public void setArtist_id(int artist_id) {
		this.artist_id = artist_id;
	}
	
}