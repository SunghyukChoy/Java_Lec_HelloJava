package sec07.exam03;

public class KumhoTire extends Tire	{
	//??
	//??깆
	public KumhoTire(String location, int maxRotation) {
		super(location, maxRotation);
	}
	//硫??
	@Override	// 異???댁⑹ ?щ━?湲?????ъ?? roll() 硫??
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation < maxRotaion) {	//?? ??(?? < 理?)??寃쎌??ㅽ.
			System.out.println(location + "KumhoTire ?紐 : " + (maxRotaion - accumulatedRotation) + "?");
			return true;
		} else {								//???(?? = 理?)??寃쎌??ㅽ
			System.out.println("***" + location + "Tire ???***");
			return false;
		}		
	}
}
