package exercise.no03;

public class SoundableExample {
	private static void printSound(Soundable soundable) {
		System.out.println(soundable.sound());
	}
	
	public static void main(String[] ar) {
		printSound(new Cat());
		printSound(new Dog());
	}
}

