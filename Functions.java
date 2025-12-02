package Example;

public class Functions {

    void sayHello() {
        System.out.println("Hello ! ");
    }
    void greet(String name) {
        System.out.println("Hello, " + name);
    }
    int add(int a, int b) {
        return a + b;
    }
    String getMessage() {
        return "Welcome to BlueScope!";
    }
    static void display() {
        System.out.println("Hello purushoth");
    }


    public static void main (String [] args )
    {
        Functions fun = new Functions();
        fun.greet("Purushothaman");
        fun.add(10,30);
        fun.sayHello();
        

    }
}
