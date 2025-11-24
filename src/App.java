import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
       Order expressOrder= new ExpressOrder("pepe", 4, 7);
       Order expressOrder2= new ExpressOrder("Carlos", 3, 4);
       Order standardOrder= new StandardOrder("Jhon", 4);
       Order standardOrder2= new StandardOrder("Espidy", 6);
    }
}
