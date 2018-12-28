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
		
		Song song2 = new Song("Love Shot","EXO",null,null,0,null);
		song2.show();
		
		Song song3 = new Song("Tempo","EXO");
		song3.show();//생성자 오버로딩
	}

}
