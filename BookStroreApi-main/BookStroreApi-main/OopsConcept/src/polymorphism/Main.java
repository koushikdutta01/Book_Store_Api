package polymorphism;

import static polymorphism.OverLoading.add;

public class Main {
    public static void main(String[] args) {
        //Method Overloading
        System.out.println(add(1,2));
        System.out.println(add(1.2,2.3));

        //Method Overriding
        OverRiding overRiding = new OverRiding();
        overRiding.print();
        Overridden overridden = new Overridden();
        overridden.print();

    }
}