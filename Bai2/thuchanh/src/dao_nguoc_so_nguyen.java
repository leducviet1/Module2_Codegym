import java.util.Scanner;

public class dao_nguoc_so_nguyen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        int number;
//        do{
//            System.out.print("Nhap so nguyen duong: ");
//            number = scanner.nextInt();
//            if(number<=0){
//                System.out.println("Phải lớn hơn 0, nhập lại:");
//            }
//        }while(number<=0);
//        int soGoc = number;
//        String reverse = "";
//        while(number != 0){
//            int sodu = number % 10;
//            reverse += sodu;
//            number /= 10;
//        };
//        System.out.println("Số đảo ngược của " + soGoc + " là: " + reverse );
        //bài 1: Tìm chữ số lớn nhất
//        System.out.print("Enter a number: ");
//        int number = scanner.nextInt();
//        int maxdigit = 0;
//        while(number > 0){
//            int digit = number % 10;
//            if (digit > maxdigit)
//                maxdigit = digit;
//            number /= 10;
//        }
//    System.out.println("The max digit is: " + maxdigit);
//    }
//}

//Bài 2: Kiểm tra số đối xứng
//        int number;
//        do {
//            System.out.print("Nhap so nguyen duong: ");
//            number = scanner.nextInt();
//            if (number <= 0) {
//                System.out.println("Phải lớn hơn 0, nhập lại:");
//            }
//        } while (number <= 0);
//        int soGoc = number;
//        String reverse = "";
//        while (number != 0) {
//            int sodu = number % 10;
//            reverse += sodu;
//            number /= 10;
//        }
//        if(String.valueOf(soGoc).equals(reverse))
//            System.out.println("Đây là số đối xứng");
//        else
//            System.out.println("Đây không phải là số đối xứng");

        //Bài 3: Tính giai thừa của N
//        int number;
//        do{
//            System.out.print("Nhap so nguyen duong: ");
//            number = scanner.nextInt();
//            if(number<0){
//                System.out.println("Số bạn nhập < 0, vui lòng nhập lại:");
//            }
//        }while (number<0);
//        int giaithua = 1;
//        for(int i = 1; i<=number; i++){
//            giaithua *= i;
//        }
//        System.out.println("Gia thưa của " + number + "=" + giaithua);
        // Bài 4: Kiểm tra số hoàn hảo
        int number;
        do{
            System.out.print("Nhap so nguyen duong: ");
            number = scanner.nextInt();
            if(number<0){
                System.out.println("Số bạn nhập < 0, vui lòng nhập lại:");
            }
        }while (number<0);
        int sum = 0;
        for(int i = 1; i < number; i++){
            if(number % i == 0){
                sum += i;
            }
        }
        if(number == sum)
            System.out.println("Đây là số hoàn hảo");
        else
            System.out.println("Đây không phải số hoàn hảo");
    }
}