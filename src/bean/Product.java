package bean;
public class Product {
    private String name;
    private String weight;
    private double price;
    private int stock;
    private double value;

    public Product(String name, String weight, double price, int stock, double value) {
        this.name = name;
        this.weight = weight;
        this.price = price;
        this.stock = stock;
        this.value = value;
    }

    public Product() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return  "name=" + name + ", weight=" + weight + ", price=" + price + ", stock=" + stock + ", value=" + value;
    }

    
    
    
    
}
