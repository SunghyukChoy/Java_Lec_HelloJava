package sec07.exam03;

public class HankookTire extends Tire {
	//??
	//??깆
	public HankookTire(String location, int maxRotaion) {
		super(location, maxRotaion);		
	}
	//硫??
	@Override	// 異???댁⑹ ?щ━?湲?????ъ?? roll() 硫??
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation < maxRotaion) {	//?? ??(?? < 理?)??寃쎌??ㅽ.
			System.out.println(location + "HankookTire ?紐 : " + (maxRotaion - accumulatedRotation) + "?");
			return true;
		} else {								//???(?? = 理?)??寃쎌??ㅽ
			System.out.println("***" + location + "Tire ???***");
			return false;
		}		
	}
}