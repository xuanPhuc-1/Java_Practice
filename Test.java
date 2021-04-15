import java.util.*;
	class Phuc{
		private String name;
		private int age;
		private int account;
		private String move;
		
	Phuc(String name, int age, int account){
	this.name = name;
	this.age = age;
	this.account = account;
	this.move = move;
	};
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAccount() {
		return account;
	}
	
	public void setAccount(int account) {
		this.account = account;
	}
	
	public String getMove() {
		return move;
	}
	
	public void print() {
		System.out.println("User's name is: "+name);
		System.out.println("User's age is: "+age);
		System.out.println("User's account is: "+account);
	}
	public void display() {
	
	}
}
public class Test {

	public static void main(String[] args) {
		Phuc User1 =new Phuc("Phuc", 18, 20021568);
		Scanner sc = new Scanner(System.in);
		System.out.println("Input the name: ");
		User1.setName(sc.nextLine());
		System.out.println("Iput the age: ");
		User1.setAge(sc.nextInt());
		System.out.println("Input the account: ");
		User1.setAccount(sc.nextInt());
		User1.print();	
		
	}

}
