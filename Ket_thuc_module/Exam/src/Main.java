import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ContactService service = new ContactService();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== MENU QUẢN LÝ DANH BẠ =====");
            System.out.println("1. Xem danh sách");
            System.out.println("2. Thêm mới");
            System.out.println("3. Cập nhật");
            System.out.println("4. Xóa");
            System.out.println("5. Tìm kiếm");
            System.out.println("0. Thoát");
            System.out.print("Chọn: ");
            String choice = sc.nextLine();

            switch (choice) {
                case "1": new DisplayContactHandle(service).execute(); break;
                case "2": new AddContactHandle(service).execute(); break;
                case "3": new UpdateContactHandle(service).execute(); break;
                case "4": new DeleteContactHandle(service).execute(); break;
                case "5": new SearchContactHandle(service).execute(); break;
                case "0": System.exit(0);
                default: System.out.println("Lựa chọn không hợp lệ!");
            }
        }
    }
}