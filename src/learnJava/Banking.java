package learnJava;
import java.util.Scanner;

class Account {
	Scanner sc = new Scanner(System.in);
	int num;
	private String name;
	private String adress;
	private long mobile;
	private int balance;
	void entry(){
		System.out.println("1) Create New Account\n2) Quit");
		num = sc.nextInt();
		
		if(num == 1) {
			newAccount();
		}
		
	}
	void createAccount(String name,String address, long mobile, int balance) {
		this.name = name;
		this.adress = address;
		this.mobile = mobile;
		this.balance = balance;
		System.out.println("Account Created:");
	}
	void newAccount() {
		System.out.println("Enter AccountHOlder NAme:");
		this.name = sc.next();
		System.out.println("Enter Address: ");
		this.adress = sc.next();
		System.out.println("Enter Mobil Number: ");
		this.mobile = sc.nextLong();
		System.out.println("Enter Opening Deposit: ");
		this.balance = sc.nextInt();
		
		if(this.name != null &&  this.adress != null && this.balance > 0) {
			System.out.println("Account created Succuefully: ");
			options();
		}
		
		
	}
	
	void options() {
		System.out.println("Choose an Option:\n1) Deposit\n2) Withdraw\n3) Check Balance\n4) Quit");

			int num = sc.nextInt();
		
		if(num == 1) {
			System.out.println("Enter Ammount to Deposit:");
			int depositAmount = sc.nextInt();
			deposit(depositAmount);
		}else if(num == 2) {
			System.out.println("Enter Amount To withdraw:");
			int withdrawAmount = sc.nextInt();
			withdraw(withdrawAmount);
		}
		else if(num == 3) {
			checkBalance();
		}else if (num == 4) {
			newAccount();
		}
	}
	
	void deposit(int amount) {
		balance += amount;
		System.out.println("Deposited Suycessfully");
		checkBalance();
	}
	
	void withdraw(int amount){
		if(this.balance > amount) {
			this.balance -= amount;
			System.out.println("Amount Withdrawn Sucessfully: ");
			checkBalance();
		}else {
			System.out.println("Insufficient Balance");
			options();
		}
	}
	
	void checkBalance() {
		System.out.println("Current Balance is: " + this.balance);
		options();
	}
}

public class Banking {
	static void starting(){
		System.out.println("Chosse an option to continue:");
	}
	public static void main(String[] args) {
		starting();
		Account user = new Account();
		user.entry();
	}

}
