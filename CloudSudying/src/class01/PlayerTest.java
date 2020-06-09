package class01;

public class PlayerTest {
	public static void main(String[] ar) {
		int[] points0 = new int[] {10, 10, 9};
		int[] points1 = new int[] {10, 9, 9};
		int[] points2 = new int[] {10, 8, 8};
		
		Player p0 = new Player("신비", points0);
		Player p1 = new Player("은하", points1);
		Player p2 = new Player("예린", points2);
		
		Player[] players = new Player[] {p0, p1, p2};
		
		
		for(int i = 0; i < players.length; i++) {
			System.out.println(players[i].toString());
		}
	}
}

class Player {
	String name;
	int[] points;
	
	Player(String n, int[] p) {
		name = n;
		points = p;
	}
	int totalpoints() {
		int sum = 0;
		for(int i = 0; i < points.length; i++) {
		sum += points[i];
		} return sum;
	}
	public String toString() {
		return String.format("%s -> %d점", name, totalpoints());
	}
	
}