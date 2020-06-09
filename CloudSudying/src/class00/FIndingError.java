package class00;

// 출력 예 : 주인님! 저는 망고이구, 3살이에요.
public class FIndingError {
	  public static void main(String[] args){
		    Dog dog1=new Dog(); 
		    dog1.setName("망치"); 
		    dog1.setAge(4);     
		    dog1.name = "댕댕이";  
		    dog1.age = 40;
		    dog1.print();
		  }
		}
		class Dog{
		  String name;  
		  int age;   
		  void setName(String n){
		    name = n;
		  }
		  void setAge(int a){
		    age = a;
		  }
		  void print() {
		    System.out.printf("주인님! 저는 %s이구, %d살이에요.\n", name, age);
		  }
		}

