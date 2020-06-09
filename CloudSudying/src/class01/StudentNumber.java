package class01;

public class StudentNumber {
	  public static void main(String[] args) {
	    Student a = new Student("Tom");
	    Student b = new Student("John");
	    Student c = new Student("Kate");
	     
	  }
	}
	class Student {
	  /* 클래스 변수를 활용하여 총 학생수를 출력하도록 하시오 */
	  int count = 0;
	  String name;
	  
	  Student(String name) {
	    this.name = name;
	  }  
	}

	
	
	
