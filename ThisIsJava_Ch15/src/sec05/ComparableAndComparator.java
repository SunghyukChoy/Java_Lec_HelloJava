package sec05;

public class ComparableAndComparator {
	public static void main(String[] args) {
		// TreeSet과 TreeMap의 자동 정렬 :
		// TreeSet의 객체와 TreeMap의 키는 저장과 동시에 자동 오름차순으로 정렬
		// 숫자(Integer, Double) 타입일 경우에는 숫자의 값으로 정렬
		// 문자열(String) 타입일 경우에는 유니코드로 정렬
		// TreeSet과 TreeMap은 정렬을 위해 java.lang.Comparable을 구현한 객체를 요구
		// - Integer, Double, String은 모두 Comparable 인터페이스를 구현한 클래스
		// -- Integer, Double, String 개체를 TreeSet에 저장한다던지 TreeMap에 저장할 때 키로 사용하게 되면
		// -- Integer, Double, String 클래스에서 구현한 Comparable 인터페이스의 메소드가 호출되어서 자동으로 오름차순 정렬이 됨
		// - Comparable을 구현하고 있지 않을 경우에는 저장하는 순간 ClassCastException 발생

		// 사용자 정의 객체를 정렬하고 싶을 경우
		// 방법 1 : 사용자 정의 클래스가 Comparable을 구현 (compareTo() 메소드)
		// 방법 2 : TreeSet, TreeMap 생성 시 Comparator 구현 객체 제공 (compare() 메소드)
	}
}