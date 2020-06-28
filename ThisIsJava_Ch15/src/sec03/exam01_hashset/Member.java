package sec03.exam01_hashset;

import java.util.Objects;

// hashCode()와 equals() 메소드 재정의
public class Member {
	public String name;
	public int age;

	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public boolean equals(Object obj) { // name과 age 값이 같으면 true를 리턴
		if (obj instanceof Member) { // 매개변수 obj가 Mamber 타입이면
			Member member = (Member) obj; // Member로 타입 변환.
			return member.name.equals(name) && (member.age == age);
		} else {
			return false;
		}
	}

	@Override
	public int hashCode() { // name과 age 값이 같으면 동일한 hashCode가 리턴
		return name.hashCode() + age;
		// String의 hashCode() 이용
		// return Objects.hash(name, age);
	}
}
