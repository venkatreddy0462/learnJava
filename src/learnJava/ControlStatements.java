package learnJava;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.Scanner;

class car{
	String brand;
	String color;
	int speed;
	int noOfWheels;
	
	car(){	
	}
	
	car(String brand, String color, int s, int n){
		this.brand = brand;
		this.color = color;
		speed = s;
		noOfWheels = n;
	}
	
	void display() {
		System.out.println(brand);
		System.out.println(color);
		System.out.println(speed);
		System.out.println(noOfWheels);
	}
	
	void display(String brand, String color) {
		System.out.println(brand);
		System.out.println(color);
	}
	
	void display(String brand, String color, int speed) {
		System.out.println(speed);
		System.out.println(color);
		System.out.println(brand);
	}
	
	String brandName() {
		return brand;
	}
}

class Factorial {
	int fact1(int n) {
		int result;
		if(n==1) return 1;
		result = fact1(n-1)*n;
		return result;
	}
}

class Fibonacci{
	long fib(int n) {
		
		if(n <= 1) return n;
		return fib(n-1) + fib(n-2);
		
	}
}

public class ControlStatements {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		StringBuilder fullName = new StringBuilder();
		
		System.out.println("Enter Name");
		
		fullName.append(sc.nextLine());
		
		System.out.println(fullName);

		System.out.println("Enter TExt To Add To FullName");
		
		fullName.append(" ");
		
		fullName.insert(fullName.length(), sc.nextLine());
		
		System.out.println(fullName);
		
		System.out.println("Enter OFFset Start and End and String to replace");
		
		
		fullName.replace(sc.nextInt(), sc.nextInt(), sc.nextLine());
		
		System.out.println(fullName);
		
		fullName.delete(0, 1);
		
		System.out.println(fullName);
		
		System.out.println("Set the char at :");
		
		fullName.setCharAt(sc.nextInt(), (char) );
		
		/*
		int[] arr = {5,3,5,2,8,6,4,4,5};
		System.out.println("Enter Number to find:");
		int fi = sc.nextInt();
		
		int max = arr[0];
		int min = arr[0];
		int sum = 0;
		double avg = 0.000;
		int[] reverseArr = new int[arr.length];
		
		String find = "";
		
		for(int i : arr) {
			if(i>max) {
				max = i;
			}
			if(i<min) {
				min = i;
			}
			sum += i;
			
			
		}
		
		System.out.println("reversed Array");
		for(int j=0;j<arr.length;j++) {
			reverseArr[j] = arr[arr.length-1-j];
			System.out.printf(""+reverseArr[j]);
			if(fi == arr[j]) {
				find = "Found at " + (j+1); 
			}
			
		}
		avg = (double)sum/arr.length;
		
		System.out.printf("\n\nMaximum inArray: "+max+"\n\nMinimum in Array: "+min+"\n\nSum of Elements in Array: "+sum 
				+"\n\nAverage of elements in Array: "+avg+"\n\n"+find);
		
		
		
		/*
		
		List<List<String>> listOfObjects = Arrays.asList(
				Arrays.asList("Venkat","Rikhith","Srinivas","Manjula"),
				Arrays.asList("Chitti", "Aishu"),
				Arrays.asList("Srivani","Shivani","KAvyaG","KavyaS")
				);
		
		Set<String> intermediateResults = new HashSet<>();
		
		List<String> result = listOfObjects.stream()
				.flatMap(List::stream)
				//.filter(s -> s.startsWith("V"))
				.map(String::toUpperCase)
				.distinct()
				.sorted()
				.peek(s -> intermediateResults.add(s))
				.collect(Collectors.toList());
		
		System.out.println("Intermediate Results:");
		intermediateResults.forEach(System.out::println);
		
		System.out.println("\n final result:");
		result.forEach(System.out::println);
		
		String text = result.stream().reduce("", (a,b) -> a+" "+b);
		System.out.printf("\nReduced List and Concatinated \n\n"+text.trim());
		
		
		
		/*
		//traversing arrays
		int[] arr = {1,2,3,4,5,6,7,8,9};
		String[] words = {"Venat","Varsha", "Chitti","Bapu","Aishu"};
		
		for(int i = 0; i < arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		for (String name: words) {
			System.out.println(name);
		}
		int i = 0;
		while(i<arr.length) {
			System.out.printf(""+arr[i]);
			i++;
		}
				
		
		  
		//Fibonacci Sequence
		Fibonacci fibonacci =  new Fibonacci();
		
		int num = sc.nextInt();
		for(int i =0; i < num;i++) {
			System.out.println(fibonacci.fib(i)+" ");
		}
		
		
		// Factorial problem
		///
		Factorial fact = new Factorial();
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" Enter Number");
		int num = sc.nextInt();
		System.out.println("Factorial of: "+ num +" 3is "+fact.fact1(num));
		
		
		//method overloading
		
		car car1 = new car("Tata","Red", 150,4);
		car car2 = new car("BMW","White",250,6);
		car car3 = new car("Volvo","Black",180,4);
		car car4 =  new car();
		
		car4.brand = "Ferari";
		car4.color = "Blue";
		car4.speed = 300;
		car4.noOfWheels = 4;
		
		//car1
		car1.display();
		System.out.println("-----");
		car1.display(car1.brand, car1.color);
		System.out.println("------");
		car1.display(car1.brand, car1.color, car1.speed);
		System.out.println("------");
		
		//car2
		car2.display();
		
		//car3
		car3.display();
		
		//car4
		car4.display();
		
		//Switch Control Statements
		
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter Two numbers");
		int i = sc.nextInt();
		int j = sc.nextInt();
		
		System.out.println("Select one \n 1 for Addition \n 2 for Sub \n 3 for Mul \n 4 for Div \n 5 tp Cancel");
		int a = sc.nextInt();

		
		
		
		switch(a){
		case 1:
			System.out.println(i+j);
			break;
		case 2:
			System.out.println(i-j);
			break;
		case 3:
			System.out.println(i*j);
			break;
		case 4:
			System.out.println(i/j);
			break;
		case 5:
			break;
		}
		
		
		//While loop
		int whi = sc.nextInt();
		while(whi<98) {
			System.out.println(whi);
			whi++;
		}
		
		
		//Do While Loop
		///
		int wha = sc.nextInt();
		
		do {
			if(wha%2 == 0) {
				System.out.println(wha);
			}
			wha++;
		}while(wha<98);
		
		//For loop
		
		int loof = sc.nextInt();
		
		for(int g = loof;g <1000;g++) {
			System.out.println("fhdhg");
		}
		
		*/

	}

}
