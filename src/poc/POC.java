package poc;

public class POC {

	public static void main(String[] args) {
		
		String fieldName = "PAT_NBR_ID";
		String fieldLowerCase = fieldName.toLowerCase();
		System.out.println(fieldName.toLowerCase());
		System.out.println(fieldLowerCase.substring(0, 1).toUpperCase() + fieldLowerCase.substring(1));
		
		POC poc = new POC();
		String methodName = "get" + "HelloWorld";
	}
	
	public void getHelloWorld() {
		System.out.println("Hello World!!!");
	}
}
