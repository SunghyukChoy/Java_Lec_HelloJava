public class GenericTest6 {
	public static <K, V> void display(K key, V value) {
		System.out.println("key = " + key + ", value = " + value);
	}
	public static <K, V> V display2(K key, V value) {
						// value를 리턴하겠다. value의 클래스형 V 기재.	
		System.out.println("key = " + key + ", value = " + value);
		return value;
	}	
	public static void main(String[] ar) {
		GenericTest6.<Integer, String>display(10,"신비");
			//Integer와 String을 토대로 호출하겠다.
			//객체명.<클래스형들>메소드명(매개변수값)
		GenericTest6.display(12.34, 20);
			//<클래스형들> 생략 가능. 컴파일러가 알아서 판단.
		GenericTest6.<Double, Integer>display(12.34, 20);		
			// 위 코드와 동일.
		GenericTest6.display(false, 'a');	
		
		Double result = GenericTest6.<Integer, Double>display2(50, 34.56);
		//GenericTest6.<Integer, Double>display2(10, 12.34);의 리턴값인 12.34를 result에 대입.
		System.out.println("result = " + result); 
	}
}