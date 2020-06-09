package class01;

public class TeamTest {
	public static void main(String[] ar) {
		Gamer g0 = new Gamer("신비", new int[] {10, 10, 10});
		Gamer g1 = new Gamer("은하", new int[] {9, 9, 10});
		Gamer g2 = new Gamer("예린", new int[] {9, 10, 8});
		
		Gamer g3 = new Gamer("소원", new int[] {10, 8, 9});
		Gamer g4 = new Gamer("엄지", new int[] {8, 7, 10});
		Gamer g5 = new Gamer("유주", new int[] {10, 10, 10});
		
		Team blue = new Team("bule", new Gamer[] {g0, g1, g2});
		Team white = new Team("white", new Gamer[] {g3, g4, g5});
		
		System.out.printf("%s -> %d점\n", blue.name, blue.teamScore());
		System.out.printf("%s -> %d점\n", white.name, white.teamScore());
		System.out.println();
		
		if (blue.teamScore() > white.teamScore()) {
			System.out.println("blue 승리");
		} else if (blue.teamScore() < white.teamScore()) {
			System.out.println("white 승리");
		} else
			System.out.println("무승부");		
	}
}
class Gamer {
	String name;
	int[] score;
	
	Gamer(String n, int[] s) {
		name = n;
		score = s;
	}
	int totalScore() {
		int sum = 0;
		for(int i = 0; i < score.length; i++) {
			sum +=score[i];
		} return sum;
	}
}
class Team {
	String name;
	Gamer[] members;
	
	Team(String n, Gamer[] g) {
		name = n;
		members = g;
	}	
	int teamScore() {
		int sum = 0;
		for(int i = 0; i < members.length; i++) {
			sum += members[i].totalScore();
		} return sum;
	}
}