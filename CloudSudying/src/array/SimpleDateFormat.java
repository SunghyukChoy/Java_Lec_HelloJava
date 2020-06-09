// 강의 동영상 없음. 구글 검색 자바 split

package array;

public class SimpleDateFormat {
	public static void main(String[] args) {
		String date = new String("2017-10-04");
		String dateElements[] = date.split("-");
		System.out.printf("%s년 %s월 %s일\n", dateElements[0], dateElements[1], dateElements[2]);
		for (int i = 1; i < dateElements.length; i++) {
			if (10 > Integer.parseInt(dateElements[i]) && dateElements[i].contains("0")) {
				dateElements[i] = dateElements[i].replace("0", "");
			}
		}
		System.out.printf("%s. %s. %s.\n", dateElements[0], dateElements[1], dateElements[2]);
	}
}