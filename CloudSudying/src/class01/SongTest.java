package class01;

public class SongTest {
	public static void main(String[] ar) {
		Song s0 = new Song("WhiteGlass", "Eunha", 2015);
		Song s1 = new Song("Rough", "SinB", 2016);
		Song s2 = new Song("LoveWhisper", "Sowon", 2018);
		Song s3 = new Song();
		
		s3.name = "Fever";
		s3.composer = "Yerin";
		s3.year = 2019;

		// 객체를 배열화
		Song[] songs = new Song[] { s0, s1, s2, s3 };

		for (int i = 0; i < songs.length; i++) {
			System.out.println(songs[i].toString());
		}
	}
}

class Song {
	String name;
	String composer;
	int year;

	Song() {

	}

	Song(String _name, String _composer, int _year) {
		name = _name;
		composer = _composer;
		year = _year;
	}

	public String toString() {
		return String.format("[Song] 제목 : %s, 작곡 : %s, 발매년도 : %s", name, composer, year);
	}
}

