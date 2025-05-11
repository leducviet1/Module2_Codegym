import java.util.Scanner;

public class electric_money {
    public static void main(String[] args) {
        System.out.print("Số kWh đã sử dụng:");
        Scanner scanner = new Scanner(System.in);
        int kwh = scanner.nextInt();

        double total = 0;
        if(kwh <= 50){
            total = kwh * 1800;
        }else if(kwh <= 100){
            total = (kwh - 50) * 2300 + 50 * 1800;
        }else if(kwh >100){
            total = 50 * 1800 + 50 * 2300 + (kwh - 100) * 3000;
        }
        System.out.println("Tiền điện phải trả:" + total + " VNĐ");
    }
}
