package class01;

public class FishBreadTest {
	  public static void main(String[] args) {
	    // 객체 배열 생성
//	    FishBread[] breads = new FishBread[7];
	    FishBread[] breads = new FishBread[7];
	    
	    // 난수 생성(1 ~ 7)
//	    int randNum = 1 + (int) (Math.random() * breads.length);
	    int randNum = 1 + (int) (Math.random() * breads.length);
	    // 객체 생성 및 배열에 할당
//	    for (int i = 0; i < randNum; i++) {
//	      breads[i] = new FishBread();
//	    }
	    for (int i = 0; i < randNum; i++) {
	    	breads[i] = new FishBread();
	    }
	    
	    // 모든 객체 정보 출력
	    for (int i = 0; i < FishBread.count; i++) {
	      System.out.println(breads[i].toString());
	    }
	  }
	}

	class FishBread {
	  // 인스턴스 변수(non-static 필드)
	  String contents;  // 내용물
	  
	  /* 1. 클래스 변수(static 필드)로 만드시오. */
	  static int count; // 붕어빵 객체 수
	  
	  // 생상자
	  public FishBread() {
	    contents = randomContents();
	    
	    /* 2. 붕어빵 객체 수를 증가시키시오. */
	    count += 1;
	  }
	  
	  // 메소드
	  public String randomContents() {
	    String[] arr = {"팥", "고구마", "치즈", "슈크림"};
	    int idx = (int) (Math.random() * arr.length); // 0 ~ 3
	    return arr[idx]; // 팥 or 고구마 or 치즈 or 슈크림
	  }
	  
	  public String toString() {
	    return String.format("[%s] 붕어빵", contents);
	  }
	}