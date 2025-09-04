package learnJava;

public class LearnJava {
	
	public static void main(String[] args) {
		int tet = 5;
		String test = "hello! World";
		double price = 88.6;
		boolean isTrue = true;
		char get = 'd';
		float price2 = 55.254f;
		int[] numbers = {1,2,3,4,5,6,7,8,9,10,55,556,2};
		
		System.out.printf("-- %d \n", tet);
		System.out.println("----" + tet);
		System.out.println(tet);
		System.out.println("Text: " + test);
		System.out.printf("Price: %.3f ", price);
		System.out.println("---"+isTrue);
		System.out.printf("Price 2 : %f \n", price2);
		System.out.println(numbers[5]);
		System.out.println(get);
		
		if(tet == 5) {
			System.out.println("sdmsdn b");
		}
		
		for (int i = 0; i < numbers.length ; i++) {
			
			System.out.printf(" Index %d: %d \n", i+1 , numbers[i]);
			
		}
	}
}
