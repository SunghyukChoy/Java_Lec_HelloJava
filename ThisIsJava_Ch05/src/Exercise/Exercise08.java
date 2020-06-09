package Exercise;

public class Exercise08 {

	public static void main(String[] args) {
		int[][] array = {
				{95, 86},					//1행 [0][0] , [0][1]
				{83, 92, 96},				//2행 [1][0], [1][1], [1][2]	
				{78, 83, 93, 87, 88}		//3행 [2][0] ~ [2][4]
		};
		int sum = 0;
		double avg = 0.0;
		
		
		int count = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				sum += array[i][j];
				count++;
			}
		}
		
		
		avg = (double) sum / count;
		
		
		System.out.println("sum = " + sum);
		System.out.println("avg = " + avg);

	}

}
