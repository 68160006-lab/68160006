package java10;
public class Test {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        Customer c1 = new Customer();
        Fullname f1 = new Fullname();
        Fullname f2 = new Fullname();

        f1.firstname = "Jane";
        f1.lastname = "Smith";

        f2.firstname = "Robert";
        f2.lastname = "Peterson";

        e1.id = 111;
        e1.name = f2;
        e1.salary = 20000;

        c1.id = 101;
        c1.name = f1;
        c1.tel = "0879208767";

        System.out.println(c1.id + " " + c1.name.firstname + " " + c1.name.lastname + " " + c1.tel);
        System.out.println(e1.id + " " + e1.name.firstname + " " + e1.name.lastname + " " + e1.salary);
    }
}
