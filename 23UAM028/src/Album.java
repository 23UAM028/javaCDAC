

public class Album {
	
	int album_id;
	String title;
	
	public Album(int album_id, String title) {
		this.album_id = album_id;
		this.title = title;
	}

	@Override
	public String toString() {
		return "Album [album_id=" + album_id + ", title=" + title +"]";
	}

	public int getAlbum_id() {
		return album_id;
	}

	public void setAlbum_id(int album_id) {
		this.album_id = album_id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	
	
}