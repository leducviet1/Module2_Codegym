public class BankAccount {
    private double balance;
    private String ownerName;
    public BankAccount(String ownerName, double initialbalance){
        this.ownerName = ownerName;
        if(initialbalance > 0) this.balance = initialbalance ;
        else{
            this.balance = 0;
            System.out.println("Số dư ban đầu không hợp lệ, đặt về 0");
        }
    }

    public String getOwnerName() {
        return ownerName;
    }
    public double getBalance(){
        return balance;
    }
    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public void deposit(double amount){
        if(amount>0){
            balance += amount;
            System.out.println("Gửi " + amount + " thành công");
        }else {
            System.out.println("Không thể gửi");
        }
    }

    public void withdraw(double amount){
        if(amount<=0){
            System.out.println("Không thể rút");
        }else if(amount>balance){
            System.out.println("Số dư không đủ");
        }else{
            balance -= amount;
            System.out.println("Rút " + amount + "thành công");
        }
    }
}
