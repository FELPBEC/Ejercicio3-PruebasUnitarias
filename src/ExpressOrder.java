public class ExpressOrder extends Order {
private double expressFee;
public ExpressOrder(String customer, double amount, double expressFee){
super(customer, amount);
if(expressFee < 0) throw new IllegalArgumentException("Fee must be positive");
this.expressFee = expressFee;
}
@Override
public double calculateTotal(){
return amount * 1.05 + expressFee;
}
}

