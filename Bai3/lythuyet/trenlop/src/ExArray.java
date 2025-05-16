import java.util.Scanner;

public class ExArray {
    public static  double[] inputdiem(){
        Scanner sc = new Scanner(System.in);


        int n;
        do {
            System.out.println("Nhập số lượng sinh viên (Tối đa 100)");
            n = sc.nextInt();
            if (n < 1 || n > 100) {
                System.out.println("Bạn nhập sai, mời bạn nhập lại");
            }
        } while (n < 1 || n > 100);
        double[] diem = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập điểm sinh viên thứ " + (i + 1) + ": ");
            diem[i] = sc.nextDouble();
        }
        return diem;
    }
    public static void showScore(double[] diem){
        System.out.println("\nDanh sách điểm sinh viên:");
        for (int i = 0; i < diem.length; i++) {
            System.out.println("Sinh viên " + (i + 1) + ": " + diem[i]);
        }
    }
    public static void statScore(double[] diem){
        int count=0;
        double sum = 0;
        double diem_trung_binh;
        for (int i = 0; i < diem.length; i++) {
            sum += diem[i];
            System.out.println("Sinh viên " + (i + 1) + ": " + diem[i]);
        }
        diem_trung_binh = sum / diem.length;
        System.out.println("Điểm trung bình của tất cả sinh viên: " + diem_trung_binh);

        for (int i = 0; i < diem.length; i++) {
            if (diem[i] >= 5) {
                count++;
            }
        }
        System.out.println("Số lượng sinh viên đạt điểm 5 trở lên là: " + count);

        //max, min:
        double max = diem[0];
        double min = diem[0];
        for (int i = 1; i < diem.length; i++) {
            if (diem[i] > max) {
                max = diem[i];
            }
            if (diem[i] < min) {
                min = diem[i];
            }
        }
        System.out.println("Điểm cao nhất là : " + max);
        System.out.println("Điểm thấp nhất là : " + min);
    }
    public static void sortScore(double[] diem){
        String hocLuc ="" ;
        for( int i = 0; i < diem.length; i++){
            if(diem[i] >= 8)
                hocLuc = "Giỏi";
            else if (diem[i] >= 6.5) {
                hocLuc = "Kha";
            } else if (diem[i] >= 5) {
                hocLuc = "trung bình";
            }else hocLuc = "Yeu";
            System.out.println("Sinh viên"+ (i+1)+ "đạt học lực: " + hocLuc);
        }
    }
    public static void bubleSort(double[] diem){
        for(int i = 0; i < diem.length-1; i++){
            for(int j = 0; j < diem.length-i-1; j++){
                if(diem[j] > diem[j+1]){
                    double temp = diem[j];
                    diem[j] = diem[j+1];
                    diem[j+1] = temp;
                }
            }
        }
        //in
        System.out.println("Danh sách điểm sau khi sắp xếp tăng dần");
        for (int i = 0; i < diem.length; i++) {
            System.out.println( diem[i]);
        }
    }
    public static void main(String[] args) {
    double[] diem = inputdiem();

    //Hiển thị danh sách điểm
        showScore(diem);
        statScore(diem);
        sortScore(diem);
        bubleSort(diem);


    }
}
