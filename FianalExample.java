final class Bank {

    final double itr = 10.5;
    final void showitr() {
        System.out.println("Bank Interest Rate: " + itr + "%");
    }
}
public class Final {
    public static void main(String[] args) {
        Bank b = new Bank();
        b.showitr();
    }
}

