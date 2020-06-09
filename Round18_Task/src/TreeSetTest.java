import java.util.SortedSet;
import java.util.TreeSet;
public class TreeSetTest {
	public static void main(String[] ar) {
		SortedSet<Integer> sets = new TreeSet<>();
		for(int n = 0; n < 5; n++) {
			int x = (int)(Math.random() * 100) + 1;
			sets.add(x);
		}
		
		sets.forEach(data -> System.out.print(data + "\t"));
		System.out.println();
		
		Integer first = sets.first();
		Integer last = sets.last();
		System.out.printf("first = %d, last = %d\n", first, last);
		
		SortedSet<Integer> tailSets = sets.tailSet(50);
		tailSets.forEach(data -> System.out.print(data + "\t"));		
	}	
}
