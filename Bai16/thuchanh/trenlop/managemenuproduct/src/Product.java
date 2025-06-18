public class Product {
    private String productId;
    private String productName;
    private double productPrice;
    public Product(String productId, String productName, double productPrice){
        this.productId = productId;
        this.productName = productName;
        this.productPrice = productPrice;
    }

    public String getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }
    public String toString(){
        return productId + "," + productName + "," + productPrice;
    }
    public String displayInformation() {
        return String.format("Mã: %s | Tên: %s | Giá: %.0f", productId, productName, productPrice);
    }
}
