package banking;

public class Counter {
    private int id;
    private Customer currentCustomer ;

    public Counter(int id) {
        this.id = id;
        this.currentCustomer = null;
    }
    public boolean isBusy(){
        return currentCustomer != null;
    }
    public void serveCustomer(Customer customer){
        this.currentCustomer = customer;
    }
    public void finishService(){
        this.currentCustomer = null;
    }
    public int getId() {
        return id;
    }
    public String getStatus(){
        return isBusy() ? "Bận (Đang phục vụ: " + currentCustomer.getName() + ")" : "Rảnh";
    }
}
