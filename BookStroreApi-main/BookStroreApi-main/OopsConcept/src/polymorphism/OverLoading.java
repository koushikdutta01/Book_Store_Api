package polymorphism;

public class OverLoading {
    public static int add(int a, int b){
        System.out.println("Method with Integer is Called");
        return a+b;
    }
    public static double add(double a , double b){
        System.out.println("Method with double is Called");
        return a+b;
    }
}
