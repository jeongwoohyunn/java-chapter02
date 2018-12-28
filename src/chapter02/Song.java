package chapter02;

public class Song {
	private String title;
	private String artist; 
	private String album; 
	private String composer; 
	private int year; 
	private String track;
	public Song() {
		//디폴트 생성자 따로 만들어줘야된다.
	}
	public Song(String title,String artist) {
		this(title,artist,null,null,0,null);
		//초기화 코드
	}
	//중복되는 코드는 피해야된다.
	//source constructor field
	public Song(String title, String artist, String album, String composer, int year, String track) {
		this.title = title;
		this.artist = artist;
		this.album = album;
		this.composer = composer;
		this.year = year;
		this.track = track;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getAlbum() {
		return album;
	}

	public void setAlbum(String album) {
		this.album = album;
		//this를 떼면 파라미터가 우선 
		//this쓰면 heap에있는 자신에게 대입
	}

	public String getComposer() {
		return composer;
	}

	public void setComposer(String composer) {
		this.composer = composer;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getTrack() {
		return track;
	}

	public void setTrack(String track) {
		this.track = track;
	}

	public void show() {
		System.out.println(artist+" "+title+" ("+album+", "+year+", "+track+", "+composer+")");
	}
}
