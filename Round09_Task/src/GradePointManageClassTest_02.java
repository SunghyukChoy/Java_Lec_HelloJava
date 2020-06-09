class GradePoint_02 {
	String name;		//이름	
	byte gradeNumber;	//학년
	short classNumber;	//반
	int positionNumber;	//번호
	int[] subject = new int[4];	// 국어, 영어, 수학, 총점
	float avg;			//평균
	int rank;			//반석차
	char grade;			//학점
	
	/* 생성자들 */
	GradePoint_02 () {
		name = "";
		rank = 1;
	}
	GradePoint_02(String name, int rank) {
		this.name = name;
		this.rank = rank;
	}
	
	/*멤버 메소드들*/
	void calculation() {
		for(int n = 0; n < 3; ++n) {
			subject[subject.length - 1] += subject[n];
		}
		avg = subject[subject.length - 1] / 3.0f;
	}
	
	/* 내부 클래스들 */
	class SubjectName {
		String[] subjectNmae = {"국어", "영어", "수학"};
		String getSubjectName(int x) {
			return subjectNmae[x];
		}
	}
}
	
public class GradePointManageClassTest_02 {
	public static void main(String[] ar) {
		
	}
}
