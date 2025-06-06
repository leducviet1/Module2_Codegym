import java.util.Stack;

public class BrowserHistory {
    private Stack<String> backStack;
    private Stack<String> forwardStack;
    private String currentPage;
    public BrowserHistory(String homepage) {
        backStack = new Stack<>();
        forwardStack = new Stack<>();
        currentPage = homepage;
    }
    public  void visit(String url){
        backStack.push(currentPage);
        forwardStack.clear();
        currentPage = url;
        System.out.println("Đang ở : " + currentPage);
    }
    public void back(){
        if(!backStack.empty()){
            forwardStack.push(currentPage); //lưu trang hiện tại vào stack tiến
            currentPage = backStack.pop();   //quay lại trước
            System.out.println("Trở về: " + currentPage);
        }else{
            System.out.println("Không có trang để trở về");
        }
    }
    public void forward(){
        if(!forwardStack.empty()){
            backStack.push(currentPage); //lưu trang hiện tại vào stack lùi
            currentPage = forwardStack.pop(); //tiến
            System.out.println("Lên trang: " + currentPage);
        }else {
            System.out.println("Không có trang");
        }
    }
    public String getCurrentPage(){
        return currentPage;
    }
}
