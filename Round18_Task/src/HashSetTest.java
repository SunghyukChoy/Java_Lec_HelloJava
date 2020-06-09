import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.stream.Collectors;

public class HashSetTest {
	public static void main(String[] ar) {
		String[] strings = new String[] {"Kim", "Lee", "Park", "Kim", "Choi"};
		Set<String> sets = Arrays.asList(strings).stream().collect(Collectors.toSet());
		System.out.println("size = " + sets.size());
		for(String str : sets) {
			System.out.print(str + "\t");
		}
		System.out.println();
		System.out.println();
		Set<String> sets2 = new HashSet<>();
		sets2.add("Mun");
		sets2.add("Nam");
		sets.addAll(sets2);
		for(String str : sets) {
			System.out.print(str + "\t");
		}
		System.out.println();
		System.out.println();
		System.out.println("Contains Park ? " + sets.contains("Park"));
		System.out.println("sets empty ? " + sets.isEmpty());
		System.out.println();
		
		sets.removeAll(sets2);
		Iterator<String> iterator = sets.iterator();
		while(iterator.hasNext()) {
			System.out.print(iterator.next() + "\t");
		}
		System.out.println();
		System.out.println();
		
		sets2.add("Kim");
		sets2.add("Lee");
		sets2.add("Han");
		sets.retainAll(sets2);
		
		String[] results = new String[sets.size()];
		sets.toArray(results);
		for(String str : results) {
			System.out.print(str + "\t");			
		}
		System.out.println();
		System.out.println();
		
		sets.forEach(str -> System.out.print("forEach = " + str + "\t"));
	}
}