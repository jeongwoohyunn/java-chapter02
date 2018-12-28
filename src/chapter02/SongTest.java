package chapter02;

public class SongTest {

	public static void main(String[] args) {
		Song song =  new Song();
		song.setTitle("좋은날");
		song.setArtist("아이유");
		song.setComposer("이민수 작곡");
		song.setYear(2010);
		song.setAlbum("Real");
		song.setTrack("3번 track");
		song.show();
	}

}
