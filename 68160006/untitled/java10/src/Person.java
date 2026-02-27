package java10;

public class Person {
    String firstname;
    String lastname;
    int age;

    public Person(String fn, String ln) {
        firstname = fn;
        lastname = ln;
    }

    public Person(String fn, String ln, int a) {
        this();
        age = a;
    }

    public void show() {
        System.out.println("Name : " + firstname + " " + lastname + " Age : " + age);
    }
}





