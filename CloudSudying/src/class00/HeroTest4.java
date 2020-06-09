package class00;

public class HeroTest4 {
	public static void main(String[] ar) {
		Hero4 eunha = new Hero4("은하", 100);
		Hero4 sinb = new Hero4();
		sinb.name = "신비";
		sinb.hp = 100;
		Hero4 sowon = new Hero4("소원", 100);
		
	
		
		sinb.AttackEunha(eunha);
		eunha.AttackSinB(sinb);
		sinb.AttackEunha(eunha);
		eunha.AttackSinB(sinb);
		sinb.AttackEunha(eunha);
		eunha.AttackSinB(sinb);
		sowon.Heal(eunha);
				
	}
}
class Hero4 {
	String name;
	int hp;
	Hero4() {
		
	}
	
	Hero4(String _name, int _hp) {
		name = _name;
		hp = _hp;
	}
	
	void AttackEunha(Hero4 ar) {
		ar.hp -= 20;
		System.out.printf("[%s의 펀치!!] -> [%s]의 hp : %d\n", name, ar.name, ar.hp);
	}
	void AttackSinB(Hero4 ar) {
		ar.hp -= 15;
		System.out.printf("[%s의 펀치!!] -> [%s]의 hp : %d\n", name, ar.name, ar.hp);
		
	}
	void Heal(Hero4 ar) {
		ar.hp += 10;
		System.out.printf("[%s의 치료!!] -> [%s]의 hp : %d\n", name, ar.name, ar.hp);
	}
	
}
