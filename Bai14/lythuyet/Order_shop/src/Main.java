import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void selectionSort(List<Order> orders){
        int n = orders.size();
        for(int i = 0; i < n-1; i++){
            int maxIndex = i;
            for(int j = i + 1; j < n; j++){
                if(orders.get(j).getTotalAmount()>orders.get(maxIndex).getTotalAmount()){
                    maxIndex = j;
                }
            }
            if(maxIndex != i){
                Order temp = orders.get(i);
                orders.set(i,orders.get(maxIndex));
                orders.set(maxIndex,temp);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Order> orders = new ArrayList<>();
        System.out.println("Nhap so luong don hang:");
        int n = sc.nextInt();
        sc.nextLine();
        for(int i = 0; i < n; i++){
            System.out.println("Nhap don hang thu " + (i+1) + ":");
            System.out.println("Ma don hang:");
            String id = sc.nextLine();
            System.out.println("Tong tien");
            double amount = Double.parseDouble(sc.nextLine());
            orders.add( new Order(id,amount));
        }
        selectionSort(orders);
        System.out.println("\nDanh sach don hang sau khi sap xep giam dan");
        for (Order order : orders) {
            System.out.println(order);
        }

    }
}
