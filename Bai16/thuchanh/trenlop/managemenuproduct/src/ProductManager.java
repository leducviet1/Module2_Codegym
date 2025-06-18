import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductManager {
    private List<Product> productList = new ArrayList<>();
    private String filePath = "products.txt";
    public ProductManager(){
        loadProducts();
    }
    //Doc file
    public void loadProducts(){
        productList.clear();
        try(BufferedReader br = new BufferedReader(new FileReader(filePath))){
            String line;
            while((line = br.readLine()) != null){
                String[] parts = line.split(",");
                if(parts.length == 3){
                    String productID = parts[0];
                    String productName = parts[1];
                    double productPrice = Double.parseDouble(parts[2]);
                    productList.add(new Product(productID,productName,productPrice));
                }
            }
        }catch (IOException e){
            System.out.println("Can not read file" + e.getMessage());
        }
    }
    //ghi file
    public void saveProductstoFile(){
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(filePath))){
            for(Product p: productList){
                bw.write(p.toString());
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println("can not save " + e.getMessage());
        }
    }

    //Thêm sản phẩm
    public void addProduct(Scanner sc){
        System.out.println("ID of product:");
        String id = sc.nextLine();
        System.out.println("Name of product:");
        String name = sc.nextLine();
        System.out.println("Price of product");
        double price = sc.nextDouble();
        productList.add(new Product(id,name,price));
        saveProductstoFile();
        System.out.println("Added product successfully ");
    }

    public void displayAllProducts() {
        if (productList.isEmpty()) {
            System.out.println("Danh sách sản phẩm trống.");
        } else {
            for (Product p : productList) {
                System.out.println(p.displayInformation());
            }
        }
    }

    public void displayProductFrom200(){
        System.out.println("Products from 200k:");
        for (Product p: productList){
            if(p.getProductPrice()>200000){
                System.out.println(p.displayInformation());
            }
        }
    }

    public void updateProduct(Scanner sc){
        System.out.println("Id of product which you want to change");
        String id = sc.nextLine();
        boolean isFound = false;
        for(Product p : productList){
            if(p.getProductId().equalsIgnoreCase(id)){
                System.out.println("New price:");
                double newPrice = sc.nextDouble();
                p.setProductPrice(newPrice);
                saveProductstoFile();
                System.out.println("Updated success");
                isFound = true;
                break;
            }
        }
        if(!isFound){
            System.out.println("Not found");
        }
    }
}
