package javaPrcatice.ch_13;
class Song {
	String title; // 노래 제목
	String artist; // 가수
	int length; // 곡의 길이(단위 : 초)
	Song(){}
	Song(String title){
		this(title, null, 0);
	}
	Song(String title, String artist){
		this(title, artist, 0);
	}
	Song(String title, String artist, int length){
		this.title = title;
		this.artist = artist;
		this.length = length;
	}
	public String toString() {
		return "Song{title='" + title + "', artist='" + artist + "', length='" + length + "'}";
	}
}
public class Ex_02 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**/
		Song song1 = new Song("Outward Bound", "Nana", 180);
		Song song2 = new Song("Jambalua", "Carpenters");
		Song song3 = new Song("Yesterday");
		Song song4 = new Song();
		
		System.out.println(song1);
		System.out.println(song2);
		System.out.println(song3);
		System.out.println(song4);
	}

}
