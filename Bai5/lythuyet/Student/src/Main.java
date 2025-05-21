import demo_static.Student2;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
//        Student s1 = new Student("Alice");
//        Student s2 = new Student("Bob");
//        s1.display();
//        s2.display();
//        Student2 s1 = new Student2("Alice");
//        String name = s1.name;

//        UserSession user1 = new UserSession();
//        UserSession user2 = new UserSession();
//        UserSession user3 = new UserSession();
//
//        System.out.println("Số người dùng đang online: " + UserSession.getOnlineCount());
//
//        user1.logout();
//        System.out.println("Số người dùng sau khi đăng xuất: " + UserSession.getOnlineCount());
//        }

//        int a = 10, b = 5;
//        System.out.println("Cộng: " + Calculator.add(a, b));
//        System.out.println("Trừ: " + Calculator.sub(a, b));
//        System.out.println("Nhân: " + Calculator.mul(a, b));
//
//        try {
//            System.out.println("Chia: " + Calculator.div(a, b));
//            System.out.println("Chia cho 0: " + Calculator.div(a, 0));
//        } catch (ArithmeticException e) {
//            System.out.println("Lỗi: " + e.getMessage());
//        }

        BankAccount account1 = new BankAccount("Lê Đức Việt", 1000);
        account1.deposit(100);
        account1.withdraw(50);
    }
}
