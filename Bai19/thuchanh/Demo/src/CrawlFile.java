import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class CrawlFile {
    public static void main(String[] args) {
        String outputFile = "output.txt";

        try {

            URL url = new URL("https://www.nhaccuatui.com/bai-hat/nhac-tre-moi.html");
            Scanner scanner = new Scanner(new InputStreamReader(url.openStream(), "UTF-8"));
            scanner.useDelimiter("\\Z");
            String content = scanner.next();
            scanner.close();

            //Xử lý dữ liệu HTML
            content = content.replaceAll("\\n+", "");
            Pattern p = Pattern.compile("name_song\">(.*?)</a>");
            Matcher m = p.matcher(content);

            //Ghi dữ liệu vào file
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));
            while (m.find()) {
                String title = m.group(1).trim();
                writer.write(title);
                writer.newLine();
            }
            writer.close();
            System.out.println(" Đã ghi danh sách bài hát vào file: " + outputFile);

            //Đọc lại từ file và in ra màn hình
            System.out.println("\n Danh sách bài hát đã lưu:");
            BufferedReader reader = new BufferedReader(new FileReader(outputFile));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println("- " + line);
            }
            reader.close();

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
