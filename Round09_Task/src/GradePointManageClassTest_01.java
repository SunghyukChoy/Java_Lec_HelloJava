class GradePoint_01 {
	String name;		//이름	
	byte gradeNumber;	//학년
	short classNumber;	//반
	int positionNumber;	//번호
	int[] subject = new int[4];	// 국어, 영어, 수학, 총점
	float avg;			//평균
	int rank;			//반석차
	char grade;			//학점

	// 데이터를 저장하는 필드 선언
	
	void calculation() {
		for (int n = 0; n < 3; n++) {
			subject[subject.length - 1] += subject[n];
		}
		avg = subject[subject.length - 1] / 3.0f;
	} // 행위를 저장하는 메소드 선언
	
}

public class GradePointManageClassTest_01 {
	public static void main(String[] ar) {
		GradePoint_01 gp = new GradePoint_01();
		
		
		System.out.println(gp.avg);
	}
}
