class Animal {
	public String name = "abc";
	public String cry = "default";
	public void cry() {
		System.out.println("울다");
	}
}

class Cat extends Animal {
	public int xx = 300;
	public void cry() {
		System.out.println("xx = " + xx);
		// xx가 Cat의 필드이므로 Animal에서는 볼 수 없지만(ani는 Animal클래스 객체) cry()가 실행되면서 그 내부의 것들은 볼 수 있다.
		System.out.println("야옹");
	}
}
class Dog extends Animal {
	public int yy = 500;
	public void cry() {
		System.out.println("yy = " + yy);
		System.out.println("멍멍");
	}
}	
	//부모가 하나로 같지만 습성이 조금 달라서 클래스를 확장해서 나눔
	//다양한 속성을 가진 클래스들이 늘어났는데 대신에 관리는 부모이름으로 할 수 있도록 하겠다 -> 다형성

public class PolyTest {
	public static void addDisplay(Animal ani) {
		// 클래스에 따라 다른 동작을 수행하고자 할 떄...	
		if(ani instanceof Cat) { //ani가 Cat의 인스턴스라면
			System.out.println("얘는 고양이과입니다");
		} else if (ani instanceof Dog) { // ani가 Dog의 인스턴스라면
			System.out.println("얘는 개과입니다");
		}
		ani.cry();
	}
	
	public static void main(String[] ar) {
		Animal[] ani = new Animal[10];
		ani[0] = new Cat();
		ani[1] = new Cat();
		ani[2] = new Dog();		
		//부모의 객체에 속성이 다른 자식 클래스들을 대입시킨다. 이러한 속성이 다형성
		
		for (int i = 0; i < ani.length; i++) {
			if(ani[i] == null) {
				continue;	//ani의 i번째 공간이 비어있으면 건너뛰어라.				
			}
			System.out.println();
			ani[i].cry();
			addDisplay(ani[i]);
					
			System.out.println(ani[i].name);	//출력 가능
			System.out.println(ani[i].cry);		//출력 가능
		//	System.out.println(ani[i].xx);		//출력 불가능
		//	System.out.println(ani[i].yy);		//출력 불가능
				//ani는 Animal클래스의 객체이므로 실제로 보이는 건 name, cry, cry()뿐
				//Cat,Dog 클래스에서 선언산 필드, 메소드 등은 보이지 않음
		//	ani[i].cry();가 보인 이유는 동일한 이름으로 오버라이딩 되었기 때문에 
		//	오버라이딩 규칙이 적용되어 하위에 있는 메소드가 실행된 것.
			
		} 
	}	/*부모이름으로 객체를 만들어서 그곳에 자식들을 대입. 
	 공간이 중요한 것이 아니라 실제 대입된 것이 무엇이냐에 따라 객체가 실제로 갖고 있는 메모리상의 공간은 
	 대입된 놈의 메모리로 만들어진다 ---> 다형성에서의 가장 큰 특징 
	 다양한 표현법을 주기 위해 부모의 이름으로 관리는 편리하게 하되 대입되는 자식에 따라서 여러가지 
	 다양한 표협을 해줄 수 있다 */
}

