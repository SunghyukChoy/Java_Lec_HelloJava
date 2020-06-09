package class01;

public class EmployeeTest {
	public static void main(String[] ar) {
		int[] hours0 = new int[] {8,8,8,8,8};
		int[] hours1 = new int[] {9,9,9,9,9};
		int[] hours2 = new int[] {10,10,10,10,10};
		
		Employee e0 = new Employee("작업자0", hours0);
		Employee e1 = new Employee("작업자0", hours1);
		Employee e2 = new Employee("작업자0", hours2);
		
		Employee[] employees = new Employee[] {e0, e1, e2};
		
		for (int i = 0; i < employees.length; i++) {
			System.out.println(employees[i].toString());			
		}
	}
}
class Employee {
	String name;
	int[] hours;
	
	Employee(String n, int[] h) {
		name = n;
		hours = h;
	}
	int totalHours() {
		int sum = 0;
		for(int i = 0; i < hours.length; i++) {
			sum += hours[i];
		} return sum;		
	}
	public String toString() {
		return String.format("%s -> %d시간", name, totalHours());
	}
}