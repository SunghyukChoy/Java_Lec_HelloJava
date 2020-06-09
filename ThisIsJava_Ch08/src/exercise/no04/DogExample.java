package exercise.no04;

public class DogExample {
	public static void dbWork(DataAccessObject dao) {
		
	}
	
	public static void main(String[] ar) {
		dbWork(new OracleDao());
		dbWork(new MySqlDao());
	}
}
