package inheritance;

public class Main {
    public static void main(String[] args) {
        Parrot parrot = new Parrot();
        parrot.name="motu";
        parrot.age=18;
        System.out.println(parrot.name);
        System.out.println(parrot.age);
        parrot.fly();
    }
}
