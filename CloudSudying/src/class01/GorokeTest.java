package class01;

public class GorokeTest {
	public static void main(String[] ar) {
		Goroke gr1 = new Goroke("피자", 1000);
		Goroke gr2 = new Goroke("야채", 800);
		Goroke gr3 = new Goroke();
		gr3.name = "팥";
		gr3.price = 500;

		System.out.println(gr1.toString());
		System.out.println(gr2.toString());
		System.out.println(gr3.toString());

	}
}

class Goroke {
	String name;
	int price;

	Goroke() {

	}

	Goroke(String _name, int _price) {
		name = _name;
		price = _price;
	}

	public String toString() {
		return String.format("Goroke { name: %s, price : %d원}", name, price);
	}
}
