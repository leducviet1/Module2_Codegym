package banking;
import java.util.*;
public class BankSimulation {
        private static LinkedList<Customer> customerQueue = new LinkedList<>();
        private static List<Counter> counters = new ArrayList<>();
        private static int nextCustomerId = 1;
        private static Scanner scanner = new Scanner(System.in);

        public static void main(String[] args) {
            // Khởi tạo 5 quầy mặc định đều bận với khách giả lập
            for (int i = 1; i <= 5; i++) {
                Counter counter = new Counter(i);
                counter.serveCustomer(new Customer("Khách_" + i,nextCustomerId++));
                counters.add(counter);
            }

            int choice;
            do {
                System.out.println("\n========= MENU =========");
                System.out.println("1. Thêm 10 khách hàng vào hàng đợi");
                System.out.println("2. Quầy xử lý xong → gọi khách tiếp theo");
                System.out.println("3. Hiển thị hàng đợi hiện tại");
                System.out.println("4. Hiển thị trạng thái các quầy");
                System.out.println("0. Thoát");
                System.out.print("Chọn: ");
                choice = scanner.nextInt();
                scanner.nextLine(); // clear buffer

                switch (choice) {
                    case 1 -> addCustomers();
                    case 2 -> serveNextCustomers();
                    case 3 -> showQueue();
                    case 4 -> showCounters();
                    case 0 -> System.out.println("Thoát chương trình.");
                    default -> System.out.println("Lựa chọn không hợp lệ.");
                }
            } while (choice != 0);
        }

        private static void addCustomers() {
            for (int i = 0; i < 10; i++) {
                String name = "Khách_" + nextCustomerId;
                Customer customer = new Customer("Khách_" + i,nextCustomerId++);
                customerQueue.add(customer);
            }
            System.out.println("✅ Đã thêm 10 khách hàng vào hàng đợi.");
        }

        private static void serveNextCustomers() {
            boolean served = false;
            for (Counter counter : counters) {
                if (!counter.isBusy()) {
                    if (!customerQueue.isEmpty()) {
                        Customer next = customerQueue.poll();
                        counter.serveCustomer(next);
                        System.out.println("➡ Quầy " + counter.getId() + " phục vụ " + next.getName());
                        served = true;
                    }
                } else {
                    // Giả sử quầy đã xử lý xong khách cũ
                    counter.finishService();
                }
            }

            if (!served) {
                System.out.println("⚠ Không có quầy nào rảnh để phục vụ khách.");
            }
        }

        private static void showQueue() {
            if (customerQueue.isEmpty()) {
                System.out.println("📭 Hàng đợi trống.");
            } else {
                System.out.println("📋 Danh sách khách đang chờ:");
                for (Customer c : customerQueue) {
                    System.out.println(" - " + c);
                }
            }
        }

        private static void showCounters() {
            System.out.println("🏦 Trạng thái các quầy:");
            for (Counter counter : counters) {
                System.out.println(" - Quầy " + counter.getId() + ": " + counter.getStatus());
            }
        }
    }


