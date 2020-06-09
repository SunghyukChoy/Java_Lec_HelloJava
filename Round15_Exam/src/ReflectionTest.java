import java.lang.reflect.*;
public class ReflectionTest {
	
	public static void main(String[] ar) throws Exception {
		Class obj = Class.forName("com.minek.Mk");
		Field[] fields = obj.getFields();
		Method[] methods = obj.getMethods();
		
		for(int i = 0; i < fields.length; i++) {
			System.out.println(fields[i].getType().getName() + " : " + fields[i].getName());  			
		}
		System.out.println();
		for (int i = 0; i < methods.length; i++) {
	 		System.out.println(methods[i].getReturnType().getName() + " : " + methods[i].getName()); 
		}
	}
}	