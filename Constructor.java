class Myclass{
    Myclass(){
        System.out.println("Default Examples.Constructor ");
    }
    int num_1,num_2;
    Myclass(int a,int b){
        num_1=a;
        num_2=b;
    }
    void display()
            
    {
        System.out.println(num_1+num_2);
    }
}
public class Constructor {

    public static void main(String[] args) {
        Myclass obj = new Myclass(10,20);
        obj.display();

    }
}
