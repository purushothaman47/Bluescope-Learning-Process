package Thread  ;
class Book  extends  Thread{
    public void run (){
        for (int i= 1; i<5;i++)
        {
            System.out.println("upadteDb");
            try{Thread.sleep(8000);}
            catch ( Exception e){}
        }
    }
}
class num extends Thread {
     public void run(){
        for (int i= 1 ; i<5;i++)
        {
            System.out.println(i);
            try{Thread.sleep(6000);}
            catch ( Exception e){}
        }
    }
}
public class demo1  {
    public static void main(String[] args) {
        num n1 = new num();
        Book book = new Book();
        book.start();
        n1.start();
        try {
            book.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Haii");
    }

}
