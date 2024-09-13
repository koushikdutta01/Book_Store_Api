package encapsulation;

public class Main {
    public static void main(String[] args) {
        Bird bird = new Bird();
        System.out.println(bird.getName());
        System.out.println(bird.getAge());
        bird.setName("esha");
        bird.setAge(27);
        System.out.println("After Updation: " + bird.getName());
        System.out.println("After Updation: " + bird.getAge());
    }
}
