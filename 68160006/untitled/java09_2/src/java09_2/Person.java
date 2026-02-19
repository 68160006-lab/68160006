package java09_2;

public class Person {
	int id;
	String firstname;
	String lastname;
	int age;
	int count = 0;

	public Person(String fn, String ln, int a) {
		firstname = fn;
		lastname = ln;
		age = a;
		count++;
		id = count;
	}

	public void show() {
		System.out.println("Id : " + id + " Name : " + firstname + " " + lastname + " Age : " + age);
	}
}