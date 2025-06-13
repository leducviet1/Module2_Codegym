import java.util.InputMismatchException;
import java.util.Scanner;

public class Debug{
    public static void main(String[] args) {
        int num1 =0;
        int num2 =0;
        char operator;
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Nhap so thu nhat:");
            num1 = sc.nextInt();
            System.out.println("Nhap so thu hai:");
            num2 = sc.nextInt();
            System.out.println("Chon phep tinh : (+,-,*,/)");
            operator = sc.next().charAt(0);
            switch (operator) {
                case '+':
                    System.out.println("Ket qua phep cong:" + (num1 + num2));
                    break;
                case '-':
                    System.out.println("Ket qua phep tru:" + (num1 - num2));
                    break;
                case '*':
                    System.out.println("ket qua phep nhan:" + (num1 * num2));
                    break;
                case '/':
                    if(num2 == 0){
                        throw new ArithmeticException("Khong the chia cho 0");
                    }
                    System.out.println("Ket qua phep chia:" + (num1/num2));
                    break;
                default:
                    System.out.println("ban cho phep tinh khong hop le");
            }
        }catch(InputMismatchException e){
            System.out.println("ban nhap sai kieu du lieu");
        }catch(ArithmeticException e){
            System.out.println("loi:" + e.getMessage());
        }
        finally{
            System.out.println("ket thuc chuong trinh");
        }
        sc.close();
    }
}