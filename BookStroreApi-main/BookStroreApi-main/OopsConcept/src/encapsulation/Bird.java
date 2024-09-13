package encapsulation;

public class Bird {
    private String name;
    private int age;


    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }

    public void fly(){
        System.out.println("Flying");
    }
    public void eat(){
        System.out.println("Eating");
    }
}
