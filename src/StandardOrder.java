public class StandardOrder extends Order {
public StandardOrder(String customer, double amount){
super(customer, amount);
}
@Override
public double calculateTotal(){
return amount * 1.05; // 5% impuesto
}
}
