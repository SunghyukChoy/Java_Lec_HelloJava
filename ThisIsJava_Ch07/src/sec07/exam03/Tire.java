package sec07.exam03;

public class Tire {
	//??
	public int maxRotaion;					//理? ???(??댁??紐)
	public int accumulatedRotation;			//?? ???
	public String location;					//??댁댁 ?移
	
	//??깆
	public Tire(String location, int maxRotation) {
		this.location = location;			//??댁댁 ?移 珥湲고
		this.maxRotaion = maxRotation;		//理? ??? 珥湲고
	}
	
	//硫??
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation < maxRotaion) {	//?? ??(?? < 理?)??寃쎌??ㅽ.
			System.out.println(location + "Tire ?紐 : " + (maxRotaion - accumulatedRotation) + "?");
			return true;
		} else {								//???(?? = 理?)??寃쎌??ㅽ
			System.out.println("***" + location + "Tire ???***");
			return false;
		}
	}
}
