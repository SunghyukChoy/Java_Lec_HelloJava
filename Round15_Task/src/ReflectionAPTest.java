import java.lang.reflect.Field;
import java.lang.reflect.Method;
//이해 안 됨. 현재수준에서 어려움.
public class ReflectionAPTest {
	public static void main(String[] ar) throws Exception {
		Class obj = Class.forName("java.lang.String");
		Field[] fields = obj.getFields();
		Method[] methods = obj.getMethods();
		
		System.out.println("class = " + obj.getName());
		System.out.println("/* Fields */");
		for(Field field : fields) { 
			System.out.println(field.getType().getName() + " " + field.getName());
		}
		System.out.println("/*Methods*/");
		for(Method method : methods) {
			System.out.println(method.getReturnType().getName() + " " + method.getName()
			+ "() {...}"); 
		}
	}
}
