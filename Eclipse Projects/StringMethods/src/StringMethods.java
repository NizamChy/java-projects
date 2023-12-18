
public class StringMethods {

	public static void main(String[] args) {
		
		// String = a reference data type that can store one or more characters
		//          reference data types have access to useful methods
		
		String name = "Nizam";
		
//		boolean result = name.equals("Nizam");
//		boolean result = name.equalsIgnoreCase("Nizam");
// 		int result = name.length();
//		char result = name.charAt(0);
// 		int result = name.indexOf("N");
//		boolean result = name.isEmpty();
//		String result = name.toUpperCase();
//		String result = name.toLowerCase();
//		String result = name.trim(); [to remove empty space]
		String result = name.replace('z', 'Z');
		System.out.println(result);

	}

}
