public abstract class Order {
protected String customer;
protected double amount;
public Order(String customer, double amount){
if (amount <= 0) throw new IllegalArgumentException("Amount must be positive");
this.customer = customer;
this.amount = amount;
}
public abstract double calculateTotal();
public double getAmount(){
return amount;
}
}

