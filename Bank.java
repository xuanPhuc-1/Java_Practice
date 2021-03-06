import java.util.*;
class Account {
	private String name;
	private int age;
	private String ID;
	private int number;
	private int operator;
	
	public Account(String name, int age, String ID, int operator, int number) {
		this.name = name;
		this.age = age;
		this.ID = ID;
		this.number = number;
		this.operator = operator;
	}
	
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

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getOperator() {
		return operator;
	}

	public void setOperator(int operator) {
		this.operator = operator;
	}

	public int rut(int a, int b) {				// Yeu cau rut tien
		return a-b;
	}
	public int nap(int a, int b) {				// Yeu cau nap tien
		return a+b;
	}
	public static void xoa(String a) {				// Yeu cau xoa ten khach hang
		String a1 = "NULL";
		System.out.println(a1);
	}
	
	
	@Override
	public String toString() {
		return "Account [name=" + name + ", age=" + age + ", ID=" + ID + ", "
				+ "number=" + number + ", operator=" + operator
				+ "]";
	}
	
}
class User {
	private String name;
	private int age;
	private String ID;
	private int number;
	private int demandrut;
	private int demandnap;
	
	public User(String name, int age, String ID, int number, int demandrut, int demandnap) {
		this.name = name;
		this.age = age;
		this.ID = ID;
		this.number = number;
		this.demandrut = demandrut;
		this.demandnap = demandnap;
	}

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

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getDemandrut() {
		return demandrut;
	}

	public void setDemandrut(int demandrut) {
		this.demandrut = demandrut;
	}
	
	public int getDemandnap() {
		return demandnap;
	}

	public void setDemandnap(int demandnap) {
		this.demandnap = demandnap;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + ", ID=" + ID + ", number=" 
				+ number + ", demandrut=" + demandrut
				+ ", demandnap=" + demandnap + "]";
	}
	public static void show (String name, int age, String ID, int operator, int number) {	//Show thong tin khach hang
		System.out.println("T??n: "+name);
		System.out.println("Tu???i: "+age);
		System.out.println("CMT: "+ID);
		System.out.println("S??? d??: "+operator);
		System.out.println("M?? t??i kho???n: "+number);
	}
	
}
public class Bank {
	public static void main (String[] args) {
		Account acc1 = new Account("Nam", 18, "20021568", 814172302,10000000);			//Thong tin tai khoan
		acc1.setName("Nam");
		acc1.setAge(18);	
		acc1.setID("20021568");
		acc1.setNumber(814172302);
		acc1.setOperator(1000000);
		User us1 = new User("Nam", 18, "20021568", 814172302,900000,800000);			//Thong tin nguoi dung
		us1.setName("Nam");
		us1.setAge(18);
		us1.setID("20021568");
		us1.setNumber(814172302);
		us1.setDemandrut(9000000);
		us1.setDemandnap(800000);								
		System.out.println("N???P TI???N ch???n ph??m 1");										//Hien thi len man hinh
		System.out.println("R??T TI???N ch???n ph??m 2");
		System.out.println("X??A TH??NG TIN ch???n ph??m 3");
		System.out.println("XEM TH??NG TIN ch???n ph??m 4");
		System.out.println("H??Y NH???P S???: ");
		Scanner sc = new Scanner(System.in);
		int input= sc.nextInt();
		switch(input) {
		case 1:
			if(acc1.getName() == us1.getName() && acc1.getID() == us1.getID() && acc1.getNumber() == us1.getNumber())
			{
					System.out.println("B???n ???? n???p th??nh c??ng s??? ti???n "+ us1.getDemandnap() +" s??? d?? c??n l???i trong t??i kho???n l?? "+acc1.nap(acc1.getOperator(),us1.getDemandnap()));
			
			}
			else
				System.out.println("Vui l??ng nh???p l???i th??ng tin:...");
			break;
		case 2:
			if(acc1.getName() == us1.getName() && acc1.getID() == us1.getID() && acc1.getNumber() == us1.getNumber())
			{
				if( acc1.getOperator() >= us1.getDemandrut() ) {
					System.out.println("B???n ???? r??t th??nh c??ng s??? ti???n "+ us1.getDemandrut() +" S??? d?? c??n l???i l?? "+acc1.rut(acc1.getOperator(),us1.getDemandrut()));
				}
				else 
					System.out.println("S??? ti???n c??n l???i kh??ng ????? ????? r??t");
			}
			else
				System.out.println("Vui l??ng nh???p l???i th??ng tin:...");
			break;
		case 3:
			if(acc1.getName() == us1.getName() && acc1.getID() == us1.getID() && acc1.getNumber() == us1.getNumber())
			{
				Account.xoa(acc1.getName());
			}
			else
				System.out.println("Vui l??ng nh???p l???i th??ng tin:...");
			break;
		case 4:
			if(acc1.getName() == us1.getName() && acc1.getID() == us1.getID() && acc1.getNumber() == us1.getNumber())
			{
				User.show(acc1.getName(), acc1.getAge(), acc1.getID(), acc1.getOperator(), acc1.getNumber());
			}
			else
				System.out.println("Vui l??ng nh???p l???i th??ng tin:...");
			break;
		}
		
		
}
}

