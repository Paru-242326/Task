public class Product {
    private String name;
    private int productId;
    private double price;
    private int stock;

    public Product(String name, int productId, double price, int stock) {
        this.name = name;
        this.productId = productId;
        setPrice(price);
        this.stock = stock;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int id) {
        this.productId = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price >= 0)
            this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void purchase(int quantity) {
        if (quantity <= stock) {
            stock -= quantity;
        }
    }

    public void restock(int quantity) {
        stock += quantity;
    }
}

