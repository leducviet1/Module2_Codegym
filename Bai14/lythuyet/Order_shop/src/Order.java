public class Order{
    private String orderID;
    private double totalAmount;
    public Order(String orderID, double totalAmount){
        this.orderID = orderID;
        this.totalAmount = totalAmount;
    }
    public String getOrderID(){
        return orderID;
    }
    public double getTotalAmount(){
        return totalAmount;
    }
    @Override
    public String toString() {
        return "Ma don hang: " + orderID + ", Tong tien: " + totalAmount;
    }

}