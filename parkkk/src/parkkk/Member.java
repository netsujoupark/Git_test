package parkkk;
//create class2 //클래스 만들기2.
import java.util.Scanner;

class Member{
	String name, address, job; int age;
	
	void showInfo() {System.out.println(name +" "+address +" "+ job +" "+age);}
	
	public Member(String name, String address, String job, int age) {
		this.name = name;
		this.address = address;
		this.job = job;
		this.age = age;
	}
    public static void main(String [] args) {
    	Scanner scanner = new Scanner(System.in);
    	System.out.print("Insert Your name>>");
    	String name = scanner.nextLine();
    	System.out.print("Insert Your address>>");
    	String address = scanner.nextLine();
    	System.out.print("Insert Your job>>");
    	String job = scanner.nextLine();
    	System.out.print("Insert Your age>>");
    	int age = scanner.nextInt();
    	Member Freshman = new Member(name, address, job, age);
    	Freshman.showInfo();
    	
    	scanner.close();
    }
}