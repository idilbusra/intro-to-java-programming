package classeswithattributes;

public class Product {
    public Product(int id, String name, String descriptions, double price, int stockAmount, String renk ){
        System.out.println("Yapici blok calisti");
        this.id=id;
        this.renk= renk;
        this.name= name;
        this.price=price;
        this.descriptions= descriptions;
        this.stockAmount=stockAmount;
    }

    public Product(){

    }

    //attribute | field
    private int id;
     String name;
     String descriptions;
     double price;
     int stockAmount;
     String renk;
     String kod;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(String descriptions) {
        this.descriptions = descriptions;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStockAmount() {
        return stockAmount;
    }

    public void setStockAmount(int stockAmount) {
        this.stockAmount = stockAmount;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public String getKod() {
        return this.name.substring(0,1)+ id;
    }

    public void setKod(String kod) {
        this.kod = kod;
    }
}
