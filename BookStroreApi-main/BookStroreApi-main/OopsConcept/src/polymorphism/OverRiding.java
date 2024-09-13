package polymorphism;

public class OverRiding {
    public void print(){
        System.out.println("plain old text");
    }
}

 class Overridden extends OverRiding{
    @Override
    public void print(){
        System.out.println("This is overriding the previous plain old text");
    }

}
