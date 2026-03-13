package java14;

public class Test{
    public static void main(String args[]){
        Animal a1,a2,a3,a4;
        a1 = new Dog();
        a2 = new Mammal();
        a3 = new Reptile();
        a4 = new Animal();

        System.out.println(a1 instanceof Animal);
        System.out.println(a1 instanceof Mammal);
        System.out.println(a1 instanceof Reptile);
        System.out.println(a1 instanceof Dog);
        System.out.println(a2 instanceof Animal);
        System.out.println(a2 instanceof Dog);
        System.out.println(a2 instanceof Reptile);
        System.out.println(a2 instanceof Mammal);
        System.out.println(a3 instanceof Mammal);
        System.out.println(a3 instanceof Animal);
        System.out.println(a3 instanceof Dog);
        System.out.println(a3 instanceof Reptile);
        System.out.println(a4 instanceof Mammal);
        System.out.println(a4 instanceof Dog);
        System.out.println(a4 instanceof Animal);
        System.out.println(a4 instanceof Reptile);
    }
}









