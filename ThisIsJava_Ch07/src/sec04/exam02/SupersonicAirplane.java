package sec04.exam02;

public class SupersonicAirplane extends Airplane {
	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2;
	
	public int flymode = NORMAL;
	
	@Override
	public void fly() {
		if(flymode == SUPERSONIC) {
			System.out.println("珥??鍮??⑸??");
		} else {
			//Airplane 媛梨? fiy() 硫?? ?몄?
			super.fly();
		}
		
		
	}
}
