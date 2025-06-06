public class Main {
    public static void main(String[] args) {
        BrowserHistory browser = new BrowserHistory("home.com");

        browser.visit("aaaaaa.com");
        browser.visit("bccas.com");
        browser.back();
        browser.back();
        browser.forward();
        browser.visit("casds.com");
        browser.forward();
        browser.back();
    }
}
