import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ProductManager pm = new ProductManager();
        Scanner sc = new Scanner(System.in);
        int choice = -1;
        do {
            System.out.println("Menu");
            System.out.println("1. Xem danh sách");
            System.out.println("2. Thêm sản phẩm");
            System.out.println("3. Hiển thị sản phẩm từ 200k trở lên");
            System.out.println("4. Update price");
            System.out.println("0. Exit");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice){
                case 1:
                    pm.displayAllProducts();
                    break;
                case 2:
                    pm.addProduct(sc);
                    break;
                case 3:
                    pm.displayProductFrom200();
                    break;
                case 4 :
                    pm.updateProduct(sc);
                    break;
                case 0:
                    System.out.println("Thoát");
                    break;
                default:
                    System.out.println("Your choice is not valid");
            }
        }while (choice != 0);
    }
}