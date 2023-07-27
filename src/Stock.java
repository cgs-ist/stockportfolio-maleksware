public class Stock {
    private String code;
    private String name;
    private double price;

    public Stock(String code, String name, double price) {
        this.code = code;
        this.name = name;
        this.price = price;
    }

    public void setPrice(double newPrice) {
        this.price = newPrice;
    }

    public double getPrice() {
        return this.price;
    }

    public String getCode() {
        return this.code;
    }

    public String getName() {
        return this.name;
    }
}
