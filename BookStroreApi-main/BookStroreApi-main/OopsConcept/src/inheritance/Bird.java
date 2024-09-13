package inheritance;

public class Bird {
    public String name;
    public int age;

    public void fly(){
        System.out.println("Flying!!");
    }
    public void eat(){
        System.out.println("Eating!!");
    }

    public Bird(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public Bird(){

    }
}
