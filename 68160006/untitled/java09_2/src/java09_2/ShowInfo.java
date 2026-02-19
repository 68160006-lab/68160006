package java09_2;

public class ShowInfo {

	public static void main(String[] args) {
		Person p1;
		Person p2;
		Person p3;

		p1 = new Person("nid", "kubola", 25);
		p2 = new Person("john", "peterson", 37);
		p3 = new Person("bob", "smith", 18);

		p1.show();
		p2.show();
		p3.show();
	}
}