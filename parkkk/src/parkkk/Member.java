package parkkk;
//create class. //클래스 만들기.
public class Member{
	String name, address, job, age;
	
	void showInfo() {System.out.println(name +" "+address +" "+ job +" "+age);}
	
	public Member(String name, String address, String job, String age) {
		this.name = name;
		this.address = address;
		this.job = job;
		this.age = age;
	}
	
	public static void main(String [] args) {
		Member James = new Member("James", "London", "Cook", "33");
		James.showInfo();
	}
}