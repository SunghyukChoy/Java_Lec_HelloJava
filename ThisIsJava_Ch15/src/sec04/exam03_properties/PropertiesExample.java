package sec04.exam03_properties;

import java.io.FileReader;
import java.net.URLDecoder;
import java.util.Properties;

public class PropertiesExample {
	public static void main(String[] args) throws Exception {
		// Properties :
		// 키와 값을 String 타입으로 제한한 Map 컬렉션
		// Properties는 프로퍼티(~.properties) 파일을 읽어 들일 때 주로 사용한다.

		// 프로퍼티(~.properties) 파일 :
		// 애플리케이션의 옵션 정보, 데이터베이스 연결 정보, 국제화(다국어)정보를 기록한 텍스트 파일로 활용
		// 애플리케이션에서 주로 변경이 잦은 문자열을 저장해서 유지 보수를 편리하게 만들어 줌
		// 키와 값이 '='기호로 연결되어 있는 텍스트 파일로 ISO 8859-1 문자셋으로 저장
		// 한글은 유니코드로 변환되어 저장

		// Properties 객체 생성
		// 1. 파일 시스템 경로를 이용
		// Properties properties = new Properties();
		// properties.load(new FileReader("C:/~/database.properties"));
		// FileReader : 파일을 읽어들이는 객체. FileReader()의 매개변수는 프로퍼티 파일 경로

		// 2. ClassPath를 이용
		// (자바 코드가 있는 디렉토리, 클래스.class가 있는 디렉토리에 ~.properties가 있는 경우를 의미함)
		// String path = 클래스.class.getResource("database.properties").getPath();
		// 파일 경로를 얻어냄
		// path = URLDecoder.decode(path, "utf-8"); // 경로에 한글이 있을 경우 한글을 복원
		// Properties properties = new Properties();
		// properties.load(new FileReader(path));

		// String path = 클래스.class.getResource("config/database.properties").getPath();
		// 클래스와 properties 파일의 위치가 다를 경우 properties 파일의 경로를 넣어줌

		// 값 읽기
		// String value = properties.getProperty("key");

		Properties properties = new Properties();
		String path = PropertiesExample.class.getResource("database.properties").getPath();
		// 클래스와 같은 경로에 있는 프로퍼티 파일.
		path = URLDecoder.decode(path, "utf-8"); // 한글 복원. 예외 발생 가능하므로 throws
		properties.load(new FileReader(path));

		String driver = properties.getProperty("driver"); // 매개변수로 키를 넣고 값을 받아옴.
		String url = properties.getProperty("url");
		String username = properties.getProperty("username");
		String password = properties.getProperty("password");

		System.out.println("driver : " + driver);
		System.out.println("url : " + url);
		System.out.println("username : " + username);
		System.out.println("password : " + password);

	}
}
