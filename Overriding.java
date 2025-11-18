class Banks {
    void rate() {
        System.out.println("General Bank Rate: 5%");
    }
}
class SBI extends Banks{
    void rate() {
        System.out.println("SBI Rate: 6%");
    }
}
public class Overrriding {
    public static void main(String[] args) {
        Banks b = new Banks();
        b.rate();
        SBI s = new SBI();
        s.rate();
    }
}
